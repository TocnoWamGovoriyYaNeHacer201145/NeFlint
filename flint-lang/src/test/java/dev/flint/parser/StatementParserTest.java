package dev.flint.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import dev.flint.lexer.Lexer;
import dev.flint.lexer.Token;
import dev.flint.parser.Parser;
import dev.flint.ast.ASTNode;
import dev.flint.interpreter.ExecutionContext;

public class StatementParserTest {
    @Test
    public void testParsePrintStatement() {
        Lexer lexer = new Lexer("print 42;");
        List<Token> tokens = lexer.tokenize();
        Parser parser = new Parser(tokens);
        ASTNode root = parser.getStatementParser().parseStatements();
        Object result = root.execute(new ExecutionContext());
        assertNull(result); // Print returns null
    }
}
