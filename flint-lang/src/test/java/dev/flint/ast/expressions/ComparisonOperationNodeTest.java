package dev.flint.ast.expressions;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.flint.interpreter.ExecutionContext;
import dev.flint.lexer.TokenType;

public class ComparisonOperationNodeTest {
    @Test
    public void testEqual() {
        NumberNode left = new NumberNode(5);
        NumberNode right = new NumberNode(5);
        ComparisonOperationNode node = new ComparisonOperationNode(left, TokenType.EQUAL, right);
        assertEquals(true, node.execute(new ExecutionContext()));
    }

    @Test
    public void testNotEqual() {
        NumberNode left = new NumberNode(5);
        NumberNode right = new NumberNode(6);
        ComparisonOperationNode node = new ComparisonOperationNode(left, TokenType.NOT_EQUAL, right);
        assertEquals(true, node.execute(new ExecutionContext()));
    }

    @Test
    public void testLessThan() {
        NumberNode left = new NumberNode(3);
        NumberNode right = new NumberNode(4);
        ComparisonOperationNode node = new ComparisonOperationNode(left, TokenType.LESS_THAN, right);
        assertEquals(true, node.execute(new ExecutionContext()));
    }
}
