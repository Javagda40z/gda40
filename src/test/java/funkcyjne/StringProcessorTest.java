package funkcyjne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    private StringProcessor stringProcessor;

    @BeforeEach
    void setUp() {
        stringProcessor = new StringProcessor();
    }

    @Test
    public void testWhenDefaultStringProcessorIsProcessingInputThenReturnNotModifiedInput() {
        String tekst = "tekst";
        assertEquals(tekst, stringProcessor.process(tekst));
    }

    @Test
    public void testWhenUpperCaseStringProcessorIsProcessingInputThenReturnUpperCasedInput() {
        String tekst = "tekst";
        String upperCasedTekst = "TEKST";
        stringProcessor.setStringOperation(input -> input.toUpperCase());
        assertEquals(tekst.toUpperCase(), stringProcessor.process(tekst));
    }
}
