/**
 * Created by aleksamarkoni on 21.2.15..
 */
public class Artikal {

    protected String sifra;
    protected String opis;
    protected int dani; // broj dana u magacinu

    public Artikal(String sifra, String opis) {
        this.sifra = sifra;
        this.opis = opis;
        dani = 0;
    }

    public String dajSifru() {
        return sifra;
    }

    public String dajOpis() {
        return opis;
    }

    public void promeniOpis(String opis) {
        this.opis = opis;
    }

    /**
     * 4) Napisati metod u klasi Artikal koji vraca broj nedelja provedenih u magacinu
     *
     * @return - broj nedelja provedenih u magacinu
     */
    public double brojNedeljaProvedenihUMagacinu() {
        return dani/7.0;
    }

    /**
     * 8) moramo ovo dodati da bi prisutpili broju dana koje je artikal proveo u magacinu
     * @return - broj dana provedenih u magacinu
     */
    public int dani() {
        return dani;
    }
}