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
	
<<<<<<< HEAD
	// Método CHRISTIAN
    public void mostrarJugadores() {
        System.out.println("Jugadores del equipo " + nombre + ": " + jugadores);
    }

    // Método CHRISTIAN
    public int existeJugador(String jugador) {
        return jugadores.length;
    }
=======
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
>>>>>>> 047b28a88aac79b2367b0115555a83e513a8fee3

}
