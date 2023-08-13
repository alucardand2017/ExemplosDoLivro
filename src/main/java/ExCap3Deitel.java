import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, soma;

        int ex, d1, d2, d3, d4, d5;
        ex = entrada.nextInt();
        d1 = ex/10000;
        d2 = ex/1000 - d1*10;
        d3 = ex/100 - (ex/1000)*10;
        d4 = ex/10 - (ex/100)*10;
        d5 = ex - (ex/10)*10;

        System.out.printf("%d   %d   %d   %d   %d   ", d1, d2, d3, d4, d5);
    }
}
