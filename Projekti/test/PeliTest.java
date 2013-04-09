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
import projekti.Pelaaja;
import projekti.Peli;

/**
 *
 * @author papepa
 */
public class PeliTest {

    @Before
    public void setUp() {
    }

    @Test
    public void aloitusTeskstiToimii() {
        Peli peli = new Peli();
        assertEquals("tervetuloa pelin pariin!", peli.aloitusTeksti());
    }

    @Test
    public void luoPelilautaToimii() {
        Pelaaja pelaaja = new Pelaaja("p");
        Peli peli = new Peli();

        int maara = peli.luoPelilauta(pelaaja).pelilaudanObjektienMaara();

        assertEquals(3, maara);

    }
}
