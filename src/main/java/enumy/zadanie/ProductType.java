package enumy.zadanie;

public enum ProductType {
    OWOCE("owoce", 123), WARZYWA("warzywa", 124), MIESO("mięso", 125);

    private String owoce;
    private int code;

    ProductType(String owoce, int code) {
        this.owoce = owoce;
        this.code = code;
    }


}
