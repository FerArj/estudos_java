package com.mycompany.segunda.lista.nivelamento;
import java.util.Scanner;
/**
 *
 * @author EDSON MORAES
 */
public class ContadorVariado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Double valor = 0.15;
        
        Double novoValor = 0.00;
        
        for(int i=0; novoValor <= 4.95; i++){
           
              novoValor = novoValor + valor; 
            
            System.out.println(String.format("%.2f", novoValor));
             
            
        
           i++;
            
        }
        
    }
}
