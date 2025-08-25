package br.com.fiap.game.model;

public class Item {
    public String nome;
    public String descricao;
    public boolean raro;
    public int nivelPoder;

    public Item(String nome, String descricao, boolean raro, int nivelPoder) {
        this.nome = nome;
        this.descricao = descricao;
        this.raro = raro;
        this.nivelPoder = nivelPoder;
    }
}
