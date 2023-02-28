package sptech.primeira.lista.nivelamento;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class BolsaFilhos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in); 
        
        System.out.println("Quantos filhos de 0 a 3 anos você possúi?");
        Integer qtdFilhos1 = leitor.nextInt();
        
        System.out.println("Quantos filhos de 4 a 16 anos você possúi?");
        Integer qtdFilhos2 = leitor.nextInt();
        
        System.out.println("Quantos filhos de 17 a 18 anos você possúi?");
        Integer qtdFilhos3 = leitor.nextInt();
        
        Integer totalFilhos = qtdFilhos1 + qtdFilhos2 + qtdFilhos3;
        Double valorBolsa = (qtdFilhos1 * 25.12) + (qtdFilhos2 * 15.18) + (qtdFilhos3 * 12.44); 
        
        System.out.println("Você tem um total de " 
                + totalFilhos + " filhos e vai receber R$"
                + valorBolsa + " de bolsa");
        
    }
}
