package projekti;

public interface Liikutettava {

    /**
     * Liikutettava rajapinta. Pelin mahdollisessa jatkokehityksessa
     * mahdollistaa erilaisetn liikutettavat objektien luomisen pelilaudalle.
     * Tällä hetkelle vain VaistettavaObjekti luokka toteuttaa kyseisen
     * rajapinnan.
     */
    void liikuta();

    int haePaikkaX();

    int haePaikkaY();
}
