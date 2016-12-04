
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormRegistro extends javax.swing.JFrame {

    private String usuario;
    private String senha;

    public FormRegistro(FormLogin fLogin) {

        usuario = fLogin.getTxt_login();
        senha = fLogin.getTxt_senha();

        //System.out.println(usuario);
        //System.out.println(senha);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_razaoSocial = new javax.swing.JTextField();
        txt_nomeFantasia = new javax.swing.JTextField();
        txt_complemento = new javax.swing.JTextField();
        txt_bairro = new javax.swing.JTextField();
        txt_cidade = new javax.swing.JTextField();
        txt_estado = new javax.swing.JTextField();
        txt_pais = new javax.swing.JTextField();
        txt_telefone = new javax.swing.JTextField();
        txt_inscEstadual = new javax.swing.JTextField();
        txt_inscMunicipal = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_atividadesDesenvolvidas = new javax.swing.JTextField();
        txt_generoAtividade = new javax.swing.JTextField();
        txt_especieAtividade = new javax.swing.JTextField();
        txt_nomeRepresentante = new javax.swing.JTextField();
        txt_foneReprese = new javax.swing.JTextField();
        txt_CNPJ = new javax.swing.JFormattedTextField();
        txt_CPF = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_cadastrados = new javax.swing.JTable();
        btn_inserir = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_procurar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_CEP = new javax.swing.JFormattedTextField();
        txt_dataConstituicao = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_numero = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_logradouro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Razão Social:");

        jLabel2.setText("Nome de Fantasia:");

        jLabel3.setText("Complemento:");

        jLabel4.setText("Telefone (DDD):");

        jLabel5.setText("CNPJ:");

        jLabel6.setText("Inscrição Estadual:");

        jLabel7.setText("Inscrição Municipal:");

        jLabel8.setText("E-mail:");

        jLabel9.setText("Data de sua constituição:");

        jLabel10.setText("Atividades desenvolvidas:");

        jLabel11.setText("Gênero da atividade:");

        jLabel12.setText("Espece da atividade:");

        jLabel13.setText("Nome do Representante Legal:");

        jLabel14.setText("CPF do representante:");

        jLabel15.setText("Fone do representante:");

        jLabel16.setText("Bairro:");

        jLabel17.setText("Cidade:");

        jLabel18.setText("Estado:");

        jLabel19.setText("País:");

        jLabel20.setText("CEP:");

        txt_estado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_estadoFocusLost(evt);
            }
        });

        try {
            txt_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txt_CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tb_cadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_cadastrados);

        btn_inserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        btn_inserir.setText("Inserir");
        btn_inserir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirActionPerformed(evt);
            }
        });

        btn_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.jpg"))); // NOI18N
        btn_alterar.setText("Alterar");
        btn_alterar.setEnabled(false);
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deletar.jpg"))); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.setEnabled(false);
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_procurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/procurar.png"))); // NOI18N
        btn_procurar.setText("Procurar");
        btn_procurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procurarActionPerformed(evt);
            }
        });

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        try {
            txt_CEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txt_dataConstituicao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jLabel22.setText("Numero:");

        jLabel23.setText("Logradouro:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_alterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_procurar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nomeRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_foneReprese, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_dataConstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_atividadesDesenvolvidas))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_generoAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_especieAtividade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_inscEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_inscMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_razaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_pais))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txt_razaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txt_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(txt_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txt_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txt_inscEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addComponent(txt_inscMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_generoAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txt_especieAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txt_dataConstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10)
                    .addComponent(txt_atividadesDesenvolvidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_nomeRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txt_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel15)
                        .addComponent(txt_foneReprese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_alterar)
                        .addComponent(btn_excluir)
                        .addComponent(btn_procurar)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(btn_inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_procurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procurarActionPerformed
        try {

            procurar();

        } catch (RemoteException | NotBoundException | MalformedURLException ex) {
            Logger.getLogger(FormRegistro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println(ex);//tudo
        }


    }//GEN-LAST:event_btn_procurarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {

            preenchetabela();

            //listar();//descomentar
        } catch (RemoteException | NotBoundException | MalformedURLException ex) {
            Logger.getLogger(FormRegistro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int val = JOptionPane.showConfirmDialog(rootPane, "Deseja mesmo sair?");
        if (val == 0) {
            sair();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        int val = JOptionPane.showConfirmDialog(rootPane, "Deseja mesmo excluir?");
        if (val == 0) {
            try {

                excluir();
                desabilitarBotoes();

            } catch (RemoteException | NotBoundException | MalformedURLException ex) {
                Logger.getLogger(FormRegistro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                System.out.println(ex);//tudo
            }

        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        int val = JOptionPane.showConfirmDialog(rootPane, "Deseja mesmo alterar?");
        if (val == 0) {
            try {

                alterar();
                desabilitarBotoes();

            } catch (RemoteException | NotBoundException | MalformedURLException ex) {
                Logger.getLogger(FormRegistro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                System.out.println(ex);
            }
            desabilitarBotoes();
        }
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //JOptionPane.showMessageDialog(rootPane, "Closing");
        sair();
    }//GEN-LAST:event_formWindowClosing

    private void btn_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirActionPerformed
        if (varificaBranco() == false) {
            JOptionPane.showMessageDialog(rootPane, "Há campo(s) em branco");
            return;
        }
        try {

            inserir();
            limpar();

        } catch (NotBoundException | RemoteException | MalformedURLException ex) {
            Logger.getLogger(FormRegistro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {//tudo
            System.out.println(ex);
        }

    }//GEN-LAST:event_btn_inserirActionPerformed

    private void txt_estadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_estadoFocusLost
        String teste = txt_estado.getText();
        if (teste.length() >= 3 || teste.length() == 1 || txt_estado.getText() == "  ") {
            JOptionPane.showMessageDialog(rootPane, "O campo Estado deve ter 2 caracteres");
            txt_estado.setText("");
            txt_estado.requestFocus();
        }

    }//GEN-LAST:event_txt_estadoFocusLost

    public void inserir() throws NotBoundException, RemoteException, MalformedURLException {
        MensageiroRegistro mRegistro = null;
        //LocateRegistry.getRegistry("192.168.0.103");//F
        //LocateRegistry.getRegistry("192.168.56.1");
        LocateRegistry.getRegistry("127.0.0.1");
        //mRegistro = (MensageiroRegistro) Naming.lookup("rmi://localhost:14003/MensageiroRegistro");
        mRegistro = (MensageiroRegistro) Naming.lookup("rmi://localhost:14003/MensageiroRegistro");
//apenas um teste
        String[] item = new String[22];                 //String[] retorno = new String[22];//testar conteudo

        item[0] = txt_CNPJ.getText();                   //retorno[0] = "51.728.712/0001-62";
        item[1] = txt_razaoSocial.getText();            //retorno[1] = "razaoSocial";
        item[2] = txt_nomeFantasia.getText();           //retorno[2] = "NomeF";
        item[3] = txt_telefone.getText();               //retorno[3] = "9999-9999";
        item[4] = txt_inscMunicipal.getText();          //retorno[4] = "munucipal";
        item[5] = txt_inscEstadual.getText();           //retorno[5] = "estadual";
        item[6] = txt_email.getText();                  //retorno[6] = "email@gmail.com";
        item[7] = txt_dataConstituicao.getText();       //retorno[7] = "12/01/2016";
        item[8] = txt_atividadesDesenvolvidas.getText();//retorno[8] = "Atividades";
        item[9] = txt_generoAtividade.getText();        //retorno[9] = "generoAtivi";
        item[10] = txt_especieAtividade.getText();      //retorno[10] = "especialAtividade";
        item[11] = txt_CEP.getText();                   //retorno[11] = "14545-010";
        item[12] = txt_numero.getText();                //retorno[12] = "20";
        item[13] = txt_complemento.getText();           //retorno[13] = "complemento";
        item[14] = txt_logradouro.getText();            //retorno[14] = "logrado";
        item[15] = txt_bairro.getText();                //retorno[15] = "bairro";
        item[16] = txt_cidade.getText();                //retorno[16] = "cidade";
        item[17] = txt_estado.getText();                //retorno[17] = "es";
        item[18] = txt_pais.getText();                  //retorno[18] = "bra";
        item[19] = txt_CPF.getText();                   //retorno[19] = "431.316.038-87";
        item[20] = txt_nomeRepresentante.getText();     //retorno[20] = "nome rep";
        item[21] = txt_foneReprese.getText();           //retorno[21] = "9999-8888";

        boolean re = mRegistro.inserir(item, usuario, senha);//erro

        if (re == true) {
            JOptionPane.showMessageDialog(rootPane, "Dados inseridos com sucesso");
            limpar();
            txt_razaoSocial.requestFocus();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Houve um erro");
        }

        //System.out.println(re);
        //System.out.println(mRegistro.inserir(retorno));
        //testar do retorno
//        JOptionPane.showMessageDialog(rootPane, item[0]);
//        JOptionPane.showMessageDialog(rootPane, item[1]);
//        JOptionPane.showMessageDialog(rootPane, item[2]);
//        JOptionPane.showMessageDialog(rootPane, item[3]);
//        JOptionPane.showMessageDialog(rootPane, item[4]);
//        JOptionPane.showMessageDialog(rootPane, item[5]);
//        JOptionPane.showMessageDialog(rootPane, item[6]);
//        JOptionPane.showMessageDialog(rootPane, item[7]);
//        JOptionPane.showMessageDialog(rootPane, item[8]);
//        JOptionPane.showMessageDialog(rootPane, item[9]);
//        JOptionPane.showMessageDialog(rootPane, item[10]);
//        JOptionPane.showMessageDialog(rootPane, item[11]);
//        JOptionPane.showMessageDialog(rootPane, item[12]);
//        JOptionPane.showMessageDialog(rootPane, item[13]);
//        JOptionPane.showMessageDialog(rootPane, item[14]);
//        JOptionPane.showMessageDialog(rootPane, item[15]);
//        JOptionPane.showMessageDialog(rootPane, item[16]);
//        JOptionPane.showMessageDialog(rootPane, item[17]);
//        JOptionPane.showMessageDialog(rootPane, item[18]);
//        JOptionPane.showMessageDialog(rootPane, item[19]);
//        JOptionPane.showMessageDialog(rootPane, item[20]);
//        JOptionPane.showMessageDialog(rootPane, item[21]);
    }

    public void alterar() throws RemoteException, NotBoundException, MalformedURLException {
        MensageiroRegistro mRegistro = null;
        LocateRegistry.getRegistry("192.168.0.103");//F
        mRegistro = (MensageiroRegistro) Naming.lookup("rmi://localhost:14003/MensageiroRegistro");

        String[] itens = new String[22];

        itens[0] = txt_CNPJ.getText();
        itens[1] = txt_razaoSocial.getText();
        itens[2] = txt_nomeFantasia.getText();
        itens[3] = txt_telefone.getText();
        itens[4] = txt_inscMunicipal.getText();
        itens[5] = txt_inscEstadual.getText();
        itens[6] = txt_email.getText();
        itens[7] = txt_dataConstituicao.getText();
        itens[8] = txt_atividadesDesenvolvidas.getText();
        itens[9] = txt_generoAtividade.getText();
        itens[10] = txt_especieAtividade.getText();
        itens[11] = txt_CEP.getText();
        itens[12] = txt_numero.getText();
        itens[13] = txt_complemento.getText();
        itens[14] = txt_logradouro.getText();
        itens[15] = txt_bairro.getText();
        itens[16] = txt_cidade.getText();
        itens[17] = txt_estado.getText();
        itens[18] = txt_pais.getText();
        itens[19] = txt_CPF.getText();
        itens[20] = txt_nomeRepresentante.getText();
        itens[21] = txt_foneReprese.getText();

        boolean val = mRegistro.alterar(itens, usuario, senha);

        if (val == true) {
            JOptionPane.showMessageDialog(rootPane, "Alterado com sucesso");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro ao alterar");
        }

    }

    public void excluir() throws RemoteException, NotBoundException, MalformedURLException {
        MensageiroRegistro mRegistro = null;
        LocateRegistry.getRegistry("192.168.0.103");//F
        mRegistro = (MensageiroRegistro) Naming.lookup("rmi://localhost:14003/MensageiroRegistro");

        String[] itens = new String[22];

        itens[0] = txt_CNPJ.getText();
        itens[1] = txt_razaoSocial.getText();
        itens[2] = txt_nomeFantasia.getText();
        itens[3] = txt_telefone.getText();
        itens[4] = txt_inscMunicipal.getText();
        itens[5] = txt_inscEstadual.getText();
        itens[6] = txt_email.getText();
        itens[7] = txt_dataConstituicao.getText();
        itens[8] = txt_atividadesDesenvolvidas.getText();
        itens[9] = txt_generoAtividade.getText();
        itens[10] = txt_especieAtividade.getText();
        itens[11] = txt_CEP.getText();
        itens[12] = txt_numero.getText();
        itens[13] = txt_complemento.getText();
        itens[14] = txt_logradouro.getText();
        itens[15] = txt_bairro.getText();
        itens[16] = txt_cidade.getText();
        itens[17] = txt_estado.getText();
        itens[18] = txt_pais.getText();
        itens[19] = txt_CPF.getText();
        itens[20] = txt_nomeRepresentante.getText();
        itens[21] = txt_foneReprese.getText();

        boolean val = mRegistro.excluir(itens, usuario, senha);

        if (val == true) {
            JOptionPane.showMessageDialog(rootPane, "Excluido com sucesso");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro ao excluir");
        }

    }

    public void procurar() throws RemoteException, NotBoundException, MalformedURLException {
        //MensageiroRegistro mRegistro = null;

        //LocateRegistry.getRegistry("192.168.0.103");//F
        //LocateRegistry.getRegistry("192.168.56.1");//F
        LocateRegistry.getRegistry("127.0.0.1");
        MensageiroRegistro mRegistro = (MensageiroRegistro) Naming.lookup("rmi://localhost:14003/MensageiroRegistro");

        String[] itens = new String[22];
        itens = mRegistro.procurar(txt_CNPJ.getText(), usuario, senha);

        if (itens == null) {
            JOptionPane.showMessageDialog(rootPane, "Nunhum cadastro encontrado");
            return;
        } else {
            txt_razaoSocial.setText(itens[1]);
            txt_nomeFantasia.setText(itens[2]);
            txt_telefone.setText(itens[3]);
            txt_inscMunicipal.setText(itens[4]);
            txt_inscEstadual.setText(itens[5]);
            txt_email.setText(itens[6]);
            txt_dataConstituicao.setText(itens[7]);
            txt_atividadesDesenvolvidas.setText(itens[8]);
            txt_generoAtividade.setText(itens[9]);
            txt_especieAtividade.setText(itens[10]);
            txt_CEP.setText(itens[11]);
            txt_numero.setText(itens[12]);
            txt_complemento.setText(itens[13]);
            txt_logradouro.setText(itens[14]);
            txt_bairro.setText(itens[15]);
            txt_cidade.setText(itens[16]);
            txt_estado.setText(itens[17]);
            txt_pais.setText(itens[18]);
            txt_CPF.setText(itens[19]);
            txt_nomeRepresentante.setText(itens[20]);
            txt_foneReprese.setText(itens[21]);
        }

        habilitarBotoes();
    }

    public void sair() {
        MensageiroAcesso mAcesso = null;
        try {
            //MensageiroAcesso
            //LocateRegistry.getRegistry("127.0.0.1");
            //LocateRegistry.getRegistry("192.168.58.1");//F
            LocateRegistry.getRegistry("192.168.56.1");//F
            mAcesso = (MensageiroAcesso) Naming.lookup("rmi://localhost:14001/MensageiroAcesso");

            mAcesso.sair();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
    }

    public void listar() {

        MensageiroRegistro mRegistro = null;

        try {
            //LocateRegistry.getRegistry("127.0.0.1");
            //LocateRegistry.getRegistry("192.168.58.1");//Fabio
            LocateRegistry.getRegistry("192.168.56.1");//F
            Object[][] lTudo = new Object[25][20];
            mRegistro = (MensageiroRegistro) Naming.lookup("rmi://localhost:14003/MensageiroRegistro");

            //lTudo = mRegistro.listar();
            for (Object ver : lTudo) {
                System.out.println(ver.toString());

            }

            for (int i = 1; lTudo.length <= i; i++) {
                System.out.println(lTudo.toString());//apenas um teste
            }

        } catch (RemoteException | NotBoundException | MalformedURLException ex) {
            Logger.getLogger(FormConsulta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println(ex);//pega tudo
        }

    }

    public void preenchetabela() throws RemoteException, NotBoundException, MalformedURLException {
        MensageiroRegistro mR = null;
        LocateRegistry.getRegistry("192.168.56.1");//Fabio
        mR = (MensageiroRegistro) Naming.lookup("rmi://localhost:14003/MensageiroRegistro");
        Object[][] retorno = mR.listar();

        //Cabeçalho
        Vector cabecalho = new Vector();
        cabecalho.add("CNPJ");
        cabecalho.add("Razão Social");
        cabecalho.add("Nome Fantasia");
        cabecalho.add("Telefone");
        cabecalho.add("Inscrição Municipal");
        cabecalho.add("Inscrição Estadual");
        cabecalho.add("E-mail");
        cabecalho.add("Data de Constituição");
        cabecalho.add("Atividades Exercidas");
        cabecalho.add("Gênero da Atividade");
        //cabecalho.add("Espécie de Atividade");
        cabecalho.add("CEP");
        cabecalho.add("Número");
        cabecalho.add("Complemento");
        cabecalho.add("Logradouro");
        cabecalho.add("Bairro");
        cabecalho.add("Cidade");
        cabecalho.add("Estado");
        cabecalho.add("País");
        cabecalho.add("Nome do representante");

        //Itens
        Vector dados = new Vector();
        Vector item = null;

        if (retorno != null) {
            System.out.println(retorno.length);
            for (int i = 0; i < retorno.length; i++) {
                item = new Vector();
                
                item.add(retorno[i][0]);
                item.add(retorno[i][1]);
                item.add(retorno[i][2]);
                item.add(retorno[i][3]);
                item.add(retorno[i][4]);
                item.add(retorno[i][5]);
                item.add(retorno[i][6]);
                item.add(retorno[i][7]);
                item.add(retorno[i][8]);
                item.add(retorno[i][9]);
                //item.add(retorno[i][10]);
                item.add(retorno[i][11]);
                item.add(retorno[i][12]);
                item.add(retorno[i][13]);
                item.add(retorno[i][14]);
                item.add(retorno[i][15]);
                item.add(retorno[i][16]);
                item.add(retorno[i][17]);
                item.add(retorno[i][18]);
                //item.add(retorno[i][19]);
                item.add(retorno[i][20]);
                //item.add(retorno[i][21]);
                
                dados.add(item);

            }
        } else {
            System.out.println("Sem resultados ou problema.");
        }

        DefaultTableModel modeloTabela = new DefaultTableModel();
        modeloTabela.setDataVector(dados, cabecalho);
        tb_cadastrados.setModel(modeloTabela);
    }

    public void habilitarBotoes() {
        btn_alterar.setEnabled(true);
        btn_excluir.setEnabled(true);

        btn_inserir.setEnabled(false);
        txt_CNPJ.setEditable(false);
    }

    public void desabilitarBotoes() {
        btn_alterar.setEnabled(false);
        btn_excluir.setEnabled(false);

        btn_inserir.setEnabled(true);
        txt_CNPJ.setEditable(true);
    }

    public void limpar() {
        txt_CEP.setText("");
        txt_CNPJ.setText("");
        txt_CPF.setText("");
        txt_atividadesDesenvolvidas.setText("");
        txt_bairro.setText("");
        txt_cidade.setText("");
        txt_dataConstituicao.setText("");
        txt_email.setText("");
        txt_complemento.setText("");
        txt_especieAtividade.setText("");
        txt_estado.setText("");
        txt_foneReprese.setText("");
        txt_generoAtividade.setText("");
        txt_inscEstadual.setText("");
        txt_inscMunicipal.setText("");
        txt_nomeFantasia.setText("");
        txt_nomeRepresentante.setText("");
        txt_pais.setText("");
        txt_razaoSocial.setText("");
        txt_telefone.setText("");
        txt_logradouro.setText("");
        txt_numero.setText("");

        desabilitarBotoes();

    }

    public boolean varificaBranco() {
        if ("     -   ".equals(txt_CEP.getText()) || "  .   .   /    -  ".equals(txt_CNPJ.getText()) || "   .   .   -  ".equals(txt_CPF.getText())
                || "".equals(txt_atividadesDesenvolvidas.getText()) || "".equals(txt_bairro.getText()) || "".equals(txt_cidade.getText())
                || "".equals(txt_dataConstituicao.getText()) || "".equals(txt_email.getText()) || "".equals(txt_complemento.getText())
                || "".equals(txt_especieAtividade.getText()) || "".equals(txt_estado.getText()) || "".equals(txt_foneReprese.getText())
                || "".equals(txt_generoAtividade.getText()) || "".equals(txt_inscEstadual.getText()) || "".equals(txt_inscMunicipal.getText())
                || "".equals(txt_nomeFantasia.getText()) || "".equals(txt_nomeRepresentante.getText())
                || "".equals(txt_pais.getText()) || "".equals(txt_razaoSocial.getText()) || "".equals(txt_telefone.getText())) {
            return false;
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_inserir;
    private javax.swing.JButton btn_procurar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_cadastrados;
    private javax.swing.JFormattedTextField txt_CEP;
    private javax.swing.JFormattedTextField txt_CNPJ;
    private javax.swing.JFormattedTextField txt_CPF;
    private javax.swing.JTextField txt_atividadesDesenvolvidas;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_complemento;
    private javax.swing.JFormattedTextField txt_dataConstituicao;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_especieAtividade;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_foneReprese;
    private javax.swing.JTextField txt_generoAtividade;
    private javax.swing.JTextField txt_inscEstadual;
    private javax.swing.JTextField txt_inscMunicipal;
    private javax.swing.JTextField txt_logradouro;
    private javax.swing.JTextField txt_nomeFantasia;
    private javax.swing.JTextField txt_nomeRepresentante;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_pais;
    private javax.swing.JTextField txt_razaoSocial;
    private javax.swing.JTextField txt_telefone;
    // End of variables declaration//GEN-END:variables
}
