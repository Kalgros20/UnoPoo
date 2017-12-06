package view.menu;

import unopoo.Partida;

/**
 *
 * @author KENJI
 */
public class MenuJogoDuo extends javax.swing.JFrame {
    
    MenuPrincipal telaAnterior;
    Partida       partida = new Partida(this);

    public MenuJogoDuo(MenuPrincipal menu) {
        this.telaAnterior = menu;
        initComponents();
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
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        discarte = new javax.swing.JPanel();
        topOfDiscardPile = new javax.swing.JLabel();
        endTurnButton = new javax.swing.JButton();
        drawButton = new javax.swing.JButton();
        unoButton = new javax.swing.JButton();
        player1Label = new javax.swing.JLabel();
        player2Label = new javax.swing.JLabel();

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

        javax.swing.GroupLayout maoJogadorAtualLayout = new javax.swing.GroupLayout(maoJogadorAtual);
        maoJogadorAtual.setLayout(maoJogadorAtualLayout);
        maoJogadorAtualLayout.setHorizontalGroup(
            maoJogadorAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maoJogadorAtualLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(maoJogadorAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
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
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(maoJogadorAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(maoJogadorAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

        endTurnButton.setText("Passar");
        endTurnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endTurnButtonActionPerformed(evt);
            }
        });

        drawButton.setText("Comprar");
        drawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawButtonActionPerformed(evt);
            }
        });

        unoButton.setText("UNO!!!!");
        unoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoButtonActionPerformed(evt);
            }
        });

        player1Label.setBackground(new java.awt.Color(102, 0, 102));
        player1Label.setForeground(new java.awt.Color(204, 0, 204));
        player1Label.setMaximumSize(new java.awt.Dimension(200, 50));
        player1Label.setMinimumSize(new java.awt.Dimension(200, 50));
        player1Label.setPreferredSize(new java.awt.Dimension(200, 50));

        player2Label.setBackground(new java.awt.Color(102, 0, 102));
        player2Label.setForeground(new java.awt.Color(204, 0, 204));
        player2Label.setMaximumSize(new java.awt.Dimension(200, 50));
        player2Label.setMinimumSize(new java.awt.Dimension(200, 50));
        player2Label.setPreferredSize(new java.awt.Dimension(200, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(player2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(player1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(endTurnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(drawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(149, 149, 149)
                        .addComponent(discarte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addComponent(unoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(maoJogadorAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(player1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(player2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addComponent(unoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(endTurnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(drawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(discarte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(maoJogadorAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        setDiscardPile(getImage(currentHand[1]));
        controller.discardCard(currentHand[1]);
        if (controller.invalidPlay()){
            setDiscardPile(getImage(controller.getTopOfDeck()));
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        setDiscardPile(getImage(currentHand[2]));
        controller.discardCard(currentHand[2]);
        if (controller.invalidPlay()){
            setDiscardPile(getImage(controller.getTopOfDeck()));
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        setDiscardPile(getImage(currentHand[4]));
        controller.discardCard(currentHand[4]);
        if (controller.invalidPlay()){
            setDiscardPile(getImage(controller.getTopOfDeck()));
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        setDiscardPile(getImage(currentHand[5]));
        controller.discardCard(currentHand[5]);
        if (controller.invalidPlay()){
            setDiscardPile(getImage(controller.getTopOfDeck()));
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        setDiscardPile(getImage(currentHand[6]));
        controller.discardCard(currentHand[6]);
        if (controller.invalidPlay()){
            setDiscardPile(getImage(controller.getTopOfDeck()));
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        setDiscardPile(getImage(currentHand[7]));
        controller.discardCard(currentHand[7]);
        if (controller.invalidPlay()){
            setDiscardPile(getImage(controller.getTopOfDeck()));
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        setDiscardPile(getImage(currentHand[8]));
        controller.discardCard(currentHand[8]);
        if (controller.invalidPlay()){
            setDiscardPile(getImage(controller.getTopOfDeck()));
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        setDiscardPile(getImage(currentHand[9]));
        controller.discardCard(currentHand[9]);
        if (controller.invalidPlay()){
            setDiscardPile(getImage(controller.getTopOfDeck()));
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        setDiscardPile(getImage(currentHand[10]));
        controller.discardCard(currentHand[10]);
        if (controller.invalidPlay()){
            setDiscardPile(getImage(controller.getTopOfDeck()));
        }
    }                                     maoJogadorAtuald jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-LAST:event_jLabel11MouseClicked
        setDiscardPile(getImage(currentHand[11]));//GEN-FIRST:event_jLabel12MouseClicked
        controller.discardCard(currentHand[11]);
        if (controller.invalidPlay()){
            setDiscardPile(getImage(controller.getTopOfDeck()));
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        setDiscardPile(getImage(currentHand[12]));
        controller.discardCard(currentHand[12]);
        if (controller.invalidPlay()){
            setDiscardPile(getImage(controller.getTopOfDeck()));
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        setDiscardPile(getImage(currentHand[3]));
        controller.discardCard(currentHand[3]);
        if (controller.invalidPlay()){
            setDiscardPile(getImage(controller.getTopOfDeck()));
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        setDiscardPile(getImage(currentHand[13]));
        controller.discardCard(currentHand[13]);
        if (controller.invalidPlay()){
            setDiscardPile(getImage(controller.getTopOfDeck()));
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        setDiscardPile(getImage(currentHand[0]));
        controller.discardCard(currentHand[0]);
        if (controller.invalidPlay()){
            setDiscardPile(getImage(controller.getTopOfDeck()));
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void endTurnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endTurnButtonActionPerformed
        controller.endTurn();
    }//GEN-LAST:event_endTurnButtonActionPerformed

    private void drawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawButtonActionPerformed
        controller.draw();
    }//GEN-LAST:event_drawButtonActionPerformed

    private void unoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoButtonActionPerformed
        if (controller.checkUNO()){
            JOptionPane.showMessageDialog(null, "You have won the game! Congratulations!", "You win!", JOptionPane.INFORMATION_MESSAGE);
            hidePanel();
        } else {
            JOptionPane.showMessageDialog(null, "You do not have UNO", "Sorry", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_unoButtonActionPerformed

    
    
    
    
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
    private javax.swing.JPanel discarte;
    private javax.swing.JButton drawButton;
    private javax.swing.JButton endTurnButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel maoJogadorAtual;
    private javax.swing.JLabel player1Label;
    private javax.swing.JLabel player2Label;
    private javax.swing.JLabel topOfDiscardPile;
    private javax.swing.JButton unoButton;
    // End of variables declaration//GEN-END:variables
}
