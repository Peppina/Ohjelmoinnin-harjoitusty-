/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hahmot;

import hahmot.Liikutettava;

/**
 *
 * @author papepa
 */
public class VaistettavaObjektiKaksi implements Liikutettava{
    
    private int paikkaX;
    private int paikkaY;
    private boolean suunta;
    final private int KAPPALEEN_NOPEUS = 5;
    private int koko;

    /**
     * VaistettavaObjekti on Liikutettava rajapinnan toteuttava luokka.
     * Kostruktorissa objektille määritellään x- ja y-kordinaatit. Objektilla on myös suunta, johon se liikkuu (true/false)
     *
     * @param x
     * @param y
     */
    public VaistettavaObjektiKaksi(int x, int y) {
        this.paikkaX = x;
        this.paikkaY = y;
        this.suunta = true;
        this.koko = 12;

    }
    
    /**
     * Liikuta() metodi muuttaa olion paikkaa suunnasta ja paikasta pelilaudalla riippuen nopeuden ja suunnan mukaan y-suunnassa
     */

    @Override
    public void liikuta() {
        
        if(this.suunta) {
            if(paikkaY + KAPPALEEN_NOPEUS <= 475) {
                paikkaY += KAPPALEEN_NOPEUS;
            }
            else {
                this.suunta = false;
            }
        }
        if(!this.suunta) {
            if(paikkaY - KAPPALEEN_NOPEUS >= 0) {
                paikkaY -= KAPPALEEN_NOPEUS;
            }
            else {
                this.suunta = true;
            }
        }
    }

    @Override
    public int haePaikkaX() {
        return this.paikkaX;
    }

    @Override
    public int haePaikkaY() {
        return this.paikkaY;
    }

    @Override
    public int haeKoko() {
        return this.koko;
    }
    
}
