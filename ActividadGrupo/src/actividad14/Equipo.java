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
	
	// Método CHRISTIAN
    public void mostrarJugadores() {
        System.out.println("Jugadores del equipo " + nombre + ": " + jugadores);
    }

    // Método CHRISTIAN
    public int existeJugador(String jugador) {
        return jugadores.length;
    }

}
