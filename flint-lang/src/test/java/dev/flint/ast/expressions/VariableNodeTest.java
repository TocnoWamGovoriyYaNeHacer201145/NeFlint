package dev.flint.ast.expressions;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.flint.interpreter.ExecutionContext;

public class VariableNodeTest {
    @Test
    public void testExecuteReturnsVariableValue() {
        ExecutionContext ctx = new ExecutionContext();
        ctx.defineVariable("x", 99);
        VariableNode node = new VariableNode("x");
        assertEquals(99, node.execute(ctx));
    }
}
