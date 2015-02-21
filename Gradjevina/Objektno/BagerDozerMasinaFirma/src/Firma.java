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
     * 7) Dodati metod u klasu Firma koji vraca najnoviju masinu
     *
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
     * 8) Dodati metod u klasu Firma koji vraca listu masina koje su novije od srednje starosti svih masina
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
     * 9) Dodati metod u klasu Firma koji vraca mapu ciji su kljucevi serijski brojevi,
     * a vrednosti odgovarajuce masine
     *
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
     * 13) Dodati klasni metod test u klasu Firma u kome se obavlja sledece:
     */
    public static void test() {

        // a) Kreirati firmu "ABC ing"
        Firma firma = new Firma("ABC ing");

        // b) Kreirati dva proizvoljna bager i jedan dozer (pretpostaviti da konstruktor za dozer postoji,
        // i da je slican konstruktoru za bager)
        Bager b1 = new Bager("23", 2000, 230, 23.4, 2.3, 2.4, 2.5);
        Bager b2 = new Bager("24", 2004, 250, 23.4, 2.3, 2.4, 2.5);
        Dozer d1 = new Dozer("25", 2002, 250, 23.4, 2.3, 2.4, 2.5);

        // c) Ubaciti kreirane masine u postojecu firmu
        firma.dodajMasinu(b1);
        firma.dodajMasinu(b2);
        firma.dodajMasinu(d1);

        // d) Ispisati ucinke za sve masine u firmi (prolaskom kroz listu masina).
        //    Pretpostaviti da je i u klasi Dozer prepisan metod ucinak()
        for (Masina m : firma.dajMasine()) {
            System.out.println(m.ucinak());
        }

        // e) Formirati niz M od 100 masina po slucajnom principu (slucajan izbor za bager/dozer)
        ArrayList<Masina> M = new ArrayList<Masina>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            if (random.nextBoolean()) {
                M.add(new Bager("sb" + i, 2000 + random.nextInt(15), random.nextInt(500), random.nextDouble() * 50, random.nextDouble() * 50, random.nextDouble() * 50, random.nextDouble() * 50));
            } else {
                M.add(new Dozer("sb" + i, 2000 + random.nextInt(15), random.nextInt(500), random.nextDouble() * 50, random.nextDouble() * 50, random.nextDouble() * 50, random.nextDouble() * 50));
            }
        }

        // f) Ispisati podatke o svim dozerima iz niza M
        for (Masina m : M) {
            if (m instanceof Dozer) {
                System.out.println(m);
            }
        }
    }
}