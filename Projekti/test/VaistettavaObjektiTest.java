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
import projekti.VaistettavaObjekti;

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
    public void liikutatoimiiOiekin() {
        VaistettavaObjekti o = new VaistettavaObjekti(2, 3);
        o.liikuta();
        assertEquals(13, o.haePaikkaY());
    }
}
