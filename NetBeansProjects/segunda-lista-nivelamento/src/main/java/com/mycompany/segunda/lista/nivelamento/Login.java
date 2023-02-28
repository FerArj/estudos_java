package com.mycompany.segunda.lista.nivelamento;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Login {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Login:");
        String login = leitor.nextLine();
        
        System.out.println("Senha");
        String senha = leitor.nextLine();
        
        while(!login.equals("admin") && !login.equals("#SPtech2022")){     
            System.out.println("Login e/ou senha inválidos.");
            
            System.out.println("Login:");
            login = leitor.nextLine();
        
            System.out.println("Senha");
            senha = leitor.nextLine();
            
        }
        
        System.out.println("Login realizado com sucesso!");
        
    }
}
