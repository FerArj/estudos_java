package sptech.atividade02.ac01;
import java.util.Scanner;
        
public class TesteDescontoProgressivo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DescontoProgressivo desconto = new DescontoProgressivo();
        
        System.out.println("Digite o valor unitário do produto");
        Double produto = leitor.nextDouble();
        
        System.out.println("Digite a quantidade:");
        Integer quantidade = leitor.nextInt();
        
        Double valorFinal = desconto.calcularDesconto(produto, quantidade);
        
        desconto.exibirNotaFiscal(valorFinal, produto, quantidade);
        
    }
}
