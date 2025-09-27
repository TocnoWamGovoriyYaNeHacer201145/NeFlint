package dev.flint.ast.expressions;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.flint.interpreter.ExecutionContext;
import dev.flint.lexer.Token;
import dev.flint.lexer.TokenType;

public class UnaryOperationNodeTest {
    @Test
    public void testMinusOperator() {
        Token minus = new Token(TokenType.MINUS, "-");
        NumberNode operand = new NumberNode(5);
        UnaryOperationNode node = new UnaryOperationNode(minus, operand);
        assertEquals(-5.0, node.execute(new ExecutionContext()));
    }

    @Test
    public void testNotOperator() {
        Token not = new Token(TokenType.NOT, "!");
        BooleanNode operand = new BooleanNode(true);
        UnaryOperationNode node = new UnaryOperationNode(not, operand);
        assertEquals(false, node.execute(new ExecutionContext()));
    }
}
