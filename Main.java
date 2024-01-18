import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();

        String resultado = "y modaba";

        for (int i = 1; i <= n; i++) {
            resultado += "a";
            System.out.println(resultado);
        }
    }
}