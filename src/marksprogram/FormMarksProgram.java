/*
FormCDCollection.java 
Created by: Lucas N-H
Created on: May 25, 2018
Last edited on: May 28, 2018
*/
package marksprogram;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.ArrayList;
public class FormMarksProgram extends javax.swing.JFrame {
    /**
     * Creates new form FormMarksProgram
     */
    ArrayList <Double> marks = new ArrayList();
    public FormMarksProgram() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        markInput = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        markOutput = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        analyseOutput = new javax.swing.JTextArea();
        sortButton = new javax.swing.JButton();
        analyseButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 222));
        jLabel1.setText("Marks Program");
        jLabel1.setAutoscrolls(true);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel2.setText("Student Mark");

        markInput.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        markOutput.setEditable(false);
        markOutput.setColumns(20);
        markOutput.setRows(5);
        jScrollPane1.setViewportView(markOutput);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        analyseOutput.setEditable(false);
        analyseOutput.setColumns(20);
        analyseOutput.setRows(5);
        jScrollPane2.setViewportView(analyseOutput);

        sortButton.setText("Sort");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        analyseButton.setText("Analyse");
        analyseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(markInput, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(sortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(analyseButton)
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sortButton)
                    .addComponent(analyseButton))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        double marksD = Double.valueOf(markInput.getText());
        if (marksD >= 0 && marksD <= 100) {
            marks.add(marksD);
            displayMarks();
        }
        markInput.setText(null);
    }//GEN-LAST:event_addButtonActionPerformed

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        Collections.sort(marks);
        Collections.reverse(marks);
        displayMarks();
    }//GEN-LAST:event_sortButtonActionPerformed

    private void analyseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyseButtonActionPerformed
        sortButtonActionPerformed(evt);
        DecimalFormat x = new DecimalFormat ("###.##");
        double total = 0;
        for (Double mark : marks) total += mark;
        double average = total / marks.size();
        analyseOutput.setText(null);
        analyseOutput.append("Class average: "+x.format(average)+"%");
        analyseOutput.append("\nMaxium mark: "+marks.get(0)+"%");
        analyseOutput.append("\nMinimum mark: "+marks.get(marks.size()-1)+"%");
        double range = marks.get(0) - marks.get(marks.size()-1);
        analyseOutput.append("\nRange of marks: "+range);
        int lvlGrdR = 0, lvlGrd1m = 0, lvlGrd1 = 0, lvlGrd1p = 0, lvlGrd2m = 0, 
                lvlGrd2 = 0, lvlGrd2p = 0, lvlGrd3m = 0, lvlGrd3 = 0, lvlGrd3p = 0, 
                lvlGrd4m = 0, lvlGrd4 = 0, lvlGrd4p = 0;
        for (Double mark : marks) {
            if (mark >= 0 && mark <= 49) lvlGrdR++;
            else if (mark >= 50 && mark <= 52) lvlGrd1m++;
            else if (mark >= 53 && mark <= 56) lvlGrd1++;
            else if (mark >= 57 && mark <= 59) lvlGrd1p++;
            else if (mark >= 60 && mark <= 62) lvlGrd2m++;
            else if (mark >= 63 && mark <= 66) lvlGrd2++;
            else if (mark >= 67 && mark <= 69) lvlGrd2p++;
            else if (mark >= 70 && mark <= 72) lvlGrd3m++;
            else if (mark >= 73 && mark <= 76) lvlGrd3++;
            else if (mark >= 77 && mark <= 79) lvlGrd3p++;
            else if (mark >= 80 && mark <= 84) lvlGrd4m++;
            else if (mark >= 85 && mark <= 89) lvlGrd4++;
            else if (mark >= 90 && mark <= 100) lvlGrd4p++;
        }
        analyseOutput.append("\nAmount at level 4+: "+lvlGrd4p);
        analyseOutput.append("\nAmount at level 4: "+lvlGrd4);
        analyseOutput.append("\nAmount at level 4-: "+lvlGrd4m);
        analyseOutput.append("\nAmount at level 3+: "+lvlGrd3p);
        analyseOutput.append("\nAmount at level 3: "+lvlGrd3);
        analyseOutput.append("\nAmount at level 3-: "+lvlGrd3m);
        analyseOutput.append("\nAmount at level 2+: "+lvlGrd2p);
        analyseOutput.append("\nAmount at level 2: "+lvlGrd2);
        analyseOutput.append("\nAmount at level 2-: "+lvlGrd2m);
        analyseOutput.append("\nAmount at level 1+: "+lvlGrd1p);
        analyseOutput.append("\nAmount at level 1: "+lvlGrd1);
        analyseOutput.append("\nAmount at level 1-: "+lvlGrd1m);
        analyseOutput.append("\nAmount at level R: "+lvlGrdR);
    }//GEN-LAST:event_analyseButtonActionPerformed
    private void displayMarks() {
        markOutput.setText("Marks:");
        marks.stream().forEach((element) -> {
            markOutput.append("\n"+element+"%");
        });
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
            java.util.logging.Logger.getLogger(FormMarksProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMarksProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMarksProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMarksProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMarksProgram().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton analyseButton;
    private javax.swing.JTextArea analyseOutput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField markInput;
    private javax.swing.JTextArea markOutput;
    private javax.swing.JButton sortButton;
    // End of variables declaration//GEN-END:variables
}
