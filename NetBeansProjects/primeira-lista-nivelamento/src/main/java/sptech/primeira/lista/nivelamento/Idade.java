package sptech.primeira.lista.nivelamento;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = leitor.next();
        
        System.out.println("Olá, " + nome + "! Qual o ano de seu nascimento?");
        Integer anoNasc = leitor.nextInt();
        
        Integer idadeFutura = (2030 - anoNasc);
        
        System.out.println("Em 2030 você terá " + idadeFutura + " anos" );
        
        
    }
}
