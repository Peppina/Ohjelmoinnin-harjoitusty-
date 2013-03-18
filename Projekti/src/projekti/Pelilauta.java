
package projekti;

import java.util.ArrayList;
import java.util.List;


public class Pelilauta {
   
    private ArrayList<Liikutettava> liikutettavatObjektit;
    private int korkeus;
    private int leveys;
    private Pelaaja pelaaja;
    
    
    public Pelilauta(Pelaaja annettuPelaaja){
        this.liikutettavatObjektit = new ArrayList<Liikutettava>(); 
        this.korkeus = 10;
        this.leveys = 14;
        this.pelaaja = annettuPelaaja;
        
    }
    
    //metodi palauttaa tasolla x olevien objektien y-arvon
    public int haeObjektienPaikatPaikassaX(int xArvo){
        int n = 0;
        int pituus = this.liikutettavatObjektit.size();
        int palautus = 0;
        while (n < pituus){
            Liikutettava liikutettava = this.liikutettavatObjektit.get(n);
            if (liikutettava.haePaikkaX() == xArvo){
                palautus = liikutettava.haePaikkaY();
            } else {
                n++;
            }
            
        }
        
        return palautus;
        
    }
    
    
    //metodi vertaa törmäävätkö pelaaja ja objekti
    
   public boolean onkoSamaYKordinaatti(Pelaaja pelaaja, Liikutettava liikutettava){
       
       
   }
    
}
