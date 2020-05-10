package generyki;

import java.util.List;

public class Miasto <T extends Mieszkaniec & Cloneable> {

    private String nazwa;
    private List<T> mieszkancy;

    public List<T> getMieszkancy() {
        return mieszkancy;
    }

    public void setMieszkancy(List<T> mieszkancy) {
        this.mieszkancy = mieszkancy;
    }

    public T znajdzMieszkancaPoImieniu(String imie) {
        for (T mieszkaniec : this.mieszkancy) {
            if (mieszkaniec.getImie().equals(imie)) {
                return mieszkaniec;
            }
        }
        return null;
    }

    public Miasto(String nazwa) {
        this.nazwa = nazwa;
    }
}
