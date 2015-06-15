package logica;

public class Insumo {
	private String nombre;
	private String proveedor;
	private String unidad;
	private String valor;
	
	public Insumo(String nombre, String proveedor, String unidad, String valor){
		this.nombre = nombre;
		this.proveedor = proveedor;
		this.unidad = unidad;
		this.valor = valor;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
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
}
