import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int eleitor,branco,nulo,valido;

        System.out.println("digite o numero de eleitores:");
        eleitor=scanner.nextInt();
        System.out.println("digite o numero de votos brancos:");
        branco=scanner.nextInt();
        System.out.println("digite o numero de votos nulos:");
        nulo=scanner.nextInt();
        System.out.println("digite o numero de votos validos:");
        valido=scanner.nextInt();

         branco= branco * 100 / eleitor;
         nulo = nulo * 100 / eleitor;
         valido = valido * 100 / eleitor;


        System.out.println("Percentual de votos em branco: " + branco + "%");
        System.out.println("Percentual de votos nulos: " + nulo + "%");
        System.out.println("Percentual de votos válidos: " + valido + "%");

    }
}
