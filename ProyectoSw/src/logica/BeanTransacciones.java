package logica;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BeanTransacciones {
	private ConexionBD conexion;
	private ArrayList<Transaccion> lista;
	
	public BeanTransacciones(){
		conexion = ConexionBD.getInstancia();
	}
	
	public void todasLasTuplas(String nick) {
		lista = new ArrayList<Transaccion>();

		String sql = "select * from transacciones where aprobado_transaccion = true and terminada_trasaccion = true"
				+ " and nick_usuario = '"+nick+"';";
		Statement comando;
		try {
			comando = conexion.getConexion().createStatement();
			ResultSet registro;
			registro = comando.executeQuery(sql);

			while (registro.next()) {
				Transaccion s = new Transaccion(registro.getString(1), registro.getString(2), Integer.valueOf(registro.getString(3))
						,registro.getString(4), registro.getString(5), Integer.valueOf(registro.getString(6)), registro.getString(7),
						Boolean.valueOf(registro.getString(8)), Boolean.valueOf(registro.getString(9))
						,Boolean.valueOf(registro.getString(10)));
				lista.add(s);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void todasLasTuplasAprobadas(String nick) {
		lista = new ArrayList<Transaccion>();

		String sql = "select * from transacciones where aprobado_transaccion = true and terminada_trasaccion = false"
				+ " and nick_usuario = '"+nick+"';";
		Statement comando;
		try {
			comando = conexion.getConexion().createStatement();
			ResultSet registro;
			registro = comando.executeQuery(sql);

			while (registro.next()) {
				Transaccion s = new Transaccion(registro.getString(1), registro.getString(2), Integer.valueOf(registro.getString(3))
						,registro.getString(4), registro.getString(5), Integer.valueOf(registro.getString(6)), registro.getString(7),
						Boolean.valueOf(registro.getString(8)), Boolean.valueOf(registro.getString(9))
						,Boolean.valueOf(registro.getString(10)));
				lista.add(s);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void todasLasTuplasNoNotificadas(String nick) {
		lista = new ArrayList<Transaccion>();

		String sql = "select * from transacciones where aprobado_transaccion = true and leida_transaccion = false"
				+ " and nick_usuario = '"+nick+"';";
		Statement comando;
		try {
			comando = conexion.getConexion().createStatement();
			ResultSet registro;
			registro = comando.executeQuery(sql);

			while (registro.next()) {
				Transaccion s = new Transaccion(registro.getString(1), registro.getString(2), Integer.valueOf(registro.getString(3))
						,registro.getString(4), registro.getString(5), Integer.valueOf(registro.getString(6)), registro.getString(7),
						Boolean.valueOf(registro.getString(8)), Boolean.valueOf(registro.getString(9))
						,Boolean.valueOf(registro.getString(10)));
				lista.add(s);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Transaccion> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Transaccion> lista) {
		this.lista = lista;
	}



}
