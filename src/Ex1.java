import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("digite o numero:");
        numero = scanner.nextInt();

        if (numero > 100) {
            System.out.println("o numero é maior que 100.");
        } else {
            System.out.println("o numero é menor ou igual a 100.");
        }


    }
}
