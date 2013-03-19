
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
    
    public String annaObjektienPaikat(){
        int i = 0;
        int listanPituus = this.liikutettavatObjektit.size();
        String palautus = "";
        
        while(i < listanPituus){
            
            palautus = palautus + "(" + this.liikutettavatObjektit.get(i).haePaikkaX() + ", " + this.liikutettavatObjektit.get(i).haePaikkaY() + ")";
            i++;
        }
        
        return palautus;
    }
    
    public void tulostaObjektienPaikat(){
        System.out.println(this.annaObjektienPaikat());
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
   
   public void liikutaPelilauttaaKerran(){
      int i = 0;
      int objektit = this.liikutettavatObjektit.size();
     
      while(i < objektit){
          this.liikutettavatObjektit.get(i).liikuta();
          i++;
      }
       
       
   }
   
   
   
   
   
   
       
   }
    

