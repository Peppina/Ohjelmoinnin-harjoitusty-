/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.KeyEvent;
import javax.xml.soap.Text;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import projekti.Kuuntelija;
import projekti.Pelaaja;
import projekti.Pelilauta;

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
