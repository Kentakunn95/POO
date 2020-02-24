package Ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class listaDeActores {

	public static void menu(listaDeActores m) {
		
		int opcion;
		Scanner s = new Scanner(System.in);
		do {
			
		System.out.println("Elija una opción");
		System.out.println("1) Para agregar nombre");
		System.out.println("2) Para modificar nombre");
		System.out.println("3) Para borrar nombre");
		System.out.println("4) Para buscar el nombre del que quiera saber su posicion");
		System.out.println("5) Para visualizar los nombres");
		System.out.println("6) Para ver la cantidad de actores");
		System.out.println("7) SALIR");
		
		opcion = s.nextInt();
		s.nextLine();
		
		if(opcion>0 && opcion < 7)
			comenzar(opcion);
		else if (opcion <=0 || opcion > 7)
			System.out.println("Opción inválida");
		} while (opcion!= 7);
		}
	

	public static void comenzar(listaDeActores m) {

		int opcion;
		Scanner s = new Scanner(System.in);

			switch (opcion) {
			case 1:
				System.out.println("Inserte el nombre que quiere agregar");
				m.addNombre(s.nextLine());
				break;

			case 2:
				System.out.println("Inserte el nombre que desea modificar");
				num1 = s.nextLine();
				System.out.println("¿Cuál será el nuevo nombre?");
				num2 = s.nextLine();
				list.
				break;

			case 3:
				System.out.println("Inserte el nombre que desea borrar");
				if(list.borrarNombre(s.nextLine()))
				break;

			case 4:
				System.out.println("Inserte el nombre de la persona para saber su posición");
				
				break;

			case 5: // VISUALIZA LOS NOMBRES

				break;

			case 6: // CANTIDAD DE ACTORES

				break;

			case 7:
				break;
			}
	}

	private ArrayList<String> list = new ArrayList<String>();

	public int agregarNombre(listaDeActores m) {
		if(actores.contains(n) == false)
		actores.add(n);
		return 0;
	}

	public void visualizarNombre(listaDeActores m) {
		System.out.println(m);
	}

	public void modificarNombre(listaDeActores m) {
		if(actores.contains(nombreViejo))
			actores.set(actores.IndexOf(nombreViejo),nombreNuevo)
	}

	public int borrarNombre(listaDeActores m) {
		System.out.println("")
		return 0;

	}

	public int cantidadActores(listaDeActores m) {
		return actores.size;
	}
	
	public void buscarNombre(listaDeActores m) {

	}
	
	@Override
	public String toString() {
		String s = "LISTA DE ACTORES:\n";
		for(String actor: actores)
			s+= 
	}
	


}
