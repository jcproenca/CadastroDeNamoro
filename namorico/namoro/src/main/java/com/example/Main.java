package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 10;
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        ManipulaApelidos manipulaApelido = new ManipulaApelidos();
        ManipulaIdade manipulaIdade = new ManipulaIdade();
        ManipulaNome manipulaNome = new ManipulaNome();
        ManipulaData manipulaData = new ManipulaData();
        
        while (opcao != 0){
            System.out.println("\n \n BEM-VINDOS AO CADASTRO DE NAMORO!");
            System.out.println("Tecle o numero referente ao método que quer realizar:");
            System.out.println("1. Cadastrar nomes");
            System.out.println("2. Cadastrar data de inicio do namoro");
            System.out.println("3. Cadastrar apelido");
            System.out.println("4. Cadastrar idades");
            System.out.println("5. Alterar nome");
            System.out.println("6. Alterar data de inicio do namoro");
            System.out.println("7. Remover apelido");
            System.out.println("8. Alterar idades");
            System.out.println("9. Mostrar apelidos");
            System.out.println("0. Encerrar programa");
            System.out.println("Digite a opcao desejada:\n ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                manipulaNome.cadastrarNome(pessoa1);
                manipulaNome.cadastrarNome(pessoa2);
                System.out.println("\n Prontinho!");
                break;
                case 2:
                manipulaData.cadastrarData(pessoa1, pessoa2);
                System.out.println("\n Prontinho!");
                break;
                case 3:
                System.out.println("Para qual pombinho sera adicionado o apelido? ");
                String pombinho = sc.nextLine();
                if(pombinho.equalsIgnoreCase(pessoa1.getNome())){
                    manipulaApelido.adicionaApelido(pessoa1);
                    System.out.println("\n Prontinho!");
                } else if (pombinho.equalsIgnoreCase(pessoa2.getNome())){
                    manipulaApelido.adicionaApelido(pessoa2);
                    System.out.println("\n Prontinho!");
                } else {
                    System.out.println("Nao conheco esse pombinho... Retornando ao menu!\n");
                };
                break;
                case 4:
                manipulaIdade.cadastrarIdade(pessoa1);
                manipulaIdade.cadastrarIdade(pessoa2);
                System.out.println("\n Prontinho!");
                break;
                case 5:
                System.out.println("Qual pombinho vai ter seu nome alterado? ");
                String pombinho2 = sc.nextLine();
                if(pombinho2.equalsIgnoreCase(pessoa1.getNome())){
                    manipulaNome.trocarNome(pessoa1);
                    System.out.println("\n Prontinho!");
                } else if (pombinho2.equalsIgnoreCase(pessoa2.getNome())){
                    manipulaNome.trocarNome(pessoa2);
                    System.out.println("\n Prontinho!");
                } else {
                    System.out.println("Nao conheco esse pombinho... Retornando ao menu!\n");
                };
                break;
                case 6:
                manipulaData.trocaData(pessoa1, pessoa2);
                System.out.println("\n Prontinho!");
                break;
                case 7:
            
                System.out.println("De qual pombinho sera removido o apelido? ");
                String pombinho3 = sc.nextLine();
                if(pombinho3.equalsIgnoreCase(pessoa1.getNome())){
                    manipulaApelido.removeApelido(pessoa1);
                    System.out.println("\n Prontinho!");
                } else if (pombinho3.equalsIgnoreCase(pessoa2.getNome())){
                    manipulaApelido.removeApelido(pessoa2);
                    System.out.println("\n Prontinho!");
                } else {
                    System.out.println("Nao conheco esse pombinho... Retornando ao menu!\n");
                };
                break;
                case 8:
                
                System.out.println("De qual pombinho sera alterada a idade?");
                String pombinho4 = sc.nextLine();
                if(pombinho4.equalsIgnoreCase(pessoa1.getNome())){
                    manipulaIdade.trocaIdade(pessoa1);
                    System.out.println("\n Prontinho!");
                } else if (pombinho4.equalsIgnoreCase(pessoa2.getNome())){
                    manipulaIdade.trocaIdade(pessoa2);
                    System.out.println("\n Prontinho! ");
                } else {
                    System.out.println("Nao conheco esse pombinho... Retornando ao menu!\n");
                };
                break;
                case 9:
                
                System.out.println("De qual pombinho serao mostrados os apelidos?");
                String pombinho5 = sc.nextLine();
                if(pombinho5.equalsIgnoreCase(pessoa1.getNome())){
                    manipulaApelido.mostraApelidos(pessoa1);
                    System.out.println("\n Prontinho!");
                } else if (pombinho5.equalsIgnoreCase(pessoa2.getNome())){
                    manipulaApelido.mostraApelidos(pessoa2);
                    System.out.println("\n Prontinho! ");
                } else {
                    System.out.println("Nao conheco esse pombinho... Retornando ao menu!\n");
                };
                break;
                default:
                System.out.println("Numero nao reconhecido. Retornando ao menu! \n");
                break;
            }
        }

        System.out.println("\n \n QUE GRACINHAS!");
        System.out.println("Casal " + pessoa1.getNome() + " & " + pessoa2.getNome() + " <3 ");
        System.out.println("Idades: " + pessoa1.getIdade() + " anos e " + pessoa2.getIdade() + " anos, respectivamente! " );
        System.out.println("Data de inicio do relacionamento: " + pessoa1.getDataInicioNamoro() + ". Que trajetoria! :)");
        System.out.println("Deus abencoe o relacionamento de voces! ");
        sc.close();
    }
}