public abstract class Pytanie {
    protected String tresc;
    protected String nazwaPliku;
    protected boolean odpowidzPoprawna;

    public Pytanie(String tresc, String nazwaPliku) {
        this.tresc = tresc;
        this.nazwaPliku = nazwaPliku;
        this.odpowidzPoprawna = false;
    }
    public abstract boolean sprawdzOdpowiedz(char odpowiedz);
}
