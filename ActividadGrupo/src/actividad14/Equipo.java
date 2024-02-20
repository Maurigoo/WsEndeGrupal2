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
	
	public String cantidadDeJugadores() {
		return "El número de jugadores que tiene el equipo es: " + jugadores.length;
	}
	
	public boolean aptoParaJugar() {
		if(jugadores.length >= 7) {
			return true;
		} else {
			return false;
		}
	}

}
