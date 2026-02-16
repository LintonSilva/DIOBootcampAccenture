/* Exercício 1 de Fundamentos de programação em Java
 Escreva um código que receba o nome e o ano de nascimento de alguém
 e imprima na tela a seguinte mensagem : "Ola "Fulano" você tem "X" anos.  */

import java.time.OffsetDateTime;
import java.util.Scanner;

public class FundamentosExec_01 {

    public static void main(String[] args) {

        var baseYear = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu ano de nascimento: ");
        var year = scanner.nextInt();

        var age = baseYear - year;

        System.out.printf("Olá %s sua idade é %s anos. \n", nome, age);
    }
}
