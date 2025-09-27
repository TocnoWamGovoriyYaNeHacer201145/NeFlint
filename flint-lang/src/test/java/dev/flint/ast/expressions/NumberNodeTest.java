package dev.flint.ast.expressions;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.flint.interpreter.ExecutionContext;

public class NumberNodeTest {
    @Test
    public void testExecuteReturnsValue() {
        NumberNode node = new NumberNode(42.5);
        assertEquals(42.5, node.execute(new ExecutionContext()));
    }
}
