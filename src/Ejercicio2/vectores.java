package Ejercicio2;

import java.util.*;
import java.util.Random;

public class vectores {

	private ArrayList<Integer> l = new ArrayList<Integer>();

	public void rellenarVector(int n) {

		Random r = new Random();

		for (int i = 0; i < n; i++)
			l.add(1 + r.nextInt(10));
		
	}

	public void imprimirVectorD() {
		System.out.println("Del derecho");
		for (Integer i : l)
			System.out.print(i + " ");
		System.out.println("");
	}

	public void imprimirVectorR() {
		System.out.println("Del reves");
		for (int i = l.size() - 1; i >= 0; i--)
			System.out.print(l.get(i) + " ");
	}

}
