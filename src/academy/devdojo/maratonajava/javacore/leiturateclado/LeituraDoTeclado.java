package academy.devdojo.maratonajava.javacore.leiturateclado;

import java.util.Scanner;

public class LeituraDoTeclado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.println("Seu nome é " + nome + " e tem "+ idade +" anos.");
    }
}
