package dev.flint.parser.StatementParser;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.flint.ast.statements.VarAssignmentNode;
import dev.flint.ast.expressions.NumberNode;
import dev.flint.interpreter.ExecutionContext;
import dev.flint.lexer.Token;
import dev.flint.lexer.TokenType;

public class VarAssignmentParserTest {
    @Test
    public void testVarAssignmentNode() {
        ExecutionContext ctx = new ExecutionContext();
        ctx.defineVariable("y", 1.0);
        VarAssignmentNode node = new VarAssignmentNode(new Token(TokenType.IDENTIFIER, "y"), new NumberNode(99));
        node.execute(ctx);
        assertEquals(99.0, ctx.getVariable("y"));
    }
}
