package com.mycompany.terceira.lista;

/**
 *
 * @author aluno
 */
public class CalculoSalario {

    Double salarioMinimo(Double salario, Double salarioMinimo) {
        Double salCalcMin = salario / salarioMinimo;
        return salCalcMin;
    }

    String definirClasse(Double salCalcMin) {
        if (salCalcMin > 20.00) {
            String classe = "A";
            return classe;
        } else if (salCalcMin > 10.00) {
            String classe = "B";
            return classe;
        } else if (salCalcMin > 4.00) {
            String classe = "C";
            return classe;
        } else if (salCalcMin > 2.00) {
            String classe = "D";
            return classe;
        } else {
            String classe = "E";
            return classe;
        }
    }

}
