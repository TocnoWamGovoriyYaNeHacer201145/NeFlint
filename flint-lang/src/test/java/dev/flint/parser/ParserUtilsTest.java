package dev.flint.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.flint.lexer.Token;
import dev.flint.lexer.TokenType;

public class ParserUtilsTest {
    @Test
    public void testIsLiteralNumber() {
        Token token = new Token(TokenType.NUMBER, "42");
        assertTrue(ParserUtils.isLiteral(token));
    }

    @Test
    public void testIsLiteralBoolean() {
        Token token = new Token(TokenType.BOOLEAN, "true");
        assertTrue(ParserUtils.isLiteral(token));
    }

    @Test
    public void testIsLiteralChar() {
        Token token = new Token(TokenType.CHAR, "a");
        assertTrue(ParserUtils.isLiteral(token));
    }

    @Test
    public void testIsLiteralIdentifier() {
        Token token = new Token(TokenType.IDENTIFIER, "x");
        assertFalse(ParserUtils.isLiteral(token));
    }
}
