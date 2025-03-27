/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author karin
 */
public class ThredSimple extends Thread {

    @Override
    public void run() {
        System.out.println("Se inicia el metodo run del Hilo  :" + getName());
        for (int i = 0; i < 100; i++) {
            
           
            System.out.println("Hilo:"+ getName());
            
        }
        System.out.println("hilo finalizado" + getName());
    }

    public ThredSimple(String name) {
        super(name);
    }
    
    
}
