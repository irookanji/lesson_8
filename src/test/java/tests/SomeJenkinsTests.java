package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeJenkinsTests {
    @Test
    void firstSuccessfulTest() {
        assertEquals(2 + 2, 4);
    }

    @Test
    void secondSuccessfulTest() {
        assertEquals(3 + 4, 7);
    }
}
