
package projekti;

import java.awt.Image;
import java.util.HashMap;
import java.util.Map;
import java.applet.*;
import java.awt.*;



public class Grafiikka extends Applet{
    
private  Map<String, Image> kuvat;
private Image Taustakuva;


public Grafiikka(){
    this.kuvat = new HashMap<String, Image>();
    this.Taustakuva = getImage(getDocumentBase(),"taivas.jpg");
}


public void piirra(Liikutettava liikutettava, java.awt.Graphics g){
    
    
}

public Image palautaTaustakuva(){
    return this.Taustakuva
}
    
}
