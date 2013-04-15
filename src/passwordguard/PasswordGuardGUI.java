/*PasswordGuardGUI.java
 *Created on Jun 21, 2011, 9:47:38 PM
 */
package passwordguard;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class PasswordGuardGUI extends javax.swing.JFrame
{

    //Clean methods
    public PasswordGuardGUI(File inFile)
    {
        DataFile = inFile;        
        initComponents();
        readData();        
        UpdateTable();
        setLocation(400,200);
    }

    private void saveData()
    {
        try
        {
            PrintWriter writer = new PrintWriter(DataFile);
            //Rewrite the password
            writer.println(password);
            //Write all the data
            for(int i=0;i<TypeList.size();i++)
            {
                writer.print(TypeList.get(i)+" ");
                writer.print(UserList.get(i)+" ");
                writer.print(PassList.get(i)+" \n");//next line
            }
            writer.close();
            JOptionPane.showMessageDialog(null,"Data saved successfully.");
        }catch(Exception e)
        {
            String error = "Error occured while trying to save.\nSorry for the inconvenience. Please try again.";
            displayError(error,"Saving Failed");
        }
    }

    private void UpdateTable()
    {
        //Update Data
        Data = new String[TypeList.size()][3];
            for(int i=0;i<TypeList.size();i++)
            {
                Data[i][0]=TypeList.get(i);
                Data[i][1]=UserList.get(i);
                Data[i][2]=getPrivate(decrypt(PassList.get(i)));
            }
        //Draw Table
        Table.setModel(new javax.swing.table.DefaultTableModel
        (Data,new String[]{"Type","Username","Password"}));        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ScrollPane = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Remove = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Details = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        PrivacyBt = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        AuthorLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        ChangePassword = new javax.swing.JMenuItem();
        DeleteAccount = new javax.swing.JMenuItem();
        CreateNewID = new javax.swing.JMenuItem();
        Quit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        SaveMenu = new javax.swing.JMenuItem();
        UndoAll = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        InfoGuide = new javax.swing.JMenuItem();
        Credits = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Password Guard");
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        ScrollPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Table.setFont(new java.awt.Font("Arial", 1, 12));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Type", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setRowHeight(20);
        Table.getTableHeader().setReorderingAllowed(false);
        ScrollPane.setViewportView(Table);
        Table.getColumnModel().getColumn(0).setMinWidth(80);
        Table.getColumnModel().getColumn(0).setPreferredWidth(80);
        Table.getColumnModel().getColumn(0).setMaxWidth(200);
        Table.getColumnModel().getColumn(1).setMinWidth(100);
        Table.getColumnModel().getColumn(1).setPreferredWidth(0);
        Table.getColumnModel().getColumn(2).setMinWidth(100);
        Table.getColumnModel().getColumn(2).setPreferredWidth(100);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Remove.setText("Remove");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Details.setText("View Details");
        Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailsActionPerformed(evt);
            }
        });

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Save.setText("Save");
        Save.setEnabled(false);
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        PrivacyBt.setSelected(true);
        PrivacyBt.setText("Privacy Shield");
        PrivacyBt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrivacyBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrivacyBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                    .addComponent(PrivacyBt, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Save, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Edit, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Remove, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PrivacyBt)
                .addGap(5, 5, 5)
                .addComponent(Add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Remove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Details)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Save)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Password Guard");

        AuthorLabel.setFont(new java.awt.Font("Tahoma", 0, 9));
        AuthorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AuthorLabel.setText("Coded by Mohammad Adib 2011");
        AuthorLabel.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AuthorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane, 0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AuthorLabel)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenu3.setText("Account Settings");

        ChangePassword.setText("Change Password");
        ChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePasswordActionPerformed(evt);
            }
        });
        jMenu3.add(ChangePassword);

        DeleteAccount.setText("Delete Account");
        DeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAccountActionPerformed(evt);
            }
        });
        jMenu3.add(DeleteAccount);

        CreateNewID.setText("Create new ID");
        CreateNewID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateNewIDActionPerformed(evt);
            }
        });
        jMenu3.add(CreateNewID);

        jMenu1.add(jMenu3);

        Quit.setText("Sign out / Quit");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });
        jMenu1.add(Quit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        SaveMenu.setText("Save");
        SaveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveMenuActionPerformed(evt);
            }
        });
        jMenu2.add(SaveMenu);

        UndoAll.setText("Undo All");
        UndoAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoAllActionPerformed(evt);
            }
        });
        jMenu2.add(UndoAll);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Help");

        InfoGuide.setText("Info / Guide");
        InfoGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoGuideActionPerformed(evt);
            }
        });
        jMenu4.add(InfoGuide);

        Credits.setText("Credits");
        Credits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditsActionPerformed(evt);
            }
        });
        jMenu4.add(Credits);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

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

    private void PrivacyBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrivacyBtActionPerformed
        if(privacy){privacy=false;}else{privacy=true;}
        UpdateTable();
    }//GEN-LAST:event_PrivacyBtActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        addNew();        
    }//GEN-LAST:event_AddActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        int row = Table.getSelectedRow();
        if(row!=-1)
        {
            TypeList.remove(row);
            UserList.remove(row);
            PassList.remove(row);
            UpdateTable();
            changes=true;
            Save.setEnabled(changes);
        }else{
            String error = "Error: Please select a row to remove it.";
            displayError(error,"Error");
        }
    }//GEN-LAST:event_RemoveActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        int row = Table.getSelectedRow();
        if(row!=-1)
        {
            Edit(TypeList.get(row),UserList.get(row),PassList.get(row),row);
        }else{
            String error = "Error: Please select a row to edit it.";
            displayError(error,"Error");
        }
    }//GEN-LAST:event_EditActionPerformed

    private void DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailsActionPerformed
        int row = Table.getSelectedRow();
        if(row!=-1) {
            DisplayInfo d = new DisplayInfo(TypeList.get(row),UserList.get(row),decrypt(PassList.get(row)));
            d.setVisible(true);
        }else{
            String error = "Error: Please select a row to view its details.";
            displayError(error,"Error");
        }
}//GEN-LAST:event_DetailsActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        saveData();
        changes=false;
        Save.setEnabled(changes);
    }//GEN-LAST:event_SaveActionPerformed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        setAlwaysOnTop(false);        
    }//GEN-LAST:event_jPanel1MouseEntered

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Save changes?", "", 2);
        if(i==0)saveData();System.exit(0);
    }//GEN-LAST:event_QuitActionPerformed

    private void SaveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveMenuActionPerformed
        saveData();
    }//GEN-LAST:event_SaveMenuActionPerformed

    private void UndoAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoAllActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Undo all changes to data since the last save (cannot be undone)?", "Undo All", 2);
        if(i==0)
        {
            readData();
            UpdateTable();
            changes=false;
            Save.setEnabled(changes);
        }
    }//GEN-LAST:event_UndoAllActionPerformed

    private void ChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePasswordActionPerformed
        int j = JOptionPane.showConfirmDialog(null, "Change password (cannot be undone)?", "Account Settings", 2);
        if(j==0)
        {
            try
            {
                password = encrypt(JOptionPane.showInputDialog("Enter new password:"));
                PrintWriter writer = new PrintWriter(DataFile);
                //Rewrite the password
                writer.println(password);
                //Write all the data
                for(int i=0;i<TypeList.size();i++)
                {
                    writer.print(TypeList.get(i)+" ");
                    writer.print(UserList.get(i)+" ");
                    writer.print(PassList.get(i)+" \n");//next line
                }
                writer.close();
                JOptionPane.showMessageDialog(null,"New password has been saved");
            }catch(Exception e)
            {
                String error = "Error: Failed to save new password";
                displayError(error,"Saving Failed");
            }
        }
    }//GEN-LAST:event_ChangePasswordActionPerformed

    private void DeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAccountActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Delete Account and all its contents (cannot be undone)?", "Account Settings", 2);
        if(i==0)
        {            
            try
            {
                PrintWriter deleter = new PrintWriter(DataFile);
                deleter.println("Account Diminished.");
                deleter.close();
                JOptionPane.showMessageDialog(null,"Account deleted successfully. Program will now close.");                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error deleting account. Program will now close.");
            }
            System.exit(0);
        }
    }//GEN-LAST:event_DeleteAccountActionPerformed

    private void CreateNewIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateNewIDActionPerformed
        CreateIDGUI c = new CreateIDGUI();
        c.setVisible(true);
    }//GEN-LAST:event_CreateNewIDActionPerformed

    private void CreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditsActionPerformed
        showCredits();
    }//GEN-LAST:event_CreditsActionPerformed

    private void InfoGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoGuideActionPerformed
        HelpGUI h = new HelpGUI();
        h.setVisible(true);
    }//GEN-LAST:event_InfoGuideActionPerformed

    //Dirty work methods
    private void readData()
    {
        TypeList = new LinkedList<String>();
        UserList = new LinkedList<String>();
        PassList = new LinkedList<String>();  
        try
        {
            //attempt to read files
            BufferedReader LoginFile = new BufferedReader(new FileReader(DataFile));
            //skip first line containing password
            password = LoginFile.readLine();
            //start reading data
            String dummy="",pass="";
            do
            {
                dummy = LoginFile.readLine();
                if(dummy!=null)
                {
                    StringTokenizer ST = new StringTokenizer(dummy);
                    TypeList.add(ST.nextToken());
                    UserList.add(ST.nextToken());
                    while(ST.hasMoreTokens())
                    pass+=(ST.nextToken()+" ");
                    PassList.add(pass);pass="";
                }
            }while(dummy!=null);
            LoginFile.close();            
        }catch(Exception e)
        {
            String error = "Stack:"+e.getMessage();
            displayError(error,"Fatal Error");
            System.exit(0);
        }
    }

    private void addNew()
    {
        AddNewGUI a = new AddNewGUI();
        a.setVisible(true);
        if(a.isAdded())
        {
            TypeList.add(a.getData()[0]);
            UserList.add(a.getData()[1]);
            PassList.add(a.getData()[2]);
            UpdateTable();
            changes=true;
            Save.setEnabled(changes);
        }
    }

    private void Edit(String a, String b, String c, int row)
    {
        EditItemGUI e = new EditItemGUI(a,b,decrypt(c));
        e.setVisible(true);
        if(e.isEdited())
        {
            String[] data = e.getData();
            TypeList=replace(data[0],row,TypeList);
            UserList=replace(data[1],row,UserList);
            PassList=replace(data[2],row,PassList);
            UpdateTable();
            changes=true;
            Save.setEnabled(changes);
        }
    }

    private LinkedList<String> replace(String a, int row, LinkedList<String> List)
    {
        LinkedList<String> dummy = new LinkedList<String>();
        for(int i=0;i<List.size();i++)
            {
                if(i!=row)
                {
                    dummy.add(List.get(i));
                }else{
                    dummy.add(a);
                }
            }
        return dummy;
    }

    private String getPrivate(String x)
    {
        if(!privacy){return x;}
        String result="";
        for(int i=0;i<x.length();i++)
        {
            result+="*";
        }
        return result;
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

    private String decrypt(String toBeParsed)
    {
        try
        {
        char c=' ';String x = "";
        StringTokenizer parser = new StringTokenizer(toBeParsed);
        while(parser.hasMoreTokens())
        {
            c = (char)Integer.parseInt(parser.nextToken());
            x += c;
        }
        return x;
        }catch(Exception e)
        {
            String error = "Stack:"+e.getMessage();
            displayError(error,"Fatal Error");
        }return "Error";
    }

    private void showCredits()
    {
        String creds = "Password Guard\nCreated by Mohammad Adib 2011\nInspired by: Varun Varahabhotla";
        JOptionPane.showMessageDialog(null,creds,"Credits",JOptionPane.INFORMATION_MESSAGE);
    }

      private void displayError(String error,String title)
    {
        JOptionPane.showMessageDialog(null,error,title,JOptionPane.ERROR_MESSAGE);
    }

    private File DataFile; private String password="";
    private LinkedList<String> TypeList;
    private LinkedList<String> UserList;
    private LinkedList<String> PassList;    
    private String[][] Data; private boolean privacy=true,changes;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel AuthorLabel;
    private javax.swing.JMenuItem ChangePassword;
    private javax.swing.JMenuItem CreateNewID;
    private javax.swing.JMenuItem Credits;
    private javax.swing.JMenuItem DeleteAccount;
    private javax.swing.JButton Details;
    private javax.swing.JButton Edit;
    private javax.swing.JMenuItem InfoGuide;
    private javax.swing.JRadioButton PrivacyBt;
    private javax.swing.JMenuItem Quit;
    private javax.swing.JButton Remove;
    private javax.swing.JButton Save;
    private javax.swing.JMenuItem SaveMenu;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JTable Table;
    private javax.swing.JMenuItem UndoAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
