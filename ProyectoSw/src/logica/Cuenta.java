package logica;

public class Cuenta {
	private String numeroCuenta;
	private String tipoCuenta;
	private String Banco;

	public Cuenta() {
		this.numeroCuenta = "";
		this.tipoCuenta = "";
		this.Banco = "";
	}

	public Cuenta(String numeroCuenta, String tipoCuenta, String banco) {
		this.numeroCuenta = numeroCuenta;
		this.tipoCuenta = tipoCuenta;
		this.Banco = banco;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}

}
