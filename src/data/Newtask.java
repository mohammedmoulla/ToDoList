package data;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Newtask extends javax.swing.JFrame {
    boolean t=false;
    String user_name;
    int [] mat;//for id's 
    String [] states = {" ","منخفضة","عادية","متوسطة","عالية","عالية جداً"};
    Main Ma ;
    public Newtask(String User,Main M) {
        Ma=M;
        user_name=User;
        initComponents();
        datePicker1.setDateToToday();
        update();//update the table 
        this.setLocationRelativeTo(null);
        this.setVisible(true);   
    }
    public   void clear ()  {
        DefaultTableModel model = (DefaultTableModel)view.getModel();
        int n=model.getRowCount();
        for (int i=n-1;i>=0; i--)
        model.removeRow(i);
    }
    public  void update () { 
        DefaultTableModel model = (DefaultTableModel)view.getModel();
        ResultSet r = Task.get_all(user_name);
        mat = new int[Task.get_count(user_name)];
        clear();
        int i=0;
        try {
            while (r.next()){
                boolean state =(boolean)r.getBoolean("state");
                String important = states[(int)r.getObject("important")];
                String date =r.getString("date");
                String details = (String)r.getString("details");
                String title = (String)r.getString("taskname");
                int id = (int )r.getObject("taskid");
                mat[i]=id;
                model.addRow(new Object[]{state,important,date,details,title,++i});
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        statefield = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        view = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("قائمة المهام");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jTextArea1.setColumns(1);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(1);
        jTextArea1.setTabSize(1);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "منخفضة", "عادية", "متوسطة", "عالية", "عالية جدا" }));

        jLabel3.setText("الأولوية");

        jLabel4.setText("التاريخ");

        statefield.setText("هل انجزت المهمة بعد ؟");
        statefield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        statefield.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                statefieldItemStateChanged(evt);
            }
        });

        jButton2.setText("حذف مهمة");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("تعديل مهمة");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "منجزة", "الأولوية", "تاريخ التنفيذ", "الوصف", "اسم المهمة", "رقم المهمة"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        view.setShowHorizontalLines(false);
        view.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(view);
        if (view.getColumnModel().getColumnCount() > 0) {
            view.getColumnModel().getColumn(0).setResizable(false);
            view.getColumnModel().getColumn(0).setPreferredWidth(1);
            view.getColumnModel().getColumn(1).setResizable(false);
            view.getColumnModel().getColumn(1).setPreferredWidth(1);
            view.getColumnModel().getColumn(2).setResizable(false);
            view.getColumnModel().getColumn(2).setPreferredWidth(2);
            view.getColumnModel().getColumn(3).setResizable(false);
            view.getColumnModel().getColumn(3).setPreferredWidth(5);
            view.getColumnModel().getColumn(4).setResizable(false);
            view.getColumnModel().getColumn(4).setPreferredWidth(1);
            view.getColumnModel().getColumn(5).setResizable(false);
            view.getColumnModel().getColumn(5).setPreferredWidth(1);
        }

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/17.jpg"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setToolTipText("");

        jLabel1.setText("اسم المهمة");

        jLabel6.setText("عودة>>");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel6MouseMoved(evt);
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        jLabel2.setText("التفاصيل");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/13.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(statefield)
                                .addGap(128, 128, 128))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(39, 39, 39)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(datePicker1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(2, 2, 2)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(statefield)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          DefaultTableModel model = (DefaultTableModel)view.getModel();
          
         String title = jTextField1.getText();
         String details = jTextArea1.getText();
        int priority =jComboBox1.getSelectedIndex()+1;
        String date = datePicker1.getDate().toString();
        Task.insertTask(title, details, date, priority, t, user_name);
        update(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void statefieldItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_statefieldItemStateChanged
        t=!t;
    }//GEN-LAST:event_statefieldItemStateChanged
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model = (DefaultTableModel)view.getModel();
        int x = view.getSelectedRow();
        if (x!=-1){
        int taskid= (int)model.getValueAt(x, 5);
        int n =JOptionPane.showConfirmDialog(rootPane, "هل تريد حذف المهمة"+taskid);
        if (n==0){
            Task.delete_task(mat[taskid-1]);
            update();
            }
        }else
            JOptionPane.showMessageDialog(rootPane, "حدد مهمة لحذفها ");        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel model = (DefaultTableModel)view.getModel();
        int x = view.getSelectedRow();
        if (x!=-1){
        
        int n =JOptionPane.showConfirmDialog(rootPane, "هل تريد تعديل المهمة"+(x+1));
        if (n==0){ 
            int id = mat[x];
            String taskname=(String)model.getValueAt(x, 4);
            String details = (String)model.getValueAt(x, 3);
            String date = (String)model.getValueAt(x, 2);
            int important =1;
            String s = (String)model.getValueAt(x, 1);
            switch (s) {
                case "منخفضة":important=1; break;
                case "عادية":important =2 ; break;
                case "متوسطة": important = 3 ; break;
                case "عالية":important = 4; break;
                case "عالية جدا":important=5; break;
            }
            
            boolean state = (boolean)model.getValueAt(x, 0);
            Task.update(id, taskname, details, date, important, state);
            update();
            }
        }else 
            JOptionPane.showMessageDialog(rootPane, "حدد مهمة لتعديلها ");        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseMoved
        jLabel6.setForeground(Color.BLUE);
    }//GEN-LAST:event_jLabel6MouseMoved

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
         jLabel6.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.dispose();
        Ma.setVisible(true);
        
    }//GEN-LAST:event_jLabel6MouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Newtask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Newtask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Newtask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Newtask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Newtask(null,null).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JCheckBox statefield;
    private javax.swing.JTable view;
    // End of variables declaration//GEN-END:variables
}
