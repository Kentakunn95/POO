package Ejercicio1Constructores;

import java.util.ArrayList;
import java.util.Scanner;

public class Sucursal {
	
	private ArrayList<CuentaCorriente> clientes;
	
	public Sucursal (CuentaCorriente c1, CuentaCorriente c2, CuentaCorriente c3) {
		this.clientes = new ArrayList<>();
		this.clientes.add(c1);
		this.clientes.add(c2);
		this.clientes.add(c3);
	}
	
	public Sucursal (ArrayList<CuentaCorriente> l) {
		this.clientes = new ArrayList<>();
		
		for(CuentaCorriente c:l)
			this.clientes.add(c);
	}
	
	public void operar() {
		Scanner s = new Scanner(System.in);
		String aux;
		
		System.out.println("¿Quiere usted consultar algún cliente? (Sí/NO)");
		aux = s.nextLine();
		if(aux.equalsIgnoreCase("Sal")) {
			System.out.println("¿Cuál es el nombre del cliente?");
			this.obtenerCliente(s.nextLine());
		} else {
			System.out.println("¡Adiós! Gracias por su visita");
		}
	}
	
	public void obtenerCliente(String nombre) {
		
		for(CuentaCorriente c: clientes) {
			if(c.getCliente().equals(nombre)) {
				this.menu(c);
				return;
			} 
		}
		
		System.out.println("No se ha encontrado el cliente");
	}
	
	public void menu(CuentaCorriente cuenta) {
		
		int opcion;
		double dinero;
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("Inserte la opción correspondiente");
			System.out.println("1.- Ingresar dinero");
			System.out.println("2.- Retirar dinero");
			System.out.println("3.- Desplegar saldo");
			System.out.println("4.- Salir");
			
			opcion = s.nextInt();
			s.nextLine();
			
			switch(opcion) {
				case 1:
					System.out.println("¿Cuánto quieres ingresar?");
					dinero = s.nextDouble();
					s.nextLine();
					cuenta.ingresar(dinero);
					System.out.println("Dinero ingresado satisfactoriamente");
					break;
				case 2:
					System.out.println("¿Cuánto quieres retirar?");
					dinero = s.nextDouble();
					s.nextLine();
					if(cuenta.retirar(dinero) == -1)
						System.out.println("No hay dinero suficiente");
					else
						System.out.println("Dinero retirado satisfactoriamente");
					break;
				case 3:
					System.out.println("Saldo disponible: " + cuenta.getCantidad() + " euros");
					break;
					
				default:
			}
			
		} while (opcion != 4);
		
	}

}