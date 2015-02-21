/**
 * 1) Zaokruziti tacne iskaze
 * a) Objekti iste klase mogu imati razlicit skup osobina (netacno)
 * b) Objekti jedne klase mogu se praviti na razlicite nacine (tacno)
 * c) Lokalnoj promenljivoj definisanoj u telu petlje moze se pristupiti bilo gde unutar iste metoda (netacno)
 * d) Dve objektne promenljive su jednake ako ukazuju na objekte sa istim stanjem (netacno)
 * <p/>
 * 2) Zaokruziti tacne iskaze
 * a) Kolekcije objekata mogu da sadrze primitivne tipove (netacno)
 * b) Prilikom kreiranja objekata klase ArrayList potrebno je definisati broj elemenata (netacno)
 * c) Svi elementi ArrayList liste ne mogu se obraditi primenom while petlje (netacno)
 * d) U mapi je moguce imati vise istih vrednosti za razlicite kljuceve (tacno)
 * <p/>
 * 3) Navesti tacne odgovore ili zaokruziti tacne iskaze:
 * a) Klase A i B izvedene su iz klase C. Objekti iz A mogu pozivati protected metode iz B (netacno)
 * b) Tip podataka na koji ukazuje objektna promenljiva u toku izvrsavanja programa je _______ tipa ( nemam pojma :) )
 * c) Princip nasledjivanja omogucava smanjenje kolicine koda u aplikaciji (tacno)
 * d) Prepisana metoda superklase poziva se u potklasi upotrebom sluzbene reci _______ (super)
 * <p/>
 * 4) Nacrtati klasni dijagram koji odgovara prilozenom listingu
 * ----------------
 * |    Firma   |
 * ----------------
 * |
 * ^ // ovo je strelica na dole
 * -----------------
 * |   Masina     |
 * -----------------
 * ^       ^
 * |       |
 * -------------  --------------
 * |   Bager   |  |    Dozer   |
 * -------------  --------------
 */

public class Main {

    public static void main(String[] args) {
        Firma.test();
    }
}
