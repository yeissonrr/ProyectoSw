package logica;

import java.io.Serializable;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "cultivobean")
@ViewScoped
public class CultivoBean implements Serializable {
	
	private ConexionBD bd;
	
	public CultivoBean() {
		bd = ConexionBD.getInstancia();
	}
	
	public void insertarValores(String nombre, String fechaSembrado, String fechaCultivo){
		System.out.println(fechaSembrado+" -- "+fechaCultivo );
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
	public static void main(String[] args) {
		CultivoBean bean = new CultivoBean();
		bean.insertarValores("Maiz", "2015-06-13", "2015-12-13");
	}
	
}
