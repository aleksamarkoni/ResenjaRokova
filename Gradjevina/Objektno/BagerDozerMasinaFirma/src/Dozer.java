/**
 * Created by aleksamarkoni on 21.2.15..
 */
public class Dozer extends Masina {
    private double radnaZapremina;
    private double kd1; // koeficijent dozera 1
    private double kd2; // koeficijent dozera 2
    private double kd3; // koeficijent dozera 3

    /**
     * 13) Moramo dodati ovaj konstruktor da bi zadatak radio
     *
     * @param serijskiBroj
     * @param godiste
     * @param brojSati
     * @param radnaZapremina
     * @param kd1
     * @param kd2
     * @param kd3
     */
    public Dozer(String serijskiBroj, int godiste, int brojSati, double radnaZapremina, double kd1, double kd2, double kd3) {
        super(serijskiBroj, godiste, brojSati);
        this.radnaZapremina = radnaZapremina;
        this.kd1 = kd1;
        this.kd2 = kd2;
        this.kd3 = kd3;
    }

    /**
     * 12) Prepisati metod toString() u klasi Dozer koji formira tekst opis dozera,
     * ukljucujuci i njegove osobine kao masine
     *
     * @return - teksualna reprezentacija Dozera
     */
    @Override
    public String toString() {
        return "radnaZapremina = " + radnaZapremina +
                "kd1 = " + kd1 +
                "kd2 = " + kd2 +
                "kd3 = " + kd3 +
                super.toString();
    }

    public double ucinak() {
        return radnaZapremina * kd1 * kd2 * kd3;
    }
}