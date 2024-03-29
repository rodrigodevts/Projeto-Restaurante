/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Delivery;

import Clientes.clientes;
import Clientes.frmClientes;
import DAO.ClasseDAO;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Aluno
 */
public class frmDeliveryInicio extends javax.swing.JFrame {

    /**
     * Creates new form frmDeliveryInicio
     */
    public frmDeliveryInicio() {
        initComponents();
        
        if (cd == null){
            cd = new ClasseDAO();
        }
        preenche();
        atualizaTotal();
        
    }
    
    private ClasseDAO cd;
    private String endereco;
    private String troco;
    private String telefone;
    private PreparedStatement stm;
    private ClasseVendaDelivery de;
    private ResultSet rs;
    private Connection con;
    private FormCupomDelivery cupomDelivery;
    private frmClientes frmCli;
    private ClasseDelivery d;
    private frmNovoPedido frmPedido;
    private final DateFormat DATA = new SimpleDateFormat("yyyy-MM-dd");
    private Date data;
    private int aux = 0;
    private int deliveryID = 0;
    private clientes c;
    private final DecimalFormat decimal = new DecimalFormat("0.00");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        pnChamados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbChamados = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbChamadosProdutos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        pnDados = new javax.swing.JPanel();
        lbNomeCliente = new javax.swing.JLabel();
        lbEnderecoCliente = new javax.swing.JLabel();
        lbTelefoneCliente = new javax.swing.JLabel();
        lbTextoNome = new javax.swing.JLabel();
        lbTextoEndereco = new javax.swing.JLabel();
        lbTextoTelefone = new javax.swing.JLabel();
        pnPedido = new javax.swing.JPanel();
        lbTotalPedido = new javax.swing.JLabel();
        lbTextoPrecoTotal = new javax.swing.JLabel();
        lbTextoPrecoTotalGeral = new javax.swing.JLabel();
        lbTotalPedido1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lbTextoPrecoTotal1 = new javax.swing.JLabel();
        pnControle = new javax.swing.JPanel();
        btAddPedido = new javax.swing.JButton();
        btAddUser = new javax.swing.JButton();
        btRefresh = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btImprimir = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        lbLogo = new javax.swing.JLabel();

        setTitle("PubManager - Delivery");
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        pnChamados.setBackground(new java.awt.Color(255, 255, 255));
        pnChamados.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbChamados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbChamados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbChamados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbChamadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbChamados);

        tbChamadosProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbChamadosProdutos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbChamadosProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbChamadosProdutosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbChamadosProdutos);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Load.png"))); // NOI18N
        jButton1.setToolTipText("Finalizar Venda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnChamadosLayout = new javax.swing.GroupLayout(pnChamados);
        pnChamados.setLayout(pnChamadosLayout);
        pnChamadosLayout.setHorizontalGroup(
            pnChamadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChamadosLayout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnChamadosLayout.setVerticalGroup(
            pnChamadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChamadosLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnChamadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pnDados.setBackground(new java.awt.Color(255, 255, 255));
        pnDados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DADOS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));

        lbNomeCliente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lbNomeCliente.setText("NOME:");

        lbEnderecoCliente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lbEnderecoCliente.setText("ENDEREÇO:");

        lbTelefoneCliente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lbTelefoneCliente.setText("TELEFONE:");

        lbTextoNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lbTextoEndereco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbTextoTelefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout pnDadosLayout = new javax.swing.GroupLayout(pnDados);
        pnDados.setLayout(pnDadosLayout);
        pnDadosLayout.setHorizontalGroup(
            pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNomeCliente)
                    .addComponent(lbTelefoneCliente)
                    .addComponent(lbEnderecoCliente))
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(lbTextoTelefone))
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTextoEndereco)
                            .addComponent(lbTextoNome))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnDadosLayout.setVerticalGroup(
            pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeCliente)
                    .addComponent(lbTextoNome))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEnderecoCliente)
                    .addComponent(lbTextoEndereco))
                .addGap(18, 18, 18)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefoneCliente)
                    .addComponent(lbTextoTelefone))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pnPedido.setBackground(new java.awt.Color(255, 255, 255));
        pnPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PEDIDO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lbTotalPedido.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lbTotalPedido.setText("TOTAL DO PEDIDO");

        lbTextoPrecoTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        lbTextoPrecoTotalGeral.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTextoPrecoTotalGeral.setText("R$");

        lbTotalPedido1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lbTotalPedido1.setText("TOTAL DAS VENDAS");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbTextoPrecoTotal1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTextoPrecoTotal1.setText("R$ ");

        javax.swing.GroupLayout pnPedidoLayout = new javax.swing.GroupLayout(pnPedido);
        pnPedido.setLayout(pnPedidoLayout);
        pnPedidoLayout.setHorizontalGroup(
            pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPedidoLayout.createSequentialGroup()
                .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPedidoLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lbTotalPedido))
                    .addGroup(pnPedidoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lbTextoPrecoTotal1)
                        .addGap(34, 34, 34)
                        .addComponent(lbTextoPrecoTotal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTextoPrecoTotalGeral)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPedidoLayout.createSequentialGroup()
                        .addComponent(lbTotalPedido1)
                        .addGap(8, 8, 8)))
                .addGap(57, 57, 57))
        );
        pnPedidoLayout.setVerticalGroup(
            pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPedidoLayout.createSequentialGroup()
                        .addComponent(lbTotalPedido)
                        .addGap(32, 32, 32)
                        .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTextoPrecoTotal)
                            .addComponent(lbTextoPrecoTotal1)))
                    .addGroup(pnPedidoLayout.createSequentialGroup()
                        .addComponent(lbTotalPedido1)
                        .addGap(32, 32, 32)
                        .addComponent(lbTextoPrecoTotalGeral)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pnControle.setBackground(new java.awt.Color(170, 169, 149));

        btAddPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add.png"))); // NOI18N
        btAddPedido.setToolTipText("Abrir Novo Chamado");
        btAddPedido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAddPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddPedidoActionPerformed(evt);
            }
        });

        btAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user_add.png"))); // NOI18N
        btAddUser.setToolTipText("Adiciona Cliente");
        btAddUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddUserActionPerformed(evt);
            }
        });

        btRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Refresh.png"))); // NOI18N
        btRefresh.setToolTipText("Atualizar");
        btRefresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit.png"))); // NOI18N
        btSair.setToolTipText("Voltar");
        btSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imprimir.png"))); // NOI18N
        btImprimir.setToolTipText("Imprime Comanda");
        btImprimir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimirActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "HOJE", "TODOS" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnControleLayout = new javax.swing.GroupLayout(pnControle);
        pnControle.setLayout(pnControleLayout);
        pnControleLayout.setHorizontalGroup(
            pnControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnControleLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btAddPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(btRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnControleLayout.setVerticalGroup(
            pnControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btAddPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btImprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
            .addGroup(pnControleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo Delivery PNG.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnChamados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnControle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbLogo)
                .addGap(18, 18, 18)
                .addComponent(pnControle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnChamados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void atualizaTotal() {
        double aux = 0;
        for (int i = 0; i < tbChamados.getRowCount(); i++) {
            aux += Double.valueOf(String.valueOf(tbChamados.getValueAt(i, 5)).replace(",", "."));
        }
        lbTextoPrecoTotalGeral.setText("R$ "+decimal.format(aux));
    }
    
    public void preenchecampos(){
        lbTextoNome.setText(c.getNome());
        lbTextoEndereco.setText(c.getEndereco());
        lbTextoTelefone.setText(c.getTelefone());
    }
    
    public void limpaDelivery(){
        lbTextoTelefone.setText("");
        lbTextoEndereco.setText("");
        lbTextoNome.setText("");
        lbTextoPrecoTotal.setText("");
        lbTextoPrecoTotalGeral.setText("");
    }
    
    public String retornaData(){
        data = new Date();
        String aux = DATA.format(data);
        return aux;
    }
    public void preenche() {
        String aux2 = "SELECT * FROM delivery WHERE status = 'ABERTO' and dataVenda = '"+retornaData()+"'";

        while (tbChamados.getRowCount() > 0) {
            ((DefaultTableModel) tbChamados.getModel()).removeRow(0);
        }
        ((DefaultTableModel) tbChamados.getModel()).setColumnCount(0);

        tbChamados.setModel(cd.preencheTabela(aux2));
        
        tbChamados.getTableHeader().setReorderingAllowed(false);
                
        tbChamados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        tbChamados.getColumnModel().getColumn(0).setHeaderValue("ID Deliv..");
        tbChamados.getColumnModel().getColumn(1).setHeaderValue("ID Cliente.");
        tbChamados.getColumnModel().getColumn(2).setHeaderValue("Telefone");
        tbChamados.getColumnModel().getColumn(3).setHeaderValue("OBS.");
        tbChamados.getColumnModel().getColumn(4).setHeaderValue("Endereço");
        tbChamados.getColumnModel().getColumn(5).setHeaderValue("Total Pedido");
        tbChamados.getColumnModel().getColumn(6).setHeaderValue("Data");
        tbChamados.getColumnModel().getColumn(7).setHeaderValue("Troco");
        
        tbChamadosProdutos.getTableHeader().resizeAndRepaint();
        
        tbChamados.getColumnModel().getColumn(0).setPreferredWidth(80);
        tbChamados.getColumnModel().getColumn(1).setPreferredWidth(80);
        tbChamados.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbChamados.getColumnModel().getColumn(3).setPreferredWidth(400);
        tbChamados.getColumnModel().getColumn(4).setPreferredWidth(300);
        tbChamados.getColumnModel().getColumn(5).setPreferredWidth(100);
        tbChamados.getColumnModel().getColumn(6).setPreferredWidth(100);
        tbChamados.getColumnModel().getColumn(7).setPreferredWidth(100);
    }
    
    public void preencheTodos() {
        String aux2 = "SELECT * FROM delivery WHERE status = 'ABERTO' ";

        while (tbChamados.getRowCount() > 0) {
            ((DefaultTableModel) tbChamados.getModel()).removeRow(0);
        }
        ((DefaultTableModel) tbChamados.getModel()).setColumnCount(0);

        tbChamados.setModel(cd.preencheTabela(aux2));
        
        tbChamados.getTableHeader().setReorderingAllowed(false);
                
        tbChamados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        tbChamados.getColumnModel().getColumn(0).setHeaderValue("ID Deliv..");
        tbChamados.getColumnModel().getColumn(1).setHeaderValue("ID Cliente.");
        tbChamados.getColumnModel().getColumn(2).setHeaderValue("Telefone");
        tbChamados.getColumnModel().getColumn(3).setHeaderValue("OBS.");
        tbChamados.getColumnModel().getColumn(4).setHeaderValue("Endereço");
        tbChamados.getColumnModel().getColumn(5).setHeaderValue("Total Pedido");
        tbChamados.getColumnModel().getColumn(6).setHeaderValue("Data");
        tbChamados.getColumnModel().getColumn(7).setHeaderValue("Troco");
        
        tbChamadosProdutos.getTableHeader().resizeAndRepaint();
        
        tbChamados.getColumnModel().getColumn(0).setPreferredWidth(80);
        tbChamados.getColumnModel().getColumn(1).setPreferredWidth(80);
        tbChamados.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbChamados.getColumnModel().getColumn(3).setPreferredWidth(400);
        tbChamados.getColumnModel().getColumn(4).setPreferredWidth(300);
        tbChamados.getColumnModel().getColumn(5).setPreferredWidth(100);
        tbChamados.getColumnModel().getColumn(6).setPreferredWidth(100);
        tbChamados.getColumnModel().getColumn(7).setPreferredWidth(100);
    }
    
    public void preenchePedido() {
        
        
        
        String aux2 = "select d.idprodutos, p.descricao, d.qtdproduto,"+
                "d.precoproduto, d.precoproduto * d.qtdproduto from produtodelivery d, produtos p where d.idProdutos = p.idProdutos and  idDelivery = "+deliveryID;

        while (tbChamadosProdutos.getRowCount() > 0) {
            ((DefaultTableModel) tbChamadosProdutos.getModel()).removeRow(0);
        }
        ((DefaultTableModel) tbChamadosProdutos.getModel()).setColumnCount(0);

        tbChamadosProdutos.setModel(cd.preencheTabela(aux2));
        
        tbChamadosProdutos.getTableHeader().setReorderingAllowed(false);
                
        tbChamadosProdutos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        tbChamadosProdutos.getColumnModel().getColumn(0).setHeaderValue("ID Prod..");
        tbChamadosProdutos.getColumnModel().getColumn(1).setHeaderValue("Descrição");
        tbChamadosProdutos.getColumnModel().getColumn(2).setHeaderValue("Qtd.");
        tbChamadosProdutos.getColumnModel().getColumn(3).setHeaderValue("Preço");
        tbChamadosProdutos.getColumnModel().getColumn(4).setHeaderValue("Preço Tot.");
        
        tbChamadosProdutos.getTableHeader().resizeAndRepaint(); 
        
        tbChamadosProdutos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbChamadosProdutos.getColumnModel().getColumn(1).setPreferredWidth(300);
        tbChamadosProdutos.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbChamadosProdutos.getColumnModel().getColumn(3).setPreferredWidth(100); 
        tbChamadosProdutos.getColumnModel().getColumn(4).setPreferredWidth(100);
    }
    
    public void refresh(){
        if (jComboBox1.getSelectedIndex() == 0) {
            preenche();
        } else {
            preencheTodos();
        }

        atualizaTotal();
        lbTextoPrecoTotal.setText("0,00");
        while (tbChamadosProdutos.getRowCount() > 0) {
            ((DefaultTableModel) tbChamadosProdutos.getModel()).removeRow(0);
        }
        limpaDelivery();
    }
    
    private void btAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddUserActionPerformed

        if (frmCli == null){
            frmCli = new frmClientes();
        }
//        this.setEnabled(false);
        frmCli.setVisible(true);
        
    }//GEN-LAST:event_btAddUserActionPerformed

    private void btAddPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddPedidoActionPerformed
        
        if (frmPedido == null){
            frmPedido = new frmNovoPedido();
        }
//        this.setEnabled(false);
        frmPedido.setVisible(true);
    }//GEN-LAST:event_btAddPedidoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void tbChamadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChamadosMouseClicked
        if (c == null){
            c = new clientes();
        }
        
        if (tbChamados.isRowSelected(tbChamados.getSelectedRow())){
            aux = (int)tbChamados.getValueAt(tbChamados.getSelectedRow(), 1);
            lbTextoPrecoTotal.setText((decimal.format(tbChamados.getValueAt(tbChamados.getSelectedRow(), 5))));
            deliveryID = (int)tbChamados.getValueAt(tbChamados.getSelectedRow(), 0);
            endereco = String.valueOf(tbChamados.getValueAt(tbChamados.getSelectedRow(), 4));
            telefone = String.valueOf(tbChamados.getValueAt(tbChamados.getSelectedRow(), 2));
            troco = String.valueOf(tbChamados.getValueAt(tbChamados.getSelectedRow(), 7));
            
            preenchePedido();
            
            
            c.setIdCliente(aux);
            
            if (c.buscaPedido(c)){
                preenchecampos();
        }else{
                JOptionPane.showMessageDialog(this, "Não existe nenhum Cliente\n"+
                        "Cadastrado com este Documento","Cadastro De Clientes",JOptionPane.INFORMATION_MESSAGE);
            }
            
        } 
    }//GEN-LAST:event_tbChamadosMouseClicked
    
    private void btRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshActionPerformed
        refresh();
    }//GEN-LAST:event_btRefreshActionPerformed

    private void tbChamadosProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChamadosProdutosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbChamadosProdutosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tbChamados.isRowSelected(tbChamados.getSelectedRow())) {
            if (JOptionPane.showConfirmDialog(this, "Deseja Finalizar o Chamado Selecionado?",
                    "PubManager.Soft", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                
                if (de == null) {
                    de = new ClasseVendaDelivery();
                }
                de.setIdDelivery(deliveryID);
                de.transferePedidosSelect(de);
                de.transferePedidosInsert(de);
//                de.alteraStatusPedido(de);
//                de.excluiPedido(de);
                refresh();
                limpaDelivery();
            }
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimirActionPerformed
        if (tbChamados.getSelectedRow() != -1) {
            if (cupomDelivery == null) {
                cupomDelivery = new FormCupomDelivery();
            }
            
            cupomDelivery.setEndereco(endereco);
            cupomDelivery.setTelefone(telefone);
            cupomDelivery.setTroco(troco);
            
            cupomDelivery.setModal(true);
            cupomDelivery.setItensPedido((DefaultTableModel) tbChamadosProdutos.getModel());
            String aux = lbTextoPrecoTotal.getText().replaceAll(",", ".");
            cupomDelivery.setTotalDelivery(aux);
            cupomDelivery.setNumDelivery(String.valueOf(deliveryID));
            cupomDelivery.preencheLista();
            
            cupomDelivery.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum Item Vendido!",
                    "PubManager.Soft", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btImprimirActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        refresh();
    }//GEN-LAST:event_formWindowGainedFocus

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedIndex() == 0)
        {
            preenche();
            refresh();
        }else{
            preencheTodos();
            refresh();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmDeliveryInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDeliveryInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDeliveryInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDeliveryInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDeliveryInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddPedido;
    private javax.swing.JButton btAddUser;
    private javax.swing.JButton btImprimir;
    private javax.swing.JButton btRefresh;
    private javax.swing.JButton btSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbEnderecoCliente;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbNomeCliente;
    private javax.swing.JLabel lbTelefoneCliente;
    private javax.swing.JLabel lbTextoEndereco;
    private javax.swing.JLabel lbTextoNome;
    private javax.swing.JLabel lbTextoPrecoTotal;
    private javax.swing.JLabel lbTextoPrecoTotal1;
    private javax.swing.JLabel lbTextoPrecoTotalGeral;
    private javax.swing.JLabel lbTextoTelefone;
    private javax.swing.JLabel lbTotalPedido;
    private javax.swing.JLabel lbTotalPedido1;
    private javax.swing.JPanel pnChamados;
    private javax.swing.JPanel pnControle;
    private javax.swing.JPanel pnDados;
    private javax.swing.JPanel pnPedido;
    private javax.swing.JTable tbChamados;
    private javax.swing.JTable tbChamadosProdutos;
    // End of variables declaration//GEN-END:variables
}
