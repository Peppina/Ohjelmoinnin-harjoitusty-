package projekti;

import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class Peli {

    public Peli() {
    }

    public String aloitusTeksti() {
        return "tervetuloa pelin pariin!";

    }

    public void ohjeet() {
        System.out.println("Pelaajaa liikutetaan näppäimillä 2 (alas), 6(sivulle) ja 8(ylös). Tarkoituksena on väistää ylös-alas liikkuvia esineitä.");
    }

    /**
     * metodi luo uuden pelaaja annetun nimen perusteella
     *
     * @return pelaaja
     */
    public Pelaaja luoPelaaja() {
        System.out.println("Anna nimesi: ");
        Scanner lukija = new Scanner(System.in);
        String nimi = lukija.nextLine();
        Pelaaja pelaaja = new Pelaaja(nimi);
        return pelaaja;
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
        Pelilauta pelilauta = new Pelilauta(pelaaja);
        int vaistettavienMaara = 3;
        int i = 0;

        while (i < vaistettavienMaara) {
            Random arpo = new Random();
            int x = (arpo.nextInt(6) + 1) * 100;
            int y = arpo.nextInt(4) * 100;
            Liikutettava liikutettava = new VaistettavaObjekti(x, y);
            pelilauta.lisaaObjekti(liikutettava);
            i++;
        }
        return pelilauta;
    }

    /**
     * pelaa metodi kauttaa luoPelilauta() metodia sekä luo uuden
     * Kayttoliittyman. Myos ajastin luodaan, jonka avulla liikutetaan
     * vaistettavia objekteja
     *
     * @see
     */
    public void pelaa() {
        System.out.println(this.aloitusTeksti());
        this.ohjeet();
        
        Pelaaja pelaaja = this.luoPelaaja();
        Pelilauta pelilauta = this.luoPelilauta(pelaaja);

        Kayttoliittyma kayttis = new Kayttoliittyma(pelilauta);
        kayttis.run();

        Timer ajastin = new Timer();
        timertask teht = new timertask(pelilauta);
        ajastin.schedule(teht, 0, 50);


        while (pelilauta.tuleekoTormaus() == false && pelaaja.annaPelaajanXPaikka() < 700) {
        }

        System.out.println("peli loppui");




    }
}
