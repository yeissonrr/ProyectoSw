package logica;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BeanCultivo {

	private ConexionBD conexion;
	private ArrayList<Compra> lista;
	
	public BeanCultivo(){
		conexion = ConexionBD.getInstancia();
	}
	
	public void todasLasTuplas(String nick) {
		lista = new ArrayList<Compra>();
		String sql = "select * from compras where Usuarios_nick_usuarios ='"+nick+"' and realizada_compra = false;";		
		Statement comando;
		try {
			comando = conexion.getConexion().createStatement();
			ResultSet registro;
			registro = comando.executeQuery(sql);

			while (registro.next()) {
				Compra s = new Compra(registro.getString(1), registro.getString(8), registro.getString(2), registro.getString(3),
						registro.getString(4), registro.getString(5));
				lista.add(s);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Compra> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Compra> lista) {
		this.lista = lista;
	}



}
