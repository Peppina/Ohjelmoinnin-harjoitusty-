package logiikka;

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
import logiikka.Pelilauta;

/**
 *
 * @author papepa
 */
public class PeliTest {
    
    private Peli peli;
    private Pelaaja pelaaja;

    @Before
    public void setUp() {
        this.pelaaja = new Pelaaja();
        this.peli = new Peli(pelaaja);
    }

   

    @Test
    public void luoPelilautaToimii() {
        

        int maara = this.peli.luoPelilauta(this.pelaaja).pelilaudanObjektienMaara();

        assertEquals(15, maara);

    }
    
    @Test
    public void lisaaVaistettava(){
        Pelilauta pelilauta = new Pelilauta(new Pelaaja());
        peli.lisaaVaistettavat(3, pelilauta);
       
        assertEquals(9, pelilauta.pelilaudanObjektienMaara());
    }
    
    
    
    
   
}
