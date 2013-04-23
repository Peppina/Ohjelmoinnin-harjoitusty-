package hamot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import hahmot.VaistettavaObjekti;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author papepa
 */
public class VaistettavaObjektiTest {

    public VaistettavaObjektiTest() {
    }

    @Test
    public void haePaikkaXToimii() {
        VaistettavaObjekti o = new VaistettavaObjekti(2, 3);
        assertEquals(2, o.haePaikkaX());
    }

    @Test
    public void haePaikkaYToimii() {
        VaistettavaObjekti o = new VaistettavaObjekti(2, 3);
        assertEquals(3, o.haePaikkaY());


    }

    @Test
    public void liikutatoimiiOikein() {
        VaistettavaObjekti o = new VaistettavaObjekti(2, 3);
        o.liikuta();
        assertEquals(13, o.haePaikkaY());
    }

    @Test
    public void haeKokoToimiikakkoshamolla() {
        VaistettavaObjekti o = new VaistettavaObjekti(2, 3, 2);
        assertEquals(12, o.haeKoko());
    }

    @Test
    public void haeKokoToimiiJosEiAnnetaKonstruktorissaHahmoa() {
        VaistettavaObjekti o = new VaistettavaObjekti(2, 3);
        assertEquals(25, o.haeKoko());
    }

    @Test
    public void liikutaToimii() {
        VaistettavaObjekti o = new VaistettavaObjekti(2, 3);
        o.liikuta();
        assertEquals(13, o.haePaikkaY());
    }

    @Test
    public void liikutaToimiiRajatapuksessa() {
        VaistettavaObjekti o = new VaistettavaObjekti(2, 3);
        double raja_arvo = 48;
        int i = 0;
        while (i < raja_arvo) {
            o.liikuta();
            i++;
        }

        assertEquals(463, o.haePaikkaY());
    }

    
}
