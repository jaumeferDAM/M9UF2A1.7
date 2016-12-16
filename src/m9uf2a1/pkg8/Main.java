/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m9uf2a1.pkg8;

/**
 *
 * @author ALUMNEDAM
 */
public class Main {

    private static Thread escritura;
    private static Thread lectura;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        escritura = new Thread(new Escritura());
//        lectura = new Thread(new Lectura());
        
        escritura.start();
    }
    

}
