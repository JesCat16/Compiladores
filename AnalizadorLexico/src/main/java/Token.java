/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author unifanami
 */

// classifica o tipo de token para poder mostrar.
public class Token {
    private String tipo;
    private String lexema;
    
    public Token(String tipo, String lexema){
        this.tipo = tipo;
        this.lexema = lexema;
    }
    

    @Override
    public String toString() {
        return "<"  + tipo + ", " + lexema + '>';
    }
    
    
    
}
