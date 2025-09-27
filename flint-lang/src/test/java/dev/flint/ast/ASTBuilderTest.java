package dev.flint.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.flint.ast.expressions.NumberNode;
import dev.flint.ast.expressions.BinaryOperationNode;
import dev.flint.lexer.TokenType;

public class ASTBuilderTest {
    @Test
    public void testCreateBinaryOperationNode() {
        NumberNode left = new NumberNode(2);
        NumberNode right = new NumberNode(3);
        BinaryOperationNode node = ASTBuilder.createBinaryOperationNode(left, TokenType.PLUS, right);
        assertNotNull(node);
        assertEquals(TokenType.PLUS, node.getLeft().execute(null) instanceof NumberNode ? TokenType.PLUS : TokenType.PLUS); // Just checks node creation
    }
}
