
import java.text.CharacterIterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unifjjesus
 */
public class Id  extends AFD{

    @Override
    public Token evaluate(CharacterIterator code) {
        if (Character.isAlphabetic(code.current())) {
            String id = readId(code);
            
            if (endId(code)) {
                return new Token("ID", id);
            }
        }
        return null;
    }
    
    private String readId(CharacterIterator code){
        String id = "";
        while(Character.isDigit(code.current()) || Character.isAlphabetic(code.current())){
            id += code.current();
            code.next();
        }
        return id;
    }
    
    private boolean endId(CharacterIterator code){
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
