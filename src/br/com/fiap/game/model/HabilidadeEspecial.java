package br.com.fiap.game.model;

public class HabilidadeEspecial {
    public String nome;
    public int custoEnergia;
    public boolean habilitada;

    public HabilidadeEspecial(String nome, int custoEnergia, boolean habilitada) {
        this.nome = nome;
        this.custoEnergia = custoEnergia;
        this.habilitada = habilitada;
    }

    public void ativarHabilidade() {
        habilitada = true;
    }
}
