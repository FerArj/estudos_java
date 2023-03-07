package com.mycompany.metodos;

/**
 *
 * @author aluno
 */
public class Utilitario {
    //Método:
    
    //Retorno: esse não tem, é void
    //Nome: exibirLinha (camelCase, igual variável)
    //Argumentos: dentro dos (), esse não tem
    //Corpo: dentro das {}
    void exibirLinha(){
        //código do método
         System.out.println("*-------*-------*-------");
    } 
    
    void exibirNome(String nome){
        System.out.println("Meu nome é " + nome);
    }
    
    
    // chamar método dentro de método
    void exibirNomeFormatado(String nome){
        exibirLinha();
        exibirNome(nome);
        exibirLinha();
    }
    
}
