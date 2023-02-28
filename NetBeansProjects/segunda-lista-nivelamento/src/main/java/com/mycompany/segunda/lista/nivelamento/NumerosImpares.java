package com.mycompany.segunda.lista.nivelamento;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class NumerosImpares {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        for(int i = 0; i <= 90; i++){
            if(i%2!=0){
                System.out.println(i);   
            }
        }
    }
}
