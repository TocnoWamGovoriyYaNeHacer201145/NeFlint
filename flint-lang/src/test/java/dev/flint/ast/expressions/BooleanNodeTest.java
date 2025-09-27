package dev.flint.ast.expressions;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.flint.interpreter.ExecutionContext;

public class BooleanNodeTest {
    @Test
    public void testExecuteReturnsValue() {
        BooleanNode nodeTrue = new BooleanNode(true);
        BooleanNode nodeFalse = new BooleanNode(false);
        assertEquals(true, nodeTrue.execute(new ExecutionContext()));
        assertEquals(false, nodeFalse.execute(new ExecutionContext()));
    }
}
