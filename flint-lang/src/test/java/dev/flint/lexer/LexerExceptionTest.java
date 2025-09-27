package dev.flint.lexer;

import org.junit.Test;
import static org.junit.Assert.*;

public class LexerExceptionTest {
    @Test
    public void testLexerExceptionClassExists() {
        LexerException ex = new LexerException();
        assertNotNull(ex);
    }
}
