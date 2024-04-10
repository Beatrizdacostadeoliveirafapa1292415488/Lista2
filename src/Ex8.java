import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b,c;

        System.out.println("digite o lado a:");
        a=scanner.nextInt();
        System.out.println("digite o lado b:");
        b=scanner.nextInt();
        System.out.println("digite o  lado c:");
        c=scanner.nextInt();
        if (a < b + c && b < a + c && c < a+b) {
            if (a == b && b == c) {
                System.out.println("Triângulo equilátero");
            } else if (a == b || a == c || b== c) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println(" não formam um triângulo.");
        }
    }
}
