/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import projekti.Liikutettava;
import projekti.Pelaaja;
import projekti.Pelilauta;
import projekti.VaistettavaObjekti;

/**
 *
 * @author papepa
 */
public class PelilautaTest {

    Pelilauta pelilauta;

    @Before
    public void setUp() {

        Pelaaja pelaaja = new Pelaaja("pelaaja");
        pelilauta = new Pelilauta(pelaaja);
        Liikutettava liikutettava = new VaistettavaObjekti(1, 1);
        Liikutettava liikutettava2 = new VaistettavaObjekti(1, 2);
        pelilauta.lisaaObjekti(liikutettava);
        pelilauta.lisaaObjekti(liikutettava2);


    }

    @Test
    public void toimiikoLisausOikein() {
        assertEquals("(1, 1)(1, 2)", pelilauta.annaObjektienPaikat());


    }

    @Test
    public void toimiikoPelilaudanLiikutusOikein() {
        pelilauta.liikutaPelilauttaaKerran();
        assertEquals("(1, 11)(1, 12)", pelilauta.annaObjektienPaikat());
    }

    @Test
    public void toimiikoKonstruktoriOikein() {
        assertEquals("Laudalla on yksi pelaa: pelaaja ja laudan koko on 14*10.", pelilauta.toString());


    }

    @Test
    public void liikutaPelaajaaToimiiOikeinYsuunnassa() {
        this.pelilauta.liikutaPelaajaa(2);
        this.pelilauta.liikutaPelaajaa(8);
        this.pelilauta.liikutaPelaajaa(8);

        assertEquals(200, this.pelilauta.annaPelaaja().annaPelaajanYPaikka());
    }

    @Test
    public void liikutaPelaajaaToimiiOikeinXsuunnassa() {
        this.pelilauta.liikutaPelaajaa(6);
        this.pelilauta.liikutaPelaajaa(6);
        this.pelilauta.liikutaPelaajaa(6);

        assertEquals(150, this.pelilauta.annaPelaaja().annaPelaajanXPaikka());
    }

    @Test
    public void annapelaajaToimii() {

        assertEquals("Pelaajan pelaaja pisteet: 0", this.pelilauta.annaPelaaja().toString());
    }

    @Test
    public void objektienMaaraToimii() {
        assertEquals(2, this.pelilauta.pelilaudanObjektienMaara());
    }
}
