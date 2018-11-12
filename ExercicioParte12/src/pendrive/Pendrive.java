package pendrive;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pendrive extends Relatorio{
    private String marca, modelo;
    private int capacidade;
    private double preco;

    public Pendrive(){}
    
    public Pendrive(String marca,String modelo, int capacidade, double preco){
        setMarca(marca);
        setModelo(modelo);
        setCapacidade(capacidade);
        setPreco(preco);
    }
    
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if (capacidade <= 0){
            throw new IllegalArgumentException("Não são permitidos zero e números negativos.");
        }
        this.capacidade = capacidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if ("".equals(marca)){
            throw new IllegalArgumentException("Não insira campos vazios.");
        }
        if(" ".equals(marca)){
            throw new IllegalArgumentException("Não insira espaços");
        }
        if(marca == null){
           throw new IllegalArgumentException("Não são permitidos valores nulos");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo){
        if ("".equals(modelo)){
            throw new IllegalArgumentException("Não insira campos vazios.");
        }
        if(" ".equals(modelo)){
            throw new IllegalArgumentException("Não insira espaços");
        }
        if(modelo == null){
           throw new IllegalArgumentException("Não são permitidos valores nulos");
        }
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0){
            throw new IllegalArgumentException("Não são permitidos zero e números negativos.");
        }
        this.preco = preco;
    }
    
    public void imprimir(){
        System.out.println("\n\nOs dados do Pendrive são: \n");
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Capacidade: "+ capacidade);
        System.out.println("Preço: " + preco);
    }
    
    public void relatorio(){
        System.out.print("\n\033[32;1m");
        
        String marcap = "";
        if (marca.length()< 5){
            marcap = marca;
            for(int i = marcap.length(); i<5; i++)
            marcap = marcap.concat(" ");
        }
        else {
            marcap = marca;
        }
        System.out.printf("%s", marcap.substring(0, 5));
        System.out.print(TAB);
        
        String modelop = "";
        if (modelo.length()< 6){
            modelop = modelo;
            for(int i = modelop.length(); i<6; i++)
            modelop = modelop.concat(" ");
        }
        else {
            modelop = modelo;
        }
        System.out.printf("%s", modelop.substring(0, 6));
        System.out.print(TAB);
        
        String capacidadep = "";
        String strCap = Integer.toString(capacidade);
        if (strCap.length()< 10){
            capacidadep = strCap;
            for(int i = capacidadep.length(); i<10; i++)
            capacidadep = capacidadep.concat(" ");
        }
        else {
            capacidadep = strCap;
        }
        
        System.out.printf("%s", capacidadep.substring(0, 10));
        System.out.print(TAB);
        
        DecimalFormat p = new DecimalFormat("#,##0.00");
        System.out.print(p.format(preco));
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        boolean entradaValida = true;
        do{
            try
            {
                do{
                    try{
                        System.out.print("Insira a Marca: ");
                        setMarca(sc.nextLine());
                        entradaValida = false;
                    }
                    catch(IllegalArgumentException e){
                        System.out.println("Campos vazios não são permitidos!");
                        System.out.println("Digite uma marca válida.");
                    }
                }while(entradaValida);
                entradaValida = true;
                do{
                    try{
                        System.out.print("Insira o Modelo: ");
                        setModelo(sc.nextLine());
                        entradaValida = false;
                    }
                    catch(IllegalArgumentException e){
                        System.out.println("Campos vazios não são permitidos!");
                        System.out.println("Digite um modelo válido.");
                    }
               }while(entradaValida);
               entradaValida = true;
               do{
                    try{    
                        System.out.print("Insira a Capacidade (GB): ");
                        setCapacidade(Integer.parseInt(sc.nextLine()));
                        entradaValida = false;
                    }
                    catch(NumberFormatException e)
                    {
                        System.out.println("Apenas são permitidos valores inteiros!");
                        System.out.println("Digite uma capacidade válida.");
                    }
                    catch(IllegalArgumentException e){
                        System.out.println("Zero ou números negativos não são permitidos!");
                        System.out.println("Digite uma capacidade válida.");
                    }
               }while(entradaValida);
               entradaValida = true;
               do{
                   try{
                        System.out.print("Insira o preço: R$");
                        setPreco(Double.parseDouble(sc.nextLine()));
                        entradaValida = false;
                   }
                    catch(NumberFormatException e)
                    {
                        System.out.println("Apenas são permitidos valores do tipo double!");
                        System.out.println("Digite um preço válido.");
                    }
                    catch(IllegalArgumentException e){
                        System.out.println("Zero ou números negativos não são permitidos!");
                        System.out.println("Digite um preço válido.");
                    }
               }while(entradaValida);
               entradaValida = false;
            }
            catch (InputMismatchException e)
            {
                System.err.printf("\nExceção: %s", e );
                System.out.println("Você deve digitar valores válidos!");
           }
        }while(entradaValida);
    }
    
    public void cadastrar(String marca, String modelo, int capacidade, double preco){
        setMarca(marca);
        setModelo(modelo);
        setCapacidade(capacidade);
        setPreco(preco);
    }
    
    public void desconto(int desc){
        if(desc <=0){
            throw new IllegalArgumentException("Não são permitidos valores negativos ou iguais a Zero");
        }
        Double descValor = preco*((double)desc/100);
        DecimalFormat p = new DecimalFormat("#,##0.00");
        System.out.println("Valor do desconto: R$"+p.format(descValor));
        System.out.println("Valor com desconto: R$"+p.format(preco-descValor));
    }
}
