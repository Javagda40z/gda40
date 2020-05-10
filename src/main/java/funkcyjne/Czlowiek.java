package funkcyjne;

public class Czlowiek {
    private int age;
    private String imie;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Czlowiek(int age, String imie) {
        this.age = age;
        this.imie = imie;
    }
}
