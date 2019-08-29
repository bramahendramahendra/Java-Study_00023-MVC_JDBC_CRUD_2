/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Database;
import model.mahasiswa;
import view.viewmahasiswa;

/**
 *
 * @author Brama Hendra Mahendra
 */
public class ControllerMahasiswa extends MouseAdapter implements ActionListener {
    
    private viewmahasiswa view;
    private Database db;
    
    public ControllerMahasiswa() {
        view = new viewmahasiswa();
        db = new Database();
        view.addActionListener(this);
        view.addMouseAdapter(this);
        view.setVisible(true);
        loadTable();
    }
    
    public void loadTable() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"NIM", "Nama", "Jurusan", "JK"}, 0);
        ArrayList<mahasiswa> mahasiswa = db.getMahasiswa();
        for (Mahasiswa m : mahasiswa) {
            model.addRow(new Object[]{m.getNim(), m.getNama(), m.getJurusan(), m.getJk()});
        }
        view.setTbMahasiswa(model);
    }
        
    @Override
    public void mousePressed (MouseEvent me) {
        Object source = me.getSource();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
    }
    
}
