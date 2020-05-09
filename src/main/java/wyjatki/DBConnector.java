package wyjatki;

public class DBConnector implements AutoCloseable {

    private boolean czyJestPolaczenie;

    public DBConnector() {
        System.out.println("Lacze z baza");
        czyJestPolaczenie = true;
    }

    @Override
    public void close() throws Exception {

        System.out.println("Koncze polaczenie z baza");
        czyJestPolaczenie = false;

    }

    public boolean isCzyJestPolaczenie() {
        return czyJestPolaczenie;
    }
}
