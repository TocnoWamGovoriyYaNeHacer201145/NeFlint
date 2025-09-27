package dev.flint.ast.statements;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.flint.ast.expressions.NumberNode;
import dev.flint.ast.expressions.BooleanNode;
import dev.flint.interpreter.ExecutionContext;

public class WhileNodeTest {
    @Test
    public void testWhileExecutesLoop() {
        // Loop increments a variable from 0 to 3
        ExecutionContext ctx = new ExecutionContext();
        ctx.defineVariable("i", 0.0);
        WhileNode node = new WhileNode(
            new dev.flint.ast.expressions.BinaryOperationNode(
                new dev.flint.ast.expressions.VariableNode("i"),
                dev.flint.lexer.TokenType.LESS_THAN,
                new NumberNode(3)
            ),
            new dev.flint.ast.statements.VarAssignmentNode(
                new dev.flint.lexer.Token(dev.flint.lexer.TokenType.IDENTIFIER, "i"),
                new dev.flint.ast.expressions.BinaryOperationNode(
                    new dev.flint.ast.expressions.VariableNode("i"),
                    dev.flint.lexer.TokenType.PLUS,
                    new NumberNode(1)
                )
            )
        );
        node.execute(ctx);
        assertEquals(3.0, ctx.getVariable("i"));
    }
}
