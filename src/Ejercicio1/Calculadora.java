package Ejercicio1;
import java.util.*;

public class Calculadora {
	
	public int pedirNumero () {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserte un número");
	
		try {
				return s.nextInt();	
		}catch (InputMismatchException e) {
					return -23697;
				}
	}
	
	//SUMAR
	public double sumar (double x, double y) {
		return x+y;
	}
	
	//RESTAR
	public double restar (double x, double y) {
		return x-y;	
	}
	
	//MULTIPLICAR
	public double multiplicar (double x, double y) {
		return x*y;
	}
	
	//DIVIDIR
	public double dividir (double x, double y) {
		return x/y;	
	}
	
}
	

