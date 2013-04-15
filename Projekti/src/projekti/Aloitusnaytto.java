package projekti;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Aloitusnaytto implements Runnable{

    private JFrame frame;
    private int lifetime  = 10 * 1000;


    @Override
    public void run() {
        
        frame = new JFrame("Otsikko");
        frame.setPreferredSize(new Dimension(700, 500));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        
        GridLayout layout = new GridLayout(1,1);
        container.setLayout(layout);
        
        JLabel teksti = new JLabel("Aloita pelaaminen antamalla nimesi: ");
        JTextField kentta = new JTextField();
        
        container.add(teksti);
        container.add(kentta);
    }

    public JFrame getFrame() {
        return frame;
    }
}
