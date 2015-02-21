import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by aleksamarkoni on 21.2.15..
 */
public class AudioProdavnica {
    private String ime;
    private String adresa;

    private HashMap<String, AudioCD> katalogDiskova; // mapa izvodjac - disk

    public AudioProdavnica(String ime, String adresa) {
        this.ime = ime;
        this.adresa = adresa;
        katalogDiskova = new HashMap<String, AudioCD>();
    }

    public void ubaciUKatalog(AudioCD disk) {
        katalogDiskova.put(disk.dajIzvodjaca(), disk);
    }

    /**
     * 8) Dodati metod u klasi AudoProdavnica kojim se omogucava promena adrese prodavnice
     *
     * @param adresa - nova adresa prodavnice
     */
    public void promeniAdresu(String adresa) {
        this.adresa = adresa;
    }

    /**
     * 9) Dodati metod u klasi AudioProdavnica koji vraca broj diskova u prodavnici
     *
     * @return
     */
    public int brojDiskovaUProdavnici() {
        return katalogDiskova.size();
    }

    /*
        10) Navesti koje je to ozbiljno ogranicenje po pitanju prodajnog asortimana koje svi objekti tipa
        AudioProdavnica imaju, a koje proistice iz implementacije ove klase

        - Problem je u tome kako je implementirana HashMap-a, jer svaki Izvodjac moze imati samo jedan disk u prodavnici

        11) Predloziti sta treba uraditi (promeniti) kako bi se izbeglo ogranicenje pod 10

        - Pa mozemo napraviti HashMap-u koja za jednog izvodjaca cuva vise diskova
     */

    /**
     * 12) Dodati metod u klasi AudioProdavnica koji vraca disk sa najduzim trajanjem
     *
     * @return - disk sa najduzim trajanjem
     */
    public AudioCD diskSaNajduzimTrajanjem() {
        int max = 0;
        AudioCD audioCD = null;
        for (AudioCD cd : katalogDiskova.values()) {
            if (cd.dajTrajanjeDiska() > max) {
                max = cd.dajTrajanjeDiska();
                audioCD = cd;
            }
        }
        return audioCD;
    }

    /**
     * 13) Dodati metod u klasi AudioProdavnica koji vraca NIZ pesama koje sadrze u svom naslovu trazenu rec
     *
     * @param trazenaRec - rec koju mora imati svaka pesma u svom naslovu
     * @return - niz svih pesama koji imaju trazenu rec
     */
    public ArrayList<Pesma> nizPesamaKojeSadrzeUSvomNaslovu(String trazenaRec) {
        ArrayList<Pesma> nizPesama = new ArrayList<Pesma>();
        for (AudioCD cd : katalogDiskova.values()) {
            for (Pesma p : cd.dajPesmeSaDiska()) {
                if (p.dajNaslov().contains(trazenaRec)) {
                    nizPesama.add(p);
                }
            }
        }
        return nizPesama;
    }
}
