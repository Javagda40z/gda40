package powtorka.dziedziczenie;

public abstract class Zawodnik {
    private int numer;
    private String imie;

    public void biegaj() {
        System.out.println("biegam");
    }

    public abstract void kopnij();

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

//    private void prywatnaMetoda() {
//
//    }
//
//    public void publicznaMetoda() {
//        prywatnaMetoda();
//    }

}
