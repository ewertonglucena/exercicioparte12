
package exemplo01;

public class Aplicacao1 {
    public static void main(String[] args) 
    {
    try
    {
            int a[] = new int[2];
            System.out.println(a[4]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
            System.out.println("Exceção gerada: "+e.getMessage());
            System.out.println("\nPilha de erros");
            e.printStackTrace();
            System.out.println("Você tentou acessar um índice fora da faixa de escopo do vetor");
    }
    finally
       {
            System.out.println("O finally é sempre executado");
       }
    }
}