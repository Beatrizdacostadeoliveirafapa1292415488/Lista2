import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2;

        System.out.println("digite o primeiro numero:");
        num1=scanner.nextInt();
        System.out.println("digite o segundo numero:");
        num2=scanner.nextInt();
        if (num1 > num2) {
            System.out.println("O maior numero é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior numero é: " + num2);
        } else {
            System.out.println("Os os numeros são iguais.");
        }

    }
}