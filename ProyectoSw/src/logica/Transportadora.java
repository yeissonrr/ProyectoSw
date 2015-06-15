package logica;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "transportadora")
@ViewScoped
public class Transportadora implements Serializable {
	private String id;
	private String nombre;
	private String correo;
	private String precioKM;
	private String PrecioKG;
	
	public Transportadora(){
		id = "";
		nombre = "";
		correo = "";
		precioKM = "";
		PrecioKG = "";		
	}
	public Transportadora(String id, String nombre, String correo, String precioKM, String precioKG ){
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.precioKM = precioKM;
		this.PrecioKG = precioKG;		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getPrecioKM() {
		return precioKM;
	}
	public void setPrecioKM(String precioKM) {
		this.precioKM = precioKM;
	}
	public String getPrecioKG() {
		return PrecioKG;
	}
	public void setPrecioKG(String precioKG) {
		PrecioKG = precioKG;
	}
	
}
