package com.example;
import java.util.Scanner;
public class ManipulaApelidos {
    public void adicionaApelido(Pessoa pessoa1){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o apelido a ser adicionado: ");
        String apelido = sc.nextLine();
        pessoa1.listaDeApelidos.add(apelido);
        System.out.println("Apelido " + apelido + " cadastrado com sucesso! Que fofo! :) ");
        
        return;
    }

    public void removeApelido(Pessoa pessoa1){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o apelido a ser removido: ");
        String velhoApelido = sc.nextLine();
        pessoa1.listaDeApelidos.remove(velhoApelido);
        System.out.println("Apelido " + velhoApelido + " removido com sucesso! Ufa! ");
        
        return;
    }

    public void mostraApelidos(Pessoa pessoa1){
        int n = 1;
        System.out.println("APELIDOS DE " + pessoa1.getNome().toUpperCase() + "! Awn :3");
        if (pessoa1.listaDeApelidos.isEmpty()){
            System.out.println("Nao ha apelidos para " + pessoa1.getNome() +" ainda. Volte para o menu e adicione! :) ");
            return;
        }
        for (String apelido : pessoa1.listaDeApelidos){
            System.out.println(n + ". " + apelido + "   ");
            n++;
        }
    }

}
