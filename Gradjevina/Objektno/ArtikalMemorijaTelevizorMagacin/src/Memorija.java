/**
 * Created by aleksamarkoni on 21.2.15..
 */
public class Memorija extends Artikal {
    protected String model;
    protected int kapacitet;
    protected int brzina;

    public int dajKapacitet() {
        return kapacitet;
    }

    /**
     * 12) ovo moramo da dodamo da bi mogli da kreiramo memorije
     * @param sifra
     * @param opis
     * @param model
     * @param kapacitet
     * @param brzina
     */
    public Memorija(String sifra, String opis, String model, int kapacitet, int brzina) {
        super(sifra, opis);
        this.model = model;
        this.kapacitet = kapacitet;
        this.brzina = brzina;
    }
}