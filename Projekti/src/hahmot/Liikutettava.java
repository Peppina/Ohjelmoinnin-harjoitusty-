package hahmot;

public interface Liikutettava {

    /**
     * Liikutettava rajapinta. Pelin mahdollisessa jatkokehityksessa
     * mahdollistaa erilaisetn liikutettavat objektien luomisen pelilaudalle.
     * Jatkossa myös voisi miettiä toteuttaisikohan myös esimerkiksi Pelaaja
     * luokka- liikutettava rajapinnan. Tällöin esim moninpeli olisi
     * mahdollinen.
     */
    void liikuta();

    int haePaikkaX();

    int haePaikkaY();

    int haeKoko();
}
