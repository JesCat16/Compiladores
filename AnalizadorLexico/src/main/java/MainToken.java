/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.IOException;
import java.util.List;

/**
 *
 * @author 
 * 
 * 
 * 
 * 
 */
public class MainToken {
    public static void main(String[] args) {
        List<Token> tokens = null;
        String data = "2 + 3 *2 / 4 (2345) + soma";
        Lexer lexer = new Lexer(data);
        tokens = lexer.getTokens();
        for (Token token: tokens) {
            System.out.println(token);
        }
    }
}
