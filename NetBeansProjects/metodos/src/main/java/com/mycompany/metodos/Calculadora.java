package com.mycompany.metodos;

/**
 *
 * @author aluno
 */
public class Calculadora {
    Double somar(Double numero01, Double numero02){
       Double soma = numero01 + numero02;
       return soma;
    }
    
    Double dividir(Double numero01, Double numero02){
        Double divisao = numero01 / numero02;
        return divisao;
    }
    
    Double subtrair (Double numero01, Double numero02){
        Double subtracao = numero01 - numero02;
        return subtracao;
    }
    
    Double multiplicar (Double numero01, Double numero02){
        Double multiplicacao = numero01 * numero02;
        return multiplicacao;
    }
    
    void exibirSoma(Double numero01, Double numero02){
        System.out.println(numero01 + numero02);
    }
    
    void exibirDivisao(Double numero01, Double numero02){
        System.out.println(numero01 / numero02);
    }
    
    void exibirSubtracao(Double numero01, Double numero02){
        System.out.println(numero01 - numero02);
    }
    
    void exibirMultiplicacao(Double numero01, Double numero02){
        System.out.println(numero01 * numero02);
    }
    
    
    
    // faça os metodos para divisão, subtração e multiplicação
    
}

    