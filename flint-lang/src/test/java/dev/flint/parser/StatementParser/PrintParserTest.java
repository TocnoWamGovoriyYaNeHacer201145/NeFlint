package dev.flint.parser.StatementParser;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.flint.ast.statements.PrintNode;
import dev.flint.ast.expressions.NumberNode;
import dev.flint.interpreter.ExecutionContext;

public class PrintParserTest {
    @Test
    public void testPrintNode() {
        PrintNode node = new PrintNode(new NumberNode(123));
        assertNull(node.execute(new ExecutionContext())); // Print returns null
    }
}
