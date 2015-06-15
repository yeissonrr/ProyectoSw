package logica;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BeanSensores {
	
	private ConexionBD conexion;
	private ArrayList<Sensor> lista;
	
	public BeanSensores(){
		conexion = ConexionBD.getInstancia();
	}
	
	public void todasLasTuplas(String nickname) {
		lista = new ArrayList<Sensor>();

		String sql = "select * from sensores where nick_usuario = '"
				+nickname+"' and Cultivos_id_cultivos = not_null;";
		Statement comando;
		try {
			comando = conexion.getConexion().createStatement();
			ResultSet registro;
			registro = comando.executeQuery(sql);

			while (registro.next()) {
				Sensor s = new Sensor(registro.getString(1), 
						Float.valueOf(registro.getString(2)));
				lista.add(s);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Sensor> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Sensor> lista) {
		this.lista = lista;
	}


}
