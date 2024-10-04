/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.List;
/**
 *
 * @author unifjjesus
 */
public class Parser {
    List<Token> tokens;
    Token token;

    public Parser(List<Token> tokens) {
        this.tokens = tokens;
    }
    
    public Token getNextToken(){
        if(tokens.size()>0){
            return tokens.remove(0);
        }
        return null;
    }
    private void erro(String regra){
        System.out.println("Regra: " + regra);
        System.out.println("token inválido: " + token.lexema);
        System.exit(0);
    }
    
    public boolean matchL(String lexema){
        if(token.lexema.equals(lexema)){
            token = getNextToken();
            return true;
        }
        return false;
    }
    
    public boolean matchT(String tipo){
        if(token.tipo.equals(tipo)){
            token = getNextToken();
            return true;
        }
        return false;
    }
    
    public void main(){
        token = getNextToken();
       /*
         if(ifelse()){
            if(token.tipo.equals("EOF")){
                System.out.println("Sintaticamente correto");
            }else{
                erro("EOF");
            }
        }*/
        if(whileC()){
            if(token.tipo.equals("EOF")){
                System.out.println("Sintaticamente correto");
            }else{
                erro("EOF");
            }
        }
    }
    
    public boolean whileC(){
        if(matchL("while") && condicao() && matchL(":") && expressao()){
            return true;
        }
        erro("whileC");
        return false;
    }
    
    
    public boolean ifelse(){
        if(matchL("if") && condicao() && matchL("then") && expressao() && matchL("else") && expressao()){
            return true;
        }
        erro("ifelse");
        return false;
    }
    
    public boolean condicao(){
        if(matchT("id") && operador() && matchT("num")){
            return true;
        }
        erro("condicao");
        return false;
    }
    
    public boolean operador(){
         if(matchL(">") || matchL("<") || matchL("==")){
            return true;
        }
        erro("operador");
        return false;
    }
    
    public boolean expressao(){
        if(matchT("id") && matchL("=") && matchT("num")){
            return true;
        }
        erro("expressao");
        return false;
    }
    
}
