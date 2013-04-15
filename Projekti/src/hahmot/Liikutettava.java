package hahmot;

public interface Liikutettava {

    /**
     * Liikutettava rajapinta. Pelin mahdollisessa jatkokehityksessa
     * mahdollistaa erilaisetn liikutettavat objektien luomisen pelilaudalle.
     * Tällä hetkelle tehty muutama erilainen VaistettavaObjekti- luokka jotka toteuttavat rajapinnan
     */
    void liikuta();

    int haePaikkaX();

    int haePaikkaY();
    
    int haeKoko();
}
