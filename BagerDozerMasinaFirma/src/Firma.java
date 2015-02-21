/**
 * Created by aleksamarkoni on 21.2.15..
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Firma {
    private String ime;
    private ArrayList<Masina> masine;

    public Firma(String ime) {
        this.ime = ime;
        masine = new ArrayList<Masina>();
    }

    public void dodajMasinu(Masina m) {
        masine.add(m);
    }

    public ArrayList<Masina> dajMasine() {
        return masine;
    }

    /**
     * 7)
     * @return - vraca najnoviju masinu iz firme
     */
    public Masina dajNajnovijuMasinuIzFirme() {
        int max = 0;
        Masina maxMasina = null;
        for (Masina m : masine) {
            if (m.dajGodiste() > max) {
                max = m.dajGodiste();
                maxMasina = m;
            }
        }
        return maxMasina;
    }

    /**
     * 8)
     *
     * @return - listu masina koje su novije od srednje starosti svih masina
     */
    public ArrayList<Masina> dajListuSvihNovijihUOdnosuNaSrednjuVrednostSvihMasina() {
        int sum = 0;
        for (Masina m : masine) {
            sum = sum + m.dajGodiste();
        }
        int sr;
        if (masine.size() != 0) {
            sr = sum / masine.size();
        } else {
            sr = 0;
        }
        ArrayList<Masina> novijeMasine = new ArrayList<Masina>();
        for (Masina m : masine) {
            if (m.dajGodiste() > sr) {
                novijeMasine.add(m);
            }
        }
        return novijeMasine;
    }

    /**
     * 9)
     * @return - mapu ciji su kljucevi serijski brojevi, a vrednosti odgovarajuce masine
     */
    public HashMap<String, Masina> dajMapu() {
        HashMap<String, Masina> mapa = new HashMap<String, Masina>();
        for (Masina m : masine) {
            mapa.put(m.dajSerijskiBroj(), m);
        }
        return mapa;
    }

    /**
     * 13) Dodati klasni metod test u klasu Firma u kome se obavlja sledece
     */
    public static void test() {
        // a)
        Firma firma = new Firma("ABC ing");
        // b)
        Bager b1 = new Bager("23", 2000, 230, 23.4, 2.3, 2.4, 2.5);
        Bager b2 = new Bager("24", 2004, 250, 23.4, 2.3, 2.4, 2.5);
        Dozer d1 = new Dozer("25", 2002, 250, 23.4, 2.3, 2.4, 2.5);
        // c)
        firma.dodajMasinu(b1);
        firma.dodajMasinu(b2);
        firma.dodajMasinu(d1);
        // d)
        for (Masina m : firma.dajMasine()) {
            System.out.println(m.ucinak());
        }

        // e)
        ArrayList<Masina> M = new ArrayList<Masina>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            if (random.nextBoolean()) {
                M.add(new Bager("sb" + i, 2000 + random.nextInt(15), random.nextInt(500), random.nextDouble()*50, random.nextDouble()*50, random.nextDouble()*50, random.nextDouble() * 50));
            } else {
                M.add(new Dozer("sb" + i, 2000 + random.nextInt(15), random.nextInt(500), random.nextDouble()*50, random.nextDouble()*50, random.nextDouble()*50, random.nextDouble() * 50));
            }
        }

        // f)
        for (Masina m : M) {
            if (m instanceof Dozer) {
                System.out.println(m);
            }
        }
    }
}