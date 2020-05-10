package kolekcje;

import java.util.Comparator;

public class GraczComparator implements Comparator<Gracz> {

    @Override
    public int compare(Gracz o1, Gracz o2) {
        return o1.getImie().compareTo(o2.getImie());
    }
}
