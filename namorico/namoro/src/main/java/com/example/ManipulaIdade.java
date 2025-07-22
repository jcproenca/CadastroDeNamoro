package com.example;
import java.util.Scanner;


public class ManipulaIdade {
    Scanner sc = new Scanner(System.in);
    public void cadastrarIdade(Pessoa pessoa1){
        System.out.println("Digite a idade de  " + pessoa1.getNome() + ": ");
        int idade = sc.nextInt();
        pessoa1.setIdade(idade);
        System.out.println("Idade de " + pessoa1.getNome() + " cadastrada como " + pessoa1.getIdade() + " anos, com sucesso." );
        return;
    }
    
    public void trocaIdade(Pessoa pessoa1){
        System.out.println("Digite a NOVA idade de  " + pessoa1.getNome() + ": ");
        int idade = sc.nextInt();
        pessoa1.setIdade(idade);
        System.out.println("Nova idade de " + pessoa1.getNome() + " cadastrada como " + pessoa1.getIdade() + " anos, com sucesso." );
        return;
    }

}
