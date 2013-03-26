
package projekti;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class KuvaJPanel extends JPanel{
    
    private Image image;
    
    
    public KuvaJPanel() throws IOException {

        this.image = ImageIO.read(new File ("tausta"));
        
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, null);
    }
    
    
    
}
