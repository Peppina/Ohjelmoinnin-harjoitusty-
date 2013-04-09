package projekti;

public class VaistettavaObjekti implements Liikutettava {

    private int paikkaX;
    private int paikkaY;
    private boolean suunta;

    /**
     * VaistettavaObjekti on Liikutettava rajapinnan toteuttava luokka.
     * Kostruktorissa objektille määritellään x- ja y-kordinaatit. Objektilla on myös suunta, johon se liikkuu (true/false)
     *
     * @param x
     * @param y
     */
    public VaistettavaObjekti(int x, int y) {
        this.paikkaX = x;
        this.paikkaY = y;
        this.suunta = true;

    }
    
    /**
     * Liikuta() metodi muuttaa olion paikkaa suunnasta ja apikasta pelilaudalla riippuen -10 tai +10 y-suunnassa
     */

    @Override
    public void liikuta() {
        if (paikkaY >= 0 && paikkaY < 500 && suunta == true) {
            this.paikkaY = this.paikkaY + 10;
        } else if (this.paikkaY == 500) {
            this.suunta = false;
            this.paikkaY = this.paikkaY - 10;
        } else if (this.paikkaY <= 500 && this.paikkaY > 0 && this.suunta == false) {
            this.paikkaY = this.paikkaY - 10;
        } else if (this.paikkaY == 0 && this.suunta == false) {
            this.suunta = true;
            this.paikkaY = this.paikkaY + 10;
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
}
