
package dados;
import java.util.Scanner;
public abstract class Drive implements Interface{
    protected String marca;
    protected double preco;
    protected int capacidade;
    protected String info;
    
    public Drive(){}
    
    public Drive(String marca, double preco, int capacidade){
        setMarca(marca);
        setPreco(preco);
        setCapacidade(capacidade);
    }

    public Drive(String marca){
        setMarca(marca);
    }
    
    public Drive(String marca, double preco){
        setMarca(marca);
        setPreco(preco);
    }
    
    public Drive(String marca, int capacidade){
        setMarca(marca);
        setCapacidade(capacidade);
    }
    
    public Drive(int capacidade){
        setCapacidade(capacidade);
    }

    public Drive(double preco){
        setPreco(preco);
    }
    
    public Drive(double preco, int capacidade){
        setPreco(preco);
        setCapacidade(capacidade);
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
    public void cadastrar(String marca, double preco, int capacidade){
        setMarca(marca);
        setPreco(preco);
        setCapacidade(capacidade);
    }
    
    public void imprimir(){
        System.out.println("Dados do " +getInfo());
        System.out.println("Marca: "+getMarca());
        System.out.println("Preco: R$"+getPreco());
        System.out.println("Capacidade: "+getCapacidade()+" GB");
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os dados do "+getInfo());
        System.out.print("Digite a Marca: ");
        setMarca(sc.nextLine());
        System.out.println("Digite o Preço: ");
        setPreco(Double.parseDouble(sc.nextLine()));
        System.out.print("Digite a Capacidade: ");
        setCapacidade(Integer.parseInt(sc.nextLine()));
    }
    
    public void ler(){
        System.out.println("Faz a leitura no "+getInfo());
    } 
    
    public void gravar(){
        System.out.println("Faz a gravação no "+getInfo());
    }
    
    public void apagar(){
        System.out.println("Apaga no "+getInfo());
    }
}
