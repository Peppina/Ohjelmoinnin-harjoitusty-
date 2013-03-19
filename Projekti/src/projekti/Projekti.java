
package projekti;


public class Projekti {

   
    public static void main(String[] args) {
        
        Pelaaja antti = new Pelaaja("Antti");
        System.out.println(antti);
        antti.kasvataPisteitä(2);
        System.out.println(antti);
        
        
        Pelilauta lauta = new Pelilauta(antti);
        
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

        Pelilauta pelilauta = new Pelilauta(antti);
          
        Liikutettava liikutettava = new VaistettavaObjekti(1,1);
        Liikutettava liikutettava2 = new VaistettavaObjekti(1,2);
        pelilauta.lisaaObjekti(liikutettava);
        pelilauta.lisaaObjekti(liikutettava2);
        
        pelilauta.annaObjektienPaikat();
        pelilauta.tulostaObjektienPaikat();
        
        pelilauta.liikutaPelilauttaaKerran();
        pelilauta.tulostaObjektienPaikat();
        
         pelilauta.liikutaPelilauttaaKerran();
        pelilauta.tulostaObjektienPaikat();
         pelilauta.liikutaPelilauttaaKerran();
        pelilauta.tulostaObjektienPaikat();
         pelilauta.liikutaPelilauttaaKerran();
        pelilauta.tulostaObjektienPaikat();
         pelilauta.liikutaPelilauttaaKerran();
        pelilauta.tulostaObjektienPaikat();
         pelilauta.liikutaPelilauttaaKerran();
        pelilauta.tulostaObjektienPaikat();
         pelilauta.liikutaPelilauttaaKerran();
        pelilauta.tulostaObjektienPaikat();
         pelilauta.liikutaPelilauttaaKerran();
        pelilauta.tulostaObjektienPaikat();
         pelilauta.liikutaPelilauttaaKerran();
        pelilauta.tulostaObjektienPaikat();
         pelilauta.liikutaPelilauttaaKerran();
        pelilauta.tulostaObjektienPaikat();
         pelilauta.liikutaPelilauttaaKerran();
        pelilauta.tulostaObjektienPaikat();
        
    }
    
    
}
