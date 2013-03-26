
package projekti;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Kayttoliittyma implements Runnable {
    
    private JFrame frame;
    Grafiikka grafiikka;

    public Kayttoliittyma() {
    }

    @Override
    public void run() {
        frame = new JFrame("Vaistelupeli");
        frame.setPreferredSize(new Dimension(700, 500));
        

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        try {
            frame.add(new KuvaJPanel());
        } catch (IOException ex) {
            Logger.getLogger(Kayttoliittyma.class.getName()).log(Level.SEVERE, null, ex);
        }

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
        
        
        
       
        
        
    }

    private void luoKomponentit(Container container) {
    }

    public JFrame getFrame() {
        return frame;
    }
    
    
}
