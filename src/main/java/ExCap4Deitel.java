import java.util.Scanner;

public class ExCap4Deitel {
    public static void main(String[] args) {
        //programa princial
        int valorX = perguntaAoUsuarioRetornandoInt("*** CALCULA (e^x) *** \nDigite o valor x: ");
        int termos = perguntaAoUsuarioRetornandoInt("Digite a quantidade de termos para calcular:  ");
        double termosDeEuler = termosDeEuler(valorX, termos);

        imprimeResultadoNaTela("valor de eˆx = ", termosDeEuler);
    }
    //funcao que retorna o fatorial de um numero
    public static int fatorial(int nTermos) {
        int soma = 1;
        for(int i = 0; i < nTermos; i++){
            soma *=  (nTermos - i);
        }
        return soma;
    }
    public static double termosDeEuler(int x, int termos) {
        double soma = 0;
        for (int i = 0 ; i <= termos ; i++){
            soma +=(Math.pow(x,i)/(double)fatorial(i));
        }
        return soma;
    }
    private static void imprimeResultadoNaTela(String frase, double valor) {

        System.out.printf("%s %.10f",frase, valor);
    }
    private static int perguntaAoUsuarioRetornandoInt(String digiteONumeroDeTermos) {
        int termos;
        Scanner entrada = new Scanner(System.in);
        System.out.printf("%s ", digiteONumeroDeTermos);
        termos = entrada.nextInt();
        return termos;
    }
}
