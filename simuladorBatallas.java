import java.util.ArrayList;

public class simuladorBatallas {
    private int turno = 0;

    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    private ArrayList<Enemigo> enemigos = new ArrayList<Enemigo>();

    public void setJugadores(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void setEnemigos(Enemigo enemigo) {
        enemigos.add(enemigo);
    }

    public int nuevoTurno() {
        turno++;

        if(turno + 1 > jugadores.size() || turno + 1 > enemigos.size()){
            turno = 0;
        }
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

    public void ataqueJugador(){
        jugadores.get(turno).atacar(enemigos.get(turno));
    }

    public void ataqueEnemigo(){
        enemigos.get(turno).atacar(jugadores.get(turno));
    }

}
