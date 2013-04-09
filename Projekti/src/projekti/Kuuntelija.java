/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author papepa
 */
public class Kuuntelija implements KeyListener {

    private Pelilauta peli;

    /**
     * Kuuntelijan konstruktori, parametrina annetun pelilaudan liikuttamiseksi
     *
     * @param annettu
     */
    public Kuuntelija(Pelilauta annettu) {
        this.peli = annettu;
    }

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
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}