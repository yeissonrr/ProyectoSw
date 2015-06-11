package logica;

public class Transacciones {
	private String nombreEmpresa;
	private String producto;
	private int totalTransaccion;
	private String cuentaTransaccion;
	private String ubicacion;
	private int cantidad;
	private String comentario;
	private boolean aprobado;
	private boolean terminada;
	private boolean leida;

	public Transacciones() {
		this.nombreEmpresa = "";
		this.producto = "";
		this.totalTransaccion = 0;
		this.cuentaTransaccion = "";
		this.ubicacion = "";
		this.cantidad = 0;
		this.comentario = "";
		this.aprobado = false;
		this.terminada = false;
		this.leida = false;
	}

	public Transacciones(String nombreEmpresa, String producto,
			int totalTransaccion, String cuentaTransaccion, String ubicacion,
			int cantidad, String comentario, boolean aprobado,
			boolean terminada, boolean leida) {

		this.nombreEmpresa = nombreEmpresa;
		this.producto = producto;
		this.totalTransaccion = totalTransaccion;
		this.cuentaTransaccion = cuentaTransaccion;
		this.ubicacion = ubicacion;
		this.cantidad = cantidad;
		this.comentario = comentario;
		this.aprobado = aprobado;
		this.terminada = terminada;
		this.leida = leida;

	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getTotalTransaccion() {
		return totalTransaccion;
	}

	public void setTotalTransaccion(int totalTransaccion) {
		this.totalTransaccion = totalTransaccion;
	}

	public String getCuentaTransaccion() {
		return cuentaTransaccion;
	}

	public void setCuentaTransaccion(String cuentaTransaccion) {
		this.cuentaTransaccion = cuentaTransaccion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public boolean isAprobado() {
		return aprobado;
	}

	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}

	public boolean isTerminada() {
		return terminada;
	}

	public void setTerminada(boolean terminada) {
		this.terminada = terminada;
	}

	public boolean isLeida() {
		return leida;
	}

	public void setLeida(boolean leida) {
		this.leida = leida;
	}

}
