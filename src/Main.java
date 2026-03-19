//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        while(true) {
            double n1;
            double n2;
            while(true) {
                try {
                    System.out.print("Digite o primeiro número: ");
                    n1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    n2 = sc.nextDouble();
                    break;
                } catch (InputMismatchException var11) {
                    System.out.println("Erro: Preciso que digite um número válido.");
                    sc.next();
                }
            }

            System.out.print("Escolha a operação a ser executada [+, -, *, /]: ");
            double result;
            switch (String.valueOf(sc.next().charAt(0))) {
                case "+":
                    result = n1 + n2;
                    break;
                case "-":
                    result = n1 - n2;
                    break;
                case "*":
                    result = n1 * n2;
                    break;
                case "/":
                    if (n2 == (double)0.0F) {
                        System.out.println("Erro: divisão por zero!");
                        continue;
                    }

                    result = n1 / n2;
                    break;
                default:
                    System.out.println("Invalid Option");
                    continue;
            }

            System.out.printf("Resultado: %.2f%n", result);
            System.out.println("Calcular novamente? (s/n): ");
            if (!sc.next().equalsIgnoreCase("s")) {
                sc.close();
                return;
            }
        }
    }
}