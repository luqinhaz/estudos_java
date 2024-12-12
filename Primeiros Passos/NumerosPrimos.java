/*
Enunciado: Crie um programa que leia um número inteiro do usuário e determine se ele é um número primo.

Sugestão: Um número primo é divisível apenas por 1 e por ele mesmo.
Use um loop para verificar se o número tem divisores além de 1 e ele mesmo.

testa se n é um múltiplo de qualquer inteiro entre 2 e 'Raiz do número'
*/

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numPrimo(numero)) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }
    }

    public static boolean numPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}