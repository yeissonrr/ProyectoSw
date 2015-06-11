package logica;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "transportadora")
@ViewScoped
public class Transportadora implements Serializable {
	private int id;
	private String nombre;
	private String correo;
	private int precioKM;
	private int PrecioKG;
	
	public Transportadora(){
		id = 0;
		nombre = "";
		correo = "";
		precioKM = 0;
		PrecioKG = 0;		
	}
	public Transportadora(int id, String nombre, String correo, int precioKM, int precioKG ){
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.precioKM = precioKM;
		this.PrecioKG = precioKG;		
	}
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
	public int getPrecioKM() {
		return precioKM;
	}
	public void setPrecioKM(int precioKM) {
		this.precioKM = precioKM;
	}
	public int getPrecioKG() {
		return PrecioKG;
	}
	public void setPrecioKG(int precioKG) {
		PrecioKG = precioKG;
	}
	

}
