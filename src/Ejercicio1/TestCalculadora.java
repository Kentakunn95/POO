package Ejercicio1;

import java.util.*;

public class TestCalculadora {

	public static void main(String[] args) {

		Calculadora c = new Calculadora();
		double x, y;
		int menu = 0;
		Scanner s = new Scanner(System.in);

		do {

			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Salir");
			menu = s.nextInt();
			s.nextLine();


			do {
				x = c.pedirNumero();
			} while (x == -23697);

			do {
				y = c.pedirNumero();
			} while (y == -23697);

			switch (menu) {
			case 1:
				System.out.println(c.sumar(x,  y));
				break;

			case 2:
				System.out.println(c.restar(x,  y));
				break;

			case 3:
				System.out.println(c.multiplicar(x,  y));
				break;

			case 4:
				System.out.println(c.dividir(x,  y));
				break;

			case 5:
				break;
			}
			
		} while (menu != 5);
		
		s.close();
	}

}
