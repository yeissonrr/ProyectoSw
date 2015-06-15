package logica;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BeanSugerencias {
	
	private ConexionBD conexion;
	private ArrayList<Insumo> listaInsumos;
	private ArrayList<Sensor> lista;
	
	public BeanSugerencias(){
		listaInsumos = new ArrayList<Insumo>();
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
	public void crearSugerencias(String nickname){
		todasLasTuplas(nickname);
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getLectura() < 6.5) {
				sugerenciasBajo();
			}
			if (lista.get(i).getLectura() > 7.5) {
				sugerenciasPhALto();
			}
		}
	}
	public void sugerenciasPhALto(){
		String sql = "select p.nombre_proveedores, i.nombre_insumo, i.unidad_insumo, i.valor_insumo"
				+ " from p proveedores, i insumo"
				+ " where nombre_insumo = 'Azufre'"
				+ " and nombre_insumo = 'Sulfato de hierro';";
		Statement comando;
		try {
			comando = conexion.getConexion().createStatement();
			ResultSet registro;
			registro = comando.executeQuery(sql);

			while (registro.next()) {
				Insumo s = new Insumo(registro.getString(1), registro.getString(2), registro.getString(3), registro.getString(4));
				listaInsumos.add(s);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sugerenciasBajo(){
		String sql = "select p.nombre_proveedores, i.nombre_insumo, i.unidad_insumo, i.valor_insumo"
				+ " from p proveedores, i insumo"
				+ " where nombre_insumo = 'Kg/ha cal viva'"
				+ " and nombre_insumo = 'Kg/ha cal caliza';";
		Statement comando;
		try {
			comando = conexion.getConexion().createStatement();
			ResultSet registro;
			registro = comando.executeQuery(sql);

			while (registro.next()) {
				Insumo s = new Insumo(registro.getString(1), registro.getString(2), registro.getString(3), registro.getString(4));
				listaInsumos.add(s);

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

	public ArrayList<Insumo> getListaInsumos() {
		return listaInsumos;
	}

	public void setListaInsumos(ArrayList<Insumo> listaInsumos) {
		this.listaInsumos = listaInsumos;
	}

}
