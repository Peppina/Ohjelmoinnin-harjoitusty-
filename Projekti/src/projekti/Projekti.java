
package projekti;

import javax.swing.SwingUtilities;



public class Projekti {


   
    public static void main(String[] args) {
        
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma();
        SwingUtilities.invokeLater(kayttoliittyma);

        
   
        
        Peli peli = new Peli();
        peli.aloitusTeksti();
        peli.ohjeet();
        peli.pelaa();


        
     
    
    
}
}