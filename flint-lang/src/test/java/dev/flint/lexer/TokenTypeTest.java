package dev.flint.lexer;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokenTypeTest {
    @Test
    public void testEnumValues() {
        assertEquals("NUMBER", TokenType.NUMBER.name());
        assertEquals("PLUS", TokenType.PLUS.name());
        assertEquals("AND", TokenType.AND.name());
        assertEquals("EOF", TokenType.EOF.name());
    }
}
