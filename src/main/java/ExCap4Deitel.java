import java.util.Scanner;

public class ExCap4Deitel {
    public static void main(String[] args) {
        int termos = perguntaAoUsuarioRetornandoInt("Digite o numero de termos para o calculo");
        double termosDeEuler = termosDeEuler(termos);
        imprimeResultadoNaTela("valor de e = ", termosDeEuler);

    }

    private static int fatorial(int nTermos) {
        int soma = 1;
        for(int i = 0; i < nTermos; i++){
            soma *=  (nTermos - i);
        }
        return soma;
    }
    private static double termosDeEuler(int termos) {
        double soma = 0;
        for (int i = 0 ; i <= termos ; i++){
            soma +=(1/(double)fatorial(i));
        }
        return soma;
    }
    private static void imprimeResultadoNaTela(String frase, double termosDeEuler) {
        System.out.printf("%s %.10f",frase, termosDeEuler);
    }
    private static int perguntaAoUsuarioRetornandoInt(String digiteONumeroDeTermos) {
        int termos;
        Scanner entrada = new Scanner(System.in);
        System.out.printf("%s :", digiteONumeroDeTermos);
        termos = entrada.nextInt();
        return termos;
    }
}
