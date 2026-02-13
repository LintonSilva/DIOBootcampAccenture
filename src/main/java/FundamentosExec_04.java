/* Exercício 4 de Fundamentos de programação em Java
   Escreva um código que receba o nome e a idae de duas pessoas e imprima a
   diferença de idade entre elas. */

import java.util.Scanner;

public class FundamentosExec_04 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String name1 = scanner.nextLine();
        System.out.print("Digite a idade da primeira pessoa: ");
        var age1 = scanner.nextInt();
        System.out.printf("%s tem %s anos. \n", name1, age1);

        var scanner2 = new Scanner(System.in);
        System.out.print("Digite o nome da segunda pessoa: ");
        String name2 = scanner2.nextLine();
        System.out.print("Digite a idade da segunda pessoa: ");
        var age2 = scanner2.nextInt();
        System.out.printf("%s tem %s anos. \n", name2, age2);

        var dif = age1 - age2;

        System.out.printf("A diferença de idade entre %s e %s é de %s anos. \n" , name1, name2, dif);
    }
}