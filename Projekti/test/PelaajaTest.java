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
  
  @Test
  public void pisteidenKasvatusToimii(){
      pelaaja.kasvataPisteitä(2);
      
      assertEquals(2, pelaaja.annaPelaajanPisteet());
  }
  
  @Test
  public void pelaajanLiikuttaminenToimiiYsuunnassa(){
      pelaaja.liikutaPelaajaaYsuunnassaAlaspain();
      pelaaja.liikutaPelaajaaYsuunnassaAlaspain();
      pelaaja.liikutaPelaajaaYsuunnassaYlospain();
      
      assertEquals(6,pelaaja.annaPelaajanYPaikka());
  }
  
  @Test
  public void pelaajanLiikuttaminenXsuunnassaToimii(){
      pelaaja.liikutaPelaajaaXsuunnassa();
      pelaaja.liikutaPelaajaaXsuunnassa();
      assertEquals(2, pelaaja.annaPelaajanXPaikka());
  }
  
  @Test
  public void toStringtoimiiOikein(){
      
      assertEquals("Pelaajan pelaaja pisteet: 0", pelaaja.toString());
      
  }
  
    
    
}
