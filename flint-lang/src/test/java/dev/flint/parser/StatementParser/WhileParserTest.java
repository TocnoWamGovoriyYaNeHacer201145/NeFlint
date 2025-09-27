package dev.flint.parser.StatementParser;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.flint.ast.statements.WhileNode;
import dev.flint.ast.expressions.NumberNode;
import dev.flint.ast.expressions.VariableNode;
import dev.flint.ast.expressions.BinaryOperationNode;
import dev.flint.lexer.TokenType;
import dev.flint.ast.statements.VarAssignmentNode;
import dev.flint.interpreter.ExecutionContext;
import dev.flint.lexer.Token;

public class WhileParserTest {
    @Test
    public void testWhileLoop() {
        ExecutionContext ctx = new ExecutionContext();
        ctx.defineVariable("i", 0.0);
        WhileNode node = new WhileNode(
            new BinaryOperationNode(
                new VariableNode("i"),
                TokenType.LESS_THAN,
                new NumberNode(3)
            ),
            new VarAssignmentNode(
                new Token(TokenType.IDENTIFIER, "i"),
                new BinaryOperationNode(
                    new VariableNode("i"),
                    TokenType.PLUS,
                    new NumberNode(1)
                )
            )
        );
        node.execute(ctx);
        assertEquals(3.0, ctx.getVariable("i"));
    }
}
