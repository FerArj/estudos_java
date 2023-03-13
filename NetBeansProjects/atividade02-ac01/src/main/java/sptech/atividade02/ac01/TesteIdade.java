package sptech.atividade02.ac01;
import java.util.Scanner;

public class TesteIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Idade classificacao = new Idade();
        
        
        System.out.println("Digite sua idade");
        Integer idade = leitor.nextInt();
        
        classificacao.classificaIdade(idade);
        
    }
}
