package dev.flint.ast.expressions;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.flint.interpreter.ExecutionContext;

public class CharNodeTest {
    @Test
    public void testExecuteReturnsValue() {
        CharNode node = new CharNode('a');
        assertEquals('a', node.execute(new ExecutionContext()));
    }
}
