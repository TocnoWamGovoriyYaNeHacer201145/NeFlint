package dev.flint.ast.statements;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.flint.ast.expressions.NumberNode;
import dev.flint.interpreter.ExecutionContext;

public class PrintNodeTest {
    @Test
    public void testExecutePrintsValue() {
        PrintNode node = new PrintNode(new NumberNode(42));
        // Just check that execute returns null (printing is side effect)
        assertNull(node.execute(new ExecutionContext()));
    }
}
