package sptech.primeira.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Insira seu nome de usuário");
        String usuarioDigitado = leitor.nextLine();
        
        System.out.println("Insira sua senha");
        String senhaDigitada = leitor.nextLine();
        
        System.out.println("Quantas vezes você deseja errar sua senha antes "
                + "do bloqueio?");
        Integer limiteErro = leitor.nextInt();
        
        System.out.println("Seu login é " + usuarioDigitado + " e sua senha é " 
                + senhaDigitada + ". Você tem " + limiteErro + " \n" +
        "tentativas antes de ser bloqueado");
    }
}
