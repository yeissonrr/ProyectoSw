package logica;

public class Compras {
	private int id;
	private String nombreProducto;
	private int cantidad;
	private String distribuidor;
	private String valor;
	private boolean confirmacion;
	
	public Compras(){
		id = 0;
		nombreProducto ="";
		cantidad =0;
		distribuidor ="";
		valor ="";
		confirmacion = false;		
	}
	public Compras(int id, String nombreProducto, int cantidad, String distribuidor, String valor, boolean confirmacion){
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.cantidad = cantidad;
		this.distribuidor = distribuidor;
		this.valor = valor;
		this.confirmacion = confirmacion;		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
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
	public boolean isConfirmacion() {
		return confirmacion;
	}
	public void setConfirmacion(boolean confirmacion) {
		this.confirmacion = confirmacion;
	}
}
