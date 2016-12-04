
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TesteMen {

    public static void main(String[] args) {
        //testaConsultaLim();//OK
        testaConsulta();
    }
    
    public static void testaConsultaLim(){
        try {
            System.out.println("-----Teste de consulta limitada----");
            
            LocateRegistry.getRegistry("127.0.0.1");
            MensageiroRegistro mRegistro = (MensageiroRegistro) Naming.lookup("rmi://localhost:14003/MensageiroRegistro");
            String[] res = mRegistro.procurarLimitado("96.362.345/0001-64");
            
            for (String re : res) {
                System.out.println(re);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(FormConsulta.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(1);
        } catch (NotBoundException ex) {
            Logger.getLogger(FormConsulta.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(2);
        } catch (MalformedURLException ex) {
            Logger.getLogger(FormConsulta.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(3);
        } catch (Exception ex){
            System.out.println(ex);
            System.exit(4);
        }
    }
    
    public static void testaConsulta() {
        try {
            System.out.println("-----Teste de consulta----");
            
            //MensageiroAcesso
            LocateRegistry.getRegistry("127.0.0.1");
            MensageiroAcesso menA = (MensageiroAcesso) Naming.lookup("rmi://localhost:14001/MensageiroAcesso");
            
            //MensageiroAcesso
            LocateRegistry.getRegistry("127.0.0.1");
            MensageiroVerifica menV = (MensageiroVerifica) Naming.lookup("rmi://localhost:14002/MensageiroVerifica");
            
            //MensageiroRegistro
            LocateRegistry.getRegistry("127.0.0.1");
            MensageiroRegistro menR = (MensageiroRegistro) Naming.lookup("rmi://localhost:14003/MensageiroRegistro");
            
            /*
            if(menA.entrar("admin", "123")) {
                System.out.println("Login efetuado com sucesso!!!");
            } else {
                System.out.println("Problema no login");
                //return;
            }*/
            
            if(menV.isUsuarioLogado()) {
                System.out.println("Sucesso na verificação!!!");
            } else {
                System.out.println("Problema na verificação");
                return;
            }
            
            String[] res;
            if((res = menR.procurar("34.041.258/0001-58", "admin", "123")) != null)
                System.out.println(res[0] + "\n" + res[1] + "\n" + res[2] + "\n" +
                        res[3] + "\n" + res[4] + "\n" + res[5] + "\n" + res[6] + "\n" +
                        res[7] + "\n" + res[8] + "\n" + res[9] + "\n" + res[10] +
                        res[18] + "\n" + res[19] + "\n" + res[20] + "\n" + res[21]);
            else
                System.out.println("Não deu.");
            
            
        } catch (RemoteException ex) {
            Logger.getLogger(FormConsulta.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(1);
        } catch (NotBoundException ex) {
            Logger.getLogger(FormConsulta.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(2);
        } catch (MalformedURLException ex) {
            Logger.getLogger(FormConsulta.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(3);
        } catch (Exception ex){
            System.out.println(ex);
            System.exit(4);
        }
    }
}