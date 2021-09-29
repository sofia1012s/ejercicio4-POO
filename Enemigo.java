public class Enemigo extends Combatiente {

    public Enemigo(String nombre, int puntosVida, int poderAtaque, int turno, int items) {
        super(nombre, puntosVida, poderAtaque, turno, items);
    }

    public void setPuntosVida(int puntos){
        puntosVida = puntos;
    }

    public void atacar(Jugador jugador) {
        int vidaJugador = jugador.getPuntosVida();
        vidaJugador = vidaJugador - poderAtaque;
        jugador.setPuntosVida(vidaJugador);
    }
}
