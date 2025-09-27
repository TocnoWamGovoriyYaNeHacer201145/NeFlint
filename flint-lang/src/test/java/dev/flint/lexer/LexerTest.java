package dev.flint.lexer;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class LexerTest {
    @Test
    public void testTokenizeSimpleExpression() {
        Lexer lexer = new Lexer("2+3");
        List<Token> tokens = lexer.tokenize();
        assertEquals(TokenType.NUMBER, tokens.get(0).getType());
        assertEquals("2", tokens.get(0).getValue());
        assertEquals(TokenType.PLUS, tokens.get(1).getType());
        assertEquals(TokenType.NUMBER, tokens.get(2).getType());
        assertEquals("3", tokens.get(2).getValue());
    }

    @Test
    public void testTokenizeBoolean() {
        Lexer lexer = new Lexer("true||false");
        List<Token> tokens = lexer.tokenize();
        assertEquals(TokenType.BOOLEAN, tokens.get(0).getType());
        assertEquals("true", tokens.get(0).getValue());
        assertEquals(TokenType.OR, tokens.get(1).getType());
        assertEquals(TokenType.BOOLEAN, tokens.get(2).getType());
        assertEquals("false", tokens.get(2).getValue());
    }
}
