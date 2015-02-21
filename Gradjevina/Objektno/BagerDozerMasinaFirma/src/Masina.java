/**
 * Created by aleksamarkoni on 21.2.15..
 */
public class Masina {
    protected String serijskiBroj;
    protected int godiste;
    protected int brojSati;

    public Masina() {
    }

    public Masina(String serijskiBroj, int godiste, int brojSati) {
        this.serijskiBroj = serijskiBroj;
        this.godiste = godiste;
        this.brojSati = brojSati;

    }

    public double ucinak() {
        return 0;
    }

    public void postaviSerijskiBroj(String serijskiBroj) {
        this.serijskiBroj = serijskiBroj;
    }

    public String dajSerijskiBroj() {
        return serijskiBroj;
    }

    public String toString() {
        return serijskiBroj + "g:" + godiste + "sati:" + brojSati;
    }

    /**
     * 5) Napisati metode u klasi Masina kojima se pristupa,  odnosno menja vrednost polja godiste
     * ovo je deo za pristup godistu
     *
     * @return - vraca godiste masine
     */
    public int dajGodiste() {
        return godiste;
    }

    /**
     * 5) Napisati metode u klasi Masina kojima se pristupa,  odnosno menja vrednost polja godiste
     * ovo je deo za menjanje godista
     *
     * @param godiste - novo godiste masine
     */
    public void promeniGodiste(int godiste) {
        this.godiste = godiste;
    }

    /**
     * 6) Napisati metod u klasi Masina koji vraca true ako je masina novija u odnosu na zadatu masinu
     *
     * @param m - masina u odnosu na koju proveravamo
     * @return - true/false u zavisnosti da li je nasa masina novija u odnosu na Masinu m
     */
    public boolean daLiJeMasinaNovijaOdZadate(Masina m) {
        if (godiste > m.dajGodiste()) {
            return true;
        } else {
            return false;
        }
    }


}