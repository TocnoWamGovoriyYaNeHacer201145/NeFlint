package dev.flint.parser.StatementParser;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.flint.ast.statements.IfNode;
import dev.flint.ast.expressions.BooleanNode;
import dev.flint.ast.expressions.NumberNode;
import dev.flint.ast.statements.BlockNode;
import dev.flint.interpreter.ExecutionContext;

import java.util.List;

public class IfParserTest {
    @Test
    public void testIfNodeBranches() {
        IfNode node = new IfNode(
            new BooleanNode(true),
            new BlockNode(List.of(new NumberNode(1))),
            new BlockNode(List.of(new NumberNode(2)))
        );
        assertEquals(1.0, node.execute(new ExecutionContext()));
        node = new IfNode(
            new BooleanNode(false),
            new BlockNode(List.of(new NumberNode(1))),
            new BlockNode(List.of(new NumberNode(2)))
        );
        assertEquals(2.0, node.execute(new ExecutionContext()));
    }
}
