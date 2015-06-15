package logica;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BeanInsumos {

	private ConexionBD conexion;
	private ArrayList<Insumo> listaInsumos;
	private ArrayList<String> lista;
	
	public BeanInsumos(){
		conexion = ConexionBD.getInstancia();
	}
	
	public void todasLasTuplas() {
		lista = new ArrayList<String>();

		String sql = "select nombre_insumo "
				+ " group by nombre_insumo;";
		Statement comando;
		try {
			comando = conexion.getConexion().createStatement();
			ResultSet registro;
			registro = comando.executeQuery(sql);
			while (registro.next()) {
				lista.add(registro.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void sugerenciasPhALto(String producto){
		listaInsumos = new ArrayList<Insumo>();
		String sql = "select p.nombre_proveedores, i.nombre_insumo, i.unidad_insumo, i.valor_insumo"
				+ " from p proveedores, i insumo"
				+ " where nombre_insumo = '"+producto+"'"
						+ " and p.id_proveedores = i.proveedores_id_prodeedores;";
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

	public ArrayList<String> getLista() {
		return lista;
	}

	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}

	public ArrayList<Insumo> getListaInsumos() {
		return listaInsumos;
	}

	public void setListaInsumos(ArrayList<Insumo> listaInsumos) {
		this.listaInsumos = listaInsumos;
	}

}
