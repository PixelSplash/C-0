/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import tree.Environment;
import tree.Tree;

/**
 *
 * @author bryam
 */
public class TestFrame extends javax.swing.JFrame {

    /**
     * Creates new form TestFrame
     */
    final JFileChooser fc = new JFileChooser();
    File file;
    String line;
    Scanner scan;
    private JScrollPane jScrollPane2;
    private JTextArea jTextArea2;
    private JPanel jPanel1;
    Global global = new Global();
        
    public TestFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CodePanel = new javax.swing.JTabbedPane();
        TokenPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        TerminalPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        TakensLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        Open = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        Close = new javax.swing.JMenuItem();
        RunMenu = new javax.swing.JMenu();
        Run = new javax.swing.JMenuItem();
        Compile = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(108, 81, 81));

        CodePanel.setBackground(new java.awt.Color(108, 81, 81));

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(108, 81, 81));
        jTextArea4.setColumns(20);
        jTextArea4.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        javax.swing.GroupLayout TokenPanelLayout = new javax.swing.GroupLayout(TokenPanel);
        TokenPanel.setLayout(TokenPanelLayout);
        TokenPanelLayout.setHorizontalGroup(
            TokenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        TokenPanelLayout.setVerticalGroup(
            TokenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(108, 81, 81));
        jTextArea3.setColumns(20);
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout TerminalPanelLayout = new javax.swing.GroupLayout(TerminalPanel);
        TerminalPanel.setLayout(TerminalPanelLayout);
        TerminalPanelLayout.setHorizontalGroup(
            TerminalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TerminalPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        TerminalPanelLayout.setVerticalGroup(
            TerminalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );

        TakensLabel.setBackground(new java.awt.Color(153, 153, 153));
        TakensLabel.setText("                                                   Tokens");
        TakensLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TakensLabel.setVerifyInputWhenFocusTarget(false);

        FileMenu.setText("File");

        Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        FileMenu.add(Open);

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Save.setText("Save");
        FileMenu.add(Save);

        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        FileMenu.add(Close);

        jMenuBar1.add(FileMenu);

        RunMenu.setText("Run");

        Run.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        Run.setText("Run");
        Run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunActionPerformed(evt);
            }
        });
        RunMenu.add(Run);

        Compile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, java.awt.event.InputEvent.CTRL_MASK));
        Compile.setText("Compile");
        Compile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompileActionPerformed(evt);
            }
        });
        RunMenu.add(Compile);

        jMenuBar1.add(RunMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TerminalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(CodePanel))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TokenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TakensLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                        .addGap(2, 2, 2))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CodePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TerminalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(TakensLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TokenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseActionPerformed
   
        
        
    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        int returnVal = fc.showOpenDialog(this);
        file = fc.getSelectedFile();
        try {
            scan = new Scanner(new FileReader(file.getPath()));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setBackground(new Color(108,81,81));
        jTextArea2.setForeground(new Color(255,255,255));
        jScrollPane2.setViewportView(jTextArea2);
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );
        String line = "";
        while (scan.hasNextLine()) {
             line += scan.nextLine() + "\n";
        }
        jTextArea2.setText(line);
        scan.close();
        CodePanel.addTab(file.getName(), jPanel1);
        
    }//GEN-LAST:event_OpenActionPerformed

    private void RunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunActionPerformed
        // TODO add your handling code here:
        try {
                Global.outputs.clear();
                Global.tokenPool.clear();
                // El siguiente comando es para generar los .java del parser:
                // java -jar java-cup-11b.jar -interface -parser parser calc.cup
                String st = jTextArea2.getText();
                Environment env = new Environment();
                Lexer lexer = new Lexer(new StringReader(st));
                parser p = new parser(lexer);

                Symbol s = p.parse();

                Tree tree = (Tree) s.value;

                env.print();
                tree.print();

           
                //System.out.println("SALIDAS:");
                
                tree.eval(env);
                                
                //OutputPool
                line = "";
                ArrayList<String> putsOutput = Global.outputs;
                for(String x : putsOutput){
                    line += x.replace("\"", "");
                }


                jTextArea3.setText(line);
                
                 //TokensPool
                 
                line = "";
                ArrayList<String> tokenPool = Global.tokenPool;
                for(String x : tokenPool){
                    line += x + "\n";
                }
                jTextArea4.setText(line);
                
        } catch (Exception e) {
            jTextArea3.setText("La operación no es válida.");
            System.out.println("Error de parseo.");
            System.out.println(e);
        };
    }//GEN-LAST:event_RunActionPerformed

    private void CompileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompileActionPerformed

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
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Close;
    private javax.swing.JTabbedPane CodePanel;
    private javax.swing.JMenuItem Compile;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenuItem Open;
    private javax.swing.JMenuItem Run;
    private javax.swing.JMenu RunMenu;
    private javax.swing.JMenuItem Save;
    private javax.swing.JLabel TakensLabel;
    private javax.swing.JPanel TerminalPanel;
    private javax.swing.JPanel TokenPanel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}