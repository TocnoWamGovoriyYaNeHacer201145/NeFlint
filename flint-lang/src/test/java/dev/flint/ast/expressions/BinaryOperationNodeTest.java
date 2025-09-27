package dev.flint.ast.expressions;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.flint.interpreter.ExecutionContext;
import dev.flint.lexer.TokenType;

public class BinaryOperationNodeTest {
    @Test
    public void testAddition() {
        NumberNode left = new NumberNode(2);
        NumberNode right = new NumberNode(3);
        BinaryOperationNode node = new BinaryOperationNode(left, TokenType.PLUS, right);
        assertEquals(5.0, node.execute(new ExecutionContext()));
    }

    @Test
    public void testLogicalAnd() {
        BooleanNode left = new BooleanNode(true);
        BooleanNode right = new BooleanNode(false);
        BinaryOperationNode node = new BinaryOperationNode(left, TokenType.AND, right);
        assertEquals(false, node.execute(new ExecutionContext()));
    }

    @Test
    public void testLogicalOr() {
        BooleanNode left = new BooleanNode(false);
        BooleanNode right = new BooleanNode(true);
        BinaryOperationNode node = new BinaryOperationNode(left, TokenType.OR, right);
        assertEquals(true, node.execute(new ExecutionContext()));
    }
}
