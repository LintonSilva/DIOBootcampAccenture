/* Escreva um código que o usuário entre com um primeiro número, um segundo número maior
que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos
os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados,
incluindo os números informados e em ordem decrescente. */

package EstruturasDeControle;
import java.util.Scanner;

public class EstruturasDeControleExec_03 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = 2;
        var number2 = 1;

        while(number1 >= number2) {
            System.out.println("Digite o primeiro número: ");
            number1 = scanner.nextInt();

            System.out.println("Digite o segundo múmero : ");
            number2 = scanner.nextInt();

            if (number1 >= number2) {
                System.out.println(" Atenção, o segundo número deve ser maior que o primeiro. \n");
            }
        }

        System.out.println("  Escolha uma das opções abaixo: \n");
        System.out.println("  1 - Imprimir números pares. \n");
        System.out.println("  2 - Imprimir números ímpares. \n");
        System.out.println("  \n");
        System.out.printf(" Digite a opção desejada : ");
        var opcao = scanner.nextInt();

        if (opcao == 1) {
            for (int i = number2; i >= number1; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else if (opcao == 2) {
            for (int i = number2; i >= number1; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }


    }
}
