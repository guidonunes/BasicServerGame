import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonagemMagico personagem = new PersonagemMagico();
        int op;

        do {
            System.out.println("Escolha uma opção: \n1-Cadastrar Personagem \n2-Exibir Personagem \n0-Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o nome do personagem:");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Digite o poder do personagem:");
                    String poder = sc.next() + sc.nextLine();
                    System.out.println("Digite o nivel de energia");
                    int energia = sc.nextInt();
                    personagem.nome = nome;
                    personagem.nivelEnergia = energia;
                    personagem.poderMagico = poder;
                    break;
                case 2:
                    System.out.println("Nome: " + personagem.nome + "\nPoder: " +personagem.poderMagico + "\nNivel de Energia: " + personagem.nivelEnergia);
                    break;
                case 0:
                    System.out.println("Finalizando o programa");
                default:
                    System.out.println("Opção inválida");

            }


        } while(op != 0);
        sc.close();
    }
}