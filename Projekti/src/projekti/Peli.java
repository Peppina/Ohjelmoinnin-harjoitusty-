
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
        System.out.println("Tässä pelin ohjeet");
    }
    
    public void aloitaPeli(){
        System.out.println("Anna nimesi: ");
        Scanner lukija = new Scanner(System.in);
        String nimi = lukija.nextLine();
        Pelaaja pelaaja = new Pelaaja(nimi);
        Pelilauta pelilauta = new Pelilauta(pelaaja);
        
    }
    
    //Pelaa metodi luo jokaisella pelikerralla vaihtelevan määrän vaistettavia objekteja. Metodi suoritus loppuu, kun pelaaja ja objekti törmäävät tai pelöaaja saavuttaa paikan x= 14.
    
    public void pelaa(Pelilauta pelilauta, Pelaaja pelaaja){
        
        Random arpoja = new Random ();
        int vaistettavienMaara = arpoja.nextInt(4);
        int i = 0;
        
        while( i < vaistettavienMaara){
            int x = arpoja.nextInt(14);
            int y = arpoja.nextInt(10);
            Liikutettava liikutettava = new VaistettavaObjekti(x,y);
            pelilauta.lisaaObjekti(liikutettava);
        }
        
        while(pelilauta.tuleekoTormaus() == false){
            
            
        }
        
        
        
        
    }

   
        
    }

