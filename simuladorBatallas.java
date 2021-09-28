import java.util.ArrayList;

public class simuladorBatallas {
    private int turno = 0;
    private int cantidadJugadores;
    private int cantidadEnemigos;

    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    private ArrayList<Enemigo> enemigos = new ArrayList<Enemigo>();

    public void setJugadores(Jugador jugador) {
        
        jugadores.add(jugador);
    }

    public int inicioBatalla() {
        turno++;

        return turno;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public ArrayList<Enemigo> getEnemigos() {
        return enemigos;
    }

    public int getTurno() {
        return turno;
    }
}
