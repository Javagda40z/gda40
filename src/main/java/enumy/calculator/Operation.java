package enumy.calculator;

public enum Operation {
    PLUS, MINUS, DODATKOWA_OPERACJA;

    double calculate(double x, double y) {

        switch (this) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            default:
                throw new AssertionError("Nieznana operacja: " + this);
        }

    }
}
