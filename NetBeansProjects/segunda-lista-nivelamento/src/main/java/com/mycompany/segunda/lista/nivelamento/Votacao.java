package com.mycompany.segunda.lista.nivelamento;
import java.util.Scanner;

/**
 *
 * @author EDSON MORAES
 */
public class Votacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Integer contarVotos = 0;
        
        Integer vtMussarela = 0;
        Integer vtCalabresa = 0;
        Integer vtQuatroQueijos = 0;
        
        
        
        
        while(contarVotos != 10){
             
            System.out.println("VOTAÇÕES \n "
                + "5 para Mussarela \n "
                + "25 para Calabresa \n"
                + "50 para Quatro queijos \n");
        Integer voto = leitor.nextInt();
        
        
            switch(voto){
                case 5:
                    vtMussarela += 1;
                    contarVotos++;
                   break;
                    
                case 25:
                    vtCalabresa += 1;
                    contarVotos++;
                    break;
                    
                case 50:
                    vtQuatroQueijos += 1;
                    contarVotos++;
                    break;
            }
        }
        System.out.println(String.format("QUANTIDADE DE VOTOS: \n"
                + "Mussarela: %d \n"
                + "Calabresa: %d \n"
                + "Quatro queijos: %d \n", vtMussarela, vtCalabresa, vtQuatroQueijos));
    }
}
