import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o produto:");
        System.out.println("1. Banana");
        System.out.println("2. Laranja");
        System.out.println("3. Maçã");
        System.out.println("4. Kiwi");

        int escolhaProduto,quantidade;
        System.out.print("Digite o número do produto desejado: ");
        escolhaProduto = scanner.nextInt();
        System.out.print("Digite a quantidade escolhida: ");
        quantidade = scanner.nextInt();

        double valorCompra = calcularValorCompra(escolhaProduto, quantidade);
        System.out.printf("Valor da compra: R$ %.2f%n", valorCompra);
    }

    public static double calcularValorCompra(int escolhaProduto, int quantidade) {
        double unidade;
        String produto;


        switch (escolhaProduto) {
            case 1:
                produto = "Banana";
                unidade= (quantidade < 12) ? 0.30 : 0.25;
                break;
            case 2:
                produto = "Laranja";
                unidade = (quantidade < 12) ? 0.40 : 0.35;
                break;
            case 3:
                produto = "Maçã";
                unidade= (quantidade < 12) ? 0.50 : 0.45;
                break;
            case 4:
                produto = "Kiwi";
                unidade = (quantidade < 12) ? 0.40 : 0.30;
                break;
            default:
                System.out.println("Produto inválido!");
                return 0.0; // Retorna 0.0 caso a escolha do produto seja inválida
        }

        // Calcular e retornar o valor total da compra
        return quantidade * unidade;
    }
}
