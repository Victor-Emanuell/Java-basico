import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int letras = 0, palavras = 1, sentencas = 0;
        double indice;
        int grade = 0;

        System.out.println("Text: ");
        char[] texto = teclado.nextLine().toCharArray();

        //Calculo das letras

        for(int i = 0; i < texto.length; i++){
            int p1 = texto[(int)i];

            if(91 > p1 && p1 > 64){
                letras += 1;
            } else if (123 > p1 && p1 > 96){
                letras += 1;
            } else{
                letras += 0;
            }

        }

        //Calculo de palavras

        for(int i = 0; i < texto.length; i++){
            int p1 = texto[i];

            if(p1 == ' '){
                palavras += 1;
            } else {
                palavras += 0;
            }
        }

        //Calculo de sentenças

        for(int i = 0; i < texto.length; i++){
            int p1 = texto[i];

            if (p1 == '.' || p1 == '!' || p1 == '?'){
                sentencas += 1;
            } else {
                sentencas += 0;
            }
        }

        //Calculo indice
        double L = ((double) letras / palavras) * 100;
        double S = ((double) sentencas / palavras) * 100;

        indice = 0.0588 * L - 0.296 * S - 15.8;
        indice = Math.round(indice);

        if (16 > indice && indice >= 1){
            System.out.println("Grade " + ((int)indice));
        } else if (indice <= 0){
            System.out.println("Grade before 1");
        } else {
            System.out.println("Grade +16");
        }

    }
}