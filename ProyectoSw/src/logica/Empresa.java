package logica;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "empresa")
@ViewScoped
public class Empresa implements Serializable {
	private int id;
	private String nombre;
	private String correo;
	private String dirrecion;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDirrecion() {
		return dirrecion;
	}
	public void setDirrecion(String dirrecion) {
		this.dirrecion = dirrecion;
	}
	public Empresa(){
		id = 0;
		nombre = "";
		correo = "";
		dirrecion = "";
	}
	public Empresa(int id, String nombre, String correo, String dirrecion){
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.dirrecion = dirrecion;
	}

}
