package logica;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "compra")
@ViewScoped
public class Compra implements Serializable {
	private String id;
	private String nombreProducto;
	private String cantidad;
	private String distribuidor;
	private String valor;
	private String confirmacion;
	
	public Compra(){
		id = "";
		nombreProducto ="";
		cantidad = "";
		distribuidor ="";
		valor ="";
		confirmacion = "";		
	}
	public Compra(String id, String nombreProducto, String cantidad, String distribuidor, String valor, String confirmacion){
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.cantidad = cantidad;
		this.distribuidor = distribuidor;
		this.valor = valor;
		this.confirmacion = confirmacion;		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getDistribuidor() {
		return distribuidor;
	}
	public void setDistribuidor(String distribuidor) {
		this.distribuidor = distribuidor;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getConfirmacion() {
		return confirmacion;
	}
	public void setConfirmacion(String confirmacion) {
		this.confirmacion = confirmacion;
	}

}
