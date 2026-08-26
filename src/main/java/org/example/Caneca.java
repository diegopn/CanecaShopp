package org.example;

public class Caneca {
    private int id;
    private String descricao;
    private double preco;

    public Caneca(int id, String descricao, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }
}