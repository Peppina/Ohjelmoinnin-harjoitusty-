/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kayttoliittyma;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import logiikka.Pelilauta;

/**
 *
 * @author papepa
 */
public class Kuuntelija implements KeyListener {

    private Pelilauta peli;

    /**
     * Kuuntelijan konstruktori, parametrina annetun pelilaudan liikuttamiseksi,
     * Kuuntelee näpäimistöllä annettuja käskys, tunnistaa nuolinäppäimet
     *
     * @param annettu
     */
    public Kuuntelija(Pelilauta annettu) {
        this.peli = annettu;
    }

    //reagoi vain painalluksiin, siksi ei metodia määritelty
    @Override
    public void keyTyped(KeyEvent e) {
    }

    /**
     * Metodi lukee nappaimistolta kaskun ja liikuttaa pelilaudalla olevaa
     * pelaajaa kaskun mukaan joko ylos alas tai oikealla.
     *
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_DOWN) {
            this.peli.liikutaPelaajaa(2);
        }
        if (key == KeyEvent.VK_RIGHT) {
            this.peli.liikutaPelaajaa(6);
        }
        if (key == KeyEvent.VK_UP) {
            this.peli.liikutaPelaajaa(8);
        }

        if (key == KeyEvent.VK_LEFT) {
            this.peli.liikutaPelaajaa(4);

        }
    }
    //reagoi vain painalluksiin, siksi ei metodia määritelty

    @Override
    public void keyReleased(KeyEvent e) {
    }
}