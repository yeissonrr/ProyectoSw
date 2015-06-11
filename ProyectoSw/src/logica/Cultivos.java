package logica;

import java.util.Date;

public class Cultivos {
	private String nombreCultivo;
	private Date fechaSembrado;
	private Date fechaRecoleccion;

	public Cultivos() {
		this.nombreCultivo = "";
		this.fechaSembrado = null;
		this.fechaRecoleccion = null;
	}

	public Cultivos(String nombreCultivo, Date fechaSembrado,
			Date fechaRecoleccion) {
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

	public Date getFechaSembrado() {
		return fechaSembrado;
	}

	public void setFechaSembrado(Date fechaSembrado) {
		this.fechaSembrado = fechaSembrado;
	}

	public Date getFechaRecoleccion() {
		return fechaRecoleccion;
	}

	public void setFechaRecoleccion(Date fechaRecoleccion) {
		this.fechaRecoleccion = fechaRecoleccion;
	}

}
