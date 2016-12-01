
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormLogin extends javax.swing.JFrame {

    public FormLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_logar = new javax.swing.JButton();
        btn_convidado = new javax.swing.JButton();
        txt_login = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_logar.setText("Logar");
        btn_logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logarActionPerformed(evt);
            }
        });

        btn_convidado.setText("Convidado");
        btn_convidado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_convidadoActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario:");

        jLabel2.setText("Senha: ");

        jLabel3.setText("Acesso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_login, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(txt_senha))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btn_logar)
                        .addGap(50, 50, 50)
                        .addComponent(btn_convidado)
                        .addGap(0, 38, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_logar)
                    .addComponent(btn_convidado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_convidadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_convidadoActionPerformed
        FormConsulta fConsulta = new FormConsulta();
        fConsulta.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_convidadoActionPerformed

    private void btn_logarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logarActionPerformed
        entrar();//função
    }//GEN-LAST:event_btn_logarActionPerformed

    public void entrar() {

        MensageiroAcesso mAcesso = null;
        try {
            mAcesso = (MensageiroAcesso) Naming.lookup("rmi://localhost:14001/MensageiroAcesso");

            if (mAcesso.entrar(txt_login.getText(), txt_senha.getText()) == true) {
                JOptionPane.showMessageDialog(rootPane, "Acesso");
                FormPrincipal fPrincipal = new FormPrincipal();
                fPrincipal.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Acesso negado");
                limpa();
            }

        } catch (Exception ex) {
            Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void sair() {

    }
    
    public void limpa(){
        txt_login.setText("");
        txt_senha.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_convidado;
    private javax.swing.JButton btn_logar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_login;
    private javax.swing.JPasswordField txt_senha;
    // End of variables declaration//GEN-END:variables
}
