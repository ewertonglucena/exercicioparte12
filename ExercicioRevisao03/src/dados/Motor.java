package dados;
import java.util.Scanner;
/**
 *
 * @author ewerton.lucena
 */
public class Motor {
    private String modelo;
    private int rpm;
    private double voltagem;
    
    public Motor(){}
    
    public Motor(String modelo, int rpm, double voltagem){
        setModelo(modelo);
        setRpm(rpm);
        setVoltagem(voltagem);
    }
    
    public Motor(String modelo){
        setModelo(modelo);
    }
    
    public Motor(String modelo, int rpm){
        setModelo(modelo);
        setRpm(rpm);
    }
    
    public Motor(int rpm, double voltagem){
        setRpm(rpm);
        setVoltagem(voltagem);
    }
    
    public Motor(int rpm){
        setRpm(rpm);
    }
    
    public Motor(String modelo, double voltagem){
        setModelo(modelo);
        setVoltagem(voltagem);
    }

    public Motor(double voltagem){
        setVoltagem(voltagem);
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }
    
    public void imprimir(){
        System.out.println("Dados Motor:");
        System.out.println("Modelo: "+getModelo());
        System.out.println("Rpm: "+getRpm());
        System.out.println("Voltagem: "+getVoltagem());
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o modelo: ");
        setModelo(sc.nextLine());
        System.out.println("Digite a Rpm: ");
        setRpm(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a Voltagem: ");
        setVoltagem(Double.parseDouble(sc.nextLine()));
    }
    
    public void cadastrar(String m, int r, double v){
        setModelo(m);
        setRpm(r);
        setVoltagem(v);
    }
}
