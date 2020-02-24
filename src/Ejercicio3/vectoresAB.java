package Ejercicio3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class vectoresAB {

	private ArrayList<Integer> A = new ArrayList<Integer>();
	private ArrayList<Integer> B = new ArrayList<Integer>();
	private ArrayList<Integer> C = new ArrayList<Integer>();

	public vectoresAB rellenarVector(int n) {

		Random r = new Random();
		vectoresAB B = new vectoresAB();

		for (int i = 0; i < n; i++) {
			A.add(1 + r.nextInt(10));
		B.B.add(1 + r.nextInt(10));
		}
		return B;
	}

	public void sumarVector(int n) {

		for (int i = 0; i < n; i++)
			C.add(A.get(i) + B.get(i));
	}

	public void imprimirVectores() {
		for (Integer i : A)
			System.out.print(i + " ");
		System.out.println("");

		for (Integer i : B)
			System.out.print(i + " ");
		System.out.println("");

		for (Integer i : C)
			System.out.print(i + " ");
		System.out.println("");
	}
}
