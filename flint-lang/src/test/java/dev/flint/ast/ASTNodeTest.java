package dev.flint.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.flint.interpreter.ExecutionContext;

public class ASTNodeTest {
    @Test
    public void testAbstractExecute() {
        // ASTNode is abstract, so we test a concrete subclass
        class DummyNode extends ASTNode {
            @Override
            public Object execute(ExecutionContext ctx) {
                return "executed";
            }
        }
        DummyNode node = new DummyNode();
        assertEquals("executed", node.execute(new ExecutionContext()));
    }
}
