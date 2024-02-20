package actividad13;

import java.util.Scanner;

public class MainEquipo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear array para los equipos
        Equipo[] equipos = new Equipo[2];

        // Pedir datos para el primer equipo
        System.out.println("Introduce los datos para el primer equipo:");
        System.out.print("Nombre del equipo: ");
        String nombreEquipo1 = scanner.nextLine();
        System.out.print("Número de jugadores: ");
        int numJugadoresEquipo1 = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        String[] jugadoresEquipo1 = new String[numJugadoresEquipo1];
        for (int i = 0; i < numJugadoresEquipo1; i++) {
            System.out.print("Nombre del jugador " + (i + 1) + ": ");
            jugadoresEquipo1[i] = scanner.nextLine();
        }
        equipos[0] = new Equipo(nombreEquipo1, jugadoresEquipo1);

        // Pedir datos para el segundo equipo
        System.out.println("\nIntroduce los datos para el segundo equipo:");
        System.out.print("Nombre del equipo: ");
        String nombreEquipo2 = scanner.nextLine();
        System.out.print("Número de jugadores: ");
        int numJugadoresEquipo2 = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        String[] jugadoresEquipo2 = new String[numJugadoresEquipo2];
        for (int i = 0; i < numJugadoresEquipo2; i++) {
            System.out.print("Nombre del jugador " + (i + 1) + ": ");
            jugadoresEquipo2[i] = scanner.nextLine();
        }
        equipos[1] = new Equipo(nombreEquipo2, jugadoresEquipo2);

        // Recorrer el array de equipos y probar los métodos
        for (Equipo equipo : equipos) {
            System.out.println("\n" + equipo);
            equipo.mostrarJugadores();
            System.out.println("Número de jugadores: " + equipo.cantidadDeJugadores());
            System.out.println("¿Es apto para jugar?: " + equipo.aptoParaJugar());

            // Verificar si un jugador existe
            System.out.print("Introduce el nombre de un jugador para verificar si existe en el equipo: ");
            String nombreJugador = scanner.nextLine();
            System.out.println("¿Existe el jugador " + nombreJugador + "?: " + equipo.existeJugador(nombreJugador));

            // Verificar si otra lista de jugadores es igual a la lista del equipo
            System.out.println("¿La lista de jugadores es igual a la lista del equipo?: " + equipo.listasIguales(new Equipo("Temporal", jugadoresEquipo1)));

            // Verificar si otro equipo es igual a este
            System.out.println("¿El equipo es igual al primer equipo introducido?: " + equipo.equiposIguales(equipos[0]));
        }

        scanner.close();
    }
}

