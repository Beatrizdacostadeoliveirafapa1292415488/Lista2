import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int numero;

        System.out.println("digite o numero:");
        numero=scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero é par.");
        } else {
            System.out.println("O numero é ímpar.");
        }


    }
}
