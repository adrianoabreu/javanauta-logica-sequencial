import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Nome: " + nome);

        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();
        System.out.println("Idade: " + idade);

        System.out.println("Digite se você está empregado sim(true) ou não(false)");
        boolean empregado = scanner.nextBoolean();
        System.out.println("Olá, sou " + nome + " tenho " + idade + " estou empregado " + empregado);

    }
}