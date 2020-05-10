package enumy.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    public void testPlusOperation() {
        assertEquals(4, Operation.PLUS.calculate(2, 2));
        assertEquals(1.5 + 1.5, Operation.PLUS.calculate(1.5, 1.5));
        assertEquals(6, Operation.PLUS.calculate(3, 3));
        assertEquals(0, Operation.PLUS.calculate(0, 0));
    }

    @Test
    public void testMinusOperation() {
        assertEquals(4, Operation.MINUS.calculate(8, 4));
        assertEquals(5, Operation.MINUS.calculate(5.5, 0.5));
    }

    @Test
    public void testWhenDefaultOperationThenThrowError() {
        assertThrows(AssertionError.class, () -> Operation.DODATKOWA_OPERACJA.calculate(5, 5));

    }

}
