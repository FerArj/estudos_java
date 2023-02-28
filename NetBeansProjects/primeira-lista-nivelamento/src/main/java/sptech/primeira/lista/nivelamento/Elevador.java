package sptech.primeira.lista.nivelamento;
import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Limite de peso do elevador: ");
        Double limitePeso = leitor.nextDouble();
        
        System.out.println("Limite de pessoas em um elevador");
        Integer limitePessoas = leitor.nextInt();
        
        System.out.println("Peso da 1ª pessoa:");
        Double primeiraPessoa = leitor.nextDouble();
        
        System.out.println("Peso da 2ª pessoa:");
        Double segundaPessoa = leitor.nextDouble();
        
        System.out.println("Peso da 3ª pessoa");
        Double terceiraPessoa = leitor.nextDouble();
        
        Double pesoTotal = (primeiraPessoa + segundaPessoa + terceiraPessoa);
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem "
                + limitePessoas + ". O peso total no elevador é de " 
                + pesoTotal + ", sendo que ele suporta "
                + limitePeso);
        
    }
}
