package exercicioparte12;
import java.util.Scanner;
import pendrive.*;
public class ExercicioParte12 {

    public static void main(String[] args) {  
        try{
            Pendrive pen[] = new Pendrive[1];
    
        for(int i=0; i <pen.length; i++){
            pen[i] = new Pendrive ();
            pen[i].entradaDados();
            boolean x = true;
            do{
                try{
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Digite um valor de desconto em %: ");
                    pen[i].desconto(Integer.parseInt(sc.nextLine()));
                    x = false;
                }
                catch(IllegalArgumentException e){
                    System.out.println("Valor de Desconto inválido");
                }
            }while(x);
        }
        
        
        
        Pendrive.cabecalho();
        Pendrive.exibirDados(pen);
        Pendrive.rodape(pen);
        }
        catch(NullPointerException e){
            System.out.println("Erro: "+e.getMessage());
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
}