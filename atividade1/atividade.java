import java.util.Scanner;

public class atividade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma string para verificar se ela está balanceada");
        String texto = input.next();

        boolean balanceada = verificarStringBalanceada(texto);

        if(balanceada){
            System.out.println("A string está balanceada");
        }else{
            System.out.println("A string não está balanceada");
        }
    }
    
    public static boolean verificarStringBalanceada(String texto){

        for(int x = 0; x < texto.length(); x++){
            char caracter = texto.charAt(x);
            if(caracter == '('){
                for(int y = x; y < texto.length(); y++){
                    char caracter2 = texto.charAt(y);
                    if(caracter2 == ')'){
                        return true;
                    }
                }
            }
            if(caracter == '['){
                for(int y = x; y < texto.length(); y++){
                    char caracter2 = texto.charAt(y);
                    if(caracter2 == ']'){
                        return true;
                    }
                }
            }
            if(caracter == '{'){
                for(int y = x; y < texto.length(); y++){
                    char caracter2 = texto.charAt(y);
                    if(caracter2 == '}'){
                        return true;
                    }
                }
            }
        }
    
        return false;

    }

    
}