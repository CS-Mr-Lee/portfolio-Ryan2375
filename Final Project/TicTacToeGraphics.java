/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ryan
 */
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class TicTacToeGraphics extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToeGraphics
     */
    String letter = "X";
    int x=0;
    int o=0; 
    boolean b1Isfilled = false;
    boolean b2Isfilled = false;
    boolean b3Isfilled = false;
    boolean b4Isfilled = false;
    boolean b5Isfilled = false;
    boolean b6Isfilled = false;
    boolean b7Isfilled = false;
    boolean b8Isfilled = false;
    boolean b9Isfilled = false;
    
    public void score()
    {
        PlayerXWins.setText(String.valueOf(x));
        PlayerOWins.setText(String.valueOf(o));
    }
    
    public void whoseTurn()
    {
        if(letter.equalsIgnoreCase("X")) 
        {
            letter="O";
        }
        else
        {
            letter="X";
        }
    }
    
    public void checkWin()
    {
        String tile1 = button1.getText();
        String tile2 = button2.getText();
        String tile3 = button3.getText();
        String tile4 = button4.getText();
        String tile5 = button5.getText();
        String tile6 = button6.getText();
        String tile7 = button7.getText();
        String tile8 = button8.getText();
        String tile9 = button9.getText();
        
        if (tile1 =="X" && tile2=="X" && tile3=="X")
        {
            x++;
            JOptionPane.showMessageDialog(this,"Player X Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            button1.setBackground(Color.RED);
            button2.setBackground(Color.RED);
            button3.setBackground(Color.RED);
            score();
        }
        else if (tile4 =="X" && tile5=="X" && tile6=="X")
        {
            x++;
            JOptionPane.showMessageDialog(this,"Player X Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            button4.setBackground(Color.RED);
            button5.setBackground(Color.RED);
            button6.setBackground(Color.RED);
            score();
        }
        else if (tile7 =="X" && tile8=="X" && tile9=="X")
        {
            x++;
            JOptionPane.showMessageDialog(this,"Player X Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            button7.setBackground(Color.RED);
            button8.setBackground(Color.RED);
            button9.setBackground(Color.RED);
            score();
        }
        else if (tile1 =="X" && tile4=="X" && tile7=="X")
        {
            x++;
            JOptionPane.showMessageDialog(this,"Player X Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            button1.setBackground(Color.RED);
            button4.setBackground(Color.RED);
            button7.setBackground(Color.RED);
            score();
        }
        else if (tile2 =="X" && tile5=="X" && tile8=="X")
        {
            x++;
            JOptionPane.showMessageDialog(this,"Player X Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            button2.setBackground(Color.RED);
            button5.setBackground(Color.RED);
            button8.setBackground(Color.RED);
            score();
        }
        else if (tile3 =="X" && tile6=="X" && tile9=="X")
        {
            x++;
            JOptionPane.showMessageDialog(this,"Player X Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            button3.setBackground(Color.RED);
            button6.setBackground(Color.RED);
            button9.setBackground(Color.RED);
            score();
        }
        else if (tile1 =="X" && tile5=="X" && tile9=="X")
        {
            x++;
            JOptionPane.showMessageDialog(this,"Player X Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            button1.setBackground(Color.RED);
            button5.setBackground(Color.RED);
            button9.setBackground(Color.RED);
            score();
        }
        else if (tile7 =="X" && tile5=="X" && tile3=="X")
        {
            x++;
            JOptionPane.showMessageDialog(this,"Player X Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            button7.setBackground(Color.RED);
            button5.setBackground(Color.RED);
            button3.setBackground(Color.RED);
            score();
        }
        
        
        else if (tile1 =="O" && tile2=="O" && tile3=="O")
        {
            o++;
            JOptionPane.showMessageDialog(this,"Player O Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            button1.setBackground(Color.RED);
            button2.setBackground(Color.RED);
            button3.setBackground(Color.RED);
            score();
        }
        else if (tile4 =="O" && tile5=="O" && tile6=="O")
        {
            o++;
            JOptionPane.showMessageDialog(this,"Player O Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            button4.setBackground(Color.RED);
            button5.setBackground(Color.RED);
            button6.setBackground(Color.RED);
            score();
        }
        else if (tile7 =="O" && tile8=="O" && tile9=="O")
        {
            o++;
            JOptionPane.showMessageDialog(this,"Player O Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            button7.setBackground(Color.RED);
            button8.setBackground(Color.RED);
            button9.setBackground(Color.RED);
            score();
        }
        else if (tile1 =="O" && tile4=="O" && tile7=="O")
        {
            o++;
            JOptionPane.showMessageDialog(this,"Player 0 Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            button1.setBackground(Color.RED);
            button4.setBackground(Color.RED);
            button7.setBackground(Color.RED);
            score();
        }
        else if (tile2 =="O" && tile5=="O" && tile8=="O")
        {
            o++;
            JOptionPane.showMessageDialog(this,"Player O Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            button2.setBackground(Color.RED);
            button5.setBackground(Color.RED);
            button8.setBackground(Color.RED);
            score();
        }
        else if (tile3 =="O" && tile6=="O" && tile9=="O")
        {
            o++;
            JOptionPane.showMessageDialog(this,"Player O Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            button3.setBackground(Color.RED);
            button6.setBackground(Color.RED);
            button9.setBackground(Color.RED);
            score();
        }
        else if (tile1 =="0" && tile5=="0" && tile9=="O")
        {
            o++;
            JOptionPane.showMessageDialog(this,"Player O Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            button1.setBackground(Color.RED);
            button5.setBackground(Color.RED);
            button9.setBackground(Color.RED);
            score();
        }
        else if (tile7 =="O" && tile5=="O" && tile3=="O")
        {
            o++;
            JOptionPane.showMessageDialog(this,"Player O Wins!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            button7.setBackground(Color.RED);
            button5.setBackground(Color.RED);
            button3.setBackground(Color.RED);
            score();
        }
        else if(b1Isfilled==true && b2Isfilled==true&& b3Isfilled==true && b4Isfilled==true && b5Isfilled==true && b6Isfilled==true && b7Isfilled==true && b8Isfilled==true && b9Isfilled==true){
            button7.setBackground(Color.GREEN);
            button5.setBackground(Color.GREEN);
            button3.setBackground(Color.GREEN);
            button1.setBackground(Color.GREEN);
            button2.setBackground(Color.GREEN);
            button4.setBackground(Color.GREEN);
            button6.setBackground(Color.GREEN);
            button8.setBackground(Color.GREEN);
            button9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,"Tie!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public TicTacToeGraphics() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private JFrame frame;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PlayerOWins = new javax.swing.JLabel();
        PlayerXWins = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        reset = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        newGame = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(238, 238, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(238, 238, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBackground(new java.awt.Color(238, 238, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 25)); // NOI18N
        jLabel3.setText("Player O:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 148, 55));

        PlayerOWins.setBackground(new java.awt.Color(255, 255, 255));
        PlayerOWins.setFont(new java.awt.Font("Lucida Grande", 1, 25)); // NOI18N
        PlayerOWins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayerOWins.setText("0");
        PlayerOWins.setOpaque(true);
        jPanel4.add(PlayerOWins, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 148, 55));

        PlayerXWins.setBackground(new java.awt.Color(255, 255, 255));
        PlayerXWins.setFont(new java.awt.Font("Lucida Grande", 1, 25)); // NOI18N
        PlayerXWins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayerXWins.setText("0");
        PlayerXWins.setOpaque(true);
        jPanel4.add(PlayerXWins, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 148, 55));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 25)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Wins");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 148, 55));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 25)); // NOI18N
        jLabel5.setText("Player X:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 148, 55));

        jPanel5.setBackground(new java.awt.Color(238, 238, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exitButton.setText("Exit Game");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        newGame.setFont(new java.awt.Font("Lucida Grande", 1, 25)); // NOI18N
        newGame.setText("New Game");
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(newGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(newGame, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 310, 370));

        jPanel3.setBackground(new java.awt.Color(238, 238, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button5.setFont(new java.awt.Font("Lucida Grande", 0, 25)); // NOI18N
        button5.setMaximumSize(new java.awt.Dimension(100, 29));
        button5.setMinimumSize(new java.awt.Dimension(100, 29));
        button5.setOpaque(true);
        button5.setPreferredSize(new java.awt.Dimension(100, 29));
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        jPanel3.add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 138, 106, 100));

        button6.setFont(new java.awt.Font("Lucida Grande", 0, 25)); // NOI18N
        button6.setMaximumSize(new java.awt.Dimension(100, 29));
        button6.setMinimumSize(new java.awt.Dimension(100, 29));
        button6.setOpaque(true);
        button6.setPreferredSize(new java.awt.Dimension(100, 29));
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        jPanel3.add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 138, 106, 100));

        button4.setFont(new java.awt.Font("Lucida Grande", 0, 25)); // NOI18N
        button4.setMaximumSize(new java.awt.Dimension(100, 29));
        button4.setMinimumSize(new java.awt.Dimension(100, 29));
        button4.setOpaque(true);
        button4.setPreferredSize(new java.awt.Dimension(100, 29));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel3.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 138, 106, 100));

        button7.setFont(new java.awt.Font("Lucida Grande", 0, 25)); // NOI18N
        button7.setMaximumSize(new java.awt.Dimension(100, 29));
        button7.setMinimumSize(new java.awt.Dimension(100, 29));
        button7.setOpaque(true);
        button7.setPreferredSize(new java.awt.Dimension(100, 29));
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        jPanel3.add(button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 244, 106, 100));

        button8.setFont(new java.awt.Font("Lucida Grande", 0, 25)); // NOI18N
        button8.setMaximumSize(new java.awt.Dimension(100, 29));
        button8.setMinimumSize(new java.awt.Dimension(100, 29));
        button8.setOpaque(true);
        button8.setPreferredSize(new java.awt.Dimension(100, 29));
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        jPanel3.add(button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 244, 106, 100));

        button9.setFont(new java.awt.Font("Lucida Grande", 0, 25)); // NOI18N
        button9.setMaximumSize(new java.awt.Dimension(100, 29));
        button9.setMinimumSize(new java.awt.Dimension(100, 29));
        button9.setOpaque(true);
        button9.setPreferredSize(new java.awt.Dimension(100, 29));
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        jPanel3.add(button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 244, 106, 100));

        button1.setFont(new java.awt.Font("Lucida Grande", 0, 25)); // NOI18N
        button1.setMaximumSize(new java.awt.Dimension(100, 29));
        button1.setMinimumSize(new java.awt.Dimension(100, 29));
        button1.setOpaque(true);
        button1.setPreferredSize(new java.awt.Dimension(100, 29));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel3.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 32, 106, 100));

        button2.setFont(new java.awt.Font("Lucida Grande", 0, 25)); // NOI18N
        button2.setMaximumSize(new java.awt.Dimension(100, 29));
        button2.setMinimumSize(new java.awt.Dimension(100, 29));
        button2.setOpaque(true);
        button2.setPreferredSize(new java.awt.Dimension(100, 29));
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel3.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 32, 106, 100));

        button3.setFont(new java.awt.Font("Lucida Grande", 0, 25)); // NOI18N
        button3.setMaximumSize(new java.awt.Dimension(100, 29));
        button3.setMinimumSize(new java.awt.Dimension(100, 29));
        button3.setOpaque(true);
        button3.setPreferredSize(new java.awt.Dimension(100, 29));
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel3.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 32, 106, 100));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 25)); // NOI18N
        jLabel2.setText("Java Tic Tac Toe Game");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -10, 300, 55));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        button3.setText(letter);
        if (b3Isfilled==true){
            if(letter.equalsIgnoreCase("X")){
                button1.setText("O");
                letter = "O";
            }
            else{
                button1.setText("X");
                letter="x";
            }
        }
        b3Isfilled = true;
        whoseTurn();
        checkWin();
    }//GEN-LAST:event_button3ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        button2.setText(letter);
        if (b2Isfilled==true){
            if(letter.equalsIgnoreCase("X")){
                button1.setText("O");
                letter = "O";
            }
            else{
                button1.setText("X");
                letter="x";
            }
        }
        b2Isfilled = true;
        whoseTurn();
        checkWin();
    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        if (b1Isfilled==true){
            if(letter.equalsIgnoreCase("X")){
                button1.setText("O");
                letter = "O";
            }
            else{
                button1.setText("X");
                letter="x";
            }
        }
        
        button1.setText(letter);
        b1Isfilled = true;
        whoseTurn();
        checkWin();
        
        
    }//GEN-LAST:event_button1ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        button9.setText(letter); 
        if (b9Isfilled==true){
            if(letter.equalsIgnoreCase("X")){
                button1.setText("O");
                letter = "O";
            }
            else{
                button1.setText("X");
                letter="x";
            }
        }
        b9Isfilled = true;
        whoseTurn() ;
        checkWin();
    }//GEN-LAST:event_button9ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        button8.setText(letter); 
        if (b8Isfilled==true){
            if(letter.equalsIgnoreCase("X")){
                button1.setText("O");
                letter = "O";
            }
            else{
                button1.setText("X");
                letter="x";
            }
        }
        b8Isfilled = true;
        whoseTurn() ;
        checkWin();
    }//GEN-LAST:event_button8ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        button7.setText(letter); 
        if (b7Isfilled==true){
            if(letter.equalsIgnoreCase("X")){
                button1.setText("O");
                letter = "O";
            }
            else{
                button1.setText("X");
                letter="x";
            }
        }
        b7Isfilled = true;
        whoseTurn() ;
        checkWin();
    }//GEN-LAST:event_button7ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        button4.setText(letter);
        if (b4Isfilled==true){
            if(letter.equalsIgnoreCase("X")){
                button1.setText("O");
                letter = "O";
            }
            else{
                button1.setText("X");
                letter="x";
            }
        }
        b4Isfilled = true;
        whoseTurn() ;
        checkWin();
    }//GEN-LAST:event_button4ActionPerformed

    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameActionPerformed

        PlayerXWins.setText("0");
        PlayerOWins.setText("0");
        x=0;
        o=0;
        
        b1Isfilled = false;
        b2Isfilled = false;
        b3Isfilled = false;
        b4Isfilled = false;
        b5Isfilled = false;
        b6Isfilled = false;
        b7Isfilled = false;
        b8Isfilled = false;
        b9Isfilled = false;

        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        

        button1.setBackground(Color.WHITE);
        button2.setBackground(Color.WHITE);
        button3.setBackground(Color.WHITE);
        button4.setBackground(Color.WHITE);
        button5.setBackground(Color.WHITE);
        button6.setBackground(Color.WHITE);
        button7.setBackground(Color.WHITE);
        button8.setBackground(Color.WHITE);
        button9.setBackground(Color.WHITE);
    }//GEN-LAST:event_newGameActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        frame= new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Tic Tac Toe",
            JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION)
    {
        System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
       
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        
        b1Isfilled = false;
        b2Isfilled = false;
        b3Isfilled = false;
        b4Isfilled = false;
        b5Isfilled = false;
        b6Isfilled = false;
        b7Isfilled = false;
        b8Isfilled = false;
        b9Isfilled = false;

        button1.setBackground(Color.WHITE);
        button2.setBackground(Color.WHITE);
        button3.setBackground(Color.WHITE);
        button4.setBackground(Color.WHITE);
        button5.setBackground(Color.WHITE);
        button6.setBackground(Color.WHITE);
        button7.setBackground(Color.WHITE);
        button8.setBackground(Color.WHITE);
        button9.setBackground(Color.WHITE);
    }//GEN-LAST:event_resetActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        button5.setText(letter);
        if (b5Isfilled==true){
            if(letter.equalsIgnoreCase("X")){
                button1.setText("O");
                letter = "O";
            }
            else{
                button1.setText("X");
                letter="x";
            }
        }
        b5Isfilled = true;
        whoseTurn();
        checkWin();
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        button6.setText(letter);
        if (b6Isfilled==true){
            if(letter.equalsIgnoreCase("X")){
                button1.setText("O");
                letter = "O";
            }
            else{
                button1.setText("X");
                letter="x";
            }
        }
        b6Isfilled = true;
        whoseTurn();
        checkWin();
    }//GEN-LAST:event_button6ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToeGraphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGraphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGraphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGraphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeGraphics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PlayerOWins;
    private javax.swing.JLabel PlayerXWins;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton exitButton;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton newGame;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
