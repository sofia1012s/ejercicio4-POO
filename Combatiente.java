public class Combatiente {
    protected String nombre;
    protected int puntosVida;
    protected int poderAtaque;
    protected int turno;
    protected boolean tomarTurno;
    protected int items;

    public Combatiente(String nombre, int puntosVida, int poderAtaque, int turno, int items) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.poderAtaque = poderAtaque;
        this.turno = turno;
        this.items = items;
    }

    public boolean tomarTurno() {
        tomarTurno = true;
        return tomarTurno;
    }

    public int tomarDano(Combatiente combatiente) {
        puntosVida = puntosVida - combatiente.getPoderAtaque();
        return puntosVida;
    }

    public void atacar(Combatiente combatiente) {
        int puntosVida = combatiente.getPuntosVida();
        combatiente.tomarDano(combatiente);
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public int getPoderAtaque() {
        return poderAtaque;
    }

    public int getTurno() {
        return turno;
    }

}
