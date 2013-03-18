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

/**
 *
 * @author papepa
 */
public class PelaajaTest {
    
    Pelaaja pelaaja;
    
    
    @Before
    public void setUp() {
       pelaaja = new Pelaaja("pelaaja");
        
    }
    
    
    @Test
    public void konstruktoriToimiiOikein(){

        
        assertEquals("Pelaajan pelaaja pisteet: 0", pelaaja.toString());
        
    }
    
    @Test
    public void pisteytysToimiiOikein(){
            assertEquals(0, pelaaja.annaPelaajanPisteet());
    }
  
  @Test
  public void annaNimiToimiiOikein(){
      
      assertEquals("pelaaja", pelaaja.annaPelaajaNimi());
      
  }
    
    
}
