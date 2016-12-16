package m9uf2a1.pkg8;

/**
 *
 * @author Jorge
 */
public class Lectura implements Runnable {

        String cadena;
//    private final int idconsumidor;

    public Lectura(String cadena) {
        this.cadena = cadena;
    }


    

    @Override
    /**
     * Implementación de la hebra
     */
    public void run() {
        while (Boolean.TRUE) {
            System.out.println("Consumidor x mostra la cadena: " + cadena);
        }
    }
}
