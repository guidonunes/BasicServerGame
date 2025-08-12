//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PersonagemMagico mago = new PersonagemMagico();

        mago.nome = "Gandalf";
        mago.nivelEnergia = 100;
        mago.poderMagico = "Magia";

        System.out.println(mago.nome + " Energia: " + mago.nivelEnergia + " Poder: " + mago.poderMagico);
    }
}