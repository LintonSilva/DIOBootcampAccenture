/* Exercício 2 de Fundamentos de programação em Java
   Escreva um código que receba o tamanho do lado de um quadrado,
   calcule sua área e exiba na tela:

    Fórmula : área = lado x lado */

import java.util.Scanner;

public class FundamentosExec_02 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite o valor do lado do quadrado: ");
        var lado = scanner.nextInt();

        var area = lado * lado;

        System.out.printf("Fórmula : àrea = %s x %s. \n", lado, lado);
        System.out.printf("A área do quadrado é %s. \n", area);
    }
}
