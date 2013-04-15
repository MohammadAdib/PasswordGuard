package passwordguard;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class CreateIDGUI extends JDialog
{ 
    public CreateIDGUI()
    {
        super(new javax.swing.JFrame(),true);
        initComponents();
        setLocation(400,200);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IDPanel = new javax.swing.JPanel();
        ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        Title = new javax.swing.JLabel();

        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        IDPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IDKeyReleased(evt);
            }
        });

        jLabel2.setText("Desired username:");

        jLabel3.setText("Select a password:");

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IDPanelLayout = new javax.swing.GroupLayout(IDPanel);
        IDPanel.setLayout(IDPanelLayout);
        IDPanelLayout.setHorizontalGroup(
            IDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IDPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(IDPanelLayout.createSequentialGroup()
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        IDPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, okButton});

        IDPanelLayout.setVerticalGroup(
            IDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IDPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(IDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Title.setFont(new java.awt.Font("Tahoma", 1, 14));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Password Guard ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(IDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        createNewAccount();
        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed
    
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        dispose();
    }//GEN-LAST:event_closeDialog

    private void IDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDKeyReleased
        ID.setText(ID.getText().toLowerCase());
    }//GEN-LAST:event_IDKeyReleased

    public boolean NewIDCreated()
    {
        return status;
    }

     public String getUsername()
    {
        return username;
    }
     
      public String getPassword()
    {
        return rawPass;
    }
    
    private void createNewAccount()
    {
        LinkedList<String> lines = new LinkedList<String>(); String s;
        username=ID.getText();
        rawPass="";
        for(int i=0;i<Password.getPassword().length;i++)
        {
            rawPass+=Password.getPassword()[i];
        }
        password = encrypt(rawPass);
        try
        {
            createDirIfNeeded();
            File output = new File(getAppDataPath()+"\\Password Guard\\"+username+"\\Dat.txt");
            if(checkFileDoesNotExist(output))
            {
                PrintWriter newFile = new PrintWriter(output);
                newFile.println(password);
                newFile.close();
                status = SUCCESSFULLY_CREATED;
                JOptionPane.showMessageDialog(null,"Account successfully created!");
            }
        }catch(Exception e)
        {
            String error = "Error occured while trying to create a new account.\nSorry for the inconvenience, please try again.";
            displayError(error,"Error creating account");
        }
    }

    private void displayError(String error,String title)
    {
        JOptionPane.showMessageDialog(null,error,title,JOptionPane.ERROR_MESSAGE);
    }

    private void createDirIfNeeded()
    {
        if(!new File(getAppDataPath()+"\\Password Guard\\"+username).exists())
            {
                String FilePath = getAppDataPath()+"\\Password Guard\\"+username;
                new File(FilePath).mkdirs();
            }
    }

    private boolean checkFileDoesNotExist(File checkMe)
    {
        if(checkMe.exists())
        {
            String error = "Error: Account already exists!";
            displayError(error,"Cannot create account");
            return false;
        }
        return true;
    }

    private String getAppDataPath()
    {
    ProcessBuilder builder = new ProcessBuilder(new String[]{"cmd", "/C echo %APPDATA%"});
    BufferedReader br = null;
    try {
        Process start = builder.start();
        br = new BufferedReader(new InputStreamReader(start.getInputStream()));
        String path = br.readLine();
        if(path.endsWith("\"")){
            path = path.substring(0, path.length()-1);
        }
        return path;
    } catch (IOException ex) {
        System.out.println("Cannot get Application Data Folder");
    }
    return null;
    }

    private String encrypt(String x)
    {
        int ascii=0; String result="";
        for(int i=0;i<x.length();i++)
        {
            ascii = (int) x.charAt(i);
            result+=ascii+" ";
        }        
        return result;
    }    

    private String username,password,rawPass;
    private static final boolean SUCCESSFULLY_CREATED = true;
    private boolean status = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JPanel IDPanel;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel Title;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
   
}
