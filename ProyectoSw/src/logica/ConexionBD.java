package logica;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "conexionbd")
@ViewScoped
public class ConexionBD implements Serializable {
	
	private static ConexionBD instancia;
	private Connection conexion;

	public ConexionBD() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conexion = DriverManager.getConnection(
					"jdbc:mysql://localhost/ecoagro", "root", "");
			System.out.println("Conexion hecha! :D");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static ConexionBD getInstancia(){
		if (instancia == null) {
			instancia = new ConexionBD();			
		}
		return instancia;
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

}
