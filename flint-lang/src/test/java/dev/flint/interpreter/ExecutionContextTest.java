package dev.flint.interpreter;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExecutionContextTest {
    @Test
    public void testVariableDefinitionAndAssignment() {
        ExecutionContext ctx = new ExecutionContext();
        ctx.defineVariable("x", 42);
        assertEquals(42, ctx.getVariable("x"));
        ctx.assignVariable("x", 100);
        assertEquals(100, ctx.getVariable("x"));
    }

    @Test(expected = RuntimeException.class)
    public void testAssignUndefinedVariableThrows() {
        ExecutionContext ctx = new ExecutionContext();
        ctx.assignVariable("y", 1); // Should throw
    }
}
