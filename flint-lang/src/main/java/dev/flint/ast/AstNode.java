package dev.flint;

import dev.flint.interpreter.ExecutionContext;

public abstract class ASTNode {
    public abstract Object execute(ExecutionContext ctx);
    public abstract Object evaluate(ExecutionContext ctx);
}
