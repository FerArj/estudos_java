package sptech.atividade02.ac01;

public class ValidacaoNumerica {
    void verificarPrimo(Integer num){
        
        Integer contador = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                contador++;
        }
    } 
       if(contador == 2){
           System.out.println("É um número primo");
          
       }else{
           System.out.println("Não é um número primo");
          
       }
    }   
 }   
      
