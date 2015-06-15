package logica;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "perfilbean")
@ViewScoped
public class PerfilBean implements Serializable {

	private ConexionBD bd;
	private ArrayList<Usuario> lista;
	private Usuario usuario;

	public PerfilBean() {
		bd = ConexionBD.getInstancia();
		lista = new ArrayList<Usuario>();
	}

	public Usuario todasLasTuplas() {
		String sql = "select * from usuarios where nick_usuario = 'SrCyco'";
		Statement comando;
		try {
			comando = bd.getConexion().createStatement();
			ResultSet registro;
			registro = comando.executeQuery(sql);

			while (registro.next()) {
				usuario = new Usuario(registro.getString(1),
						registro.getString(2), registro.getString(3),
						registro.getString(4), registro.getString(5),
						registro.getString(6), registro.getString(7),
						registro.getString(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuario;

	}

	public void actualizar(String nombre, String apellido, String correo,
			String identificacion, String telefono, String ubicacion,
			String contraseña) {

		String sql = "UPDATE usuarios set nombre_usuario='" + nombre
				+ "', apellido_usuario = '" + apellido
				+ "', correo_usuario = '" + correo
				+ "', identificacion_usuario = '" + identificacion
				+ "', telefono_usuario = '" + telefono
				+ "', ubicacion_usuario = '" + ubicacion
				+ "', contraseña_usuario = '" + contraseña
				+ "' where nick_usuario ='SrCyco';";
		Statement sentencia;
		try {
			sentencia = bd.getConexion().createStatement();
			sentencia.executeUpdate(sql);
			sentencia.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void prueba() {
		String holis = "holiiis";
		System.out.println(holis);

	}

	public ArrayList<Usuario> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Usuario> lista) {
		this.lista = lista;
	}

	public Usuario getUsuario() {
		setUsuario(todasLasTuplas());
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
