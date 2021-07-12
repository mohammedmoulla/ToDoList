package data;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Main extends javax.swing.JFrame {
    public  String user_name;
    public Main(String Name,String User) {
        initComponents();
         user_name=User;
         NameField.setText(Name);
         this.setLocationRelativeTo(null);
         }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Namelabel1 = new javax.swing.JLabel();
        search1 = new javax.swing.JTextField();
        bsearch1 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        Namelabel = new javax.swing.JLabel();
        NameField = new javax.swing.JLabel();
        bsearch2 = new javax.swing.JButton();
        search2 = new javax.swing.JComboBox();
        Namelabel2 = new javax.swing.JLabel();
        tasks = new javax.swing.JButton();
        Namelabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("القائمة الرئيسية");
        setBackground(new java.awt.Color(0, 204, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        Namelabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Namelabel1.setText("بحث عن");

        bsearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5.jpg"))); // NOI18N
        bsearch1.setToolTipText("بحث");
        bsearch1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsearch1ActionPerformed(evt);
            }
        });

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/15.jpg"))); // NOI18N
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        Namelabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Namelabel.setText("اهلاً بك يا ");

        NameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameField.setForeground(new java.awt.Color(0, 51, 51));

        bsearch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/7.png"))); // NOI18N
        bsearch2.setToolTipText("عرض");
        bsearch2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bsearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsearch2ActionPerformed(evt);
            }
        });

        search2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "الرجاء اختيار طريقة عرض", "اليوم الحالي", "الأسبوع الحالي", "الأولوية", "الحالة" }));

        Namelabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Namelabel2.setText("عرض المهام");

        tasks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tasks.setForeground(new java.awt.Color(51, 0, 102));
        tasks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4.PNG"))); // NOI18N
        tasks.setToolTipText("قائمة المهام");
        tasks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tasksActionPerformed(evt);
            }
        });

        Namelabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Namelabel3.setText("قائمة المهام");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/18.png"))); // NOI18N
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tasks, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bsearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Namelabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(search2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Namelabel2))))
                    .addComponent(Namelabel3))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Namelabel)
                        .addGap(217, 217, 217))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Namelabel)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Namelabel1)
                                    .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(bsearch1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Namelabel2)
                                    .addComponent(search2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(bsearch2)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(Namelabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(tasks)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleParent(this);

        setBounds(0, 0, 675, 442);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed

        JOptionPane.showMessageDialog(rootPane,"تم تسجيل الخروج بنجاح");
        this.dispose();
        Logout logoutframe = new Logout () ;
    }//GEN-LAST:event_logoutActionPerformed

    private void tasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tasksActionPerformed
        Newtask frame = new Newtask(user_name,this) ; 
        this.setVisible(false);
    }//GEN-LAST:event_tasksActionPerformed

    private void bsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsearch1ActionPerformed
        String text = search1.getText();
        if(text.isEmpty())
        JOptionPane.showMessageDialog(rootPane,"لم تحدد شيء للبحث عنه!!");  
        else 
        {
            ResultSet rs = Task.search(text,user_name);
            ResultSet temp=Task.search(text,user_name);
            try 
            {
                if (temp.next())
                {
                    Newsearch searchframe =new  Newsearch (rs,this);
                    this.setVisible(false);
                }
                else
                JOptionPane.showMessageDialog(rootPane, "لم يتم العثور على نتائج!!");
            } catch (SQLException ex) {
            System.out.println(ex.getMessage());
                 }
        }
    }//GEN-LAST:event_bsearch1ActionPerformed

    private void bsearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsearch2ActionPerformed
        int x = search2.getSelectedIndex();
        Filter F;
        ResultSet r=null,temp=null;
        String text=(String)search2.getSelectedItem();;
        if (x!=0)
        {
        switch (x) {
            case 1 : 
                temp=Task.search_today(user_name);
                r=Task.search_today(user_name);
                break;
            case  2 :
                temp=Task.search_week(user_name);
                r=Task.search_week(user_name);
                break ;
            case 3 :
                temp=Task.search_important_all(user_name);
                r=Task.search_important_all(user_name);
                break;
            case 4 :
                temp=Task.search_state(user_name);
                r=Task.search_state(user_name);
                break;
                }//end of switch
            try {
                if (temp.next())
                {
                    F = new Filter( r,user_name,text,this);
                    this.setVisible(false);
                }
                else
                    JOptionPane.showMessageDialog(rootPane, "لم يتم العثور على نتائج!!");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());}
        } else 
            JOptionPane.showMessageDialog(rootPane, "لم تختر طريقة عرض بعد !");
    }//GEN-LAST:event_bsearch2ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main(null,null).setVisible(true);
            }
        });   
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameField;
    private javax.swing.JLabel Namelabel;
    private javax.swing.JLabel Namelabel1;
    private javax.swing.JLabel Namelabel2;
    private javax.swing.JLabel Namelabel3;
    private javax.swing.JButton bsearch1;
    private javax.swing.JButton bsearch2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField search1;
    private javax.swing.JComboBox search2;
    private javax.swing.JButton tasks;
    // End of variables declaration//GEN-END:variables
}
