/* 14) Faça um algoritmo que leia 20 números e, ao final,
escreva quantos estão entre 0 e 100, quantos estão entre 101 e 200
e quantos são maiores de 200.
*/
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade0a100 = 0;
        int quantidade101a200 = 0;
        int i = 1; // contador de iterações

        while (i <= 20) {
            System.out.println(" Digite o " + i + " ° número: ");
            int numero = scanner.nextInt();

            // Verifica se o número está entre 0 e 100
            if (numero >= 0 && numero <= 100) {
                quantidade0a100++;

            }
            // Verifica se o número está entre 101 e 200
            if (numero >= 101 && numero <= 200) {
                quantidade101a200++;

            }
            i++;


        }
        System.out.println(" Quantidade de números entre 0 e 100: " + quantidade0a100);

        System.out.println(" Quantidade de números entre 101 e 200: " + quantidade101a200);

        scanner.close();
    }
}
