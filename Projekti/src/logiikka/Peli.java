package logiikka;

import Kayttoliittyma.Kayttoliittyma;
import hahmot.Liikutettava;
import hahmot.Pelaaja;
import hahmot.VaistettavaObjekti;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Peli {

    final private int PELIN_NOPEUS = 1000 / 25;
    private Kayttoliittyma kayttis;
    private Pelilauta lauta;
    
    /*
     * Peli-luokan avulla voidaan pelata peliä pelaa-metodilla. Peli koostuu pelilaudasta ja pelaajasta sekä käyttökliittymästä.
     * Peli saa konstruktorissaan Pelaajan. Konstruktori luo uuden pelilaudan käyyten omaa metodiaan luopelilauta() sekä uuden Käyttöliittymän.
     */

    public Peli(Pelaaja pelaaja) {

        this.lauta = this.luoPelilauta(pelaaja);
        this.kayttis = new Kayttoliittyma(lauta);

    }

    /**
     *
     * metodi kayttaa luoPelaaja() metodia ja taman avulla luo uuden pelilaudan
     * ja sinne kolme vaistettavaa objektia
     *
     * @see this.luoPelaaja();
     * @return Pelilauta
     */
    public Pelilauta luoPelilauta(Pelaaja pelaaja) {
        Pelilauta uusiPelilauta = new Pelilauta(pelaaja);
        int vaistettavienMaara = 5;
        this.lisaaVaistettavat(vaistettavienMaara, uusiPelilauta);
        return uusiPelilauta;
    }
    
    /*
     * Lisää laudalle annetun maaran vaistettaviaObjekteja
     * apumetodi, luoPelilauta():lle
     */

    public void lisaaVaistettavat(int vaistettavienMaara, Pelilauta Pelilauta) {
        int i = 0;
        while (i < vaistettavienMaara) {
            LisaaKaikkiVaistettavat(Pelilauta, i);
            i++;
        }
        
      
    }
    
    /*
     * apumetodi luoPelilauta().lle
     */

    private void LisaaKaikkiVaistettavat(Pelilauta Pelilauta, int i) {
        for (int monesko = 1; monesko <= 3; monesko++) {
            this.LisaaVaistettava(Pelilauta, monesko);
        }
    }
    
    /*
     * metodi lisää pelilaudalle annettua mallia olevan vaistettavanObjektin arvottuun paikkaan 
     */

    private void LisaaVaistettava(Pelilauta Pelilauta, int mikaMalli) {
        int x = this.Random(6);
        int y = this.Random(4);
        Liikutettava liikutettava = new VaistettavaObjekti(x, y, mikaMalli);
        Pelilauta.lisaaObjekti(liikutettava);
    }

    /*apumetodi 
     * LisaaVaistettavalle
     */
    
    private int Random(int montako) {
        Random arpo = new Random();
        return (arpo.nextInt(montako) + 1) * 100;
    }

    /**
     * pelaa metodi kauttaa luoPelilauta() metodia sekä luo uuden
     * Kayttoliittyman. Myos ajastin luodaan, jonka avulla liikutetaan
     * vaistettavia objekteja
     *
     * @see
     */

    /*
     * Luokan pää-metosi, jolla "käynnistetään" pelin pelaaminen. Metodi tarkastaa tuleeko törmausta ja muuttaa sen perusteella mahdollisesti pelin statusta. Käyttää apuna paivittamisessa PaivitaPeli()-metodia.
     */

    public void pelaa() {
        kayttis.rakenna();
        this.lauta.muutaPelinSatusta(1);
        while (true) {
            paivitaPeli();
            try {
                Thread.sleep(PELIN_NOPEUS);
            } catch (InterruptedException ex) {
                Logger.getLogger(Peli.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (this.lauta.tuleekoTormaus()) {
                System.out.println("loppu");
                this.lauta.muutaPelinSatusta(2);
                System.out.println(lauta.annaPelinStatus());
                break;
            }
            if (this.lauta.annaPelaaja().annaPelaajanXPaikka() == 700) {
                System.out.println("loppu");
                this.lauta.muutaPelinSatusta(3);
                System.out.println(lauta.annaPelinStatus());
                break;
            }
        }
    }
    
    

    private void paivitaPeli() {
        if (lauta.tuleekoTormaus() == false) {
            lauta.liikutaPelilauttaaKerran();
        } else {
            lauta.liikutaPelilauttaaKerran();
        }
    }
    
    /*
     * metodi pelin statuksen, eli onko peli käynnissa vai päättynyt. Mahdollistaa erilaiset naytot.
     */

    public int pelinStatus() {
        return lauta.annaPelinStatus();
    }
}
