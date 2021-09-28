public class Controlador {
    public static void main(String[] args) {
        // try {
        Vista view = new Vista();
        simuladorBatallas simulador = new simuladorBatallas();
        int opcionInicio = 0;
        int cantidadJugadores;
        int cantidadEnemigos = 0;

        view.bienvenida();

        while (opcionInicio != 3) {
            opcionInicio = view.menuInicio();

            switch (opcionInicio) {
                case 1: // Ingresar nuevos jugadores
                    cantidadJugadores = view.cantidadJugadores(); // pregunta cuantos jugadores desean jugar

                    // ingresar datos de cada jugador
                    for (int i = 0; i < cantidadJugadores; i++) {
                        view.Jugador(i);
                        String nombre = view.nombre();
                        int tipo = view.tipoJugador();

                        if (tipo == 1) {
                            // Guerrero
                            Guerrero guerrero = new Guerrero(nombre, 500, 30, i, 2);
                            simulador.setJugadores(guerrero);

                        } else if (tipo == 2) {
                            // Explorador
                            Explorador explorador = new Explorador(nombre, 200, 10, i, 5);
                            simulador.setJugadores(explorador);
                        } else {
                            view.opcionInvalida();
                        }
                    }

                    view.Jugadores(simulador.getJugadores());

                    break;

                case 2:// Comenzar nueva batalla
                    /*
                     * cantidadEnemigos = view.cantidadEnemigos(); simulador = new
                     * simuladorBatallas(cantidadJugadores, cantidadEnemigos); view.inicioBatalla();
                     */
                    break;

                case 3:// Salir
                    break;
            }
        }
        // } catch (Exception e) {
        // System.out.println("Ha ocurrido un error");
        // }
    }
}
