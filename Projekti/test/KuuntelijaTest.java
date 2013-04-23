/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Kayttoliittyma.Kuuntelija;
import hahmot.Pelaaja;
import logiikka.Pelilauta;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author papepa
 */
public class KuuntelijaTest {

    public KuuntelijaTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void kuuntelijaKuuntelee() {
        Pelaaja pelaaja = new Pelaaja();
        Pelilauta pelilauta = new Pelilauta(pelaaja);

        Kuuntelija kuuntelija = new Kuuntelija(pelilauta);
        



    }
}
