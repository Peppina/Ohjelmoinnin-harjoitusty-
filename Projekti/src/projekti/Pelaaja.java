package projekti;

public class Pelaaja {

    private String nimi;
    private int pisteet;
    private int paikkaX;
    private int paikkaY;

    /**
     * konstruktorissa pelaajalle annetaan nimi. Aloituspaikka on keskellä
     * pelilautaa y-suunassa ja x-suunnassa tietystipaikassa nolla. Pisteet on
     * lisätty pelaajalle mahdollisen jatkokehityksen varalle. Kun pelaaja voi
     * pelata esim useamman maan, jolloin hän saa jokaisesta suoritetusta
     * tasosta pisteitä.
     *
     * @param annettuNimi
     */
    public Pelaaja(String annettuNimi) {
        this.nimi = annettuNimi;
        this.pisteet = 0;
        this.paikkaX = 0;
        this.paikkaY = 250;
    }

    /**
     * Kasvattaa pelaajan pisteitä parametrina annetun luvun verran
     *
     * @param luku
     */
    public void kasvataPisteitä(int luku) {
        this.pisteet = this.pisteet + luku;
    }

    /**
     * palauttaa pelaajan pisteet
     *
     * @return
     */
    public int annaPelaajanPisteet() {
        return this.pisteet;
    }

    /**
     * Palauttaa pelaajan nimen
     *
     * @return
     */
    public String annaPelaajaNimi() {
        return this.nimi;
    }

    /**
     * Palauttaa pelaajan tekstiesityksen
     *
     * @return
     */
    public String toString() {
        return "Pelaajan " + this.nimi + " pisteet: " + this.pisteet;
    }

    /**
     * Kertoo pelaajan x-paikan pelilaudalla
     *
     * @return
     */
    public int annaPelaajanXPaikka() {
        return this.paikkaX;
    }

    /**
     * kertoo pelaajan Y-paikan pelilaudalla
     *
     * @return
     */
    public int annaPelaajanYPaikka() {
        return this.paikkaY;
    }

    /**
     * metodin avulla pelaajan paikkaa liikutetaan eplilaudalla y-suunnassa
     * yhden askeleen verran ylospain
     */
    public void liikutaPelaajaaYsuunnassaYlospain() {
        this.paikkaY = this.paikkaY - 50;

    }

    /**
     * metodin avulla pelaajan paikkaa liikutetaan eplilaudalla y-suunnassa
     * yhden askeleen verran alaspain
     */
    public void liikutaPelaajaaYsuunnassaAlaspain() {
        this.paikkaY = this.paikkaY + 50;
    }

    /**
     * metodin avulla pelaajan paikkaa liikutetaan eplilaudalla x-suunnassa
     * yhden askeleen verran
     */
    public void liikutaPelaajaaXsuunnassa() {
        this.paikkaX = this.paikkaX + 50;
    }
}
