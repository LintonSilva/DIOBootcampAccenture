/* Exercício 3 de Fundamentos de programação em Java
   Escreva um código que receba a base e a altura um retângulo,
   calcule sua área e exiba na tela:

    Fórmula : área = base x altura */

import java.util.Scanner;

public class FundamentosExec_03 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite o valor da base do retângulo: ");
        var base = scanner.nextInt();
        System.out.print("Digite o valor da altura do retângulo: ");
        var altura = scanner.nextInt();
        var area = base * altura;

        System.out.printf("Fórmula : àrea = %s x %s \n", base, altura);
        System.out.printf("A área do retângulo é %s \n", area);
    }
}
