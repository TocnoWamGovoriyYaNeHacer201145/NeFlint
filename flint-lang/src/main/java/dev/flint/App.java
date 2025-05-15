package dev.flint;

import java.util.ArrayList;
import java.util.List;

import dev.flint.ast.ASTNode;
import dev.flint.ast.expressions.BinaryOperationNode;
import dev.flint.ast.expressions.ExpressionNode;
import dev.flint.ast.expressions.NumberNode;
import dev.flint.ast.statements.BlockNode;
import dev.flint.lexer.Lexer;
import dev.flint.lexer.Token;
import dev.flint.parser.Parser;

public class App 
{

    private static void printTree(ASTNode root) {
        if(root instanceof NumberNode) {
            System.out.println("--- --- " + root);
            // base condition
            return;
        }
        System.out.println("--- --- " + root);
        if(root instanceof BlockNode b) {
            List<ASTNode> l = b.getStatements();
            for(int i = 0; i < l.size(); i++ ) {
                printTree(l.get(i));
            }
        } else if(root instanceof BinaryOperationNode b) {
            ASTNode l = b.getLeft();
            ASTNode r = b.getRight();
            printTree(l);
            printTree(r);
        }
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String program = "(2+3)*5";
        Lexer l = new Lexer(program);
        List<Token> t = new ArrayList<>();
        t = l.tokenize();
        // for(int i = 0; i < t.size(); i++) {
        //     System.out.println(t.get(i));
        // }
        Parser p = new Parser(t);
        
        printTree(p.parse());
    }
}


/*
 * 
 * 2+3
 * 2+3*4
 * 3*4/5
 * 3/5%2
 * do all this with brackets
 * 
 * think about how to implement the execution of this ..we need the answer
 * 
 * then check for locgical operations and, or, not.
 * 
 * then work on creating a variable in ast tree
 * then thin k of how to add it in the executorService
 * think of variable assingment operator 
 * do arithmatic and logicalo operations using variables
 * then work on print ast tree
 * think of how to implement the stdio and stderr, and what is that exactly..
 * how to implement stdio in our code
 * think of how to print on the stdio
 * implemment if condition in the language
 * implement some kind of loop in the language in the languasge
 * implement an object in the language
 * implement an array in the language
 * implement a function in the language
 * implement function call in language
 * make print equal to  a function
 * 
 * 
 */

