package main;
public class App {
    public static int encontre(int[] arrayOrdenado, int num){

        for (int i = 0; i < arrayOrdenado.length; i++) {
            if (arrayOrdenado[i] == num) {
                return 1;
            }
        }
        return 0;

    }

    public static int maior(int[] arrayDesordenado){
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < arrayDesordenado.length; i++) {
            if (arrayDesordenado[i] > maior) {
                maior = arrayDesordenado[i];
            }
        }
        return maior;
    }

    public static Integer parMaisProximo(Integer[][] pares){
        return 1;
    }
}
