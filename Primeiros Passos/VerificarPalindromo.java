/*
Descrição: Crie um programa que verifica se uma palavra é um palíndromo
(ou seja, se pode ser lida da mesma forma de trás para frente, como "arara").
Desafio Extra: Permita que o usuário insira frases completas e ignore espaços e caracteres especiais.
 */

import java.util.Scanner;

public class VerificarPalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        palavra = palavra.toLowerCase(); // Transforma a palavra em minuscula

        boolean palindromo = true;

        int n = palavra.length();
        for (int i = 0; i < n / 2; i++) { // Verifica a metade da palavra
            if (palavra.charAt(i) != palavra.charAt(n - 1 - i)) { // verifica a metade da palavra de tras para frente
                palindromo = false;
                break;
            }
        }

        String resultado = palindromo == false ? "Não é palindromo" : "É palindromo";
        System.out.println(resultado);
        
        scanner.close();
    }
}