/**
 * Created by aleksamarkoni on 21.2.15..
 * 1) Navesti razlike izmedju metode i polja
 *
 *    - Metodama definisemo ponasanje objekta, dok poljima definisemo stanja objekta
 *
 * 2) Navesti razlike izmedju objektne promenljive i promenljive primitivnog tipa.
 *
 *    - Objektne promenljive pravimo koriscenjem operatora new, dok za primitivne to ne moramo da radimo
 *      Objektne promenljive su dosta kompleksnije, jer se sastoje od drugih primitivnih i objektnih promenljivih.
 *
 * 3) Nacrtati klasni dijagram koji odgovara prilozenom listingu
 *
 *      ----------------
 *      |    Magacin   |
 *      ----------------
 *              |
 *              ^
 *      -----------------
 *      |   Artikal     |
 *      -----------------
 *          ^       ^
 *          |       |
 *  -------------  --------------
 *  | Memorija  |  | Televizor  |
 *  -------------  --------------
 */
public class Main {
    public static void Main(String args[]) {
        // 6) Kreirati magacin "Trosarina", i artikal "Prolom voda". Ubaciti kreirani artikal u magacin i
        // stampati podatke koriscenjem metode iz tacke 5.
        Magacin magacin = new Magacin("Trosarina");
        Artikal artikal = new Artikal("123", "Prolom voda");
        magacin.dodajArtikal(artikal);
        magacin.ispisiSveOpise();
    }
}
