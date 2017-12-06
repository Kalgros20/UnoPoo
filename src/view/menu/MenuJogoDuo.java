package view.menu;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import unopoo.Partida;

/**
 *
 * @author KENJI
 */
public class MenuJogoDuo extends javax.swing.JFrame {
    
    public  MenuPrincipal telaAnterior;
    public  Partida       partida       = new Partida(this);
    public  JLabel[]      labelArray    = new JLabel[21];

    public MenuJogoDuo(MenuPrincipal menu) {
        setLabelArray();
        this.telaAnterior = menu;
        initComponents();
        partida.comecarJogo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        maoJogadorAtual = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        discarte = new javax.swing.JPanel();
        topOfDiscardPile = new javax.swing.JLabel();
        botaoPassa = new javax.swing.JButton();
        botaoCompra = new javax.swing.JButton();
        botaoUYNO = new javax.swing.JButton();
        maoJogador1 = new javax.swing.JLabel();
        maoJogador2 = new javax.swing.JLabel();
        jogadorAtual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel1.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel1.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel2.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel2.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel3.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel3.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel5.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel5.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel6.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel6.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel7.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel7.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel8.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel8.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel9.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel9.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel9.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel10.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel10.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel10.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel13.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel13.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel13.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel4.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel4.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel14.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel14.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel14.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel15.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel15.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel15.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel16.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel16.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel16.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel17.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel17.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel17.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel18.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel18.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel18.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel19.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel19.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel19.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel20.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel20.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel20.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel21.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel21.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel21.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel11.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel11.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel11.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Yellow0.JPG"))); // NOI18N
        jLabel12.setMaximumSize(new java.awt.Dimension(40, 63));
        jLabel12.setMinimumSize(new java.awt.Dimension(40, 63));
        jLabel12.setPreferredSize(new java.awt.Dimension(40, 63));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout maoJogadorAtualLayout = new javax.swing.GroupLayout(maoJogadorAtual);
        maoJogadorAtual.setLayout(maoJogadorAtualLayout);
        maoJogadorAtualLayout.setHorizontalGroup(
            maoJogadorAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maoJogadorAtualLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(maoJogadorAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(maoJogadorAtualLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(maoJogadorAtualLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(maoJogadorAtualLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        maoJogadorAtualLayout.setVerticalGroup(
            maoJogadorAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maoJogadorAtualLayout.createSequentialGroup()
                .addGroup(maoJogadorAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(maoJogadorAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(maoJogadorAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(maoJogadorAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(maoJogadorAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(maoJogadorAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        topOfDiscardPile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unopoo/images/Red0.png"))); // NOI18N
        topOfDiscardPile.setMaximumSize(new java.awt.Dimension(40, 63));
        topOfDiscardPile.setMinimumSize(new java.awt.Dimension(40, 63));
        topOfDiscardPile.setPreferredSize(new java.awt.Dimension(40, 63));

        javax.swing.GroupLayout discarteLayout = new javax.swing.GroupLayout(discarte);
        discarte.setLayout(discarteLayout);
        discarteLayout.setHorizontalGroup(
            discarteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
            .addGroup(discarteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(discarteLayout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(topOfDiscardPile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(51, Short.MAX_VALUE)))
        );
        discarteLayout.setVerticalGroup(
            discarteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
            .addGroup(discarteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(discarteLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(topOfDiscardPile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
        );

        botaoPassa.setText("Passar");
        botaoPassa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPassaActionPerformed(evt);
            }
        });

        botaoCompra.setText("Comprar");
        botaoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCompraActionPerformed(evt);
            }
        });

        botaoUYNO.setText("UNO!!!!");
        botaoUYNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUYNOActionPerformed(evt);
            }
        });

        maoJogador1.setBackground(new java.awt.Color(102, 0, 102));
        maoJogador1.setForeground(new java.awt.Color(204, 0, 204));
        maoJogador1.setMaximumSize(new java.awt.Dimension(200, 50));
        maoJogador1.setMinimumSize(new java.awt.Dimension(200, 50));
        maoJogador1.setPreferredSize(new java.awt.Dimension(200, 50));

        maoJogador2.setBackground(new java.awt.Color(102, 0, 102));
        maoJogador2.setForeground(new java.awt.Color(204, 0, 204));
        maoJogador2.setMaximumSize(new java.awt.Dimension(200, 50));
        maoJogador2.setMinimumSize(new java.awt.Dimension(200, 50));
        maoJogador2.setPreferredSize(new java.awt.Dimension(200, 50));

        jogadorAtual.setBackground(new java.awt.Color(102, 0, 102));
        jogadorAtual.setForeground(new java.awt.Color(204, 0, 204));
        jogadorAtual.setMaximumSize(new java.awt.Dimension(200, 50));
        jogadorAtual.setMinimumSize(new java.awt.Dimension(200, 50));
        jogadorAtual.setPreferredSize(new java.awt.Dimension(200, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(maoJogadorAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maoJogador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(maoJogador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoPassa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(149, 149, 149)
                        .addComponent(discarte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addComponent(botaoUYNO, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addComponent(jogadorAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(maoJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(maoJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addComponent(botaoUYNO, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botaoPassa, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(botaoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(discarte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jogadorAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(maoJogadorAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        partida.descartaCarta(1);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        partida.descartaCarta(2);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        partida.descartaCarta(4);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        partida.descartaCarta(5);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        partida.descartaCarta(6);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        partida.descartaCarta(7);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        partida.descartaCarta(8);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        partida.descartaCarta(9);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        partida.descartaCarta(12);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        partida.descartaCarta(3);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        partida.descartaCarta(13);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        partida.descartaCarta(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void botaoPassaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPassaActionPerformed
        partida.passaTurno();
    }//GEN-LAST:event_botaoPassaActionPerformed

    
    
    
    private void botaoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCompraActionPerformed
        partida.botaoComprar();
    }//GEN-LAST:event_botaoCompraActionPerformed

    /*
        BOTÂO UNO!
    */
    
    private void botaoUYNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUYNOActionPerformed
        if (partida.validaUNO()){
            
            JOptionPane.showMessageDialog(null, "UNO declarado!!", "Agora o bicho pega...", JOptionPane.INFORMATION_MESSAGE);
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Ta maluco? tem mais cartas nessa mão", "Sabe contar não?", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoUYNOActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        partida.descartaCarta(14);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
         partida.descartaCarta(15);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
         partida.descartaCarta(16);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
         partida.descartaCarta(17);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
         partida.descartaCarta(18);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
         partida.descartaCarta(19);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
         partida.descartaCarta(20);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        partida.descartaCarta(10);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
         partida.descartaCarta(11);
    }//GEN-LAST:event_jLabel12MouseClicked

    /*
        Metodos Auxiliares
    */
    
    public void apagaBotaoCompra(){
        this.botaoCompra.setVisible(false);
        this.botaoPassa.setVisible(true);
    }
    
    public void retornaBotaoCompra(){
        this.botaoCompra.setVisible(true);
        this.botaoPassa.setVisible(false);
    }
    
     public void setTamanhoMaoJogador1(int tamanhoMao){
        maoJogador1.setText("Jogador 1 :  " + tamanhoMao + " carta(s)");
    }
    
    public void setTamanhoMaoJogador2(int tamanhoMao){
        maoJogador2.setText("Jogador 2 :  " + tamanhoMao + " carta(s)");
    }
    
    public void setJogadorAtual(int jogador){
        jogadorAtual.setText("Jogador Atual :  " + jogador);
    }
    
    public void setLabelArray(){
        labelArray[0] = jLabel1;
        labelArray[1] = jLabel2;
        labelArray[2] = jLabel3;
        labelArray[3] = jLabel4;
        labelArray[4] = jLabel5;
        labelArray[5] = jLabel6;
        labelArray[6] = jLabel7;
        labelArray[7] = jLabel8;
        labelArray[8] = jLabel9;
        labelArray[9] = jLabel10;
        labelArray[10] = jLabel11;
        labelArray[11] = jLabel12;
        labelArray[12] = jLabel13;
        labelArray[13] = jLabel14;
        labelArray[14] = jLabel15;
        labelArray[15] = jLabel16;
        labelArray[16] = jLabel17;
        labelArray[17] = jLabel18;
        labelArray[18] = jLabel19;
        labelArray[19] = jLabel20;
        labelArray[20] = jLabel21;
        
    }
    
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
            java.util.logging.Logger.getLogger(MenuJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCompra;
    private javax.swing.JButton botaoPassa;
    private javax.swing.JButton botaoUYNO;
    private javax.swing.JPanel discarte;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jogadorAtual;
    private javax.swing.JLabel maoJogador1;
    private javax.swing.JLabel maoJogador2;
    private javax.swing.JPanel maoJogadorAtual;
    private javax.swing.JLabel topOfDiscardPile;
    // End of variables declaration//GEN-END:variables
}


