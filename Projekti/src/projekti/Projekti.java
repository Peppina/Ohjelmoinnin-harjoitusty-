
package projekti;


public class Projekti {

   
    public static void main(String[] args) {
        
        Pelaaja antti = new Pelaaja("Antti");
        System.out.println(antti);
        antti.kasvataPisteitä(2);
        System.out.println(antti);
        
        
        Pelilauta lauta = new Pelilauta(antti);
        System.out.println(lauta.haeObjektienPaikatPaikassaX(2));
        
        Liikutettava o = new VaistettavaObjekti( 2, 3);
        
        o.liikuta();
          System.out.println(o.haePaikkaY());
        o.liikuta();
          System.out.println(o.haePaikkaY());
        o.liikuta();
          System.out.println(o.haePaikkaY());
        o.liikuta();
          System.out.println(o.haePaikkaY());
        o.liikuta();
          System.out.println(o.haePaikkaY());
        o.liikuta();
          System.out.println(o.haePaikkaY());
        o.liikuta();
          System.out.println(o.haePaikkaY());
        o.liikuta();
          System.out.println(o.haePaikkaY());
        o.liikuta();
          System.out.println(o.haePaikkaY());
        o.liikuta();
          System.out.println(o.haePaikkaY());
        o.liikuta();
          System.out.println(o.haePaikkaY());
        o.liikuta();
          System.out.println(o.haePaikkaY());

        
        
    }
    
    
}
