package com.mycompany.segunda.lista.nivelamento;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Acumulador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        
        System.out.println("Insira vários números:");
        Integer numero = leitor.nextInt();
        
        Integer soma = 0;
        
        while(numero != 0){
            soma = numero + soma;
            
            System.out.println("Insira vários números:");
            
            numero = leitor.nextInt();
            
            
        }
        
        System.out.println(soma);
    }
}
