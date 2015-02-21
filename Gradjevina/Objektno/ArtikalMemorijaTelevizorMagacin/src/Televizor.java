/**
 * Created by aleksamarkoni
 *

 *
 *
 */
public class Televizor extends Artikal{
    protected String model;
    protected double dijagonala;
    protected int rezolucijaX,rezolucijaY;
    protected String tip;

    public double dajDijagonalu(){return dijagonala;}

    /**
     * 9) Dodati konstruktor u klasi Televizor (voditi racuna o tome da je klasa izvedena iz klase Artikal)
     * @param sifra
     * @param opis
     * @param model
     * @param dijagonala
     * @param rezolucijaX
     * @param rezolucijaY
     * @param tip
     */
    public Televizor(String sifra, String opis, String model, double dijagonala, int rezolucijaX, int rezolucijaY, String tip) {
        super(sifra, opis);
        this.model = model;
        this.dijagonala = dijagonala;
        this.rezolucijaX = rezolucijaX;
        this.rezolucijaY = rezolucijaY;
        this.tip = tip;
    }

    /**
     * 10) Prepisati u klasi Televizor metod toString() klase Object koji u tekstualnu reprezentaciju objekta
     * ukljucuje i informacije iz super klase.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Televizor" +
                "model = '" + model + '\'' +
                ", dijagonala = " + dijagonala +
                ", rezolucijaX = " + rezolucijaX +
                ", rezolucijaY = " + rezolucijaY +
                ", tip = '" + tip + '\'' +
                " " + super.toString();
    }
}