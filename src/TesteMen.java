
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TesteMen {

    public static void main(String[] args) {
        testaConsulta();
        
        
//        MensageiroAcesso menA = null;
//        MensageiroVerifica menV = null;
//        String val;
//        try {
//            //MensageiroAcesso
//            //LocateRegistry.getRegistry("127.0.0.1");
//            LocateRegistry.getRegistry("192.168.58.1");
//            menA = (MensageiroAcesso) Naming.lookup("rmi://localhost:14001/MensageiroAcesso");
//            
//            //MensageiroAcesso
//            //LocateRegistry.getRegistry("127.0.0.1");
//            LocateRegistry.getRegistry("192.168.58.1");
//            menV = (MensageiroVerifica) Naming.lookup("rmi://localhost:14002/MensageiroVerifica");
//            
//            menA.sair();
//            System.out.println(menV.isUsuarioLogado());
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//            System.exit(1);
//        }
    }
    
    public static void testaConsulta(){
           MensageiroRegistro mRegistro = null;
        
        try {
            LocateRegistry.getRegistry("127.0.0.1");
            //LocateRegistry.getRegistry("192.168.58.1");//Fabio
            String[] res = new String[25];
            mRegistro = (MensageiroRegistro) Naming.lookup("rmi://localhost:14003/MensageiroRegistro");
            
            res = mRegistro.procurarLimitado("96.362.345/0001-64");
            
            
            for (int i=0; res.length <= i; i++){
                System.out.println(res[i]);//apenas um teste
            }
            
        } catch (RemoteException ex) {
            Logger.getLogger(FormConsulta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(FormConsulta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(FormConsulta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex){
            System.out.println(ex);//pega tudo
        }
     
    }
    
}