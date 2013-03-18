
package projekti;

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

   
        
    }

