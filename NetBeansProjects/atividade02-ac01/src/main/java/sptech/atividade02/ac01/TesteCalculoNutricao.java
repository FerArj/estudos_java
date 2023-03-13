package sptech.atividade02.ac01;
import java.util.Scanner;

/**
 *
 * @author EDSON MORAES
 */
public class TesteCalculoNutricao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculoNutricao calculaIMC = new CalculoNutricao();
        
        System.out.println("Qual sua altura?");
        Double altura = leitor.nextDouble();
        
        System.out.println("Qual seu peso?");
        Double peso = leitor.nextDouble();
        
        Double IMC = calculaIMC.calculaIMC(peso, altura);
       
        System.out.println(String.format("O IMC é: %.2f", IMC));
        
        System.out.println("Deseja calcular outra pessoa? \n"
                + "s - Continuar \n"
                + "n - Sair");
        String opcao = leitor.next();
        
        while(!opcao.equals("n")){
            System.out.println("Qual sua altura?");
            altura = leitor.nextDouble();
        
            System.out.println("Qual seu peso?");
            peso = leitor.nextDouble();
       
            IMC = calculaIMC.calculaIMC(peso, altura);
            
            System.out.println(String.format("O IMC é: %.2f", IMC));
        
            System.out.println("Deseja calcular outra pessoa? \n"
                + "s - Continuar \n"
                + "n - Sair");
            opcao = leitor.next();
        }
    }
}
