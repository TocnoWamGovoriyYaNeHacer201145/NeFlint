package dev.flint.parser.StatementParser;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.flint.ast.statements.VarDeclarationNode;
import dev.flint.ast.expressions.NumberNode;
import dev.flint.interpreter.ExecutionContext;

public class VarDeclarationParserTest {
    @Test
    public void testVarDeclarationNode() {
        ExecutionContext ctx = new ExecutionContext();
        VarDeclarationNode node = new VarDeclarationNode("x", new NumberNode(42));
        node.execute(ctx);
        assertEquals(42.0, ctx.getVariable("x"));
    }
}
