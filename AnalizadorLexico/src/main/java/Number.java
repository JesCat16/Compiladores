
import java.text.CharacterIterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unifjjesus
 */
public class Number extends AFD {
    
    @Override
    public Token evaluate(CharacterIterator code) {
        if (Character.isDigit(code.current())) {
            String number = readNumber(code);
            
            if (endNumber(code)) {
                return new Token("NUM", number);
            }
        }
        return null;
    }
    
    private String readNumber(CharacterIterator code){
        String number = "";
        while(Character.isDigit(code.current())){
            number += code.current();
            code.next();
        }
        return number;
    }
    
    private boolean endNumber(CharacterIterator code){
        return code.current() == ' ' ||
               code.current() == '+' ||
               code.current() == '\n' ||
               code.current() == '-' ||
               code.current() == '*' ||
               code.current() == '/' ||
               code.current() == '(' ||
               code.current() == ')' ||
               code.current() == CharacterIterator.DONE;
    }
}
