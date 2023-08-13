import java.util.Scanner;

public class ExCap4Deitel {
    public static void main(String[] args) {
        int termos = buscaNumeroDeTermos("numero de termos para o calculo");
        double termosDeEuler = termosDeEuler(termos);
        System.out.printf(" e = %.10f", termosDeEuler);
    }

    private static double termosDeEuler(int termos) {
        double soma = 0;
        for (int i = 0 ; i <= termos ; i++){
            soma +=(1/(double)fatorial(i));
        }

        return soma;
    }

    private static int fatorial(int nTermos) {
        int soma = 1;
        for(int i = 0; i < nTermos; i++){
            soma *=  (nTermos - i);
        }
        return soma;
    }
    private static int buscaNumeroDeTermos(String digiteONumeroDeTermos) {
        int termos;
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite o %s :", digiteONumeroDeTermos);
        termos = entrada.nextInt();
        return termos;
    }
}
