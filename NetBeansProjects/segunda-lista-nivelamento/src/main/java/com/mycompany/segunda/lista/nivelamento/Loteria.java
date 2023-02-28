package com.mycompany.segunda.lista.nivelamento;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author aluno
 */
public class Loteria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número entre 0 e 10");
        Integer numeroDigitado  = leitor.nextInt();
         
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(1,11);
        
        int contador = 1;
        
        while(numeroAleatorio != numeroDigitado){
            numeroAleatorio = ThreadLocalRandom.current().nextInt(1,11);        
            System.out.println(numeroAleatorio);
            
            contador++;
            
        }
        
        if(contador <= 3){
            System.out.println("Você é MUITO sortudo");
        }else if(contador < 10){
            System.out.println("Você é sortudo");
        }else{
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
        
    }
}
