
package krsti;
import java.sql.*;
import javax.swing.JOptionPane;
import koneksi.konek;
import javax.swing.table.DefaultTableModel;
import java.*;
import javax.swing.table.TableColumn;

public class daftar_matakuliah extends javax.swing.JFrame {
    DefaultTableModel model1;
    DefaultTableModel model2;
    DefaultTableModel model3;
    DefaultTableModel model4;
    DefaultTableModel model5;
    DefaultTableModel model6;
    DefaultTableModel model7;
    DefaultTableModel model8;
    DefaultTableModel model9;
    konek xxx;
    public daftar_matakuliah() {
        initComponents();
        this.setLocationRelativeTo(null);
        xxx = new konek();
        xxx.Class();
        String []judul = {"Kode Matakuliah", "Nama Matakuliah", "sks", "js","opsi"};
        String []judulhasil = {"Kode Matakuliah", "Nama Matakuliah", "sks", "js"};
        //semester 1
        model1 = new DefaultTableModel(judul,0);
        jTable3.setModel(model1);
        tampilkan1();
        //semester 2
        model2 = new DefaultTableModel(judul,0);
        jTable4.setModel(model2);
        tampilkan2();
        //semester 3
        model3 = new DefaultTableModel(judul,0);
        jTable5.setModel(model3);
        tampilkan3();
        //semester 4
        model4 = new DefaultTableModel(judul,0);
        jTable6.setModel(model4);
        tampilkan4();
        //semester 5
        model5 = new DefaultTableModel(judul,0);
        jTable7.setModel(model5);
        tampilkan5();
        //semester 6
        model6 = new DefaultTableModel(judul,0);
        jTable8.setModel(model6);
        tampilkan6();
        //semester 7
        model7 = new DefaultTableModel(judul,0);
        jTable9.setModel(model7);
        tampilkan7();
        //semester 8
        model8 = new DefaultTableModel(judul,0);
        jTable10.setModel(model8);
        tampilkan8();
        //semester 9
        model9 = new DefaultTableModel(judulhasil,0);
        jTable12.setModel(model9);
        tampilkan9();
    }
    private void tampilkan1(){
        TableColumn column;
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = jTable3.getColumnModel().getColumn(0); 
        column.setPreferredWidth(110);
        column = jTable3.getColumnModel().getColumn(1); 
        column.setPreferredWidth(270); 
        column = jTable3.getColumnModel().getColumn(2); 
        column.setPreferredWidth(30); 
        column = jTable3.getColumnModel().getColumn(3); 
        column.setPreferredWidth(30);
        column = jTable3.getColumnModel().getColumn(4); 
        column.setPreferredWidth(70);
        int row = jTable3.getRowCount();
        for(int a=0;a<row;a++){
            model1.removeRow(0);
        }
        try{
            xxx.ss = xxx.cc.createStatement();
            String sql = "SELECT kode_matkul,nama_matkul,sks,js FROM tb_semester1";
            xxx.rr=xxx.ss.executeQuery(sql);
            int i=1;
            String j;
            while (xxx.rr.next()) {
                j=Integer.toString(i);
                String data[]={xxx.rr.getString(1),xxx.rr.getString(2),xxx.rr.getString(3),xxx.rr.getString(4)};
                model1.addRow(data);
                i=i+1;
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    private void tampilkan2(){
        TableColumn column;
        jTable4.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = jTable4.getColumnModel().getColumn(0); 
        column.setPreferredWidth(110);
        column = jTable4.getColumnModel().getColumn(1); 
        column.setPreferredWidth(270); 
        column = jTable4.getColumnModel().getColumn(2); 
        column.setPreferredWidth(30); 
        column = jTable4.getColumnModel().getColumn(3); 
        column.setPreferredWidth(30);
        column = jTable4.getColumnModel().getColumn(4); 
        column.setPreferredWidth(70);
        int row = jTable4.getRowCount();
        for(int a=0;a<row;a++){
            model2.removeRow(0);
        }
        try{
            xxx.ss = xxx.cc.createStatement();
            String sql = "SELECT kode_matkul,nama_matkul,sks,js FROM tb_semester2";
            xxx.rr=xxx.ss.executeQuery(sql);
            int i=1;
            String j;
            while (xxx.rr.next()) {
                j=Integer.toString(i);
                String data[]={xxx.rr.getString(1),xxx.rr.getString(2),xxx.rr.getString(3),xxx.rr.getString(4)};
                model2.addRow(data);
                i=i+1;
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    private void tampilkan3(){
        TableColumn column;
        jTable5.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = jTable5.getColumnModel().getColumn(0); 
        column.setPreferredWidth(110);
        column = jTable5.getColumnModel().getColumn(1); 
        column.setPreferredWidth(270); 
        column = jTable5.getColumnModel().getColumn(2); 
        column.setPreferredWidth(30); 
        column = jTable5.getColumnModel().getColumn(3); 
        column.setPreferredWidth(30);
        column = jTable5.getColumnModel().getColumn(4); 
        column.setPreferredWidth(70);
        int row = jTable5.getRowCount();
        for(int a=0;a<row;a++){
            model3.removeRow(0);
        }
        try{
            xxx.ss = xxx.cc.createStatement();
            String sql = "SELECT kode_matkul,nama_matkul,sks,js FROM tb_semester3";
            xxx.rr=xxx.ss.executeQuery(sql);
            int i=1;
            String j;
            while (xxx.rr.next()) {
                j=Integer.toString(i);
                String data[]={xxx.rr.getString(1),xxx.rr.getString(2),xxx.rr.getString(3),xxx.rr.getString(4)};
                model3.addRow(data);
                i=i+1;
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    private void tampilkan4(){
        TableColumn column;
        jTable6.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = jTable6.getColumnModel().getColumn(0); 
        column.setPreferredWidth(110);
        column = jTable6.getColumnModel().getColumn(1); 
        column.setPreferredWidth(270); 
        column = jTable6.getColumnModel().getColumn(2); 
        column.setPreferredWidth(30); 
        column = jTable6.getColumnModel().getColumn(3); 
        column.setPreferredWidth(30);
        column = jTable6.getColumnModel().getColumn(4); 
        column.setPreferredWidth(70);
        int row = jTable6.getRowCount();
        for(int a=0;a<row;a++){
            model4.removeRow(0);
        }
        try{
            xxx.ss = xxx.cc.createStatement();
            String sql = "SELECT kode_matkul,nama_matkul,sks,js FROM tb_semester4";
            xxx.rr=xxx.ss.executeQuery(sql);
            int i=1;
            String j;
            while (xxx.rr.next()) {
                j=Integer.toString(i);
                String data[]={xxx.rr.getString(1),xxx.rr.getString(2),xxx.rr.getString(3),xxx.rr.getString(4)};
                model4.addRow(data);
                i=i+1;
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    private void tampilkan5(){
        TableColumn column;
        jTable7.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = jTable7.getColumnModel().getColumn(0); 
        column.setPreferredWidth(110);
        column = jTable7.getColumnModel().getColumn(1); 
        column.setPreferredWidth(270); 
        column = jTable7.getColumnModel().getColumn(2); 
        column.setPreferredWidth(30); 
        column = jTable7.getColumnModel().getColumn(3); 
        column.setPreferredWidth(30);
        column = jTable7.getColumnModel().getColumn(4); 
        column.setPreferredWidth(70);
        int row = jTable7.getRowCount();
        for(int a=0;a<row;a++){
            model5.removeRow(0);
        }
        try{
            xxx.ss = xxx.cc.createStatement();
            String sql = "SELECT kode_matkul,nama_matkul,sks,js FROM tb_semester5";
            xxx.rr=xxx.ss.executeQuery(sql);
            int i=1;
            String j;
            while (xxx.rr.next()) {
                j=Integer.toString(i);
                String data[]={xxx.rr.getString(1),xxx.rr.getString(2),xxx.rr.getString(3),xxx.rr.getString(4)};
                model5.addRow(data);
                i=i+1;
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    private void tampilkan6(){
        TableColumn column;
        jTable8.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = jTable8.getColumnModel().getColumn(0); 
        column.setPreferredWidth(110);
        column = jTable8.getColumnModel().getColumn(1); 
        column.setPreferredWidth(270); 
        column = jTable8.getColumnModel().getColumn(2); 
        column.setPreferredWidth(30); 
        column = jTable8.getColumnModel().getColumn(3); 
        column.setPreferredWidth(30);
        column = jTable8.getColumnModel().getColumn(4); 
        column.setPreferredWidth(70);
        int row = jTable8.getRowCount();
        for(int a=0;a<row;a++){
            model6.removeRow(0);
        }
        try{
            xxx.ss = xxx.cc.createStatement();
            String sql = "SELECT kode_matkul,nama_matkul,sks,js FROM tb_semester6";
            xxx.rr=xxx.ss.executeQuery(sql);
            int i=1;
            String j;
            while (xxx.rr.next()) {
                j=Integer.toString(i);
                String data[]={xxx.rr.getString(1),xxx.rr.getString(2),xxx.rr.getString(3),xxx.rr.getString(4)};
                model6.addRow(data);
                i=i+1;
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    private void tampilkan7(){
        TableColumn column;
        jTable9.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = jTable9.getColumnModel().getColumn(0); 
        column.setPreferredWidth(110);
        column = jTable9.getColumnModel().getColumn(1); 
        column.setPreferredWidth(270); 
        column = jTable9.getColumnModel().getColumn(2); 
        column.setPreferredWidth(30); 
        column = jTable9.getColumnModel().getColumn(3); 
        column.setPreferredWidth(30);
        column = jTable9.getColumnModel().getColumn(4); 
        column.setPreferredWidth(70);
        int row = jTable9.getRowCount();
        for(int a=0;a<row;a++){
            model7.removeRow(0);
        }
        try{
            xxx.ss = xxx.cc.createStatement();
            String sql = "SELECT kode_matkul,nama_matkul,sks,js FROM tb_semester7";
            xxx.rr=xxx.ss.executeQuery(sql);
            int i=1;
            String j;
            while (xxx.rr.next()) {
                j=Integer.toString(i);
                String data[]={xxx.rr.getString(1),xxx.rr.getString(2),xxx.rr.getString(3),xxx.rr.getString(4)};
                model7.addRow(data);
                i=i+1;
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    private void tampilkan8(){
        TableColumn column;
        jTable10.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = jTable10.getColumnModel().getColumn(0); 
        column.setPreferredWidth(110);
        column = jTable10.getColumnModel().getColumn(1); 
        column.setPreferredWidth(270); 
        column = jTable10.getColumnModel().getColumn(2); 
        column.setPreferredWidth(30); 
        column = jTable10.getColumnModel().getColumn(3); 
        column.setPreferredWidth(30);
        column = jTable10.getColumnModel().getColumn(4); 
        column.setPreferredWidth(70);
        int row = jTable10.getRowCount();
        for(int a=0;a<row;a++){
            model8.removeRow(0);
        }
        try{
            xxx.ss = xxx.cc.createStatement();
            String sql = "SELECT kode_matkul,nama_matkul,sks,js FROM tb_semester8";
            xxx.rr=xxx.ss.executeQuery(sql);
            int i=1;
            String j;
            while (xxx.rr.next()) {
                j=Integer.toString(i);
                String data[]={xxx.rr.getString(1),xxx.rr.getString(2),xxx.rr.getString(3),xxx.rr.getString(4)};
                model8.addRow(data);
                i=i+1;
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    private void tampilkan9(){
        TableColumn column;
        jTable12.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = jTable12.getColumnModel().getColumn(0); 
        column.setPreferredWidth(110);
        column = jTable12.getColumnModel().getColumn(1); 
        column.setPreferredWidth(270); 
        column = jTable12.getColumnModel().getColumn(2); 
        column.setPreferredWidth(30); 
        column = jTable12.getColumnModel().getColumn(3); 
        column.setPreferredWidth(30);
        int row = jTable12.getRowCount();
        for(int a=0;a<row;a++){
            model9.removeRow(0);
        }
        try{
            xxx.ss = xxx.cc.createStatement();
            String sql = "SELECT kode_matkul,nama_matkul,sks,js FROM tb_semester1";
            xxx.rr=xxx.ss.executeQuery(sql);
            int i=1;
            String j;
            while (xxx.rr.next()) {
                j=Integer.toString(i);
                String data[]={xxx.rr.getString(1),xxx.rr.getString(2),xxx.rr.getString(3),xxx.rr.getString(4)};
                model9.addRow(data);
                i=i+1;
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jtab2 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Matakuliah", "sks", "js", "opsi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setMinWidth(110);
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable3.getColumnModel().getColumn(0).setMaxWidth(110);
            jTable3.getColumnModel().getColumn(1).setMinWidth(270);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable3.getColumnModel().getColumn(1).setMaxWidth(270);
            jTable3.getColumnModel().getColumn(2).setMinWidth(30);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable3.getColumnModel().getColumn(2).setMaxWidth(30);
            jTable3.getColumnModel().getColumn(3).setMinWidth(30);
            jTable3.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable3.getColumnModel().getColumn(3).setMaxWidth(30);
            jTable3.getColumnModel().getColumn(4).setMinWidth(70);
            jTable3.getColumnModel().getColumn(4).setPreferredWidth(10);
            jTable3.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        jtab2.addTab("SMT 1", jScrollPane3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Matakuliah", "sks", "js", "opsi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setMinWidth(110);
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable4.getColumnModel().getColumn(0).setMaxWidth(110);
            jTable4.getColumnModel().getColumn(1).setMinWidth(270);
            jTable4.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable4.getColumnModel().getColumn(1).setMaxWidth(270);
            jTable4.getColumnModel().getColumn(2).setMinWidth(30);
            jTable4.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable4.getColumnModel().getColumn(2).setMaxWidth(30);
            jTable4.getColumnModel().getColumn(3).setMinWidth(30);
            jTable4.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable4.getColumnModel().getColumn(3).setMaxWidth(30);
            jTable4.getColumnModel().getColumn(4).setMinWidth(70);
            jTable4.getColumnModel().getColumn(4).setPreferredWidth(10);
            jTable4.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        jtab2.addTab("SMT 2", jScrollPane4);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Matakuliah", "sks", "js", "opsi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setMinWidth(110);
            jTable5.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable5.getColumnModel().getColumn(0).setMaxWidth(110);
            jTable5.getColumnModel().getColumn(1).setMinWidth(270);
            jTable5.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable5.getColumnModel().getColumn(1).setMaxWidth(270);
            jTable5.getColumnModel().getColumn(2).setMinWidth(30);
            jTable5.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable5.getColumnModel().getColumn(2).setMaxWidth(30);
            jTable5.getColumnModel().getColumn(3).setMinWidth(30);
            jTable5.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable5.getColumnModel().getColumn(3).setMaxWidth(30);
            jTable5.getColumnModel().getColumn(4).setMinWidth(70);
            jTable5.getColumnModel().getColumn(4).setPreferredWidth(10);
            jTable5.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        jtab2.addTab("SMT 3", jScrollPane5);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Matakuliah", "sks", "js", "opsi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setMinWidth(110);
            jTable6.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable6.getColumnModel().getColumn(0).setMaxWidth(110);
            jTable6.getColumnModel().getColumn(1).setMinWidth(270);
            jTable6.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable6.getColumnModel().getColumn(1).setMaxWidth(270);
            jTable6.getColumnModel().getColumn(2).setMinWidth(30);
            jTable6.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable6.getColumnModel().getColumn(2).setMaxWidth(30);
            jTable6.getColumnModel().getColumn(3).setMinWidth(30);
            jTable6.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable6.getColumnModel().getColumn(3).setMaxWidth(30);
            jTable6.getColumnModel().getColumn(4).setMinWidth(70);
            jTable6.getColumnModel().getColumn(4).setPreferredWidth(10);
            jTable6.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        jtab2.addTab("SMT 4", jScrollPane6);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Matakuliah", "sks", "js", "opsi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setMinWidth(110);
            jTable7.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable7.getColumnModel().getColumn(0).setMaxWidth(110);
            jTable7.getColumnModel().getColumn(1).setMinWidth(270);
            jTable7.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable7.getColumnModel().getColumn(1).setMaxWidth(270);
            jTable7.getColumnModel().getColumn(2).setMinWidth(30);
            jTable7.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable7.getColumnModel().getColumn(2).setMaxWidth(30);
            jTable7.getColumnModel().getColumn(3).setMinWidth(30);
            jTable7.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable7.getColumnModel().getColumn(3).setMaxWidth(30);
            jTable7.getColumnModel().getColumn(4).setMinWidth(70);
            jTable7.getColumnModel().getColumn(4).setPreferredWidth(10);
            jTable7.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        jtab2.addTab("SMT 5", jScrollPane7);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Matakuliah", "sks", "js", "opsi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable8);
        if (jTable8.getColumnModel().getColumnCount() > 0) {
            jTable8.getColumnModel().getColumn(0).setMinWidth(110);
            jTable8.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable8.getColumnModel().getColumn(0).setMaxWidth(110);
            jTable8.getColumnModel().getColumn(1).setMinWidth(270);
            jTable8.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable8.getColumnModel().getColumn(1).setMaxWidth(270);
            jTable8.getColumnModel().getColumn(2).setMinWidth(30);
            jTable8.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable8.getColumnModel().getColumn(2).setMaxWidth(30);
            jTable8.getColumnModel().getColumn(3).setMinWidth(30);
            jTable8.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable8.getColumnModel().getColumn(3).setMaxWidth(30);
            jTable8.getColumnModel().getColumn(4).setMinWidth(70);
            jTable8.getColumnModel().getColumn(4).setPreferredWidth(10);
            jTable8.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        jtab2.addTab("SMT 6", jScrollPane8);

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Matakuliah", "sks", "js", "opsi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTable9);
        if (jTable9.getColumnModel().getColumnCount() > 0) {
            jTable9.getColumnModel().getColumn(0).setMinWidth(110);
            jTable9.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable9.getColumnModel().getColumn(0).setMaxWidth(110);
            jTable9.getColumnModel().getColumn(1).setMinWidth(270);
            jTable9.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable9.getColumnModel().getColumn(1).setMaxWidth(270);
            jTable9.getColumnModel().getColumn(2).setMinWidth(30);
            jTable9.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable9.getColumnModel().getColumn(2).setMaxWidth(30);
            jTable9.getColumnModel().getColumn(3).setMinWidth(30);
            jTable9.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable9.getColumnModel().getColumn(3).setMaxWidth(30);
            jTable9.getColumnModel().getColumn(4).setMinWidth(70);
            jTable9.getColumnModel().getColumn(4).setPreferredWidth(10);
            jTable9.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        jtab2.addTab("SMT 7", jScrollPane9);

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Matakuliah", "sks", "js", "opsi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable10.setColumnSelectionAllowed(true);
        jScrollPane10.setViewportView(jTable10);
        jTable10.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (jTable10.getColumnModel().getColumnCount() > 0) {
            jTable10.getColumnModel().getColumn(0).setMinWidth(110);
            jTable10.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable10.getColumnModel().getColumn(0).setMaxWidth(110);
            jTable10.getColumnModel().getColumn(1).setMinWidth(270);
            jTable10.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable10.getColumnModel().getColumn(1).setMaxWidth(270);
            jTable10.getColumnModel().getColumn(2).setMinWidth(30);
            jTable10.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable10.getColumnModel().getColumn(2).setMaxWidth(30);
            jTable10.getColumnModel().getColumn(3).setMinWidth(30);
            jTable10.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable10.getColumnModel().getColumn(3).setMaxWidth(30);
            jTable10.getColumnModel().getColumn(4).setMinWidth(70);
            jTable10.getColumnModel().getColumn(4).setPreferredWidth(10);
            jTable10.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        jtab2.addTab("SMT 8", jScrollPane10);

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Matakuliah", "sks", "js"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane12.setViewportView(jTable12);
        if (jTable12.getColumnModel().getColumnCount() > 0) {
            jTable12.getColumnModel().getColumn(0).setMinWidth(110);
            jTable12.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable12.getColumnModel().getColumn(0).setMaxWidth(110);
            jTable12.getColumnModel().getColumn(1).setMinWidth(270);
            jTable12.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable12.getColumnModel().getColumn(1).setMaxWidth(270);
            jTable12.getColumnModel().getColumn(2).setMinWidth(30);
            jTable12.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable12.getColumnModel().getColumn(2).setMaxWidth(30);
            jTable12.getColumnModel().getColumn(3).setMinWidth(30);
            jTable12.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable12.getColumnModel().getColumn(3).setMaxWidth(30);
        }

        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtab2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtab2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new home().show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(daftar_matakuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daftar_matakuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daftar_matakuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daftar_matakuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daftar_matakuliah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTabbedPane jtab2;
    // End of variables declaration//GEN-END:variables
}
