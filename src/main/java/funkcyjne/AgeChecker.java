package funkcyjne;

public class AgeChecker implements Checker {

    @Override
    public boolean check(Czlowiek czl) {
        return czl.getAge() >= 18;
    }
}
