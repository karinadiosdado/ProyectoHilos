/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package mx.edu.itses.kldm.hilos;

import threads.ThredSimple;

/**
 *
 * @author karin
 */
public class Hilos {

    public static void main(String[] args) throws InterruptedException {
// inicializacion de hilo extends 
        Thread hilo = new ThredSimple("juan");
        hilo.start();//Inicializar hilo
        System.out.println(hilo.getState());// estado del hilo

        // tiempo de espera 
        //Thread.sleep(10000);
        Thread hilo2 = new ThredSimple("jose");
        hilo2.start();//Inicializar hilo

    }
}
