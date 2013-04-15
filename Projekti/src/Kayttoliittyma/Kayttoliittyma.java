package Kayttoliittyma;

import Grafiikka.KuvaJPanel;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import logiikka.Pelilauta;

public class Kayttoliittyma {

    private JFrame frame;
    private Pelilauta lauta;
    
    /*
     * käyttöliittymälle annetaan haluttu peli konstruktorissa
     */

    public Kayttoliittyma(Pelilauta peli) {
        this.lauta = peli;

    }

    /**
     * Metodi luo ikkunan ja sen komponentit metodin luoKomponentit() avulla
     *
     */
    public void rakenna() {

        frame = new JFrame("Vaistelupeli");
        frame.setPreferredSize(new Dimension(700, 520));


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        System.out.println("rakennan");


        KuvaJPanel kuva = new KuvaJPanel(lauta);
        frame.add(kuva);
        kuva.repaint();

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);

    }

    /**
     * Metodi lisää KeyListener komponentin kayttoliittymaan
     *
     */
    private void luoKomponentit(Container container) {
        frame.addKeyListener(new Kuuntelija(this.lauta));

    }

    public JFrame getFrame() {
        return frame;
    }
}
