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
import hahmot.Pelaaja;
import logiikka.Peli;

/**
 *
 * @author papepa
 */
public class PeliTest {

    @Before
    public void setUp() {
    }

   

    @Test
    public void luoPelilautaToimii() {
        Pelaaja pelaaja = new Pelaaja();
        Peli peli = new Peli(pelaaja);

        int maara = peli.luoPelilauta(pelaaja).pelilaudanObjektienMaara();

        assertEquals(15, maara);

    }
}
