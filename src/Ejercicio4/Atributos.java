package Ejercicio4;

import java.util.ArrayList;

public class Atributos {
	private String Nombre;
	private String Apellido;
	private String Calle;
	private long Telefono;
	private ArrayList<String> aficiones = new ArrayList<String>();
	
	public void setNombre(String n) {
		this.Nombre = n;
	}
	
	public void setApellido (String apellido) {
		this.Apellido = apellido;
	}
	
	public void setCalle (String c) {
		this.Calle = c;
	}
	
	public void setTelefono (long l) {
		this.Telefono = l;
	}
	
	public void addAficion (String s) {
		this.aficiones.add(s);
	}
	
	public void emptyAficiones () {
		aficiones.clear();
	}
	
	@Override
	public String toString() {
		String s = "Nombre: " + Nombre + "\nApellido: " + Apellido + 
				"\nCalle: " + Calle + "\nTelefono: " + Telefono + 
				"\nAficiones: ";
		
		for(String aficion: aficiones)
			s += aficion + " ";
	
		return s;
	}
}
