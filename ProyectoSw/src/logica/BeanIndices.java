package logica;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "BeanIndices")
@ViewScoped
public class BeanIndices implements Serializable {
	
	private ConexionBD conexion;
	private ArrayList<Indice> lista;
	
	public BeanIndices(){
		conexion = ConexionBD.getInstancia();
	}
	
	public void todasLasTuplas() {
		lista = new ArrayList<Indice>();

		String sql = "select * from indices";
		Statement comando;
		try {
			comando = conexion.getConexion().createStatement();
			ResultSet registro;
			registro = comando.executeQuery(sql);

			while (registro.next()) {
				Indice i = new Indice(registro.getString(1),
						registro.getString(2), registro.getString(3),
						registro.getString(4), registro.getString(5));
				lista.add(i);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Indice> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Indice> lista) {
		this.lista = lista;
	}

}
