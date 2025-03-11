import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int sla = 0;

        System.out.println("Quantas magicas você tem no seu deck?");
        float cartas = teclado.nextFloat();

        System.out.println("Qual o valor da carta de maior custo?");
        int Mcarta = teclado.nextInt();


        for(int i = 1; Mcarta >= i; i++){
            System.out.printf("Quantas cartas de custo %d você tem?\n", i);
            sla += teclado.nextInt()*i;
        }

        float a = (float) sla;
        float result = a / cartas;

        System.out.println(result);

    }
}