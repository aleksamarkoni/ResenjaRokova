/**
 * Created by aleksamarkoni on 21.2.15..
 */
public class Pesma {
    private String naslov;
    private int trajanje; // u minutima

    public Pesma(String naslov, int trajanje) {
        this.naslov = naslov;
        this.trajanje = trajanje;
    }

    public String dajNaslov() {
        return naslov;
    }

    public int dajTrajanje() {
        return trajanje;
    }

    public void odsvirajPesmu() {
        // ovde ide kod koji ce odsvirati pesmu
    }

    /**
     * 2) Dodati metod u klasi Pesma koji ispisuje podatke o pesmi
     */
    public void ispisiInformacijeOPesmi() {
        System.out.println("Naslov: " + naslov);
        System.out.println("Trajanje: " + trajanje);
    }


}
