package exerciciorevisao03;
import dados.*;
public class ExercicioRevisao03 {
    public static void main(String[] args) {
        Hd hd1 = new Hd();
        hd1.entradaDados();
        hd1.imprimir();
        hd1.gravar();
        hd1.ler();
        hd1.apagar();
        
        Pendrive pen1 = new Pendrive();
        pen1.entradaDados();
        pen1.imprimir();
        pen1.gravar();
        pen1.ler();
        pen1.apagar();
        
        Motor aux1 = new Motor("Alto Torque", 8500,12.9);
        Motor aux2 = new Motor("Baixo Torque", 2500, 12.5);
        
        Hd hd2 = new Hd();
        hd2.cadastrar("Seagate", 500.90, 10240, aux1, 2560);
        hd2.imprimir();
        hd2.gravar();
        hd2.ler();
        hd2.apagar();
        
        Pendrive pen2 = new Pendrive();
        pen2.cadastrar("Kingston", 29.90, 200, 16, 13, 23);
        pen2.imprimir();
        pen2.gravar();
        pen2.ler();
        pen2.apagar();
        
        Hd hd3 = new Hd("Maxtor", 159.90, 240);
        hd3.imprimir();
        hd3.gravar();
        hd3.ler();
        hd3.apagar();
        
        Pendrive pen3 = new Pendrive("Sandisk", 39.90, 8);
        pen3.imprimir();
        pen3.gravar();
        pen3.ler();
        pen3.apagar();
        
        Hd hd4 = new Hd("Samsung", 800.89, 1024, aux2, 512);
        hd4.imprimir();
        hd4.gravar();
        hd4.ler();
        
        Pendrive pen4 = new Pendrive("Multilaser", 20.90, 8, 30, 15, 26);
        pen4.imprimir();
        pen4.gravar();
        pen4.apagar();
        
        Hd hd5 = new Hd("Toshiba", 500);
        hd5.gravar();
        hd5.imprimir();
        
        Pendrive pen5 = new Pendrive("Apacer", 81.90, 32, 14.6, 29.5);
        pen5.ler();
        pen5.imprimir();
        
    }
    
}
