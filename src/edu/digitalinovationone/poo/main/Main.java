package edu.digitalinovationone.poo.main;

import edu.digitalinovationone.poo.iphone.Iphone;
import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Iphone iphone = new Iphone();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo a Mula Store! Aqui a gente só vende Iphone 2007\n");
        int seletorModelo;
        do {
            System.out.println("Qual modelo de aparelho você deseja?");
            System.out.println("1 - 4GB");
            System.out.println("2 - 8GB");
            seletorModelo = scanner.nextInt();
            switch (seletorModelo) {
                case 1 ->
                    iphone.setModelo("4GB");

                case 2 ->
                    iphone.setModelo("8GB");

                default ->
                    System.out.println("Selecione uma opção válida!");
            }
        } while (seletorModelo < 1 || seletorModelo > 2);

        System.out.println("\nÓtimo, agora selecione a cor do seu Iphone!");
        int seletorCor;
        do {
            System.out.println("1 - Preto");
            System.out.println("2 - Branco");
            seletorCor = scanner.nextInt();
            switch (seletorCor) {
                case 1 ->
                    iphone.setCor("Preto");

                case 2 ->
                    iphone.setCor("Branco");

                default ->
                    System.out.println("Selecione uma opção válida!");

            }
        } while (seletorCor < 1 || seletorCor > 2);

        String modeloIphone = iphone.getModelo();
        String corIphone = iphone.getCor();

        System.out.println("\nParabéns, você comprou um Iphone " + corIphone + " modelo " + modeloIphone);
        System.out.println("Deseja ligá-lo agora? \n1 - Sim \n2 - Não");
        int seletor = scanner.nextInt();

        switch (seletor) {
            case 1:
                System.out.println("Ligando seu iphone...");
                break;

            case 2:
                System.out.println("Ok, deixando para mais tarde!");
                return;

            default:
                System.out.println("Você derrubou seu aparalho no chão e ele quebrou.");
                return;

        }

        int opcao;

        do {
            System.out.println("\n===== MENU iPHONE =====");
            System.out.println("1 - Ligar");
            System.out.println("2 - Atender");
            System.out.println("3 - Iniciar Correio de Voz");
            System.out.println("4 - Exibir Página");
            System.out.println("5 - Adicionar Nova Aba");
            System.out.println("6 - Atualizar Página");
            System.out.println("7 - Tocar Música");
            System.out.println("8 - Pausar Música");
            System.out.println("9 - Selecionar Música");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número: ");
                    String numero = scanner.nextLine();
                    iphone.ligar(numero);
                    break;
                case 2:
                    iphone.atender();
                    break;
                case 3:
                    iphone.iniciarCorreioVoz();
                    break;
                case 4:
                    System.out.print("Digite a URL: ");
                    String url = scanner.nextLine();
                    iphone.exibirPagina(url);
                    break;
                case 5:
                    iphone.adicionarNovaAba();
                    break;
                case 6:
                    iphone.atualizarPagina();
                    break;
                case 7:
                    iphone.tocar();
                    break;
                case 8:
                    iphone.pausar();
                    break;
                case 9:
                    System.out.print("Digite o nome da música: ");
                    String musica = scanner.nextLine();
                    iphone.selecionarMusica(musica);
                    break;
                case 0:
                    System.out.println("Encerrando o menu. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();

    }

}
