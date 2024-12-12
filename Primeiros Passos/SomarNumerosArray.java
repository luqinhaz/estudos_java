/* Descrição: Crie um programa que solicita ao usuário 5 números inteiros,
armazene-os em um array e calcule a soma de todos os números.
Desafio Extra: Permita que o usuário decida quantos números deseja informar.
 */

import java.util.Scanner;

public class SomarNumerosArray {
    public static void main(String[] args) {
        // Usando Scanner para armazenados dados de entrada do usuário.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você deseja informar? ");
        int quantidade = scanner.nextInt();

        int[] numeros = new int[quantidade]; // Define um tamanho fixo.
        int total = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
            total += numeros[i];
        }
        System.out.println("Soma total: " + total);
        scanner.close();
    }
}