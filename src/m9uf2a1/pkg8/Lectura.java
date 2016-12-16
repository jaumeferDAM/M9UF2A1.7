package m9uf2a1.pkg8;

/**
 *
 * @author alumnedam
 */
public class Lectura implements Runnable {

    Buffer buffer;
//    String cadena;
//    private final int idconsumidor;
    public String[] lista = new String[10];

    public Lectura(Buffer buffer) {
        this.buffer = buffer;
        lista = buffer.getLista();
    }

    /**
     * Implementación de la hebra
     */
    @Override
    public void run() {
        while (Boolean.TRUE) {
            System.out.println("Consumidor x mostra la cadena: " + lista[0]);
        }
    }
}
