package com.example;
import java.util.Scanner;

public class ManipulaNome {
    Scanner sc = new Scanner(System.in);
    public void cadastrarNome(Pessoa pessoa1){
        System.out.println("Digite o nome dessa pessoa: ");
        String nome = sc.nextLine();
        pessoa1.setNome(nome);
        System.out.println("Nome '" + pessoa1.getNome() + "' cadastrado com sucesso");
        return;
    }

    public void trocarNome(Pessoa pessoa1){
        System.out.println("Digite o NOVO nome dessa pessoa: ");
        String nome = sc.nextLine();
        pessoa1.setNome(nome);
        System.out.println("Nome '" + pessoa1.getNome() + "' cadastrado com sucesso");
        return;
    }
}
