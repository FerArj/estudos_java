package sptech.atividade02.ac01;

public class DescontoProgressivo {

    Double calcularDesconto(Double produto, Integer quantidade) {
        
        
        if (quantidade == 1) {
            Double valorFinal = (produto*quantidade) - (produto * 0.10);
             return valorFinal;
        } else if (quantidade == 2) {
            Double valorFinal = (produto*quantidade) - (produto * 0.20);
             return valorFinal;
        } else {
            Double valorFinal = (produto*quantidade) - (produto * 0.30);
             return valorFinal;
        }     
    }
    
    void exibirNotaFiscal(Double valorFinal, Double produto, Integer quantidade){
        
         System.out.println(
                String.format("Valor do produto: R$ %.2f \n"
                        + "Quantidade: %d \n"
                        + "Valor com desconto: R$ %.2f", produto,quantidade,valorFinal));
        
    }        
}