package br.com.fiap.game.model;

public class PersonagemMagico {
    private String nome;
    private int nivelEnergia;
    private String poderMagico;

    public HabilidadeEspecial habilidade;

    public PersonagemMagico(String nome, int nivelEnergia, String poderMagico) {
        this.nome = nome;
        this.nivelEnergia = nivelEnergia;
        this.poderMagico = poderMagico;
    }

    public PersonagemMagico(String nome) {
        this.nome = nome;
    }

    public PersonagemMagico(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void atacar(String ataque) {
        if(nivelEnergia >= 10) {
            System.out.println(nome + " realizou um ataque: " + ataque + "!");
            nivelEnergia -= 10;
        } else {
            System.out.println("Sem energia para atacar...");
        }
    }

    public int aumentarEnergia(int energia) {
        nivelEnergia += energia;
        return nivelEnergia;
    }

    public void ativarHabilidadeEspecial() {
        if(!habilidade.habilitada) {
            System.out.println("Habilidade especial não está ativada.");
        } else if (nivelEnergia >= habilidade.custoEnergia) {
            System.out.println("Ativando a habilidade: " + habilidade.nome);
            nivelEnergia -= habilidade.custoEnergia;
        } else {
            System.out.println(nome + " está sem energia para a habilidade especial");
        }
    }
}
