package com.mycompany.segundo.projeto.nivelamento;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class SwitchCase {
    public static void main(String[] args) {
        //Cenário: Digite um número que faça um print de qual dia da semana
        //esse número representa
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite um número:");
        Integer numDigitado = leitor.nextInt();
        
        switch(numDigitado){
            case 1:
                System.out.println("Segundou!");
                break;
            case 2:
                System.out.println("Terçou!");
                break;
            case 3:
                System.out.println("Quartou");
                break;
            case 4:
                System.out.println("Quintou");
                break;
            case 5:
                System.out.println("Sextou");
                break;
            default:
                System.out.println("Número inválido! >w<");
        }
    }
}
