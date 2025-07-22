package com.example;
import java.util.List;
import java.util.ArrayList;



public class Pessoa {
    
    int idade;
    String nome;
    List<String> listaDeApelidos;
    String dataInicioNamoro;

    // instanciação da lista para não dar exception
    public Pessoa (){
        listaDeApelidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataInicioNamoro() {
        return dataInicioNamoro;
    }

    public void setDataInicioNamoro(String dataInicioNamoro) {
        this.dataInicioNamoro = dataInicioNamoro;
    }

    public List<String> getListaDeApelidos() {
        return listaDeApelidos;
    }
}
