/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vwww.pnl;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Label;
import synsoftech.util.Center;
import synsoftech.util.ImageRenderer;
import vwws.meter_readers.Meter_reader_assignments;
import vwws.meter_readers.Meter_readers;
import vwws.occupancy_types.Occupancy_types;
import vwws.readings.Readings;
import vwws.util.Alert;
import vwws.util.DateType;
import vwws.util.MyUser;

/**
 *
 * @author Ronescape
 */
public class Dlg_meter_reading extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_meter_reading
     */
    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private Callback callback;
    
    public void setCallback(Callback callback) {
        this.callback = callback;
        
    }
    
    public static interface Callback {
        
        void ok(CloseDialog closeDialog, OutputData data);
    }
    
    public static class InputData {
    }
    
    public static class OutputData {
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_meter_reading(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }
    
    private Dlg_meter_reading(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }
    
    public Dlg_meter_reading() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();
        
    }
    private Dlg_meter_reading myRef;
    
    private void setThisRef(Dlg_meter_reading myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_meter_reading> dialogContainer = new java.util.HashMap();
    
    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }
    
    public static Dlg_meter_reading create(java.awt.Window parent, boolean modal) {
        
        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }
        
        return create(parent, ModalityType.MODELESS);
        
    }
    
    public static Dlg_meter_reading create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {
        
        if (parent instanceof java.awt.Frame) {
            
            Dlg_meter_reading dialog = dialogContainer.get(parent);
            
            if (dialog == null) {
                dialog = new Dlg_meter_reading((java.awt.Frame) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }
            
        }
        
        if (parent instanceof java.awt.Dialog) {
            Dlg_meter_reading dialog = dialogContainer.get(parent);
            
            if (dialog == null) {
                dialog = new Dlg_meter_reading((java.awt.Dialog) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }
            
        }
        
        return null;
        
    }
    //</editor-fold>    

    //<editor-fold defaultstate="collapsed" desc=" main ">
    public static void main(String args[]) {
        
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        Dlg_meter_reading dialog = Dlg_meter_reading.create(new javax.swing.JFrame(), true);
        Center.setCenter(dialog);
        dialog.setVisible(true);
        
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" added ">
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible == true) {
            getContentPane().removeAll();
            initComponents();
            myInit();
            repaint();
        }
        
    }
    
    public javax.swing.JPanel getSurface() {
        return (javax.swing.JPanel) getContentPane();
    }
    
    public void nullify() {
        myRef.setVisible(false);
        myRef = null;
    }
    //</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new Label.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 170, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Welcome DURAY, BOBBY! ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vwws/icons/expand22.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jPanel2.setOpaque(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("No. of Accounts");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Checked");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Pending");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("0");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Select Account");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        menu();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        select_account();
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        init_tbl_customers(jTable1);
        
//        String where = " where id=1 ";
//        List<Meter_readers.to_meter_readers> readers = Meter_readers.ret_data(where);
//        if (!readers.isEmpty()) {
//            
//            Meter_readers.to_meter_readers reader1 = (Meter_readers.to_meter_readers) readers.get(0);
//            MyUser.setUser_id("" + reader1.id);
//            MyUser.setUser_name(reader1.user_name);
//            MyUser.setUser_screen_name(reader1.lname + ", " + reader1.fname + " " + reader1.mi);
//            reader = reader1;
//            jLabel4.setText("Welcome " + reader1.lname + ", " + reader1.fname + " " + reader1.mi);
//            ret_meter_reader_assignments();
//        }
    }
    Meter_readers.to_meter_readers reader = null;
    
    public void do_pass(Meter_readers.to_meter_readers r) {
        reader = r;
        jLabel4.setText("Welcome " + r.lname + ", " + r.fname + " " + r.mi);
        ret_meter_reader_assignments();
    }

    // <editor-fold defaultstate="collapsed" desc="Key">
    private void disposed() {
        this.dispose();
    }
    
    private void init_key() {
        KeyMapping.mapKeyWIFW(getSurface(),
                              KeyEvent.VK_ESCAPE, new KeyAction() {
                          
                          @Override
                          public void actionPerformed(ActionEvent e) {
//                btn_0.doClick();
//                              disposed();
                          }
                      });
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" customers "> 
    public static ArrayListModel tbl_customers_ALM;
    public static TblcustomersModel tbl_customers_M;
    
    public static void init_tbl_customers(JTable tbl_customers) {
        tbl_customers_ALM = new ArrayListModel();
        tbl_customers_M = new TblcustomersModel(tbl_customers_ALM);
        tbl_customers.setModel(tbl_customers_M);
        tbl_customers.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_customers.setRowHeight(25);
        int[] tbl_widths_customers = {100, 150, 50, 0};
        for (int i = 0, n = tbl_widths_customers.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_customers, i, tbl_widths_customers[i]);
        }
        Dimension d = tbl_customers.getTableHeader().getPreferredSize();
        d.height = 0;
        tbl_customers.getTableHeader().setPreferredSize(d);
        tbl_customers.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_customers.setRowHeight(40);
        tbl_customers.setFont(new java.awt.Font("Arial", 0, 14));
        tbl_customers.getColumnModel().getColumn(2).setCellRenderer(new ImageRenderer());
    }
    
    public static void loadData_customers(List<Meter_reader_assignments.to_meter_reader_assignments> acc) {
        tbl_customers_ALM.clear();
        tbl_customers_ALM.addAll(acc);
    }
    
    public static class TblcustomersModel extends AbstractTableAdapter {
        
        public static String[] COLUMNS = {
            "ID #", "Name", "", ""
        };
        
        public TblcustomersModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }
        
        @Override
        public boolean isCellEditable(int row, int column) {
            
            return false;
        }
        
        @Override
        public Class getColumnClass(int col) {
            if (col == 4) {
                return Boolean.class;
            }
            return Object.class;
        }
        
        @Override
        public Object getValueAt(int row, int col) {
            Meter_reader_assignments.to_meter_reader_assignments tt = (Meter_reader_assignments.to_meter_reader_assignments) getRow(row);
            switch (col) {
                case 0:
                    
                    return " " + tt.meter_no;
                case 1:
                    return " " + tt.customer_name;
                case 2:
                    if (tt.status == 1) {
                        return "/vwws/icons/checked (1).png";
                    } else {
                        return "/vwws/icons/cross29 (1).png";
                    }
                default:
                    return tt.status;
            }
        }
    }
    
    private void ret_meter_reader_assignments() {
        String where = " where mra.meter_reader_id='" + reader.id + "' order by mra.customer_name asc ";
        List<Meter_reader_assignments.to_meter_reader_assignments> assignments = Meter_reader_assignments.ret_assignments2(where);
        loadData_customers(assignments);
        int pending = 0;
        int checked = 0;
        for (Meter_reader_assignments.to_meter_reader_assignments mra : assignments) {
            if (mra.status == 0) {
                pending++;
            } else {
                checked++;
            }
        }
        jLabel8.setText("" + pending);
        jLabel5.setText("" + checked);
        jLabel3.setText("" + assignments.size());
    }
    
    private void select_account() {
        int row = jTable1.getSelectedRow();
        if (row < 0) {
            return;
        }
        
        final Meter_reader_assignments.to_meter_reader_assignments to = (Meter_reader_assignments.to_meter_reader_assignments) tbl_customers_ALM.get(row);
        int col = jTable1.getSelectedColumn();
        if (col == 2) {
            List<Readings.to_readings> readings = Readings.ret_data(" where customer_id='" + to.customer_id + "' order by created_at desc limit 1");
            Readings.to_readings prev = null;
            
            if (!readings.isEmpty()) {
                prev = readings.get(0);
            }
            
            Readings.to_readings prev2 = prev;
            Window p = (Window) this;
            Dlg_meter_reading_details nd = Dlg_meter_reading_details.create(p, true);
            nd.setTitle("");
            nd.do_pass(to, prev);
            nd.setCallback(new Dlg_meter_reading_details.Callback() {
                
                @Override
                public void ok(CloseDialog closeDialog, Dlg_meter_reading_details.OutputData data) {
                    closeDialog.ok();
                    
                    if (to.status == 0) {
                        int id = 0;
                        String reading_no = Readings.increment_id(to.meter_reader_id);
                        String meter_reader_id = to.meter_reader_id;
                        String meter_reader_name = to.meter_reader_name;
                        String customer_id = to.customer_id;
                        String customer_no = to.customer_no;
                        String customer_name = to.customer_name;
                        String customer_meter_no = to.meter_no;
                        String previous_reading_date = null;
                        double previous_reading = data.previous_reading;
                        
                        double current_reading = data.current_reading;
                        String city = to.city;
                        String city_id = to.city_id;
                        String barangay = to.barangay;
                        String barangay_id = to.barangay_id;
                        String purok = to.purok;
                        String purok_id = to.purok_id;
                        String sitio = to.sitio;
                        String sitio_id = to.sitio_id;
                        String created_at = DateType.now();
                        String updated_at = DateType.now();
                        String created_by = MyUser.getUser_id();
                        String updated_by = MyUser.getUser_id();
                        int status = 0;
                        String occupancy_id = to.occupancy_id;
                        String occupancy = to.occupancy;
                        String occupancy_type_id = to.occupancy_type_id;
                        String occupancy_type = to.occupancy_type;
                        String occupancy_type_code = to.occupancy_type_code;
                        double actual_consumption = data.current_reading - previous_reading;
                        double amount_due = 0;
                        double mf = 0;
                        double mr = 0;
                        double interest = 0;
                        double discount = 0;
                        double net_due = 0;
                        List<Occupancy_types.to_occupancy_types> types = Occupancy_types.ret_data(" where occupancy_type_code='" + occupancy_type_code + "' and occupancy='" + occupancy_type + "' and pipe_size='" + to.pipe_size + "' ");
                        for (Occupancy_types.to_occupancy_types type : types) {
                            String[] cubics = type.cubic.split(",");
                            double low = FitIn.toDouble(cubics[0]);
                            double high = FitIn.toDouble(cubics[1]);
                            if (cubics[1].equalsIgnoreCase("above")) {
                                high = 100000;
                            }
                            if (actual_consumption >= low && actual_consumption <= high) {
                                mf = type.mf;
                                mr = type.mr;
                                amount_due = actual_consumption * type.charge + (type.mf + type.mr);
                            }
                        }
                        net_due = amount_due;
                        int is_paid = 0;
                        String or_id = "";
                        String or_no = "";
                        String date_uploaded = null;
                        int is_uploaded = 0;
                        boolean selected = false;
                        String pipe_size = to.pipe_size;
                        Readings.to_readings new_reading = new Readings.to_readings(id, reading_no, meter_reader_id, meter_reader_name, customer_id, customer_no, customer_name, customer_meter_no, previous_reading_date, previous_reading, current_reading, city, city_id, barangay, barangay_id, purok, purok_id, sitio, sitio_id, created_at, updated_at, created_by, updated_by, status, occupancy_id, occupancy, occupancy_type_id, occupancy_type, occupancy_type_code, actual_consumption, amount_due, mf, mr, interest, discount, net_due, is_paid, or_id, or_no, date_uploaded, is_uploaded, selected, pipe_size);
                      
                        Readings.add_data(new_reading);
                        Alert.set(1, "");
                        ret_meter_reader_assignments();
                    } else {
                        int id = FitIn.toInt(to.update_by_id);
                        String reading_no = "";
                        String meter_reader_id = to.meter_reader_id;
                        String meter_reader_name = to.meter_reader_name;
                        String customer_id = to.customer_id;
                        String customer_no = to.customer_no;
                        String customer_name = to.customer_name;
                        String customer_meter_no = to.meter_no;
                        String previous_reading_date = "";
                        double previous_reading = data.previous_reading;
                        double current_reading = data.current_reading;
                        String city = to.city;
                        String city_id = to.city_id;
                        String barangay = to.barangay;
                        String barangay_id = to.barangay_id;
                        String purok = to.purok;
                        String purok_id = to.purok_id;
                        String sitio = to.sitio;
                        String sitio_id = to.sitio_id;
                        String created_at = DateType.now();
                        String updated_at = DateType.now();
                        String created_by = MyUser.getUser_id();
                        String updated_by = MyUser.getUser_id();
                        int status = 1;
                        String occupancy_id = to.occupancy_id;
                        String occupancy = to.occupancy;
                        String occupancy_type_id = to.occupancy_type_id;
                        String occupancy_type = to.occupancy_type;
                        String occupancy_type_code = to.occupancy_type_code;
                        double actual_consumption = data.current_reading - previous_reading;
                        System.out.println(":actual_consumption: " + actual_consumption);
                        double amount_due = 0;
                        double mf = 0;
                        double mr = 0;
                        double interest = 0;
                        double discount = 0;
                        double net_due = 0;
                        List<Occupancy_types.to_occupancy_types> types = Occupancy_types.ret_data(" where occupancy_type_code='" + occupancy_type_code + "' and occupancy='" + occupancy_type + "' and pipe_size='" + to.pipe_size + "' ");
                        
                        for (Occupancy_types.to_occupancy_types type : types) {
                            String[] cubics = type.cubic.split(",");
                            double low = FitIn.toDouble(cubics[0]);
                            double high = FitIn.toDouble(cubics[1]);
                            if (cubics[1].equalsIgnoreCase("above")) {
                                high = 100000;
                            }
                            if (actual_consumption >= low && actual_consumption <= high) {
                                mf = type.mf;
                                mr = type.mr;
                                amount_due = actual_consumption * type.charge + (type.mf + type.mr);
                            }
                        }
                        net_due = amount_due;
                        int is_paid = 0;
                        String or_id = "";
                        String or_no = "";
                        String date_uploaded = null;
                        int is_uploaded = 0;
                        boolean selected = false;
                        String pipe_size = to.pipe_size;
                        Readings.to_readings new_reading = new Readings.to_readings(id, reading_no, meter_reader_id, meter_reader_name, customer_id, customer_no, customer_name, customer_meter_no, previous_reading_date, previous_reading, current_reading, city, city_id, barangay, barangay_id, purok, purok_id, sitio, sitio_id, created_at, updated_at, created_by, updated_by, status, occupancy_id, occupancy, occupancy_type_id, occupancy_type, occupancy_type_code, actual_consumption, amount_due, mf, mr, interest, discount, net_due, is_paid, or_id, or_no, date_uploaded, is_uploaded, selected, pipe_size);
                        Readings.update_data2(new_reading);
                        Alert.set(2, "");
                        ret_meter_reader_assignments();
                    }
                    
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        } else if (col == 0) {
            if (to.status == 1) {
                String id = to.update_by_id;
                List<Readings.to_readings> readings = Readings.ret_data(" where id='" + id + "' ");
                if (!readings.isEmpty()) {
                    Readings.to_readings to1 = (Readings.to_readings) readings.get(0);
                    Window p = (Window) this;
                    Dlg_print_reading nd = Dlg_print_reading.create(p, true);
                    nd.setTitle("");
                    nd.do_pass(to1);
                    nd.setCallback(new Dlg_print_reading.Callback() {
                        
                        @Override
                        public void ok(CloseDialog closeDialog, Dlg_print_reading.OutputData data) {
                            closeDialog.ok();
                            
                        }
                    });
                    nd.setLocationRelativeTo(this);
                    nd.setVisible(true);
                }
                
            }
        } else {
            
        }
      
        
    }
    
    private void menu() {
        Window p = (Window) this;
        Dlg_menu nd = Dlg_menu.create(p, true);
        nd.setTitle("");
        
        nd.setCallback(new Dlg_menu.Callback() {
            
            @Override
            public void upload(CloseDialog closeDialog, Dlg_menu.OutputData data) {
                
                upload_readings();
            }
            
            @Override
            public void logout(CloseDialog closeDialog, Dlg_menu.OutputData data) {
                closeDialog.ok();
                login();
            }
        });
        Point loc = jLabel2.getLocationOnScreen();
//        nd.setLocationRelativeTo(this);
        nd.setLocation(loc.x - 110, loc.y + 25);
        nd.setVisible(true);
    }
    
    private void login() {
        Window p = (Window) this;
        Dlg_login nd = Dlg_login.create(p, true);
        nd.setTitle("");
        
        nd.setCallback(new Dlg_login.Callback() {
            
            @Override
            public void ok(CloseDialog closeDialog, Dlg_login.OutputData data) {
                closeDialog.ok();
                
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
    
    private void upload_readings() {
        Window p = (Window) this;
        Dlg_upload_readings nd = Dlg_upload_readings.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_upload_readings.Callback() {
            
            @Override
            public void ok(CloseDialog closeDialog, Dlg_upload_readings.OutputData data) {
                closeDialog.ok();
                
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
}
