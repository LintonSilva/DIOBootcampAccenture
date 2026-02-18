
/* Escreva um código onde o usuário informa um número inicial, posteriormente irá informar
   outros N números, a execução do código irá continuar até que o número informado dividido
   pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro
   número devem ser ignorados. */

package EstruturasDeControle;

import java.util.Scanner;

public class EstruturaDeControleExec_04 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        var number1 = scanner.nextInt();

        System.out.println("Informe outro número: ");
        var number2 = scanner.nextInt();

        while (number2 % number1 == 0 || (number2 < number1) ) {
            if (number2 < number1) {
                System.out.printf("Número %s ignorado. \n", number2);
            }
            System.out.println("Informe outro número: ");
            number2 = scanner.nextInt();
        }
        System.out.printf("O número %s não é divisível por %s \n", number1, number2);
    }
}
