
package projekti;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class KuvaJPanel extends JPanel{
    
    private Image image;
    private Pelilauta peli;
    
    public KuvaJPanel(Pelilauta peli) throws IOException {

        this.image = ImageIO.read(new File ("tausta"));
        this.peli = peli;
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
     
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
            g.drawImage(image, 0, 0, 700, 500, null);
            g.fillOval(x1, y1 , 25, 25);
            g.fillOval(x2, y2 , 25, 25);
            g.fillOval(x3, y3 , 25, 25);
            g.setColor(Color.pink);
            g.fillOval(pelaajaX, pelaajaY, 25, 25);
           
          this.repaint();
      
    }
    
    
    
}
