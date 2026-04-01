public class Ksiazka {
    // Pola (cechy książki)
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    // Konstruktor (maszyna do tworzenia książki)
    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }

    // Metody (co książka potrafi)
    public void wypiszInfo() {
        System.out.println("Tytuł: " + tytul + " | Autor: " + autor + " | Stron: " + liczbaStron + " | Dostępna: " + (dostepna ? "Tak" : "Nie"));
    }

    public void wypozycz() {
        this.dostepna = false;
    }

    public void zwroc() {
        this.dostepna = true;
    }

    // Dodatkowe metody, żeby inne klasy mogły "czytać" te dane
    public String getTytul() { return tytul; }
    public boolean czyDostepna() { return dostepna; }
}
