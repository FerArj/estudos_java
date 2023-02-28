package sptech.primeira.lista.nivelamento;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class CalculoTroco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Valor unitário do produto: ");
        Double valorUnitario = leitor.nextDouble();
        
        System.out.println("Quantidade vendida: ");
        Integer qtdVendida = leitor.nextInt();
        
        System.out.println("Valor pago pelo cliente: ");
        Double pagamentoCliente = leitor.nextDouble();
        
        Double troco = pagamentoCliente - (valorUnitario * qtdVendida);
        
        System.out.println("Seu troco será de R$" + troco);
    }
}
