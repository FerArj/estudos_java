package sptech.primeira.lista.nivelamento;
import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Aluno, por favor insira seu nome: ");
        String nomeAluno = leitor.next();
        
        System.out.println("Insira a primeira nota: ");
        Double primeiraNota = leitor.nextDouble();
        
        System.out.println("Insira a segunda nota: ");
        Double segundaNota = leitor.nextDouble();
        
        Double media = (primeiraNota + segundaNota) / 2;
        
        System.out.println("Olá, " 
                + nomeAluno + ". Sua média foi de " 
                + media);
    }
}
