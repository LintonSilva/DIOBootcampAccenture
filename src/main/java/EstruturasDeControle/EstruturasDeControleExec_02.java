/* Escreva um código onde o usuário entra com sua altura e peso, seja feito o
calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de
acordo com o resultado:
Se for menor ou igual a 18,5 "Abaixo do peso";
se for entre 18,6 e 24,9 "Peso ideal";
Se for entre 25,0 e 29,9 "Levemente acima do peso";
Se for entre 30,0 e 34,9 "Obesidade Grau I";
Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
*/

package EstruturasDeControle;
import java.util.Scanner;
import java.util.Locale;

public class EstruturasDeControleExec_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);   // Define Locale para usar '.' como separador decimal,
                                        // caso contrário, dependerá do idioma do computador (vírgula)
        var scanner = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        var altura = scanner.nextDouble();

        System.out.print("Digite seu peso: " );
        var peso = scanner.nextDouble();

        double imc = (peso/(altura * altura));

        System.out.printf("O índice de massa corpórea é: %.2f \n", imc);

        if (imc <= 18.5) {
            System.out.printf("Você está abaixo do peso.");
        } else if (imc >= 18.6 && imc <= 24 || imc == 9) {
            System.out.printf("Você está com o peso ideal.");
        } else if (imc >= 25.0 && imc <= 29 || imc == 9) {
            System.out.printf("Você está levemente acima do peso.");
        } else if (imc >= 30.0 && imc <= 34 || imc == 9) {
            System.out.printf("Você está com Obesidade Grau I.");
        } else if (imc >= 35.0 && imc <= 39 || imc == 9) {
            System.out.printf("Você está com Obesidade Grau II (Severa).");
        } else if (imc >= 40.0) {
            System.out.printf("Você está com obesidade III (Mórbida).");
        }
        }

    }