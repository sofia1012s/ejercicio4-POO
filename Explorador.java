public class Explorador extends Jugador {

    public Explorador(String nombre, int puntosVida, int poderAtaque, int turno,int items) {
        super(nombre, puntosVida, poderAtaque, turno, items);
    }

    public int setPuntosVida() {
        this.puntosVida = 200;
        return puntosVida;
    }

    public int setPoderAtaque() {
        this.poderAtaque = 10;
        return poderAtaque;
    }

}
