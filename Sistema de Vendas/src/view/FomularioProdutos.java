
package view;


import dao.ClientesDAO;
import dao.FornecedoresDAO;
import dao.ProdutosDAO;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Clientes;
import model.Fornecedores;
import model.Produtos;
import utilitarios.Utilitarios;

/**
 *
 * @author rodolpho
 */
public class FomularioProdutos extends javax.swing.JFrame {

    /**
     * Creates new form FomularioCliente
     */
    public void listar(){
        ProdutosDAO dao = new ProdutosDAO();
    List<Produtos> lista = dao.Listar();
        
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        dados.setNumRows(0);
        for(Produtos c: lista){
            dados.addRow(new Object[]{
            c.getId(),
            c.getDescricao(),
            c.getPreco(),
            c.getQtdEstoque(),
            c.getFornecedores().getNome()
            });
           
        }
        
    }
        
   
    
    public FomularioProdutos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painel_guias = new javax.swing.JTabbedPane();
        painel_dados_produto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtQtdEstoque = new javax.swing.JTextField();
        cbFornecedor = new javax.swing.JComboBox();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExluir = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        painel_consulta_produto = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtPesquisaProduto = new javax.swing.JTextField();
        tbnPesquisaProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario Produtos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Produtos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setText("Código:");

        txtCodigo.setEditable(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel3.setText("Descrição:");

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyPressed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar_1.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel4.setText("Preço:");

        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        jLabel9.setText("Qtd_Estoque:");

        txtQtdEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdEstoqueActionPerformed(evt);
            }
        });

        cbFornecedor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbFornecedorAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbFornecedorMouseClicked(evt);
            }
        });
        cbFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFornecedorActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add1.png"))); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar_1_1.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        btnExluir.setText("EXCLUIR");
        btnExluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExluirActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/printer.png"))); // NOI18N
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        jLabel10.setText("Fornecedor:");

        javax.swing.GroupLayout painel_dados_produtoLayout = new javax.swing.GroupLayout(painel_dados_produto);
        painel_dados_produto.setLayout(painel_dados_produtoLayout);
        painel_dados_produtoLayout.setHorizontalGroup(
            painel_dados_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dados_produtoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dados_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_dados_produtoLayout.createSequentialGroup()
                        .addGroup(painel_dados_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_dados_produtoLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btnSalvar)
                                .addGap(17, 17, 17)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnImprimir))
                            .addGroup(painel_dados_produtoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painel_dados_produtoLayout.createSequentialGroup()
                        .addGroup(painel_dados_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_dados_produtoLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel_dados_produtoLayout.createSequentialGroup()
                                .addGap(593, 593, 593)
                                .addComponent(btnExluir))
                            .addGroup(painel_dados_produtoLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel_dados_produtoLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 129, Short.MAX_VALUE))))
        );
        painel_dados_produtoLayout.setVerticalGroup(
            painel_dados_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dados_produtoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dados_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dados_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dados_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dados_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(painel_dados_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimir)
                    .addComponent(btnExluir)
                    .addComponent(btnEditar)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo))
                .addContainerGap())
        );

        painel_guias.addTab("Dados de Produtos", painel_dados_produto);

        jLabel15.setText("Descrição:");

        txtPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaProdutoActionPerformed(evt);
            }
        });
        txtPesquisaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaProdutoKeyReleased(evt);
            }
        });

        tbnPesquisaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar_1.png"))); // NOI18N
        tbnPesquisaProduto.setText("Pesquisar");
        tbnPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnPesquisaProdutoActionPerformed(evt);
            }
        });

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "Descrição", "Preço", "Qtd. Estoque", "Fornecedor"
            }
        ));
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);

        javax.swing.GroupLayout painel_consulta_produtoLayout = new javax.swing.GroupLayout(painel_consulta_produto);
        painel_consulta_produto.setLayout(painel_consulta_produtoLayout);
        painel_consulta_produtoLayout.setHorizontalGroup(
            painel_consulta_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_consulta_produtoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tbnPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(373, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        painel_consulta_produtoLayout.setVerticalGroup(
            painel_consulta_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_consulta_produtoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_consulta_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painel_consulta_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPesquisaProduto)
                        .addComponent(tbnPesquisaProduto))
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
        );

        painel_guias.addTab("Consulta de Produtos", painel_consulta_produto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painel_guias)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel_guias))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
      Produtos obj = new Produtos();
      obj.setDescricao(txtDescricao.getText());
      obj.setPreco(Double.valueOf(txtPreco.getText()));
      obj.setQtdEstoque(Integer.valueOf(txtQtdEstoque.getText()));
      obj.setFornecedores((Fornecedores)cbFornecedor.getSelectedItem());
      obj.setId(Integer.valueOf(txtCodigo.getText()));
   
      
      // salvando novo cliente
      ProdutosDAO dao = new ProdutosDAO();
      dao.Editar(obj);
      //limpando a tela para uma nova consulta,
       Utilitarios util = new Utilitarios();
        util.LimpaTela(painel_dados_produto);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
      Produtos obj = new Produtos();
      obj.setDescricao(txtDescricao.getText());
      obj.setPreco(Double.valueOf(txtPreco.getText()));
      obj.setQtdEstoque(Integer.valueOf(txtQtdEstoque.getText()));
      obj.setFornecedores((Fornecedores)cbFornecedor.getSelectedItem());
      // salvando novo cliente
      ProdutosDAO dao = new ProdutosDAO();
      dao.salvarProdutos(obj);
      //limpando a tela para uma nova consulta,
       Utilitarios util = new Utilitarios();
        util.LimpaTela(painel_dados_produto);
      
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
       
        Utilitarios util = new Utilitarios();
        util.LimpaTela(painel_dados_produto);
        
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtQtdEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdEstoqueActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String nome = txtDescricao.getText();
        Produtos obj = new Produtos();
        ProdutosDAO dao = new ProdutosDAO();
        
        obj = dao.buscarProdutos(nome);
        
        if(obj.getDescricao()==null){
            JOptionPane.showMessageDialog(null,"Cliente  não encontrado!");
        
    }     
        
        if(obj.getDescricao()!= null){
            
            txtCodigo.setText(String.valueOf(obj.getId()));
            txtDescricao.setText(obj.getDescricao());
            txtPreco.setText(String.valueOf(obj.getPreco()));
            txtQtdEstoque.setText(String.valueOf(obj.getQtdEstoque()));
            cbFornecedor.setSelectedItem(String.valueOf(obj.getQtdEstoque()));
        }
       
            
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void tbnPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnPesquisaProdutoActionPerformed
        
        String nome = "%"+txtPesquisaProduto.getText()+"%";
        ClientesDAO dao = new ClientesDAO();
    List<Clientes> lista = dao.Filtrar(nome);
        
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        dados.setNumRows(0);
        for(Clientes c: lista){
            dados.addRow(new Object[]{
            c.getId(),
            c.getNome(),
            c.getRg(),
            c.getCpf(),
            c.getEmail(),
            c.getTelefone(),
            c.getCelular(),
            c.getCep(),
            c.getEndereco(),
            c.getNumero(),
            c.getComplemento(),
            c.getBairro(),
            c.getCidade(),
            c.getEstado()
        });
           
        }
    }//GEN-LAST:event_tbnPesquisaProdutoActionPerformed

    private void cbFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFornecedorActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void txtPesquisaProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaProdutoKeyReleased
       String nome = "%"+txtPesquisaProduto.getText()+"%";
        ClientesDAO dao = new ClientesDAO();
    List<Clientes> lista = dao.Filtrar(nome);
        
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        dados.setNumRows(0);
        for(Clientes c: lista){
            dados.addRow(new Object[]{
            c.getId(),
            c.getNome(),
            c.getRg(),
            c.getCpf(),
            c.getEmail(),
            c.getTelefone(),
            c.getCelular(),
            c.getCep(),
            c.getEndereco(),
            c.getNumero(),
            c.getComplemento(),
            c.getBairro(),
            c.getCidade(),
            c.getEstado()
        });
           
        }
    }//GEN-LAST:event_txtPesquisaProdutoKeyReleased

    private void txtDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            String nome = txtDescricao.getText();
        Produtos obj = new Produtos();
        ProdutosDAO dao = new ProdutosDAO();
        
        obj = dao.buscarProdutos(nome);
        
        if(obj.getDescricao()==null){
            JOptionPane.showMessageDialog(null,"Cliente  não encontrado!");
        
        }     
        
        if(obj.getDescricao()!= null){
            
            txtCodigo.setText(String.valueOf(obj.getId()));
            txtDescricao.setText(obj.getDescricao());
            txtPreco.setText(String.valueOf(obj.getPreco()));
            txtQtdEstoque.setText(String.valueOf(obj.getQtdEstoque()));
            cbFornecedor.setSelectedItem(String.valueOf(obj.getQtdEstoque()));
        }
    }
    }//GEN-LAST:event_txtDescricaoKeyPressed

    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
        painel_guias.setSelectedIndex(0);
        txtCodigo.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),0).toString());
        txtDescricao.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),1).toString());
        txtPreco.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),2).toString());
        txtQtdEstoque.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),3).toString());
        
       Fornecedores f = new Fornecedores();
       FornecedoresDAO dao = new FornecedoresDAO();
       
       f = dao.buscarFornecedor(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),4).toString());
       cbFornecedor.removeAllItems();
       cbFornecedor.getModel().setSelectedItem(f);
       
    }//GEN-LAST:event_tabelaProdutosMouseClicked

    private void btnExluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExluirActionPerformed
        Produtos obj = new Produtos();
        
        obj.setId(Integer.valueOf(txtCodigo.getText()));
        ProdutosDAO dao = new ProdutosDAO();
        dao.Excluir(obj);
        
        Utilitarios util = new Utilitarios();
        util.LimpaTela(painel_dados_produto);
    }//GEN-LAST:event_btnExluirActionPerformed

    private void txtPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaProdutoActionPerformed

    private void cbFornecedorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbFornecedorAncestorAdded
        
    }//GEN-LAST:event_cbFornecedorAncestorAdded

    private void tabelaProdutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaProdutosMouseEntered

    private void cbFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbFornecedorMouseClicked
        FornecedoresDAO dao = new FornecedoresDAO();
        
        List<Fornecedores> lista=dao.Listar();
        cbFornecedor.removeAllItems();
        for(Fornecedores f : lista){
            
            cbFornecedor.addItem(f);
        }
    }//GEN-LAST:event_cbFornecedorMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FomularioProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FomularioProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FomularioProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FomularioProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FomularioProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExluir;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painel_consulta_produto;
    private javax.swing.JPanel painel_dados_produto;
    private javax.swing.JTabbedPane painel_guias;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JButton tbnPesquisaProduto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPesquisaProduto;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtdEstoque;
    // End of variables declaration//GEN-END:variables
}