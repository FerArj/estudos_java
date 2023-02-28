package sptech.primeira.lista.nivelamento;
import java.util.Scanner;
/**
 *
 * @author EDSON MORAES
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número");
        Double primeiroNumero = leitor.nextDouble();
        
        System.out.println("Digite outro número");
        Double segundoNumero = leitor.nextDouble();
        
        Double soma = (primeiroNumero + segundoNumero);
        Double subtracao = (primeiroNumero - segundoNumero);
        Double multiplicacao = (primeiroNumero * segundoNumero);
        Double divisao = (primeiroNumero / segundoNumero);
        
        System.out.println("Resultado da soma: \n" + soma);
        System.out.println("Resultado da subtração: \n" + subtracao);
        System.out.println("Resultado da multiplicação: \n" + multiplicacao);
        System.out.println("Resultado da divisão: \n" + divisao);
    }
}
