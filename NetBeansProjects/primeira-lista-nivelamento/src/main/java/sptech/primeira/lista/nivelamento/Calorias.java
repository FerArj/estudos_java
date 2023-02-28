package sptech.primeira.lista.nivelamento;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Calorias {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quanto tempo você passou se aquecendo? (em minutos)");
        Integer tempoAquecimento = leitor.nextInt();
        
        System.out.println("Quanto tempo você passou em exercícios aeorbicos? (em minutos)");
        Integer tempoAerobico = leitor.nextInt();
        
        System.out.println("Quanto tempo você passou fazendo exercícios de musculação (em minutos?)");
        Integer tempoMusculacao = leitor.nextInt();
        
        Integer totalMinutos = (tempoAquecimento + tempoAerobico + tempoMusculacao);
        
        Integer totalCaloria = (tempoAquecimento * 12) + (tempoAerobico * 20) + (tempoMusculacao * 25);
        
        System.out.println("Olá, Jorge. Você fez um total de " + totalMinutos + " minutos de exercícios e perdeu cerca de\n" + totalCaloria +
        " calorias");
        
    }
}
