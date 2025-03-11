import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Say a key: ");
        int key = teclado.nextInt();

        System.out.print("plaintext: ");
        char text = teclado.nextLine().toCharArray();
    }
}