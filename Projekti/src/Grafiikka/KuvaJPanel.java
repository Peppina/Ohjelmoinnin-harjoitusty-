package Grafiikka;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import hahmot.Liikutettava;
import logiikka.Pelilauta;

public class KuvaJPanel extends JPanel {

    private Image tausta;
    private Pelilauta peli;
    private Image loppukuvaHavio;
    private Image loppukuvaVoitto;

    /**
     * Jpanelin taustakuva, konstruktorin parametrinä annettu peli
     * luokka piirtää pelilaudan (ja siinä olevat vaistettavat objektit sekä pelaajan)
     *
     * @param peli
     * @throws IOException
     */
    public KuvaJPanel(Pelilauta peli) {
        try {
            this.tausta = ImageIO.read(new File("tausta"));
        } catch (IOException ex) {
            Logger.getLogger(KuvaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            this.loppukuvaHavio = ImageIO.read(new File("havio"));
        } catch (IOException ex) {
            Logger.getLogger(KuvaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            this.loppukuvaVoitto = ImageIO.read(new File("voitto"));
        } catch (IOException ex) {
            Logger.getLogger(KuvaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }


        this.peli = peli;
    }

    /**
     * piirtää liikutettavat pelialustaan, hakee paikat ArrayListista piirtää
     * myös pelaajan
     *
     * lopputilanteessa piirtää ruudulle tilanteen mukaan joko häviö- tai
     * voittoruudun
     *
     * @see projekti.Pelilauta
     * @param g
     */
    @Override
    protected void paintComponent(Graphics g) {

        // status 1= peli kaynnissa, piirtää siis pelaajan ja liikutettavat taustakuvan päälle
        if (this.peli.annaPelinStatus() == 1) {
            pelinStatusYksi(g);
            // status 2 = pelaaja törmää liikutettavaan, piirretään häviöruutu
        } else if (this.peli.annaPelinStatus() == 2) {
            pelinStatusKaksi(g);
            // status 3 = pelaaja pääsee loppuun, piirtää voittoruudun
        } else if (this.peli.annaPelinStatus() == 3) {
            pelinStatusKolme(g);
        }
    }

    private void pelinStatusYksi(Graphics g) {
        int pelaajaX = peli.annaPelaaja().annaPelaajanXPaikka();
        int pelaajaY = peli.annaPelaaja().annaPelaajanYPaikka();


        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawImage(this.tausta, 0, 0, 700, 500, null);
        int i = 0;
        while (i < peli.pelilaudanObjektienMaara()) {
            Liikutettava l = peli.annaLiikutettavaListalta(i);
            g.fillOval(l.haePaikkaX(), l.haePaikkaY(), l.haeKoko(), l.haeKoko());
            i++;
        }

        g.setColor(Color.pink);
        g.fillOval(pelaajaX, pelaajaY, 25, 25);

        this.repaint();
    }

    private void pelinStatusKaksi(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.loppukuvaHavio, 0, 0, 700, 500, null);
        this.repaint();
    }

    private void pelinStatusKolme(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.loppukuvaVoitto, 0, 0, 700, 500, null);
        this.repaint();
    }

   
}
