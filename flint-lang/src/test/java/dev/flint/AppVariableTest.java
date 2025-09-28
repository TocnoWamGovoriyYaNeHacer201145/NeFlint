package dev.flint;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import dev.flint.lexer.Lexer;
import dev.flint.lexer.Token;
import dev.flint.parser.Parser;
import dev.flint.ast.ASTNode;
import dev.flint.interpreter.ExecutionContext;

public class AppVariableTest {
    @Test
    public void testVariableAssignmentAndUsage() {
        String program = "var x = 5; x = x + 2; x";
        Lexer lexer = new Lexer(program);
        List<Token> tokens = lexer.tokenize();
        for (Token token : tokens) {
            System.out.println("-------- : : " + token);
        }
        Parser parser = new Parser(tokens);
        ASTNode root = parser.parse();
        ExecutionContext ctx = new ExecutionContext();
        Object result = root.execute(ctx);
        assertEquals(7.0, result);
    }

    @Test
    public void testVariableInExpression() {
        String program = "var y = 10; var z = y * 2; z";
        Lexer lexer = new Lexer(program);
        List<Token> tokens = lexer.tokenize();
        for (Token token : tokens) {
            System.out.println(token);
        }
        Parser parser = new Parser(tokens);
        ASTNode root = parser.parse();
        ExecutionContext ctx = new ExecutionContext();
        Object result = root.execute(ctx);
        assertEquals(20.0, result);
    }
}
