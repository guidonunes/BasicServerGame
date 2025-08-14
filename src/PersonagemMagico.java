public class PersonagemMagico {
    String nome;
    int nivelEnergia;
    String poderMagico;

    HabilidadeEspecial habilidade;

    public PersonagemMagico(String nome, int nivelEnergia, String poderMagico) {
        this.nome = nome;
        this.nivelEnergia = nivelEnergia;
        this.poderMagico = poderMagico;
    }

    public PersonagemMagico(String nome) { this.nome = nome;}

    public PersonagemMagico(){}

    public void atacar(String ataque) {
        if(nivelEnergia >= 10) {
            System.out.println(nome + " realizou um ataque: " + ataque + "!");
            nivelEnergia -= 10;
        } else {
            System.out.println("Sem energia para atacar...");
        }
    }
}
