package dev.flint.ast.statements;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.flint.ast.expressions.NumberNode;
import dev.flint.interpreter.ExecutionContext;

public class VarDeclarationNodeTest {
    @Test
    public void testExecuteDefinesVariable() {
        ExecutionContext ctx = new ExecutionContext();
        VarDeclarationNode node = new VarDeclarationNode("x", new NumberNode(7));
        node.execute(ctx);
        assertEquals(7.0, ctx.getVariable("x"));
    }
}
