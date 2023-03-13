package sptech.atividade02.ac01;
import java.util.Scanner;

public class TesteValidacaoNumerica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ValidacaoNumerica validar = new ValidacaoNumerica();
        
        System.out.println("Digite valores positivos:");
        Integer num = leitor.nextInt();
        
        while(num > 0){
            validar.verificarPrimo(num);
            
            System.out.println("Digite valores positivos:");
            num = leitor.nextInt();
            
            
        }
    }
}
