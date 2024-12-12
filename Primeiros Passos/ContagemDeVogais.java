/*
Enunciado: Escreva um programa que leia uma string do usuário e
conte o número de vogais (a, e, i, o, u) presentes na string.

Sugestão: Utilize um loop for para iterar sobre os caracteres da string
e um if para verificar se o caractere é uma vogal.
*/

import java.util.Scanner;

public class ContagemDeVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char vogais[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int contador = 0;

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            char caractere = palavra.charAt(i);
            for (char vogal : vogais) {
                if (caractere == vogal) {
                    System.out.println("Possui a vogal: " +vogal);
                    contador++;
                    break;
                }
            }
        }
        System.out.println("Contém " + contador + " vogais.");
        scanner.close();
    }
}