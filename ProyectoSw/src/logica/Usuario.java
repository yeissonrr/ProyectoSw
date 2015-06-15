package logica;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "usuario")
@ViewScoped
public class Usuario implements Serializable {
	private String nombre;
	private String apellido;
	private String correo;
	private String identificacion;
	private String telefono;
	private String ubicacion;
	private String nickname;
	private String contrase�a;

	public Usuario() {
		this.nombre = "";
		this.apellido = "";
		this.identificacion = "";
		this.telefono = "";
		this.correo = "";
		this.ubicacion = "";
		this.nickname = "";
		this.contrase�a = "";
	}

	public Usuario(String nombre, String apellido, String correo,
			String identificacion, String telefono, String ubicacion,
			String nickname, String contrase�a) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.identificacion = identificacion;
		this.telefono = telefono;
		this.ubicacion = ubicacion;
		this.nickname = nickname;
		this.contrase�a = contrase�a;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

}
