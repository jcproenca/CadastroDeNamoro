package com.example;
import java.util.Scanner;

public class ManipulaData {
    Scanner sc = new Scanner(System.in);
    public void cadastrarData(Pessoa pessoa1, Pessoa pessoa2){
        System.out.println("Digite a data de inicio do relacionamento: ");
        String data = sc.nextLine();
        pessoa1.setDataInicioNamoro(data);
        pessoa2.setDataInicioNamoro(data);
        System.out.println("Data cadastrada como " + pessoa1.getDataInicioNamoro() + " com sucesso");
        return;
    }

    public void trocaData(Pessoa pessoa1, Pessoa pessoa2){
        System.out.println("Digite a NOVA data do relacionamento: ");
        String data = sc.nextLine();
        pessoa1.setDataInicioNamoro(data);
        pessoa2.setDataInicioNamoro(data);
        System.out.println("Data alterada para " + pessoa1.getDataInicioNamoro() + " com sucesso");
        return;
    }
}
