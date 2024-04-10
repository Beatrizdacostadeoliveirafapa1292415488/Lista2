import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numero;
        System.out.println("digite o numero:");
        numero=scanner.nextInt();
        if (numero > 100 && numero < 200) {
            System.out.println("O numero está no intervalo (100, 200).");
        } else {
            System.out.println("O numero não está no intervalo (100, 200).");
        }
    }
}
