/**
 * Created by aleksamarkoni on 21.2.15..
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Magacin {

    private String ime;
    private HashMap<String, Artikal> artikli; // mapa <sifra artikla, artikal>

    public Magacin(String ime) {
        this.ime = ime;
        artikli = new HashMap<String, Artikal>();
    }

    /**
     * 5) Napisati metod u klasi Magacin koji ispisuje opise svih artikala
     */
    public void ispisiSveOpise() {
        for (Artikal a : artikli.values()) {
            System.out.println(a.dajOpis());
        }
    }

    /**
     * 6) i 11) Ovo moramo dodati da bi uspeli da dodamo artikal u magacin
     *
     *
     * @param artikal - artikal koji dodajemo u magacin
     */
    public void dodajArtikal(Artikal artikal) {
        artikli.put(artikal.dajSifru(), artikal);
    }

    /**
     * 7) Dodati metod u klasu Magacin koji vraca listu artikala koji su magacinu duze od zadatog broja nedelja
     *
     * @param zadatBrojNedelja - broj nedelja u odnosu na koji proveravamo
     * @return listu svih artikala koji su duze od zadatBrojNedelja
     */
    public ArrayList<Artikal> dajSveArtikleKojiSuDuzeOd(double zadatBrojNedelja) {
        ArrayList<Artikal> duzeOd = new ArrayList<Artikal>();
        for (Artikal artikal : artikli.values()) {
            if (artikal.brojNedeljaProvedenihUMagacinu() > zadatBrojNedelja) {
                duzeOd.add(artikal);
            }
        }
        return duzeOd;
    }

    /**
     * 8) Dodati metod u klasu Magacin koji vraca najmladji artikal iz magacina. Pretpostaviti da u klasi Artikal
     * postoji metod dani() koji vraca broj dana.
     *
     * @return - najmladji artikal iz magacina
     */
    public Artikal dajNajmladjiArtikalUMagacinu() {
        int min = Integer.MAX_VALUE;
        Artikal minArtikal = null;
        for (Artikal a : artikli.values()) {
            if (a.dani() < min) {
                min = a.dani();
                minArtikal = a;
            }
        }
        return minArtikal;
    }

    /**
     * 11) Napisati metod u klasi Magacin kojim se lista artikala tipa televizor ubacuje u Magacin.
     *     Metod vraca broj ubacenih televizora cija je dijagonala manja od zadate vrednosti
     *
     * @param televizori - lista televizora koje zelimo da ubacimo u magacina
     * @param dijagonala - dijagonala na osnovu koje poredimo
     * @return - broj televizora koje smo ubacili a koji imaju manju dijagonalu od zadate
     */
    public int ubaciSveTelevizore(ArrayList<Televizor> televizori, int dijagonala) {
        int brojUbacenihSaManjomDijagonalom = 0;
        for (Televizor televizor : televizori) {
            dodajArtikal(televizor);
            if (televizor.dajDijagonalu() < dijagonala) {
                brojUbacenihSaManjomDijagonalom++;
            }
        }
        return brojUbacenihSaManjomDijagonalom;
    }


    /**
     * 12) Dodati metod u klasu Magacin kojim se za zadati niz od N boolean vrednosti ubacuje N novih artikala po
     *  sledecem principu: ako je i-ti element niza true ubaciti memoriju, inace televizor; sve potrebne podatke
     *  izabrati proizvoljno, s tim da sifre svih artikala budu razlicite.
     *
     * @param niz - niz logickih promenljivih na osnovu kojih dodajemo elemente
     */
    public void dodajNasumicnoArtikle(boolean[] niz) {
        Random random = new Random();
        for (int i = 0; i < niz.length; i++) {
            if (niz[i]) {
                dodajArtikal(new Memorija("sifra" + i, "neki opis", "model", random.nextInt(2000), random.nextInt(2000)));
            } else {
                dodajArtikal(new Televizor("sifra" + i, "neki opis", "model", random.nextDouble() * 80, random.nextInt(2000), random.nextInt(2000), "tip"));
            }
        }
    }

    /**
     * 13) Vratiti skup kljuceva svih memorija u magacinu ciji je kapacitet manji od prosecnog
     *  (koristiti instance relaciju)
     *
     * @return - sve sifre
     */
    public HashSet<String> memorijeCijiJeKapacitetManjiOdProsecnog() {
        int suma = 0;
        int br = 0;
        for (Artikal artikal : artikli.values()) {
            if (artikal instanceof Memorija) {
                Memorija memorija = (Memorija) artikal;
                suma = suma + memorija.dajKapacitet();
                br ++;
            }
        }

        double sr = 0;
        if (br != 0) {
            sr = (double)suma/br;
        } else {
            sr = 0;
        }
        HashSet<String> sifreMemorijaCijiJeKapacitetManjiOdProsecnog = new HashSet<String>();
        for (Artikal artikal : artikli.values()) {
            if (artikal instanceof Memorija) {
                Memorija memorija = (Memorija) artikal;
                if (memorija.dajKapacitet() < sr) {
                    sifreMemorijaCijiJeKapacitetManjiOdProsecnog.add(memorija.dajSifru());
                }
            }
        }
        return sifreMemorijaCijiJeKapacitetManjiOdProsecnog;
    }

}