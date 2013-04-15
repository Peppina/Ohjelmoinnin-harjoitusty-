package logiikka;

import logiikka.Pelilauta;
import Kayttoliittyma.Kayttoliittyma;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import hahmot.Liikutettava;
import hahmot.Pelaaja;
import hahmot.VaistettavaObjekti;
import hahmot.VaistettavaObjektiKaksi;
import hahmot.VaistettavaObjektiKolme;

public class Peli {

    final private int PELIN_NOPEUS = 1000 / 25;
    private Kayttoliittyma kayttis;
    private Pelilauta lauta;

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
        int i = 0;

        while (i < vaistettavienMaara) {
            Random arpo = new Random();
            int x = (arpo.nextInt(6) + 1) * 100;
            int y = arpo.nextInt(4) * 100;
            int x2 = (arpo.nextInt(6) + 1) * 100;
            int y2 = arpo.nextInt(4) * 100;
            int x3 = (arpo.nextInt(6) + 1) * 100;
            int y3 = arpo.nextInt(4) * 100;
            Liikutettava liikutettava = new VaistettavaObjekti(x, y);
            Liikutettava liikutettava2 = new VaistettavaObjektiKaksi(x2, y2);
            Liikutettava liikutettava3 = new VaistettavaObjektiKolme(x3, y3);
            uusiPelilauta.lisaaObjekti(liikutettava);
            uusiPelilauta.lisaaObjekti(liikutettava2);
            uusiPelilauta.lisaaObjekti(liikutettava3);
            i++;
        }
        return uusiPelilauta;
    }

    /**
     * pelaa metodi kauttaa luoPelilauta() metodia sekä luo uuden
     * Kayttoliittyman. Myos ajastin luodaan, jonka avulla liikutetaan
     * vaistettavia objekteja
     *
     * @see
     */
    public void pelaa() {
        this.run();



    }

    public void run() {
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

    public int pelinStatus() {
        return lauta.annaPelinStatus();
    }
}
