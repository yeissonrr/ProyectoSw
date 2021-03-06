package logica;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;



@ManagedBean(name = "cultivobean")
@ViewScoped
public class CultivoBean implements Serializable {
	
	private ConexionBD bd;
	private String fechaSembrado;
	private String fechaCultivo;
	private Date dateSembrado;
	private Date dateCultivo;
	private Calendar calendarSembrado;
	private Calendar calendarCultivo;
	private DateFormat formatterSembrado;
	private DateFormat formatterCultivo;
	private ArrayList<Cultivo> list;
	private Cultivo cultivo;
	
	public CultivoBean() {
		bd = ConexionBD.getInstancia();
		list = new ArrayList<Cultivo>();
		todasLasTuplas();
	}
	
	public void insertarValores(String nombre, String sembrado, String cultivo){
			
		formatterSembrado = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.US);
		formatterCultivo = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.US);
		
		try {
			dateSembrado = (Date)formatterSembrado.parse(sembrado);
			dateCultivo = (Date)formatterCultivo.parse(cultivo);
			calendarSembrado = Calendar.getInstance();
			calendarCultivo = Calendar.getInstance();
			calendarSembrado.setTime(dateSembrado);
			calendarCultivo.setTime(dateCultivo);
			fechaSembrado = calendarSembrado.get(Calendar.YEAR)+"-"+ (calendarSembrado.get(Calendar.MONTH) + 1) + "-" +calendarSembrado.get(Calendar.DATE);
			fechaCultivo = calendarCultivo.get(Calendar.YEAR)+"-"+ (calendarCultivo.get(Calendar.MONTH) + 1) + "-" +calendarCultivo.get(Calendar.DATE);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(fechaCultivo+" "+fechaSembrado);
		String sql = "INSERT INTO cultivos values (Default, '" + nombre + "','"
				+ fechaSembrado + "','" + fechaCultivo + "', 'SrCyco');";
		try {
			Statement sentencia = bd.getConexion().createStatement();
			sentencia.executeUpdate(sql);
			sentencia.close();
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
	
	public void todasLasTuplas() {
		String sql = "select * from cultivos";
		Statement comando;
		try {
			comando = bd.getConexion().createStatement();
			ResultSet registro;
			registro = comando.executeQuery(sql);

			while (registro.next()) {
				cultivo = new Cultivo(registro.getString(2),
						registro.getString(3), registro.getString(4));
				list.add(cultivo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public ArrayList<Cultivo> getList() {
		return list;
	}

	public void setList(ArrayList<Cultivo> list) {
		this.list = list;
	}
	
}
