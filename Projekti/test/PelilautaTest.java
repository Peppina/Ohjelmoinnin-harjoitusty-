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
       Liikutettava liikutettava = new VaistettavaObjekti(1,1);
       Liikutettava liikutettava2 = new VaistettavaObjekti(1,2);
       pelilauta.lisaaObjekti(liikutettava);
       pelilauta.lisaaObjekti(liikutettava2);
        
        
    }
    
    @Test
    public void toimiikoLisausOikein(){
        assertEquals("(1, 1)(1, 2)", pelilauta.annaObjektienPaikat() );
        

    }
    
    @Test 
    public void toimiikoPelilaudanLiikutusOiekin(){
        pelilauta.liikutaPelilauttaaKerran();
        assertEquals("(1, 2)(1, 3)", pelilauta.annaObjektienPaikat());
    }
    
    @Test
    public void toimiikoKonstruktoriOikein(){
        assertEquals("Laudalla on yksi pelaa: pelaaja ja laudan koko on 14*10.", pelilauta.toString());
        
        
    }
    
    
    
}
