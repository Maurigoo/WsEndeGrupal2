package actividad14;

import java.util.Arrays;

public class Equipo {
	
	String nombre;
	String[] jugadores;
	
	public Equipo() {
	}
	
	public Equipo(String nombre, String[] jugadores) {
		this.nombre = nombre;
		this.jugadores = jugadores;
	}

	public String toString() {
		return "Equipo [nombre=" + nombre + ", jugadores=" +
				Arrays.toString(jugadores) + "]";
	}
	

}
