
public class Main {
    public static void main(String[] args) {
        double pao = 9.50;
        double queijo = 7.00;
        double acucar = 1.00;
        double desconto = 5.00;
        int diasDoMes = 30;

        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalDividido = valorTotalComDesconto / 2;
        double valorTotalMensal = valorTotalComDesconto * diasDoMes;

        System.out.println("valorTotal:              " + valorTotal);
        System.out.println("valorTotalComDesconto:   " + valorTotalComDesconto);
        System.out.println("valorTotalDividido:      " + valorTotalDividido);
        System.out.println("valorTotalMensal:        " + valorTotalMensal);

    }
}