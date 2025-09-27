package dev.flint;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import dev.flint.interpreter.ExecutionContext;
import dev.flint.lexer.Lexer;
import dev.flint.lexer.Token;
import dev.flint.parser.Parser;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testArithmeticExpression() {
        String program = "2+3*4";
        Lexer lexer = new Lexer(program);
        List<Token> tokens = lexer.tokenize();
        Parser parser = new Parser(tokens);
        dev.flint.ast.ASTNode root = parser.parse();
        ExecutionContext ctx = new ExecutionContext();
        Object result = root.execute(ctx);
        org.junit.Assert.assertEquals(14.0, (double) result, 0.0001);
    }

    @Test
    public void testBracketedExpression() {
        String program = "(2+3)*4";
        Lexer lexer = new Lexer(program);
        List<Token> tokens = lexer.tokenize();
        Parser parser = new Parser(tokens);
        dev.flint.ast.ASTNode root = parser.parse();
        ExecutionContext ctx = new ExecutionContext();
        Object result = root.execute(ctx);
        org.junit.Assert.assertEquals(20.0, (double) result, 0.0001);
    }

    @Test
    public void testDivisionAndModulo() {
        String program = "10/3%2";
        Lexer lexer = new Lexer(program);
        List<Token> tokens = lexer.tokenize();
        Parser parser = new Parser(tokens);
        dev.flint.ast.ASTNode root = parser.parse();
        ExecutionContext ctx = new ExecutionContext();
        Object result = root.execute(ctx);
        org.junit.Assert.assertEquals(1.0, (double) result, 0.0001);
    }

    @Test
    public void testLogicalOr() {
        String program = "false||true";
        Lexer lexer = new Lexer(program);
        List<Token> tokens = lexer.tokenize();
        Parser parser = new Parser(tokens);
        dev.flint.ast.ASTNode root = parser.parse();
        ExecutionContext ctx = new ExecutionContext();
        Object result = root.execute(ctx);
        org.junit.Assert.assertEquals(true, result);
    }

    @Test
    public void testLogicalAnd() {
        String program = "true&&false";
        Lexer lexer = new Lexer(program);
        List<Token> tokens = lexer.tokenize();
        Parser parser = new Parser(tokens);
        dev.flint.ast.ASTNode root = parser.parse();
        ExecutionContext ctx = new ExecutionContext();
        Object result = root.execute(ctx);
        org.junit.Assert.assertEquals(false, result);
    }

    @Test
    public void testComplexExpression() {
        String program = "(100%7||false)";
        Lexer lexer = new Lexer(program);
        List<Token> tokens = lexer.tokenize();
        Parser parser = new Parser(tokens);
        dev.flint.ast.ASTNode root = parser.parse();
        ExecutionContext ctx = new ExecutionContext();
        Object result = root.execute(ctx);
        org.junit.Assert.assertEquals(true, result);
    }
}