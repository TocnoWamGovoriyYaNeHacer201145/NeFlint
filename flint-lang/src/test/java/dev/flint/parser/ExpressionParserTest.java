package dev.flint.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import dev.flint.lexer.Lexer;
import dev.flint.lexer.Token;
import dev.flint.parser.Parser;
import dev.flint.ast.ASTNode;
import dev.flint.interpreter.ExecutionContext;

public class ExpressionParserTest {
    @Test
    public void testParseAddition() {
        Lexer lexer = new Lexer("1+2");
        List<Token> tokens = lexer.tokenize();
        Parser parser = new Parser(tokens);
        ASTNode root = parser.getExpressionParser().parseExpression();
        Object result = root.execute(new ExecutionContext());
        assertEquals(3.0, (double) result, 0.0001);
    }

    @Test
    public void testParseLogicalOr() {
        Lexer lexer = new Lexer("false||true");
        List<Token> tokens = lexer.tokenize();
        Parser parser = new Parser(tokens);
        ASTNode root = parser.getExpressionParser().parseExpression();
        Object result = root.execute(new ExecutionContext());
        assertEquals(true, result);
    }
}
