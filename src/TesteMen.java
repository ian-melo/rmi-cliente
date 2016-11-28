
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class TesteMen {

    public static void main(String[] args) {
        MensageiroAcesso menA = null;
        MensageiroVerifica menV = null;
        String val;
        try {
            //MensageiroAcesso
            LocateRegistry.getRegistry("127.0.0.1");
            menA = (MensageiroAcesso) Naming.lookup("rmi://localhost:14001/MensageiroAcesso");
            
            //MensageiroAcesso
            LocateRegistry.getRegistry("127.0.0.1");
            menV = (MensageiroVerifica) Naming.lookup("rmi://localhost:14002/MensageiroVerifica");
            
            menA.sair();
            System.out.println(menV.isUsuarioLogado());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
    }
}