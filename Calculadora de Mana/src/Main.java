import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual é o seu nome?");
        String nome = teclado.nextLine();

        System.out.printf("Olá, %s", nome);
    }
}
