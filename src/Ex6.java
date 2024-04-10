import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b,c;

        System.out.println("digite o lado a:");
        a=scanner.nextInt();
        System.out.println("digite o lado b:");
        b=scanner.nextInt();
        System.out.println("digite o  lado c:");
        c=scanner.nextInt();
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("É possível compor um triângulo.");
        } else {
            System.out.println("Não é possível compor um triângulo.");
        }






    }
}
