package dev.flint.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class ParserErrorTest {
    @Test
    public void testParserErrorMessage() {
        ParserError error = new ParserError("Test error");
        assertEquals("Test error", error.getMessage());
    }
}
