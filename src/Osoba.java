public abstract class Osoba {

    //abstract z klasy tej nie mozna tworzyc obiektow
    public String imie;
    private int wiek; //hermetyzacja (enkapsulacja) - ograniczony dostep do pol metod
    //private tylko w tej klasie
    //public dostepne wszedzie
    //protected dostepne w tej klasie i klasie potomnej (w Javie takze w ramach pakietu)
    //brak modyfiikatora dostepu - dostepne w pakiecie

    //przeciazanie konstruktorow
    public Osoba() {
        imie="";
        wiek =0;
    }

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }
    //do wieku metody dostepowe


    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if(wiek>0 && wiek < 100) {
            this.wiek = wiek;
        }else {
        this.wiek = 0;
        }
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
