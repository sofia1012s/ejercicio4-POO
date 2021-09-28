import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Vista {
    private Scanner scan = new Scanner(System.in);

    public void bienvenida() {
        System.out.println(
                "\n****************************************** Simulador de Batallas ******************************************");
        System.out.println("Bienvenid@ ! A continuacion encontrara distintas opciones para comenzar con la partida ");
    }

    public int menuInicio() {
        int opcion = 0;
        String s = "\nQue desea hacer?\n" + "1. Ingresar nuevos Jugadores\n" + "2. Comenzar nueva batalla\n"
                + "3. Salir\n";

        System.out.println(s);

        opcion = scan.nextInt();

        return opcion;
    }

    public void inicioBatalla() {
        System.out.println("Que comience el juego!\n");
    }

    public int cantidadJugadores() {
        int cantidadJugadores = 0;
        System.out.println("\nIngrese la cantidad de jugadores que participaran: \n");
        cantidadJugadores = scan.nextInt();

        return cantidadJugadores;
    }

    public int cantidadEnemigos() {
        int min = 1;
        int max = 10;

        Random random = new Random();

        int cantidadEnemigos = random.nextInt(max + min) + min;
        System.out.println("En esta partida, debe derrotar a " + cantidadEnemigos + " enemigos\n");

        return cantidadEnemigos;
    }

    public String nombre() {
        System.out.println("\nIngrese el nombre del jugador: ");
        String nombre = scan.next();

        return nombre;
    }

    public void Jugador(int num) {
        System.out.println("\nIngrese los datos del jugador " + num);
    }

    public int tipoJugador() {
        String s = "\nQue tipo de jugador desea?\n" + "\n1) Guerrerx: \n" + "-Puntos de vida: 500\n"
                + "-Puntos de ataque: 30\n" + "-Items para usar: 2 \n" + "\n2) Exploradorx: \n"
                + "-Puntos de vida: 200\n" + "-Puntos de ataque: 10\n" + "-Items para usar: 5 \n";
        System.out.println(s);

        int opcion = scan.nextInt();

        return opcion;
    }

    public void opcionInvalida() {
        System.out.println("Ha elegido una opcion invalida.");
    }

    public void Jugadores(ArrayList<Jugador> jugadores){
        System.out.println("Estos son los jugadores que participaran en la batalla:");

        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println("\nJugador " + i + " - " + jugadores.get(i).getNombre());
        }
    }


}
