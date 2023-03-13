package sptech.atividade02.ac01;
import java.util.Scanner;

public class TesteCalculoAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculoAluno calcAluno = new CalculoAluno();
        
        System.out.println("Primeira nota:");
        Double nota01 = leitor.nextDouble();
        
        System.out.println("Segunda nota:");
        Double nota02 = leitor.nextDouble();
        
        Double media = calcAluno.calcularMedia(nota01, nota02);
        
        System.out.println(String.format("Média: %.2f", media));
    }
}
