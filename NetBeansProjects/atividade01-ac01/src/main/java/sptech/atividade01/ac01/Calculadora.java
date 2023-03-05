package sptech.atividade01.ac01;
import java.util.Scanner;

/**
 *
 * @author EDSON MORAES
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Integer numDigitado = 0;
        Integer resultado = 1;
               
        System.out.println("Digite um número correspondente a operação desejada \n "
                + "1 - Soma  \n "
                + "2 - Multiplicação  \n "
                + "3 - Divisão  \n "
                + "4 - Subtração  \n "
                + "0 - Sair ");
        Integer opcao = leitor.nextInt();
        
        while(opcao != 0){
                        
        
            switch(opcao){
                case 1:
                    System.out.println("Digite um número inteiro");
                    numDigitado = leitor.nextInt();
                    
                    
                    for(int i = 1; i <= 10; i++){
                    
                         resultado = numDigitado + i;
                        
                        System.out.println(String.format("%d + %d = %d",
                                numDigitado, i, resultado));
                    }
                    break;
                    
                case 2:
                    System.out.println("Digite um número inteiro");
                    numDigitado = leitor.nextInt();
                    
                     for(int i = 1; i <= 10; i++){
                    
                         resultado = numDigitado * i;
                        
                        System.out.println(String.format("%d x %d = %d",
                                numDigitado, i, resultado));
                    }
                    break;
                case 3:
                    System.out.println("Digite um número inteiro");
                    numDigitado = leitor.nextInt();
                                       
                     for(int i = 1; i <= 10; i++){
                         
                         resultado = numDigitado / i;
                        
                        System.out.println(String.format("%d ÷ %d = %d",
                                numDigitado, i, resultado));
                    }
                    break;
                case 4:
                    System.out.println("Digite um número inteiro");
                    numDigitado = leitor.nextInt();
                    
                     for(int i = 1; i <= 10; i++){
                    
                         resultado = numDigitado - i;
                        
                        System.out.println(String.format("%d - %d = %d",
                                numDigitado, i, resultado));
                    }
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                     break;
            }
              
             System.out.println("Digite um número correspondente a operação desejada \n "
                + "1 - Soma  \n "
                + "2 - Multiplicação  \n "
                + "3 - Divisão  \n "
                + "4 - Subtração  \n "
                + "0 - Sair ");
                opcao = leitor.nextInt();
            
        }
        System.out.println("Até logo!");
    }
}
