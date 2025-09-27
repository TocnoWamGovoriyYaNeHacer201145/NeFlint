package dev.flint.ast.statements;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.flint.ast.expressions.NumberNode;
import dev.flint.interpreter.ExecutionContext;
import dev.flint.lexer.Token;
import dev.flint.lexer.TokenType;

public class VarAssignmentNodeTest {
    @Test
    public void testExecuteAssignsVariable() {
        ExecutionContext ctx = new ExecutionContext();
        ctx.defineVariable("y", 1);
        Token token = new Token(TokenType.IDENTIFIER, "y");
        VarAssignmentNode node = new VarAssignmentNode(token, new NumberNode(99));
        node.execute(ctx);
        assertEquals(99.0, ctx.getVariable("y"));
    }
}
