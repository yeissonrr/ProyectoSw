package logica;

public class Sensores {
	
	private String nombre;
	private float lectura;
	
	public Sensores() {
		this.nombre = "";
		this.lectura = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getLectura() {
		return lectura;
	}

	public void setLectura(float lectura) {
		this.lectura = lectura;
	}

		
	
}
