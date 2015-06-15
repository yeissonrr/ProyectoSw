package logica;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BeanTransporte {

	private ConexionBD conexion;
	private ArrayList<Transportadora> lista;
	
	public BeanTransporte(){
		conexion = ConexionBD.getInstancia();
	}
	
	public void todasLasTuplas(String km, String kg) {
		lista = new ArrayList<Transportadora>();
		String sql = "select * from transportadoras;";		
		Statement comando;
		try {
			comando = conexion.getConexion().createStatement();
			ResultSet registro;
			registro = comando.executeQuery(sql);
			while (registro.next()) {
				int a = Integer.valueOf(registro.getString(4))*Integer.valueOf(km);
				int b = Integer.valueOf(registro.getString(5))*Integer.valueOf(kg);;
				Transportadora t = new Transportadora(registro.getString(1), registro.getString(2), registro.getString(3),
						String.valueOf(a), String.valueOf(b));
				lista.add(t);								
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Transportadora> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Transportadora> lista) {
		this.lista = lista;
	}




}
