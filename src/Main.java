import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        while (true) {
            double n1, n2;

            try {
                System.out.print("Digite o primeiro número: ");
                n1 = sc.nextDouble();
                System.out.print("Digite o segundo número: ");
                n2 = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Erro: digite um número válido.");
                sc.next(); // limpa o buffer
                continue;
            }

            System.out.print("Escolha a operação [+, -, *, /]: ");
            String operacao = sc.next();
            double result;

            switch (operacao) {
                case "+": result = n1 + n2; break;
                case "-": result = n1 - n2; break;
                case "*": result = n1 * n2; break;
                case "/":
                    if (n2 == 0) {
                        System.out.println("Erro: divisão por zero!");
                        continue;
                    }
                    result = n1 / n2;
                    break;
                default:
                    System.out.println("Operação inválida.");
                    continue;
            }

            System.out.printf("Resultado: %.2f%n", result);

            System.out.print("Calcular novamente? (s/n): ");
            if (!sc.next().equalsIgnoreCase("s")) break;
        }

        sc.close();
    }
}