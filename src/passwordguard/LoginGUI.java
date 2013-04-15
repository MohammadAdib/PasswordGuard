/*PasswordGuardGUI.java
 *Created on Jun 20, 2011, 10:36:03 PM
 */
package passwordguard;
import javax.swing.*;
import java.util.*;
import java.io.*;
public class LoginGUI extends JDialog
{
    public LoginGUI()
    {        
        super(new JFrame(),true);
        try
        {
            UIManager.setLookAndFeel( "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch(Exception e)
        {}
        initComponents();
        setLocation(400,200);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoginLabel = new javax.swing.JPanel();
        Password = new javax.swing.JPasswordField();
        PasswordLabel = new javax.swing.JLabel();
        LoginIDLabel = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        CreateNewID = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        TitleLabel = new javax.swing.JLabel();
        AuthorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Password Guard");
        setForeground(new java.awt.Color(214, 217, 223));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LoginLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        PasswordLabel.setText("Password:");

        LoginIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        LoginIDLabel.setText("Username:");

        ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IDKeyReleased(evt);
            }
        });

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        CreateNewID.setText("Create new ID");
        CreateNewID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateNewIDActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginLabelLayout = new javax.swing.GroupLayout(LoginLabel);
        LoginLabel.setLayout(LoginLabelLayout);
        LoginLabelLayout.setHorizontalGroup(
            LoginLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLabelLayout.createSequentialGroup()
                        .addComponent(Login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CreateNewID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cancel))
                    .addGroup(LoginLabelLayout.createSequentialGroup()
                        .addGroup(LoginLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LoginIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LoginLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))))
                .addContainerGap())
        );
        LoginLabelLayout.setVerticalGroup(
            LoginLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login)
                    .addComponent(CreateNewID)
                    .addComponent(Cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Password Guard Login");

        AuthorLabel.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        AuthorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AuthorLabel.setText("Coded by Mohammad Adib 2011");
        AuthorLabel.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AuthorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AuthorLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Login with ID and Password
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        Login();
    }//GEN-LAST:event_LoginActionPerformed

    //No Uppercase Letters
    private void IDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDKeyReleased
        ID.setText(ID.getText().toLowerCase());
}//GEN-LAST:event_IDKeyReleased

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void CreateNewIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateNewIDActionPerformed
        CreateNewID();
    }//GEN-LAST:event_CreateNewIDActionPerformed

    public boolean isLoggedIn()
    {
        return status;
    }

    private void Login()
    {        
        if(foundUserName()&&passwordMatches())
        {
            status=LOGGEDIN;
            PasswordGuardGUI p = new PasswordGuardGUI(new File(getAppDataPath()+"\\Password Guard\\"+username+"\\Dat.txt"));
            p.setVisible(true); p.toFront();
            dispose();
        }else{          
            String error = "Password does not match.\nPlease try again.";
            displayError(error,"Invalid password");
            password="";
            Password.setText("");            
        }
    }

    private void CreateNewID()
    {
        CreateIDGUI newID = new CreateIDGUI();
        newID.setVisible(true);        
        if(newID.NewIDCreated())
        {
            ID.setText(newID.getUsername());
            Password.setText(newID.getPassword());
        }
    }

    private boolean foundUserName()
    {
        boolean result=false;
        username = ID.getText();
        try
        {
            //create dir ...\AppData\Roaming\Password Guard            
            File usernameFile = new File(getAppDataPath()+"\\Password Guard\\"+username+"\\Dat.txt");
            BufferedReader LoginFile = new BufferedReader(new FileReader(usernameFile));
            parsePassword(LoginFile.readLine());
            result=true;
        }catch(Exception e)
        {
            String error = "Error: The specified account does not exist or has been deleted.";
            displayError(error,"Username Invalid");
            result=false;
        }
        return result;
    }   

    private void parsePassword(String needsParsing)
    {
        char c=' ';
        StringTokenizer parser = new StringTokenizer(needsParsing);
        while(parser.hasMoreTokens())
        {
            c=(char)Integer.parseInt(parser.nextToken());
            password+=c;
        }        
    }   

    private boolean passwordMatches()
    {
        boolean result = true;        
        if(password.length()==Password.getPassword().length)
        {
            for(int i=0;i<Password.getPassword().length;i++)
            {                    
                if(Password.getPassword()[i]!=password.charAt(i))
                {
                   result = false;
                }
            }
            return result;
        }else{
            return false;
        }
    }

    private void displayError(String error,String title)
    {
        JOptionPane.showMessageDialog(null,error,title,JOptionPane.ERROR_MESSAGE);
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
        String error = "Application Data could not be found.";
        displayError(error,"Access Denied");
    }
    return null;
    }

    //Instance variables
    private String
            //String vars:
            pwUnparsed="",
            password="",
            username="";
    private static final boolean
            //Return types
            CANCELED = false,
            LOGGEDIN = true;
    private boolean
            //Returned result
            status = CANCELED;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorLabel;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton CreateNewID;
    private javax.swing.JTextField ID;
    private javax.swing.JButton Login;
    private javax.swing.JLabel LoginIDLabel;
    private javax.swing.JPanel LoginLabel;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
