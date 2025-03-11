import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int[] iniciaisValores = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
            int pontos = 0, pontos2 = 0;

            System.out.println("Player1: ");
            char[] palavra = teclado.nextLine().toCharArray();

            for(int i = 0; i < palavra.length; i++){
                int p1 = palavra[(int)i];

                if(91 > p1 && p1 > 64){
                    p1 -= 65;
                } else if (123 > p1 && p1 > 96){
                    p1 -= 97;
                } else{
                    p1 = 0;
                }
                pontos += iniciaisValores[p1];
            }

            System.out.println("Player2: ");
            char[] palavra2 = teclado.nextLine().toCharArray();

            for(int i = 0; i < palavra2.length; i++){
                int p2 = palavra2[(int)i];

                if(91 > p2 && p2 > 64){
                    p2 -= 65;
                } else if (123 > p2 && p2 > 96){
                    p2 -= 97;
                } else {
                    p2 = 0;
                }
                pontos2 += iniciaisValores[p2];
            }

            if (pontos > pontos2){
                System.out.println("Player1 win!");
            } else if (pontos2 > pontos){
                System.out.println("Player2 win!");
            }else {
                System.out.println("Tie!");
            }
    }
}