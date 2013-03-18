
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
    
    public void lisaaObjekti(Liikutettava liikutettava){
        this.liikutettavatObjektit.add(liikutettava);
    }
    
    
    //metodi vertaa törmäävätkö pelaaja ja laudalla olevat objektit, jos törmäys tapahtuu on palautusarvo true
    
   public boolean tuleekoTormaus(){
       int i = 0;
       int lukumaara = this.liikutettavatObjektit.size();
       boolean palautus = false;
       
       while(i < lukumaara){
           Liikutettava verrattava = this.liikutettavatObjektit.get(i);
           if(verrattava.haePaikkaX() == this.pelaaja.annaPelaajanXPaikka() && verrattava.haePaikkaY() == this.pelaaja.annaPelaajanYPaikka()){
               palautus = true;
           } else  {
               i++;
           }
           
       }
       
       return palautus;
   
      }
   
   
   
   
       
   }
    

