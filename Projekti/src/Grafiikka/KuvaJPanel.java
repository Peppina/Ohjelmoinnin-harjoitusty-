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
import projekti.Pelilauta;

public class KuvaJPanel extends JPanel {

    private Image tausta;
    private Pelilauta peli;
    private Image loppukuvaHavio;
    private Image loppukuvaVoitto;

    /**
     * Jpanelin taustakuva konstruktorin parametrinä annettu peli
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
     * @see projekti.Pelilauta
     * @param g
     */
    @Override
    protected void paintComponent(Graphics g) {


        if (this.peli.annaPelinStatus() == 1) {


            int x1 = peli.annaLiikutettavaListalta(0).haePaikkaX();
            int y1 = peli.annaLiikutettavaListalta(0).haePaikkaY();

            int x2 = peli.annaLiikutettavaListalta(1).haePaikkaX();
            int y2 = peli.annaLiikutettavaListalta(1).haePaikkaY();

            int x3 = peli.annaLiikutettavaListalta(2).haePaikkaX();
            int y3 = peli.annaLiikutettavaListalta(2).haePaikkaY();

            int pelaajaX = peli.annaPelaaja().annaPelaajanXPaikka();
            int pelaajaY = peli.annaPelaaja().annaPelaajanYPaikka();

            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.drawImage(this.tausta, 0, 0, 700, 500, null);
            g.fillOval(x1, y1, 25, 25);
            g.fillOval(x2, y2, 25, 25);
            g.fillOval(x3, y3, 25, 25);

            g.setColor(Color.pink);
            g.fillOval(pelaajaX, pelaajaY, 25, 25);

            this.repaint();

        } else if (this.peli.annaPelinStatus() == 2) {
            super.paintComponent(g);
            g.drawImage(this.loppukuvaHavio, 0, 0, 700, 500, null);
            this.repaint();
        } else if (this.peli.annaPelinStatus() == 3) {
            super.paintComponent(g);
            g.drawImage(this.loppukuvaVoitto, 0, 0, 700, 500, null);
            this.repaint();
        }
    }
}
