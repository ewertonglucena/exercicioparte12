package exemplo01;
import java.util.Scanner;
public class DivididoPorZeroSemTratamentoExcecao {
    public static int quociente(int numerador, int denominador){
        return numerador / denominador;
    }
    
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
        System.out.print("Por favor insira um numerador inteiro: ");
        int numerador = scanner.nextInt();
        System.out.print("Por favor insira um denominador inteiro: ");
        int denominador = scanner.nextInt();
        
        int resultado = quociente(numerador, denominador);
        System.out.printf(
            "\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
    }
}
