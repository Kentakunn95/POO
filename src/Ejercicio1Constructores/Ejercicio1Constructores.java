package Ejercicio1Constructores;

public class Ejercicio1Constructores {
	
	public static void main (String[] args) {
		CuentaCorriente c1 = new CuentaCorriente("Cliente 1", 100);
		CuentaCorriente c2 = new CuentaCorriente("Cliente 2", 200);
		CuentaCorriente c3 = new CuentaCorriente("Cliente 3", 300);
		
		Sucursal s = new Sucursal(c1, c2, c3);
		s.operar();
	}
}
