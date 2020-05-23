package funkcyjne;

public class StringProcessor {

    private StringOperation stringOperation;

    public String process(String input) {
        return stringOperation.operation(input);
    }

    public StringProcessor() {
        stringOperation = input -> input; //input -> { return input;};
    }

    public void setStringOperation(StringOperation stringOperation) {
        this.stringOperation = stringOperation;
    }
}


// (a,b) -> {};
