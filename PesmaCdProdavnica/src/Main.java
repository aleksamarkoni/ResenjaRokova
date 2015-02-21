/**
 * a) Sta su to objekti a sta klase
 * <p/>
 * - Klasa predstavlja sablon na osnovu koga pravimo sve objekte
 * - Objekat je jedan konkretan primerak klase
 */


/**
 * 1) Nacrtati klasni dijagram sistema
 *      -----------------
 *      |   Pesma       |
 *      -----------------
 *              ^
 *              |
 *      -----------------
 *      |   AudioCD     |
 *      -----------------
 *              ^
                |
        -----------------
        |   Prodavnica  |
        -----------------
 */
public class Main {

    /**
     * b) Napisati privatni metod neke klase u Javi
     * koji za svoj ulazni parametar uzima NIZ realnih brojeva
     * a kao rezultat vraca njegov zbir
     *
     * @param niz - niz realnih brojeva
     * @return - suma niza
     */
    public double saberiNiz(double[] niz) {
        double sum = 0;
        for (int i = 0; i < niz.length; i++) {
            sum = sum + niz[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        // 4) Napisati niz naredbi kojima se kreira jedan konkretan disk sa dve konkretne pesme
        AudioCD cd = new AudioCD("Best of Saban", "Saban Saulic", 120);
        Pesma p1 = new Pesma("Zal", 3);
        Pesma p2 = new Pesma("Ti si moja ja sam tvoj :)", 5);
        cd.dodajPesmu(p1);
        cd.dodajPesmu(p2);
    }
}
