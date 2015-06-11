package logica;

public class Usuario {
	private String nombre;
	private String apellido;
	private String identificacion;
	private String telefono;
	private String correo;
	private String ubicacion;
	private String nickname;
	private String contraseña;

	public Usuario() {
		this.nombre = "";
		this.apellido = "";
		this.identificacion = "";
		this.telefono = "";
		this.correo = "";
		this.ubicacion = "";
		this.nickname = "";
		this.contraseña = "";
	}

	public Usuario(String nombre, String apellido, String identificacion,
			String telefono, String correo, String ubicacion, String nickname,
			String contraseña) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacion = identificacion;
		this.telefono = telefono;
		this.correo = correo;
		this.ubicacion = ubicacion;
		this.nickname = nickname;
		this.contraseña = contraseña;
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

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

}
