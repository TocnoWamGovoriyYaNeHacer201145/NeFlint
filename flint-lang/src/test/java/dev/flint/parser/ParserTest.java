package dev.flint.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import dev.flint.lexer.Lexer;
import dev.flint.lexer.Token;
import dev.flint.ast.ASTNode;
import dev.flint.interpreter.ExecutionContext;

public class ParserTest {
    @Test
    public void testParseArithmeticExpression() {
        Lexer lexer = new Lexer("2+3*4");
        List<Token> tokens = lexer.tokenize();
        Parser parser = new Parser(tokens);
        ASTNode root = parser.parse();
        Object result = root.execute(new ExecutionContext());
        assertEquals(14.0, (double) result, 0.0001);
    }

    @Test
    public void testParseLogicalExpression() {
        Lexer lexer = new Lexer("true&&false");
        List<Token> tokens = lexer.tokenize();
        Parser parser = new Parser(tokens);
        ASTNode root = parser.parse();
        Object result = root.execute(new ExecutionContext());
        assertEquals(false, result);
    }
}
