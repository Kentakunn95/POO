package Ejercicio4;

import java.util.Scanner;

public class Metodos {

	public void cargarDatos(Atributos p) {
		
		Scanner s = new Scanner(System.in);
		String st;
		
		System.out.println("Inserte el nombre de la persona");
		st = s.nextLine();
		p.setNombre(st);
		
		System.out.println("Inserte el apellido de la persona");
		p.setApellido(s.nextLine());
		
		System.out.println("Inserte la calle de la persona");
		p.setCalle(s.nextLine());
		
		System.out.println("Inserte el teléfono de la persona");
		p.setTelefono(s.nextLong());
		s.nextLine();
		
		System.out.println("Inserte las tres aficiones");
		p.addAficion(s.nextLine());
		p.addAficion(s.nextLine());
		p.addAficion(s.nextLine());
	}
	
	public void mostrarDatos (Atributos p) {
		System.out.println(p);
	}
	
	public void cambiarDatos (Atributos p) {
		
		int opcion;
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("Inserte el dato a modificar");
			System.out.println("1.- Cambiar nombre");
			System.out.println("2.- Cambiar apellido");
			System.out.println("3.- Cambiar calle");
			System.out.println("4.- Cambiar telefono");
			System.out.println("5.- Cambiar aficiones");
			System.out.println("6.- Salir");
			
			opcion = s.nextInt();
			s.nextLine();
			
			switch(opcion) {
				case 1:
					System.out.println("Inserte el nombre de la persona");
					p.setNombre(s.nextLine());
					break;
				case 2:
					System.out.println("Inserte el apellido de la persona");
					p.setApellido(s.nextLine());
					break;
				case 3:
					System.out.println("Inserte la calle de la persona");
					p.setCalle(s.nextLine());
					break;
				case 4:
					System.out.println("Inserte el teléfono de la persona");
					p.setTelefono(s.nextLong());
					s.nextLine();
					break;
				case 5:
					p.emptyAficiones();
					System.out.println("Inserte las tres aficiones");
					p.addAficion(s.nextLine());
					p.addAficion(s.nextLine());
					p.addAficion(s.nextLine());
					break;
			}
		} while (opcion != 6);
	}
}