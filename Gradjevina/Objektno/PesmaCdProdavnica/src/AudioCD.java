import java.util.ArrayList;
import java.util.Random;

/**
 * Created by aleksamarkoni on 21.2.15..
 */
public class AudioCD {
    private String naslov;
    private String izvodjac;
    private int trajanje; // u minutima

    private int maxTrajanje; // u minutima

    private ArrayList<Pesma> pesme;

    public AudioCD(String naslov, String izvodjac, int maxTrajanje) {
        this.naslov = naslov;
        this.izvodjac = izvodjac;
        this.maxTrajanje = maxTrajanje;
        trajanje = 0;
        pesme = new ArrayList<Pesma>();
    }

    public String dajIzvodjaca() {return izvodjac;}

    /**
     * 3) Dodati metod u klasi AudioCD koji ubacuje novu pesmu na disk,
     * pod uslovom da je trajanje diska nakon ubacivanja nove pesme, manje od maksimalno
     * dozvoljenog trajanja memorisanog u maxTrajanje
     *
     * @param p - Pesma koju zelimo da ubacimo na disk
     */
    public void dodajPesmu(Pesma p) {
        if (trajanje + p.dajTrajanje() <= maxTrajanje) {
            pesme.add(p);
        }
    }

    /**
     * 5) Dodati metod u klasi AudioCD koji ce odsvirati kompletan disk (simulacija dogadjaja nakon pritiskanja play)
     */
    public void odsvirajKompletanDisk() {
        for (Pesma p: pesme) {
            p.odsvirajPesmu();
        }
    }

    /**
     * 6) Dodati metod u klasi AudioCD koji ce odsvirati pesmu sa rednim brojem n (n je manje od broja pesama)
     * @param n - indeks pesme iz niza koju zelimo da odsviramo, (manje od n)
     */
    public void odsvirajPesmuSaRednimBrojem(int n) {
        if (n > 0 && n < pesme.size()) {
            pesme.get(n).odsvirajPesmu();
        }
    }

    /**
     * 7) Dodati metod u klasi AudioCD koji ce odsvirati sve pesme sa diska TACNO JEDNOM po slucajnom redosledu.
     * Ovde koristiti klasu Random iz paketa java.util koja ima metod nextInt(int n) koja vraca uniformno rasporedjen
     * slucajan broj od 0 do n - 1. Za resavanje mogu da se koriste i druge pogodne klase iz paketa java.util
     */
    public void odsvirajSvePesmePoSlucajnomRedosledu() {
        ArrayList<Pesma> kopijaSvihPesama = new ArrayList<Pesma>(pesme);
        Random random = new Random();
        while (kopijaSvihPesama.size() != 0) {
            int nasumicnaPesma = random.nextInt(kopijaSvihPesama.size());
            kopijaSvihPesama.get(nasumicnaPesma).odsvirajPesmu();
            kopijaSvihPesama.remove(nasumicnaPesma);
        }
    }

    /**
     * 12) Ovo moramo dodati da bi pristupili informaciji o trajanju diska
     *
     * @return - dusina trajanja diska
     */
    public int dajTrajanjeDiska() {
        return trajanje;
    }

    /**
     * 13) Ovo moramo dodati da bi mogli da pristupimo svim pesmam sa diska
     *
     * @return - sve pesme na disku
     */
    public ArrayList<Pesma> dajPesmeSaDiska() {
        return pesme;
    }
}
