package logiikka;


import java.util.ArrayList;
import hahmot.Liikutettava;
import hahmot.Pelaaja;


public class Pelilauta {

    private ArrayList<Liikutettava> liikutettavatObjektit;
    private int korkeus;
    private int leveys;
    private Pelaaja pelaaja;
    private int kaynnissa;

    public Pelilauta(Pelaaja annettuPelaaja) {
        this.liikutettavatObjektit = new ArrayList<Liikutettava>();
        this.korkeus = 500;
        this.leveys = 700;
        this.pelaaja = annettuPelaaja;
        this.kaynnissa = 0;
        // int kaynnissa kertoo pelin statuksen, 0=peli ei aloitettu, 1=peli kaynnissa ja 2=peli loppui havioon ja 3=peli loppui voittoon


    }

    public Pelaaja annaPelaaja() {
        return this.pelaaja;
    }

    /*
     * metodi lisaa liikutettavatObjektit listaan uuden Liikutettava rajapinnan toteuttavan olion
     */
    public void lisaaObjekti(Liikutettava liikutettava) {
        this.liikutettavatObjektit.add(liikutettava);
    }

    /*
     * lista size() metodin avulla palauttaa Liikutettava rajapinnan toteuttavien olioden määrän pelilaudalla
     */
    public int pelilaudanObjektienMaara() {
        return this.liikutettavatObjektit.size();
    }
    
    /*
     * Metodi palauttaa pyydetyllä paikalla olevan Liikutettavan
     */
    
    public Liikutettava annaLiikutettavaListalta(int i) {
        return this.liikutettavatObjektit.get(i);
    }
    
    
    
    public int annaPelinStatus(){
        return this.kaynnissa;
    }
    
    
    public void muutaPelinSatusta(int annettu){
        this.kaynnissa = annettu;
    }
    
 

    //metodi vertaa törmäävätkö pelaaja ja laudalla olevat objektit, jos törmäys tapahtuu on palautusarvo true
    public boolean tuleekoTormaus() {
        for (Liikutettava l : this.liikutettavatObjektit) {
            if (l.haePaikkaX() == this.pelaaja.annaPelaajanXPaikka() && l.haePaikkaY() == this.pelaaja.annaPelaajanYPaikka()) {
                return true;
            }
        }
        return false;
    }
    
    /*
     * metodi liikuttaa jokaista pelilaudalla olevaa Liikutettava rajapinnan toteuttavaa oliota käyttäen olion omaa liikuta() metodia. Objektit siis liikkuvat niille määriteltyihin suuntiin niille määritellyillä nopeuksilla.
     */

    public void liikutaPelilauttaaKerran() {
        int i = 0;
        int objektit = this.liikutettavatObjektit.size();


        while (i < objektit) {
            this.liikutettavatObjektit.get(i).liikuta();
            i++;
        }



    }
    
    /*
     * liikuttaa pelaajaa annettuun suuntaan
     */

    public void liikutaPelaajaa(int i) {


        if (i == 2 && pelaaja.annaPelaajanYPaikka() != 0 && !this.tuleekoTormaus()) {
            pelaaja.liikutaPelaajaaYsuunnassaAlaspain();
        }
        if (i == 8 && pelaaja.annaPelaajanYPaikka() != 10 && !this.tuleekoTormaus()) {
            pelaaja.liikutaPelaajaaYsuunnassaYlospain();
        }
        if (i == 6 && !this.tuleekoTormaus()) {
            pelaaja.liikutaPelaajaaXsuunnassa();
        }
        if (i == 4 && pelaaja.annaPelaajanXPaikka() != 0 && !this.tuleekoTormaus()) {
            pelaaja.liikutaPelaajaaXsuunnassaTaakse();
        }

    }

    
}
