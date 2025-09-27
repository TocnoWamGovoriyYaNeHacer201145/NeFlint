package dev.flint.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class ParseExceptionTest {
    @Test
    public void testParseExceptionMessage() {
        ParseException ex = new ParseException("Parse failed");
        assertEquals("Parse failed", ex.getMessage());
    }

    @Test
    public void testParseExceptionCause() {
        Exception cause = new Exception("cause");
        ParseException ex = new ParseException("Parse failed", cause);
        assertEquals(cause, ex.getCause());
    }
}
