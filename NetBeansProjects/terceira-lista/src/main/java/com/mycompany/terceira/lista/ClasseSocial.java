package com.mycompany.terceira.lista;

import java.util.Scanner;

/**
 * .
 * @author aluno
 */
public class ClasseSocial {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculoSalario calc = new CalculoSalario();

        Double salarioMinimo = 1045.00;

        System.out.println("Digite sua renda");
        Double renda = leitor.nextDouble();

        Double salCalcMin = calc.salarioMinimo(renda, salarioMinimo);
        System.out.println(String.format("Você recebe aproximadamente %.2f salários minimos", salCalcMin));
        
        String classe = calc.definirClasse(salCalcMin);
        System.out.println(String.format("Você pertence a classe social %s", classe));

    }
}
