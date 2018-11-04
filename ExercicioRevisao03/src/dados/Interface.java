package dados;
/**
 *
 * @author ewerton.lucena
 */
public interface Interface {
    String ENTRADAPENDRIVE = "USB";
    String ENTRADAHD = "SATA";
    void ler();
    void gravar();
    void apagar();
}
