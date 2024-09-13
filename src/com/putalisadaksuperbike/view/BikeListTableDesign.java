/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.putalisadaksuperbike.view;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import com.putalisadaksuperbike.controller.SelectionSortAlgorithm;
import com.putalisadaksuperbike.controller.BinarySearchAlgorithm;
import com.putalisadaksuperbike.model.BikeModel;


/**
 *
 * @author yonza
 */
    public class BikeListTableDesign extends javax.swing.JFrame {
    
       int size;
       int[] serial_number = new int[size];
       boolean descending = false;
       private static ArrayList<BikeModel> bikelist = new ArrayList<>();
       
       
    public BikeListTableDesign() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sortTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        mileage_txtfield = new javax.swing.JTextField();
        delete_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        country_txtfield = new javax.swing.JTextField();
        fuelcapacity_txtfield = new javax.swing.JTextField();
        company_txtfield = new javax.swing.JTextField();
        name_txtfield = new javax.swing.JTextField();
        serialnumber_txtfield = new javax.swing.JTextField();
        topspeed_txtfield = new javax.swing.JTextField();
        search_txtfield = new javax.swing.JTextField();
        search_Btn = new javax.swing.JButton();
        search_combobox = new javax.swing.JComboBox<>();
        add_btn = new javax.swing.JButton();
        desending_btn = new javax.swing.JButton();
        ascending_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        sortTable.setBackground(new java.awt.Color(255, 0, 0));
        sortTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sortTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Panigale V4", "Ducati", "Italian", "299 kmph", "17 liters", "13 kmpl"},
                {"2", "Ninja H2R", "Kawasaki", "Japan", "380 kmph", "17 liters", "15 kmpl"},
                {"3", "MT-09", "Yamaha", "Japan", "198.3 kmph", "14 liters", "19 kmpl"},
                {"4", "KTM 390", "KTM", "Austrian", "167 kmph", "15 liters", "35 kmpl"},
                {"5", "NS 200", "Pulsar", "Indian", "125 kmph", "12 liters", "40 kmpl"}
            },
            new String [] {
                "Serial Number", "Name", "Company", "Country", "Top Speed", "Fuel Capacity", "Mileage"
            }
        ));
        sortTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sortTable.setGridColor(new java.awt.Color(0, 0, 0));
        sortTable.setPreferredSize(new java.awt.Dimension(600, 500));
        sortTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        sortTable.setShowGrid(true);
        jScrollPane1.setViewportView(sortTable);

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        mileage_txtfield.setBorder(javax.swing.BorderFactory.createTitledBorder("Mileage"));

        delete_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        delete_btn.setText("DELETE BIKE");
        delete_btn.setPreferredSize(new java.awt.Dimension(125, 25));
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        update_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        update_btn.setText("UPDATE BIKE");
        update_btn.setPreferredSize(new java.awt.Dimension(125, 25));
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        country_txtfield.setBorder(javax.swing.BorderFactory.createTitledBorder("Country"));

        fuelcapacity_txtfield.setBorder(javax.swing.BorderFactory.createTitledBorder("Fuel Capacity"));

        company_txtfield.setBorder(javax.swing.BorderFactory.createTitledBorder("Company"));

        name_txtfield.setBorder(javax.swing.BorderFactory.createTitledBorder("Name"));

        serialnumber_txtfield.setBorder(javax.swing.BorderFactory.createTitledBorder("Serial Number"));

        topspeed_txtfield.setBorder(javax.swing.BorderFactory.createTitledBorder("Top Speed"));

        search_txtfield.setBorder(javax.swing.BorderFactory.createTitledBorder("Search in Programmes"));

        search_Btn.setText("Search");
        search_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_BtnActionPerformed(evt);
            }
        });

        search_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Serial Number", "Name", "Country" }));

        add_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add_btn.setText("ADD BIKE");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(search_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(search_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(search_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(464, 464, 464)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(serialnumber_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(name_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(company_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(country_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(topspeed_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fuelcapacity_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mileage_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mileage_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fuelcapacity_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topspeed_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(country_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(company_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serialnumber_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(search_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))))
        );

        desending_btn.setBackground(new java.awt.Color(255, 0, 0));
        desending_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        desending_btn.setForeground(new java.awt.Color(255, 255, 255));
        desending_btn.setText("DESENDING ORDER");
        desending_btn.setPreferredSize(new java.awt.Dimension(125, 25));
        desending_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desending_btnActionPerformed(evt);
            }
        });

        ascending_btn.setBackground(new java.awt.Color(255, 0, 0));
        ascending_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ascending_btn.setForeground(new java.awt.Color(255, 255, 255));
        ascending_btn.setText("ASCENDING ORDER");
        ascending_btn.setPreferredSize(new java.awt.Dimension(125, 25));
        ascending_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ascending_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ascending_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(desending_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desending_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ascending_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setText("PUTALISADAK SUPER bIKE");

        jLabel2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/putalisadaksuperbike/view/logo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/putalisadaksuperbike/view/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel2)
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void desending_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desending_btnActionPerformed
  
        if(descending == false)
        {
            DefaultTableModel model = (DefaultTableModel)sortTable.getModel(); 
            size = model.getRowCount();
            
            int[] serialnumber = new int[model.getRowCount()];
            String[] name = new String[model.getRowCount()];
            String[] company = new String[model.getRowCount()];
            String[] country = new String[model.getRowCount()];
            String[] topspeed = new String[model.getRowCount()];
            String[] fuelcapacity = new String[model.getRowCount()];
            String[] mileage = new String[model.getRowCount()];
            int increase = 1;
       
        for(int i = 0; i < model.getRowCount(); i++){
           serialnumber[i] = increase;
           name[i] = (String)model.getValueAt(i, 1);
           company[i] = (String)model.getValueAt(i, 2);
           country[i] = (String)model.getValueAt(i, 3);
           topspeed[i] = (String)model.getValueAt(i, 4);
           fuelcapacity[i] = (String)model.getValueAt(i, 5);
           mileage[i] = (String)model.getValueAt(i, 6);
           increase++;
        }
        
        SelectionSortAlgorithm selectionsort = new SelectionSortAlgorithm();
        selectionsort.selectionsortdescending(serialnumber);
       
        int[] sorted = new int[model.getRowCount()];
      
        sorted =  selectionsort.selectionsortdescending(serialnumber);
        serial_number = selectionsort.selectionsortdescending(serialnumber);
        
       
        for(int j = 0; j < model.getRowCount(); j++){
           model.setValueAt(sorted[j], j, 0);
           model.setValueAt(name[j], sorted[j]-1, 1);
           model.setValueAt(company[j], sorted[j]-1, 2);
           model.setValueAt(country[j], sorted[j]-1, 3);
           model.setValueAt(topspeed[j], sorted[j]-1, 4);
           model.setValueAt(fuelcapacity[j], sorted[j]-1, 5);
           model.setValueAt(mileage[j], sorted[j]-1, 6);

       }
       descending = true;
        }
    }//GEN-LAST:event_desending_btnActionPerformed

    private void ascending_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ascending_btnActionPerformed

        if(descending == true)
        {
            DefaultTableModel model = (DefaultTableModel)sortTable.getModel(); 
      
            String[] name = new String[model.getRowCount()];
            String[] company = new String[model.getRowCount()];
            String[] country = new String[model.getRowCount()];
            String[] topspeed = new String[model.getRowCount()];
            String[] fuelcapacity = new String[model.getRowCount()];
            String[] mileage = new String[model.getRowCount()];
       
        for(int i = 0; i < model.getRowCount(); i++){
           
           name[i] = (String)model.getValueAt(i, 1);
           company[i] = (String)model.getValueAt(i, 2);
           country[i] = (String)model.getValueAt(i, 3);
           topspeed[i] = (String)model.getValueAt(i, 4);
           fuelcapacity[i] = (String)model.getValueAt(i, 5);
           mileage[i] = (String)model.getValueAt(i, 6);
        }
        
       SelectionSortAlgorithm selectionsort = new SelectionSortAlgorithm();
       selectionsort.selectionsortascending(serial_number);
       
       int[] sorted = new int[model.getRowCount()];
       sorted =  selectionsort.selectionsortascending(serial_number);
       int decrease = model.getRowCount() - 1;
       
       for(int j = 0; j < model.getRowCount(); j++){
           
           model.setValueAt(sorted[j], j, 0);
           model.setValueAt(name[decrease], sorted[j] - 1, 1);
           model.setValueAt(company[decrease], sorted[j] -1, 2);
           model.setValueAt(country[decrease], sorted[j] -1, 3);
           model.setValueAt(topspeed[decrease], sorted[j] -1, 4);
           model.setValueAt(fuelcapacity[decrease], sorted[j] -1, 5);
           model.setValueAt(mileage[decrease], sorted[j] -1, 6);
           decrease--;
        }
           descending = false;
     }
    }//GEN-LAST:event_ascending_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        
        if(serialnumber_txtfield.getText().isEmpty() || name_txtfield.getText().isEmpty() || company_txtfield.getText().isEmpty() || country_txtfield.getText().isEmpty() || topspeed_txtfield.getText().isEmpty() || fuelcapacity_txtfield.getText().isEmpty() || mileage_txtfield.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "TextFields are Empty. Please Fill It!");
            
        }else{
            
             DefaultTableModel model = (DefaultTableModel)sortTable.getModel();  
            int column = model.getColumnCount();    
            int serialnumber = Integer.parseInt((String)serialnumber_txtfield.getText()) - 1;      
            
            sortTable.setValueAt(serialnumber_txtfield.getText(), serialnumber, 0);
            sortTable.setValueAt(name_txtfield.getText(), serialnumber, 1);
            sortTable.setValueAt(company_txtfield.getText(), serialnumber, 2);
            sortTable.setValueAt(country_txtfield.getText(), serialnumber, 3);
            sortTable.setValueAt(topspeed_txtfield.getText(), serialnumber, 4);
            sortTable.setValueAt(fuelcapacity_txtfield.getText(), serialnumber, 5);
            sortTable.setValueAt(mileage_txtfield.getText(), serialnumber, 6);
            
            }
   
    }//GEN-LAST:event_update_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        
         if(serialnumber_txtfield.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "TextFields are Empty. Please Fill It!");
            
        }else{
            
            DefaultTableModel model = (DefaultTableModel)sortTable.getModel();
            int serialnumber = Integer.parseInt((String)serialnumber_txtfield.getText()) - 1;     
        
        model.removeRow(serialnumber);
        } 
        
    }//GEN-LAST:event_delete_btnActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        
        if(serialnumber_txtfield.getText().isEmpty() || name_txtfield.getText().isEmpty() || company_txtfield.getText().isEmpty() || country_txtfield.getText().isEmpty() || topspeed_txtfield.getText().isEmpty() || fuelcapacity_txtfield.getText().isEmpty() || mileage_txtfield.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "TextFields are Empty. Please Fill It!");
            
        }else{
            
            try{
                
                int serial_number = Integer.parseInt((String)serialnumber_txtfield.getText()); 
                
                if(serial_number > 0 ){
                    
                    DefaultTableModel model = (DefaultTableModel)sortTable.getModel();
                    Object[] add = new Object[model.getColumnCount()];
                    add[0] = serialnumber_txtfield.getText();
                    add[1] = name_txtfield.getText();
                    add[2] = company_txtfield.getText();
                    add[3] = country_txtfield.getText();
                    add[4] = topspeed_txtfield.getText();
                    add[5] = fuelcapacity_txtfield.getText();
                    add[6] = mileage_txtfield.getText();
        
                    model.addRow(add);
                }     
                
            }catch(NumberFormatException a){
                
                JOptionPane.showMessageDialog(null, "Cannot input String value!");
                
            }
           
        } 
    }//GEN-LAST:event_add_btnActionPerformed

    private void search_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_BtnActionPerformed
        
        if(search_txtfield.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "SearchField is Empty. Please Fill It!");
            
        }else{
            
            String comboBox = (String) search_combobox.getSelectedItem();
            BinarySearchAlgorithm binarysearch = new BinarySearchAlgorithm();
        
        switch(comboBox){
            
            case"Serial Number":
                 //let's input integer value only
                try{
                    
                    int serial_number = Integer.parseInt((String)search_txtfield.getText());
                   
                if(serial_number > 0 ){
                     
                    int increasement = 0;
                    int[] add_serialnumber = new int[bikelist.size()];
                
                    for(BikeModel arrayloop : bikelist){
                    add_serialnumber[increasement] = arrayloop.getserial_number();
                    increasement++;
                    }
                
                        try{
                    
                            binarysearch.searchInt(add_serialnumber, 0, add_serialnumber.length, serial_number);
                            JOptionPane.showMessageDialog(null, "Bike Serial Number is Found!");
                    
                        }catch(IndexOutOfBoundsException  a){
                    
                            JOptionPane.showMessageDialog(null, "Bike Serial Number cannot be Found!");

                        }
                        
                    } 
                    
                }catch(NumberFormatException a){
                    
                    JOptionPane.showMessageDialog(null, "Cannot input String value!");
                    
                }
                break; 
            
            
            case"Name":
                
                try{
                    
                    int name = Integer.parseInt((String)search_txtfield.getText());
                    JOptionPane.showMessageDialog(null, "Cannot input Integer value!");
                    
                }catch(NumberFormatException a){
                    
                    String name = (String)search_txtfield.getText();
                    int name_increasement = 0;
                    String[] add_name = new String[bikelist.size()];
                
                for(BikeModel arrayloop : bikelist){
                    add_name[name_increasement] = arrayloop.getname();
                    name_increasement++;
                }
                
                    try{
                    
                        binarysearch.searchString(add_name, 0, add_name.length, name);
                        JOptionPane.showMessageDialog(null, "Bike Name is Found!");
                    
                    }catch(IndexOutOfBoundsException  b){
                    
                        JOptionPane.showMessageDialog(null, "Bike Name cannot be Found!");

                    }
                
                }
                break; 
                
                
                case"Country":
                    
                    try{
                        
                        int name = Integer.parseInt((String)search_txtfield.getText());
                        JOptionPane.showMessageDialog(null, "Cannot input Integer value!");
                    
                    }catch(NumberFormatException a){
                        
                        String country = (String)search_txtfield.getText();
                        int country_increasement = 0;
                        String[] add_country = new String[bikelist.size()];
                
                        for(BikeModel arrayloop : bikelist){
                        add_country[country_increasement] = arrayloop.getname();
                        country_increasement++;
                        }
                
                            try{
                    
                                binarysearch.searchString(add_country, 0, add_country.length, country);
                                JOptionPane.showMessageDialog(null, "Bike Country is Found");
                    
                            }catch(IndexOutOfBoundsException  c){
                    
                                JOptionPane.showMessageDialog(null, "Bike Country cannot be Found");

                            }
                    }
                
                    break;     
        }
        }   
    }//GEN-LAST:event_search_BtnActionPerformed
     
    public static void collected_array(){
     
        DefaultTableModel model = (DefaultTableModel)sortTable.getModel(); 
    
        for(int i = 0; i < model.getRowCount(); i++){
            
            int serial_number = Integer.parseInt((String)model.getValueAt(i, 0));
            String name = (String)model.getValueAt(i, 1);
            String company = (String)model.getValueAt(i, 2);
            String country = (String)model.getValueAt(i, 3);
            String topspeed = (String)model.getValueAt(i, 4);
            String fuelcapacity = (String)model.getValueAt(i, 5);
            String mileage = (String)model.getValueAt(i, 6);
            

            BikeModel bike_model = new BikeModel(serial_number, name, company, country, topspeed, fuelcapacity, mileage);
            bikelist.add(bike_model);
        }
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BikeListTableDesign().setVisible(true);
                collected_array();
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JButton ascending_btn;
    private javax.swing.JTextField company_txtfield;
    private javax.swing.JTextField country_txtfield;
    private javax.swing.JButton delete_btn;
    private javax.swing.JButton desending_btn;
    private javax.swing.JTextField fuelcapacity_txtfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private static javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mileage_txtfield;
    private javax.swing.JTextField name_txtfield;
    private javax.swing.JButton search_Btn;
    private javax.swing.JComboBox<String> search_combobox;
    private javax.swing.JTextField search_txtfield;
    private javax.swing.JTextField serialnumber_txtfield;
    private static javax.swing.JTable sortTable;
    private javax.swing.JTextField topspeed_txtfield;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
