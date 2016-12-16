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
public class Buffer {

    boolean leido = true;
    String[] lista = new String[10];
    int elementos = 0;
    int insertar = 0;
    int recoger = 0;

    public String[] getLista() {
        return lista;
    }
    
    

    public synchronized void leer() {

        while (!leido || recoger < (elementos-lista.length)) {
            try {
                wait();

            } catch (InterruptedException e) {
                System.err.println("Buffer: error en get: " + e.getMessage());

            }
        }
        leido = false;
        System.out.println(lista[recoger % lista.length]);
        recoger++;
        elementos--;
        leido = true;
        notifyAll();
    }

    public synchronized void escribir(String texto) {

        while (!leido || insertar < (elementos + lista.length)) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("Buffer: error en get: " + e.getMessage());
            }
        }
        leido = false;
        lista[insertar % lista.length] = texto;
        insertar++;
        elementos++;
        leido = true;
        notifyAll();
    }

}
