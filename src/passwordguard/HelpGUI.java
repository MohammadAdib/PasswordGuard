package passwordguard;

public class HelpGUI extends javax.swing.JFrame {

    public HelpGUI()
    {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Dismiss = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Info/Guide");

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n    Password Guard stores all as many of your passwords as you would like. To start adding passwords, press the Add button. A Dialog box should pop-up prompting for the type,username, and password of your new entry. Press the Add button on the pop-up to add the information to the original data. In order to edit an entry, simply select the entry on the table and press the Edit button. A pop-up should appear with the information on the entry pre-entered for you to edit. To save any changes made to your data, click the Save button (also on menu). In order to remove an entry, select it on the Table and click the Remove button. The Privacy radio button hides or shows all of your passwords. It is set to on by default. To access your Account Settings, refer to the File - Account Settings menu. Lastly, if a passwod is too big to view on the table, you may either resize the table, or select the entry and hit the View Details button, which will create a pop-up describing the entries' information with sufficient length for large passwords. Enjoy this free software\nprogrammed by Mohammad Adib 2011.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        Dismiss.setText("Dismiss");
        Dismiss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DismissActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(Dismiss)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Dismiss)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DismissActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DismissActionPerformed
        dispose();
    }//GEN-LAST:event_DismissActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dismiss;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
