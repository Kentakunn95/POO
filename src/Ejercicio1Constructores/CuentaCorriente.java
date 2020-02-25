package Ejercicio1Constructores;

public class CuentaCorriente {
	private String cliente;
	private double cantidad;
	
	public CuentaCorriente(String nombre, double euros) {
		// Se crea el objeto
		this.cliente = nombre;
		this.cantidad = euros;
	}
	
	public CuentaCorriente(String nombre) {
		// Se crea el objeto
		this.cliente = nombre;
		this.cantidad = 0;
	}
	
	public void ingresar (double dinero) {
		this.cantidad += dinero;
	}
	
	public int retirar (double dinero) {
		if(this.cantidad - dinero >= 0) {
			this.cantidad -= dinero;
			return 0;
		}
		else
			return -1;
	}
	
	public String getCliente () {
		return this.cliente;
	}
	
	public double getCantidad() {
		return this.cantidad;
	}
	
	public void setCliente (String nombre) {
		this.cliente = nombre;
	}
	
	public void setCantidad(double dinero) {
		this.cantidad = dinero;
	}

}
