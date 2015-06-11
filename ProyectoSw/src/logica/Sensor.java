package logica;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "sensor")
@ViewScoped
public class Sensor implements Serializable {
	
	private String nombre;
	private float lectura;
	
	public Sensor() {
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
