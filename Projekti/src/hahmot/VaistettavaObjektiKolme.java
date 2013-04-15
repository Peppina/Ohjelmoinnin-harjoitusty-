
package hahmot;

import hahmot.Liikutettava;


public class VaistettavaObjektiKolme implements Liikutettava {
    
     private int paikkaX;
    private int paikkaY;
    private boolean suunta;
    final private int KAPPALEEN_NOPEUS = 10;
    private int koko;

    /**
     * VaistettavaObjekti on Liikutettava rajapinnan toteuttava luokka.
     * Kostruktorissa objektille määritellään x- ja y-kordinaatit. Objektilla on myös suunta, johon se liikkuu (true/false)
     *
     * @param x
     * @param y
     */
    public VaistettavaObjektiKolme(int x, int y) {
        this.paikkaX = x;
        this.paikkaY = y;
        this.suunta = true;
        this.koko = 25;

    }
    
    /**
     * Liikuta() metodi muuttaa olion paikkaa suunnasta ja paikasta pelilaudalla riippuen nopeuden ja suunan verran x-suunnassa
     */

    @Override
    public void liikuta() {
        
        if(this.suunta) {
            if(paikkaX + KAPPALEEN_NOPEUS <= 675) {
                paikkaX += KAPPALEEN_NOPEUS;
            }
            else {
                this.suunta = false;
            }
        }
        if(!this.suunta) {
            if(paikkaX - KAPPALEEN_NOPEUS >= 0) {
                paikkaX -= KAPPALEEN_NOPEUS;
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
