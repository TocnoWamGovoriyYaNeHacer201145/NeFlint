package dev.flint.lexer;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokenTest {
    @Test
    public void testTokenProperties() {
        Token token = new Token(TokenType.NUMBER, "123");
        assertEquals(TokenType.NUMBER, token.getType());
        assertEquals("123", token.getValue());
    }

    @Test
    public void testToStringFormat() {
        Token token = new Token(TokenType.PLUS, "+");
        String str = token.toString();
        assertTrue(str.contains("type=PLUS"));
        assertTrue(str.contains("value='+'"));
    }
}
