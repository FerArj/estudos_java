package com.mycompany.segunda.lista.nivelamento;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author EDSON MORAES
 */
public class Sorteio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira um número de 1 a 100");
        Integer numSelecionado = leitor.nextInt();
        
        Integer numAleatorio = 0;
        
        Integer contador = 1;
        
        Integer contadorPar = 1;
        
        Integer contadorImpar = 1;
        
        
        for(int i = 1; i <= 200; i++){
            numAleatorio =  ThreadLocalRandom.current().nextInt(1,100);
            
       
            contador++;
            
            if(numAleatorio%2==0){
                contadorPar++;
            }
            
            if(numAleatorio%3==0){
                contadorImpar++;
            }
            if(numAleatorio == numSelecionado){
                
                System.out.println("Número sorteado na posição: " + contador);
            }
        }
        
        System.out.println("Foram sorteados: " + contadorPar + " números pares " +
                "e " + contadorImpar + " números ímpares.");
    }
}
