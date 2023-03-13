package sptech.projeto.individual;

import java.util.concurrent.ThreadLocalRandom;

public class CalculoMenu {

    Integer calculoPontos(Integer gols, Integer pomo) {

        Integer totalPontos = (gols * 10) + (pomo * 150);

        return totalPontos;

    }

    void exibirResultado(Integer totalPontos, Integer gols, Integer pomo) {

        System.out.println(
                String.format("Você fez %d gols e capturou %d pomos \n"
                        + "no total você fez %d pontos \n", gols, pomo, totalPontos));
    }

    void exibirFeedback(Integer pontos, String capturado) {
        if (pontos <= 50 || capturado.equals("n")) {
            System.out.println(
                    String.format("%d Pontos, você está péssimo, melhor parar de jogar", pontos));
        } else if (pontos <= 100 || capturado.equals("n")) {
            System.out.println(
                    String.format("%d Pontos, foi bem, mas pode melhorar!", pontos));
        } else if (pontos <= 150 && capturado.equals("s")) {
            System.out.println(
                    String.format("%d Pontos, parabéns, você foi muito bem!", pontos));
        } else if (pontos <= 350 && capturado.equals("s")) {
            System.out.println(
                    String.format("%d Pontos, você já virou profissional!", pontos));
        } else {
            System.out.println(
                    String.format("%d Pontos, Minha nossa! É a própria lenda do Quadribol!", pontos));
        }
    }

    void exibirCasa(Integer resposta) {
        if (resposta == 1) {
            System.out.println("Grifinoria! \n");
        } else if (resposta == 2) {
            System.out.println("Corvinal! \n");
        } else if (resposta == 3) {
            System.out.println("Lufa-lufa! \n");
        } else if (resposta == 4) {
            System.out.println("Sonserina! \n");
        }
    }

    void duelo(Integer magia, Integer pontos, Integer magiaAdversario) {
        if (magia == 1 && magiaAdversario == 3) {
            System.out.println("Estupefaça derrota Expeliarmus \n");

            pontos += 100;

            System.out.println(String.format("GANHOU %d PONTOS", pontos));

        } else if (magia == 2 && magiaAdversario == 3) {
            System.out.println("Protego não defende Expeliarmus \n");

            pontos -= 50;

            System.out.println(String.format("PERDEU %d PONTOS", pontos));

        } else if (magia == 1 && magiaAdversario == 1 || magia == 2 && magiaAdversario == 2 || magia == 3 && magiaAdversario == 3) {
            System.out.println("EMPATE");

        } else if (magia == 1 && magiaAdversario == 2) {
            System.out.println("Estupefaça não derrota Protego \n");

            pontos -= 25;

           System.out.println(String.format("PERDEU %d PONTOS", pontos));

        } else if (magia == 3 && magiaAdversario == 2) {
            System.out.println("Expeliarmus derrota Estupefaça \n");

            pontos += 50;

           System.out.println(String.format("GANHOU %d PONTOS", pontos));

        } else if (magia == 2 && magiaAdversario == 1) {
            System.out.println("Protego defende Estupefaça \n");

            pontos += 20;

            System.out.println(String.format("GANHOU %d PONTOS", pontos));

        } else if (magia == 3 && magiaAdversario == 1) {
            System.out.println("Expeliarmus não derrota Estupefaça \n");

            pontos -= 100;

           System.out.println(String.format("PERDEU %d PONTOS", pontos));
        }
        
        System.out.println(String.format("PONTOS TOTAIS: %d", pontos));
        
    }
}
