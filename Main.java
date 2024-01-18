import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();

        if(n < 0) {
            System.out.println("El número debe ser positivo");
        }
        else if(n == 0) {
            System.out.println("khe");
        }
        else {
            String resultado = "y modab";

            for (int i = 1; i <= n; i++) {
                resultado += "a";
                System.out.println(resultado);
            }
        }
    }
}