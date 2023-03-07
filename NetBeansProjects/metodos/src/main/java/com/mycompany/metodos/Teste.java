package com.mycompany.metodos;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Teste {
    public static void main(String[] args) {
        String nome01 = "Fernando";
        String nome02 = "xampson";
        Utilitario util = new Utilitario();
        Calculadora calc = new Calculadora();
        Scanner leitor = new Scanner(System.in);
        
        // para ter acesso aos métodos,
        // precisamos criar um objeto da classe
        // onde esse método foi criado
        // Insânciar para transformar em objeto
       
        
        // chamar médoto = invocar
        
        System.out.println("Escreva seu nome");
        String nomeDigitado = leitor.nextLine();
        
        util.exibirNomeFormatado(nome01);
        util.exibirNomeFormatado(nome02);
      
        //Usando a calculadora
        
        Double soma = calc.somar(10.0,32.0);
        System.out.println("Soma retornada é:" + (soma + 10));
        
        Double divisao = calc.dividir(10.0,32.0);
        System.out.println("Divisão retornada é:" + (divisao / 10));
        
        Double subtracao = calc.subtrair(10.0,32.0);
        System.out.println("Subtração retornada é:" + (subtracao - 10));
     
        Double multiplicacao = calc.multiplicar(10.0,32.0);
        System.out.println("Multiplicação retornada é:" + (multiplicacao * 10));
        
    }
}
