package hahmot;

import hahmot.Liikutettava;

public class VaistettavaObjekti implements Liikutettava {

    private int paikkaX;
    private int paikkaY;
    private boolean suunta;
    private int koko;
    private int kappaleenNopeus;
    private int rajaArvo;

    /**
     * VaistettavaObjekti on Liikutettava rajapinnan toteuttava luokka.
     * Kostruktorissa objektille määritellään x- ja y-kordinaatit. Objektilla on myös suunta, johon se liikkuu (true/false)
     *
     * @param x
     * @param y
     */
    public VaistettavaObjekti(int x, int y) {
        this(x, y, 1);
    }
    
    /*
     * int mikaMalli kertoo mi8llaisen vaistettavaObjekti-olion luomme. Erilaisia "malleja" voi lisä helposti myöhemmin lisää.
     */
   
    public VaistettavaObjekti(int x, int y, int mikaMalli) {
        paikkaX = x;
        paikkaY = y;
       
        if (mikaMalli == 1) {
            malliYksi();
        } else if (mikaMalli == 2) {
            malliKaksi();
        } else {
            malliKolme();
        }
    }
    
    /* 
     * malliYksi saa arvot suunta, koko, nopeus ja raja-arvo, joka on kohta, jossa kappale törmää pelilaudan alareunaan
     */
 
    private void malliYksi() {
        suunta = true;
        koko = 25;
        kappaleenNopeus = 10;
        rajaArvo = 475;
    }
    
     /* 
     * malliKaksi saa arvot suunta, koko, nopeus ja raja-arvo, joka on kohta, jossa kappale törmää pelilaudan alareunaan
     */
   
    private void malliKaksi() {
        suunta = true;
        koko = 12;
        kappaleenNopeus = 5;
        rajaArvo = 475;
    }
    
    /* 
     * malliKaksi saa arvot suunta, koko, nopeus ja raja-arvo, joka on kohta, jossa kappale törmää pelilaudan alareunaan
     */
   
    private void malliKolme() {
        suunta = true;
        koko = 25;
        kappaleenNopeus = 10;
        rajaArvo = 675;
    }
 
    /**
     * Liikuta() metodi muuttaa olion paikkaa suunnasta ja paikasta pelilaudalla
     * riippuen -10 tai +10 y-suunnassa
     */
    @Override
    public void liikuta() {
 
        if (this.suunta) {
            liikutaPositiivinen();
        }
        if (!this.suunta) {
            liikutaNegatiivinen();
        }
    }
    
    /*
     * apumetodi liikuta() luokalle
     */
   
    private void liikutaPositiivinen() {
        if (paikkaY + kappaleenNopeus <= rajaArvo) {
            paikkaY += kappaleenNopeus;
        } else {
            this.suunta = false;
        }
    }
    /*
     * apumetodi liikuta() luokalle
     */
 
    private void liikutaNegatiivinen() {
        if (paikkaY - kappaleenNopeus >= 0) {
            paikkaY -= kappaleenNopeus;
        } else {
            this.suunta = true;
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