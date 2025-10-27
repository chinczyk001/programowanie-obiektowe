import java.util.ArrayList;

public class Klasa {
    private String nazwa;
    private Wychowawca wychowawca;
    private ArrayList<Uczen> uczniowie;

    public Klasa(String nazwa) {
        this.nazwa = nazwa;
        uczniowie = new ArrayList<>();
    }

    public Klasa(String nazwa, Wychowawca wychowawca, ArrayList<Uczen> uczniowie) {
        this.nazwa = nazwa;
        this.wychowawca = wychowawca;
        this.uczniowie = uczniowie;
    }

    public Klasa(String imie,int wiek, String przedmiot) {
        this.wychowawca = new Wychowawca(imie, wiek, przedmiot);
    }

    public void dodajUczniaDoKlasy(Uczen uczen){
        if(uczniowie.contains(uczen)){
            System.out.println("Uczen jest juz w klasie");
        }else{
            uczniowie.add(uczen);
        }
    }

    @Override
    public String toString() {
        return "Klasa{" +
                "nazwa='" + nazwa + '\'' +
                ", wychowawca=" + wychowawca +
                ", uczniowie=" + uczniowie +
                '}';
    }
}
