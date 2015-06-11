package logica;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "indice")
@ViewScoped
public class Indice implements Serializable {
	private String nombre;
	private String cantidad;
	private String unidad;
	private String valor;
	private String variacion;
	
	public Indice(){
		nombre ="";
		cantidad ="";
		unidad ="";
		valor ="";
		variacion ="";
	}
	public Indice(String nombre, String cantidad, String unidad, String valor, String variacion){
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.unidad = unidad;
		this.valor = valor;
		this.variacion = variacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getVariacion() {
		return variacion;
	}
	public void setVariacion(String variacion) {
		this.variacion = variacion;
	}
	

}

