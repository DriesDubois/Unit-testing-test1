package ex01_xxxxx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//note: I add 1 dummy class and 1 dummy test-class because it is impossible to commit empty directories

class ExampleTest {

    private final Example arrayOfInts = new Example();

    @Test
    void happyflow() {
        int result = arrayOfInts.sumOfInts(new int[]{1, 2, 3, 4});
        assertEquals(10, result);
    }

    @Test
    void paranoia() {
        int result = arrayOfInts.sumOfInts(new int[]{2, 7});
        assertEquals(9, result);
    }

    @Test
    void emptyArray() {
        int result = arrayOfInts.sumOfInts(new int[]{});
        assertEquals(0, result);
    }

    @Test
    void nullArray() {
        int result = arrayOfInts.sumOfInts(null);
        assertEquals(0, result);
    }
}