package com.mycompany.segundo.projeto.nivelamento;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author aluno
 */
public class numeroAleatorio {
    public static void main(String[] args) {
        
        //No java temos a classe Math.random
        //Mas precisamos criar objeto, tipo scanner
        
        //Inteiro aleatório:
        Integer numeroInteiroAleatorio = 
                ThreadLocalRandom.current().nextInt(1,100);
        
        System.out.println("Aleatório inteiro: " + numeroInteiroAleatorio);
    
        Double numeroQuebradoAleatorio = ThreadLocalRandom.current().nextDouble(1.3,30.7);
        
        System.out.println(String.format("Double aleatório: %.3f", + numeroQuebradoAleatorio));
        
    }
 
}
