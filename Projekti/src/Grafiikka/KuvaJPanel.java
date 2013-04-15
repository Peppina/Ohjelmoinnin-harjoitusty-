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
     * lopputilanteessa piirtää ruudulle tilanteen mukaan joko häviö- tai voittoruudun
     *
     * @see projekti.Pelilauta
     * @param g
     */
    @Override
    protected void paintComponent(Graphics g) {

        // status 1= peli kaynnissa, piirtää siis pelaajan ja liikutettavat taustakuvan päälle
        if (this.peli.annaPelinStatus() == 1) {
            
            int pelaajaX = peli.annaPelaaja().annaPelaajanXPaikka();
            int pelaajaY = peli.annaPelaaja().annaPelaajanYPaikka();


            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.drawImage(this.tausta, 0, 0, 700, 500, null);
            int i = 0;
            while ( i < peli.pelilaudanObjektienMaara()){
                Liikutettava l = peli.annaLiikutettavaListalta(i);
                g.fillOval(l.haePaikkaX(),l.haePaikkaY(), l.haeKoko(), l.haeKoko());
                i++;
            }
     
            g.setColor(Color.pink);
            g.fillOval(pelaajaX, pelaajaY, 25, 25);

            this.repaint();

        // status 2 = pelaaja törmää liikutettavaan, piirretään häviöruutu
        } else if (this.peli.annaPelinStatus() == 2) {
            super.paintComponent(g);
            g.drawImage(this.loppukuvaHavio, 0, 0, 700, 500, null);
            this.repaint();
            
        // status 3 = pelaaja pääsee loppuun, piirtää voittoruudun    
        } else if (this.peli.annaPelinStatus() == 3) {
            super.paintComponent(g);
            g.drawImage(this.loppukuvaVoitto, 0, 0, 700, 500, null);
            this.repaint();
        }
    }
    
    
    public void piirraPallot(Graphics g){
        int i = 0;
        int pituus = peli.pelilaudanObjektienMaara();
        
        while(i < pituus ){
            Liikutettava liikutettava = this.peli.annaLiikutettavaListalta(i);
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.fillOval(liikutettava.haePaikkaX(), liikutettava.haePaikkaY(), liikutettava.haeKoko(), liikutettava.haeKoko());
            i++;
        }
    }
}
