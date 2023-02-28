package com.mycompany.segundo.projeto.nivelamento;
import java.util.Scanner;

/**
 *
 * @author aluno
 */

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
//        System.out.println("For - de 0 a 10");
//        
//        for(int i = 0; i <= 10; i++){
//            System.out.println(i);
//        }
//        
//        for (int i = 10; i  >= 0; i--) {
//            System.out.println(i);
//        }
//        
//        System.out.println("while - de 0 a 10");
//
//        int i = 0;
//        
//        while(i <= 10){
//            System.out.println(i);
//            i++;
//        }
//        
//        System.out.println("While - Adivinhe um número");
//        Integer numeroDigitado = leitor.nextInt();
//   
//        while(numeroDigitado != 42){ 
//            System.out.println("Adivinhe o número: ");
//            numeroDigitado = leitor.nextInt();
//        }
//        
//        System.out.println("Acertou!");
        
        
        //Do while (um outro tipo de estrutura de repetição)
        System.out.println("do while - adivinhe o número");
        
        System.out.println("Digite um número");
        Integer numeroDigitado2 = leitor.nextInt();
        
        do{
            System.out.println("Adivinhe um número: ");
            numeroDigitado2 = leitor.nextInt();
        }while(numeroDigitado2 != 42);
        
        System.out.println("Acertou!");
        
    }
}
   