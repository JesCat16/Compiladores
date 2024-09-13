
import java.text.CharacterIterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author unifanami
 */
public class MathOperator extends AFD{

    @Override
    public Token evaluate(CharacterIterator code) {
        switch(code.current()){
            case'+':
                code.next();
                return new Token("PLUS", "+");
            case'-':
                code.next();
                return new Token("MINUS", "-");
            case'*':
                code.next();
                return new Token("MULT", "*");
            case'/':
                code.next();
                return new Token("DIV", "/");
            case'(':
                code.next();
                return new Token("AP", "(");
            case')':
                code.next();
                return new Token("FP", ")");
            default:
                return null;
        }
    }
    
}
