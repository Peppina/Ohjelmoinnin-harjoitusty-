
package projekti;

import java.util.Random;
import java.util.Scanner;

public class Peli {
    
    public Peli(){
        
    }   
    
    
    public void aloitusTeksti(){
        System.out.println("Tervetuloa pelin pariin ");
        
    }
    
    public void ohjeet(){
        System.out.println("Pelaajaa liikutetaan näppäimillä 2 (alas), 6(sivulle) ja 8(ylös). Tarkoituksena on väistää ylös-alas liikkuvia esineitä.");
    }
    
    public Pelaaja luoPelaaja(){
        System.out.println("Anna nimesi: ");
        Scanner lukija = new Scanner(System.in);
        String nimi = lukija.nextLine();
        Pelaaja pelaaja = new Pelaaja(nimi);
        return pelaaja;
    }
    
    
    
   public Pelilauta luoPelilauta(){
       Pelaaja pelaaja = this.luoPelaaja();
       Pelilauta pelilauta = new Pelilauta(pelaaja);
       int vaistettavienMaara = 3;
       int i = 0;
        
        while( i < vaistettavienMaara){
            Random arpo = new Random ();
            int x = arpo.nextInt(7) * 100;
            int y = arpo.nextInt(5) * 100;
            Liikutettava liikutettava = new VaistettavaObjekti(x,y);
            pelilauta.lisaaObjekti(liikutettava);
            i++;
        }
       return pelilauta;
   }
    
    public void pelaa(){
        
       
       Pelilauta pelilauta = this.luoPelilauta();
       Pelaaja pelaaja = pelilauta.annaPelaaja();
       Kayttoliittyma kayttis = new Kayttoliittyma(pelilauta);
    kayttis.run();
        
        while(pelilauta.tuleekoTormaus() == false && pelaaja.annaPelaajanXPaikka() < 700){
            
            pelilauta.liikutaPelaajaaJaPelilautaa();
            System.out.println(pelilauta.annaObjektienPaikat());
            
        }
        
        System.out.println("peli loppui");
        
        
        
        
    }

   
        
    }

