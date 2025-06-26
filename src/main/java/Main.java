
public class Main {
    public static void main(String[] args) {
        String nome = "Joana";
        String sobrenome = "da Silva";

        int tamanhoString = nome.length();
        boolean saoIguais = nome.equals(sobrenome);
        String nomeCompleto = nome.concat(sobrenome);

        System.out.println("Olá " + nome.toLowerCase() + " seu nome tem " + tamanhoString + " caracteres.");
        System.out.println("O nome e sobrenome são iguais? " + saoIguais);
        System.out.println("Nome Completo: " + nomeCompleto);

    }
}