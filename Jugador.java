public class Jugador extends Combatiente {

    // 0. Restaura 10 puntos de vida
    // 1. Ataca con el doble de daño
    // 2. El enemigo se ataca a sí mismo al atacar al jugador
    // 3. Utiliza un escudo protector que hace al jugador inmune al ataque
    // 4. Convoca a los otros jugadores para atacar

    public Jugador(String nombre, int puntosVida, int poderAtaque, int turno, int items) {
        super(nombre, puntosVida, poderAtaque, turno, items);
    }

    public void items(int op, Enemigo enemigo) {
        switch (op) {
            case 1:
                puntosVida = puntosVida + 10;
                break;
            case 2:
                poderAtaque = poderAtaque * 2;

            case 3:
                enemigo.getPoderAtaque();
                poderAtaque = enemigo.poderAtaque;
            default:
                break;
        }
    }

    public void enemigo(Enemigo enemigo) {

    }
}
