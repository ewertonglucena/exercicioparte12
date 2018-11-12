package exemplo01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivididoPorZeroComTratamentoExcecao {
    public static int quociente(int numerador, int denominador)
        throws ArithmeticException
    {
      return numerador / denominador;  
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuarLoop = true;
        do
        {
            try{
                System.out.print("Por favor insira um numerador inteiro: ");
                int numerador = scanner.nextInt();
                System.out.print("Por favor insira um denominador inteiro: ");
                int denominador = scanner.nextInt();
                
                int resultado = quociente (numerador, denominador);
                System.out.printf("\nResult: %d / %d = %d\n", numerador,
                        denominador, resultado);
                continuarLoop = false;
            }
            catch (InputMismatchException inputMismatchException)
            {
                System.err.printf("\nExceção: %s\n", inputMismatchException);
                scanner.nextLine();
                System.out.println("Você deve inserir inteiros. Por favor tente novamente.\n");
            }
            catch (ArithmeticException excecaoAritmetica)
            {
                System.err.printf("\nExceção: %s\n", excecaoAritmetica);
                System.out.println("Zero é um denominador inválido. Por favor tente novamente.\n");
            }
        }while (continuarLoop);
    }
}
