package dev.flint.ast.statements;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.flint.ast.expressions.BooleanNode;
import dev.flint.ast.expressions.NumberNode;
import dev.flint.interpreter.ExecutionContext;

public class IfNodeTest {
    @Test
    public void testExecuteThenBranch() {
        IfNode node = new IfNode(
            new BooleanNode(true),
            new BlockNode(java.util.List.of(new NumberNode(1))),
            new BlockNode(java.util.List.of(new NumberNode(2)))
        );
        assertEquals(1.0, node.execute(new ExecutionContext()));
    }

    @Test
    public void testExecuteElseBranch() {
        IfNode node = new IfNode(
            new BooleanNode(false),
            new BlockNode(java.util.List.of(new NumberNode(1))),
            new BlockNode(java.util.List.of(new NumberNode(2)))
        );
        assertEquals(2.0, node.execute(new ExecutionContext()));
    }
}
