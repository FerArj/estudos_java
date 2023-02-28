package sptech.primeira.lista.nivelamento;
import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o salário bruto");
        Double salarioBruto = leitor.nextDouble();
        
        Double inss = (salarioBruto / 10);
        Double ir = (salarioBruto / 20);
        
        System.out.println("Condução diária para ida:");
        Double conducao = leitor.nextDouble();
        
        Double vt = (conducao * 2) * 22;
        
        Double totalDesconto = (inss + ir + vt);
        
        Double salarioLiquido = (salarioBruto - totalDesconto); 
        
        System.out.println("Seu salário bruto é  R$" 
                + salarioBruto + ", tem um total de R$"
                + totalDesconto +" em descontos e receberá um líquido de R$"
                + salarioLiquido);
        
    }
}
