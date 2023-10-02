package geradorSenha;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author cauan
 */
public class Gerador {
    public String gerarSenhaAPenasMaiusculas(int digitos){
        String value = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] position = new char[digitos];
        for(int i = 0; i<3; i++){              
                for(int j = 0; j<digitos; j++){
                   Random gerador = new Random();
                   int senha = gerador.nextInt(value.length());

                    // metodo chatArt acessa uma posição especifica da variavel value
                    //a indexação é feita de forma aleatoria
                    position [j] = value.charAt(senha);
                    
                }
                String str = new String(position);
                return str;
            }
            return "senha gerada";
        }
     public String gerarSenhaAlternada(int digitos){
        String value = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvw";
        char[] position = new char[digitos];
        Random gerador = new Random();
        for(int i = 0; i<3; i++){
                for(int j = 0; j<digitos; j++){

                   int senhaComMaiuscula = gerador.nextInt(value.length());
                    // metodo chatArt acessa uma posição especifica da variavel value
                    //a indexação é feita de forma aleatoria
                    position [j] = value.charAt(senhaComMaiuscula);
                    
                }
                String str = new String(position);
                return str;
            }
            return "senha gerada";
        }
    public String gerarSenhaApenasComNumeros(int digitos){
        String value = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvw123456789";
        char[] position = new char[digitos];
        Random gerador = new Random();
        for(int i = 0; i<3; i++){       
                for(int j = 0; j<digitos; j++){
                   int senha = gerador.nextInt(value.length());

                    // metodo chatArt acessa uma posição especifica da variavel value
                    //a indexação é feita de forma aleatoria
                    position [j] = value.charAt(senha);
                    
                }
               
            }
            String str = new String(position);
            return str;
        }
    public String gerarSenhaComNumeros(int digitos){
        String value = "abcdefghijklmnopqrstuvw0123456789";
        char[] position = new char[digitos];
         Random gerador = new Random();
        for(int i = 0; i<3; i++){               
                for(int j = 0; j<digitos; j++){                 
                   int senha = gerador.nextInt(value.length());
                   int senhaNumerica = gerador.nextInt(value.length());
                    // metodo chatArt acessa uma posição especifica da variavel value
                    //a indexação é feita de forma aleatoria
                    position [j] = value.charAt(senha);
                    
                }
                
            }
            String str = new String(position);
            return str;
        }
    public String gerarApenasComMinusculas(int digitos){
        String value = "abcdefghijklmnopqrstuvw";
        char[] position = new char[digitos];
        Random gerador = new Random();
        for(int i = 0; i<3; i++){        
                for(int j = 0; j<digitos; j++){          
                   int senha = gerador.nextInt(value.length());

                    // metodo chatArt acessa uma posição especifica da variavel value
                    //a indexação é feita de forma aleatoria
                    position [j] = value.charAt(senha);
                    
                }
            }
             String str = new String(position);
             return str;
        }
}