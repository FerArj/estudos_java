package sptech.projeto.individual;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Quadribol {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculoMenu calcMenu = new CalculoMenu();

        System.out.println(
                "======CAMPEONATO DE QUADRIBOL EM HOGWARTS======= \n"
                + "O quadribol é um esporte aéreo bruxo disputado por "
                + "dois times de sete jogadores montados em vassouras.\n Surgido "
                + "no brejo de Queerditch no século XI, é o esporte mais popular "
                + "entre os bruxos.\n Uma Copa Mundial de Quadribol é realizada a "
                + "cada quatro anos e competições também são organizadas em "
                + "instituições como Hogwarts.\n");

        System.out.println(
                "======OBJETIVO======= \n"
                + "O objetivo de uma partida de quadribol é fazer mais "
                + "pontos que o time adversário. \n Cada gol, feito com uma goles "
                + "nos aros pelos artilheiros, vale dez pontos, enquanto a "
                + "dificílima captura do pomo de ouro, feita pelo apanhador, "
                + "vale cento e cinquenta pontos.\n Os aros são defendidos pelos "
                + "goleiros, enquanto os balaços, bolas enfeitiçadas para "
                + "atingirem jogadores aleatoriamente, são atiradas para o "
                + "outro lado do campo pelos batedores, que utilizam bastões. \n");

        System.out.println("Selecione a opção desejada no menu:\n"
                + "1 - Calcular pontos \n"
                + "2 - Obter feedback \n"
                + "3 - Descobrir casa de Hogwarts e Duelar(jogo) \n"
                + "4 - Sair");
        Integer opcao = leitor.nextInt();

        while (opcao != 4) {
            switch (opcao) {
                case 1:
                    System.out.println("Quantos gols você fez?");
                    Integer gols = leitor.nextInt();

                    System.out.println("Quantos pomos de ouro você capturou?");
                    Integer pomo = leitor.nextInt();

                    Integer totalPontos = calcMenu.calculoPontos(gols, pomo);

                    calcMenu.exibirResultado(totalPontos, gols, pomo);

                    break;
                case 2:
                    System.out.println("Quantos pontos você fez?");
                    Integer pontos = leitor.nextInt();

                    System.out.println("Você capturou algum Pomo? s/n");
                    String capturado = leitor.next();

                    calcMenu.exibirFeedback(pontos, capturado);
                    break;
                case 3:
                    System.out.println(""
                            + "Entre as caracteristicas a seguir, "
                            + "qual você mais se identifica? \n"
                            + "1 - Coragem \n"
                            + "2 - Inteligência \n"
                            + "3 - Lealdade \n"
                            + "4 - Ambição \n");
                    Integer resposta = leitor.nextInt();

                    calcMenu.exibirCasa(resposta);

                    System.out.println("VAMOS DUELAR \n"
                            + "Um aluno de Hogwarts te chamou para um duelo \n"
                            + "COMO JOGAR \n"
                            + "Selecione o melhor feitiço contra o oponente. \n"
                            + "=============================================\n"
                            + "Estupefaça ganha de Expeliarmus \n"
                            + "Protego ganha de Estupefaça \n"
                            + "Expeliarmus ganha de Protego \n"
                            + "Você tem 5 tentativas\n"
                            + "COMECE O DUELO \n");

                    Integer magiaAdversario = ThreadLocalRandom.current().nextInt(1, 3);

                    pontos = 0;

                    for (int i = 0; i < 5; i++) {
                        System.out.println(""
                                + "Selecionar magia: \n"
                                + "1 - ESTUPEFAÇA(ATAQUE - 100 pontos)\n"
                                + "2 - PROTEGO(DEFESA - 25 pontos) \n"
                                + "3 - EXPELIARMUS(SORRATEIRO 50 pontos) \n");
                        Integer magia = leitor.nextInt();

                        calcMenu.duelo(magia, pontos, magiaAdversario);
                      
                    }
            }
            
            System.out.println("Selecione a opção desejada no menu:\n"
                            + "1 - Calcular pontos \n"
                            + "2 - Obter feedback \n"
                            + "3 - Descobrir casa de Hogwarts \n"
                            + "4 - Sair");
                    opcao = leitor.nextInt();
        }
    }
}
