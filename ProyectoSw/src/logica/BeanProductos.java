package logica;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BeanProductos {
	
	private ConexionBD conexion;
	private ArrayList<Producto> lista;
	
	public BeanProductos(){
		conexion = ConexionBD.getInstancia();
	}
	
	public void todasLasTuplas(String producto) {
		lista = new ArrayList<Producto>();
		String sql = "select p.id_producto, p.nombre_producto, p.unidad_producto, "
				+ " d.nombre_distribuidor, p.cantidad_maxima, p.valor_producto, p.valor_total "
				+ "from d distribuidores, p producto "
				+ "where d.id_distribuidores = p.Distribuidores_id_distribuidos "
				+ "and p.nombre_producto = '"+producto+"';";
		
		Statement comando;
		try {
			comando = conexion.getConexion().createStatement();
			ResultSet registro;
			registro = comando.executeQuery(sql);

			while (registro.next()) {
				Producto s = new Producto(registro.getString(1), registro.getString(2),
						registro.getString(3), registro.getString(4), registro.getString(5),
						registro.getString(6), registro.getString(7));
				lista.add(s);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Producto> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Producto> lista) {
		this.lista = lista;
	}



}
