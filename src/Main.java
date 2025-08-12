import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("Escolha uma opção: \n1-Cadastrar Personagem \n2-Exibir Personagem \n0-Sair");
            op = sc.nextInt();


        } while(op != 0);
        sc.close();
    }
}