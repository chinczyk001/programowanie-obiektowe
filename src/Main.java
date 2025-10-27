public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Osoba osoba1 = new Uczen();
        System.out.println(osoba1.imie);
        osoba1.imie = "Jaś";
        System.out.println(osoba1.imie);
        osoba1.setWiek(123);
        System.out.println(osoba1.getWiek());
        osoba1.setWiek(23);
        System.out.println(osoba1.getWiek());
        System.out.println(osoba1);
        Osoba osoba2 = new Uczen("Asia",22);
        System.out.println(osoba2);
        System.out.println("Liczba uczniów: " + Uczen.getLiczbaUczniow());
        Uczen uczen = new Uczen("Edmund", 13, 1234);
        System.out.println(uczen);
        Uczen uczen1 = new Uczen();
        System.out.println(uczen1);
        System.out.println("Liczba uczniów: " + Uczen.getLiczbaUczniow());
        Nauczyciel nauczycielWf = new Nauczyciel("Krzysztof",45,"wf");
        System.out.println(nauczycielWf);
        nauczycielWf.wykonajDyzur();
        uczen1.wykonajDyzur();//polimorfizm

        Klasa klasa = new Klasa("3p");
        System.out.println(klasa);
        klasa.dodajUczniaDoKlasy(uczen);
        System.out.println(klasa);
        klasa.dodajUczniaDoKlasy(uczen1);
        klasa.dodajUczniaDoKlasy(uczen);
    }
}