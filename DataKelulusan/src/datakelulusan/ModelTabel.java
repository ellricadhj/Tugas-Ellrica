/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakelulusan;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ellricadhj
 */
public class ModelTabel extends AbstractTableModel{

    @Override
    public int getRowCount() {
        return DataSiswa.listSiswa.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        return DataSiswa.listSiswa.get(i).nama;
    }
    
}
