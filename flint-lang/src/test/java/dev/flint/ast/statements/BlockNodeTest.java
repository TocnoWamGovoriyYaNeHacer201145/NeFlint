package dev.flint.ast.statements;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import dev.flint.ast.expressions.NumberNode;
import dev.flint.interpreter.ExecutionContext;

public class BlockNodeTest {
    @Test
    public void testExecuteReturnsLastValue() {
        BlockNode block = new BlockNode(List.of(new NumberNode(1), new NumberNode(2)));
        assertEquals(2.0, block.execute(new ExecutionContext()));
    }
}
