/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti;

import java.util.TimerTask;

/**
 *
 * @author papepa
 */
public class timertask extends TimerTask{
    
    private Pelilauta lauta;
    
    public timertask(Pelilauta annettu){
        this.lauta = annettu;
    }
    
    @Override
    public void run(){
        if (this.lauta.tuleekoTormaus() == false){
        this.lauta.liikutaPelilauttaaKerran();
        }
        else { System.out.println("peli loppui");
    }
    }
    
}
    
    

