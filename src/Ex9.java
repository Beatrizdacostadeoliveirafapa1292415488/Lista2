import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int totallaranja;
        System.out.println("digite o total de laranjas:");
        totallaranja=scanner.nextByte();
        if (totallaranja > 0) {
            double valorTotal = calcularValorTotal(totallaranja);
            System.out.printf("O valor total da compra é R$ %.2f%n", valorTotal);
        } else {
            System.out.println("Quantidade inválida de laranjas. Por favor, insira um número maior que zero.");
        }
    }

    public static double calcularValorTotal(int totallaranja) {
        double valordalaranja;

        if (totallaranja < 12) {
            valordalaranja= 0.30;
        } else {
            valordalaranja = 0.25;
        }
        return totallaranja * valordalaranja;
    }
}
