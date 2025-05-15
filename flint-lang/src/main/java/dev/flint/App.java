package dev.flint;

import java.util.ArrayList;
import java.util.List;

import dev.flint.lexer.Lexer;
import dev.flint.lexer.Token;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String program = "2+3;";
        Lexer l = new Lexer(program);
        List<Token> t = new ArrayList<>();
        t = l.tokenize();
        for(int i = 0; i < t.size(); i++) {
            System.out.println(t.get(i));
        }
    }
}


