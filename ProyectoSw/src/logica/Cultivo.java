package logica;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "cultivo")
@ViewScoped
public class Cultivo implements Serializable {
	private String nombreCultivo;
	private String fechaSembrado;
	private String fechaRecoleccion;

	public Cultivo() {
		this.nombreCultivo = "";
		this.fechaSembrado = null;
		this.fechaRecoleccion = null;
	}

	public Cultivo(String nombreCultivo, String fechaSembrado,
			String fechaRecoleccion) {
		this.nombreCultivo = nombreCultivo;
		this.fechaSembrado = fechaSembrado;
		this.fechaRecoleccion = fechaRecoleccion;

	}

	public String getNombreCultivo() {
		return nombreCultivo;
	}

	public void setNombreCultivo(String nombreCultivo) {
		this.nombreCultivo = nombreCultivo;
	}

	public String getFechaSembrado() {
		return fechaSembrado;
	}

	public void setFechaSembrado(String fechaSembrado) {
		this.fechaSembrado = fechaSembrado;
	}

	public String getFechaRecoleccion() {
		return fechaRecoleccion;
	}

	public void setFechaRecoleccion(String fechaRecoleccion) {
		this.fechaRecoleccion = fechaRecoleccion;
	}

	

}
