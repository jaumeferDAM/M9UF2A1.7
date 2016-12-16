package m9uf2a1.pkg8;

import java.util.Random;

/**
 *
 * @author Jorge
 */
public class Escritura implements Runnable {

    private final Random aleatorio;
    private String[] listaStrings = new String[10];
    private final int TIEMPOESPERA = 1500;
    private int elementos = listaStrings.length;
    private int insertar = 0;
    private int recoger = 0;
    public Buffer buffer = new Buffer();

    public Escritura() {
        this.aleatorio = new Random();
    }

    public String[] getListaStrings() {
        return listaStrings;
    }

    public void setListaStrings(String[] listaStrings) {
        this.listaStrings = listaStrings;
    }

    @Override
    /**
     * Implementación de la hebra
     */
    public void run() {
        while (Boolean.TRUE) {

            buffer.escribir("holamundo");
            insertar++;
            try {
                Thread.sleep(TIEMPOESPERA);
            } catch (InterruptedException e) {
                System.err.println(": Error en run -> " + e.getMessage());
            }
        }
    }
}
