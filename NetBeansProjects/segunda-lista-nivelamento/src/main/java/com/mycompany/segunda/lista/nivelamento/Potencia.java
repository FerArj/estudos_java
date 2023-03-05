package com.mycompany.segunda.lista.nivelamento;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Potencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor base:");
        Integer b = leitor.nextInt();
        
        System.out.println("Inisra o valor do expoente");
        Integer e = leitor.nextInt();
        
        Integer potencia = 1;
        
        int i = 0;
        
        while(i < e){
            i++;
            potencia *= b;
        }     
        
        System.out.println(potencia);
    }
}
