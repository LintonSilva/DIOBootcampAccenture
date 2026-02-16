/* Exercício 1 de Estruturas de Controle em Java
 Escreva um código onde o usuário entra com um número e seja gerada a tabuada de
 1 a 10 desse número. */

package EstruturasDeControle;
import java.util.Scanner;

public class EstruturasDeControleExec_01 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        var number = scanner.nextInt();

        System.out.printf("Tabuada do %s. \n", number);

        for  (int i = 1; i <= 10; i++) {
              var result = number * i;
              System.out.printf("%s x %s = %s \n", number, i, result);
        }
    }
}
