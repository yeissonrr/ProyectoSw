package logica;

public class Producto {
	private String id; 
	private String nombre; 
	private String unidad; 
	private String nombre_empresa;
	private String cantidad_max;
	private String valor_producto;
	private String valor_total;
	
	public Producto (String id, String nombre, String unidad,
			String nombre_empresa, String cantidad_max,
			String Valor_producto, String valor_total){
		this.id = id;
		this.nombre = nombre;
		this.unidad = unidad;
		this.nombre_empresa = nombre_empresa;
		this.cantidad_max = cantidad_max;
		this.valor_producto = valor_total;
		this.valor_total = valor_total;
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

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getNombre_empresa() {
		return nombre_empresa;
	}

	public void setNombre_empresa(String nombre_empresa) {
		this.nombre_empresa = nombre_empresa;
	}

	public String getCantidad_max() {
		return cantidad_max;
	}

	public void setCantidad_max(String cantidad_max) {
		this.cantidad_max = cantidad_max;
	}

	public String getValor_producto() {
		return valor_producto;
	}

	public void setValor_producto(String valor_producto) {
		this.valor_producto = valor_producto;
	}

	public String getValor_total() {
		return valor_total;
	}

	public void setValor_total(String valor_total) {
		this.valor_total = valor_total;
	}

}
