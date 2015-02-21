/**
 * Created by aleksamarkoni on 21.2.15..
 */
public class Bager extends Masina {
    private double teorijskiUcinak;
    private double kb1; //koeficijent bagera 1
    private double kb2; //koeficijent bagera 2
    private double kb3; //koeficijent bagera 3

    /**
     * 10) Dodati konstruktor u klasi bager (voditi racuna o tome da je klasa izvedena iz klase Masina)
     *
     * @param serijskiBroj
     * @param godiste
     * @param brojSati
     * @param teorijskiUcinak
     * @param kb1
     * @param kb2
     * @param kb3
     */
    public Bager(String serijskiBroj, int godiste, int brojSati, double teorijskiUcinak, double kb1, double kb2, double kb3) {
        super(serijskiBroj, godiste, brojSati);
        this.teorijskiUcinak = teorijskiUcinak;
        this.kb1 = kb1;
        this.kb2 = kb2;
        this.kb3 = kb3;
    }

    /**
     * 11) Prepisati ucinak() u klasi Bager tako da se racuna prema formuli teorijskiUcinak * kb1 * kb2 * kb3
     *
     * @return - ucinak za masinu
     */
    public double ucinak() {
        return teorijskiUcinak * kb1 * kb2 * kb3;
    }

}