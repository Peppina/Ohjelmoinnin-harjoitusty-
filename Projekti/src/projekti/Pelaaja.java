
package projekti;

public class Pelaaja {
    
    private String nimi;
    private int pisteet;
    private int paikkaX;
    private int paikkaY;
            
    
    
    public Pelaaja(String annettuNimi){
        this.nimi = annettuNimi;
        this.pisteet = 0;
        this.paikkaX = 0;
        this.paikkaY = 7;
    }
    
    public void kasvataPisteitä(int luku){
        this.pisteet = this.pisteet + luku;
    }
    
    public int annaPelaajanPisteet(){
        return this.pisteet;
    }
    
    public String annaPelaajaNimi(){
        return this.nimi;
    }
    
    public String toString(){
        return "Pelaajan " + this.nimi + " pisteet: " + this.pisteet;
    }
    
    public int annaPelaajanXPaikka(){
        return this.paikkaX;
    }
    
    public int annaPelaajanYPaikka(){
        return this.paikkaY;
    }
    
    public void liikutaPelaajaaYsuunnassaYlospain(){
        this.paikkaY = this.paikkaY + 1;
        
    }
    
    public void liikutaPelaajaaYsuunnassaAlaspain(){
        this.paikkaY = this.paikkaY - 1;
    }
    
    public void liikutaPelaajaaXsuunnassa(){
        this.paikkaX = this.paikkaX + 1;
    }
    
    
    
}
