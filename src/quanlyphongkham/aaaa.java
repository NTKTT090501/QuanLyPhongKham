/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham;

import java.util.Calendar;

/**
 *
 * @author HA NAM
 */
public class aaaa {
    public static void main(String[] args) {
        System.out.println(tuoi("1999-09-19"));
    }
    
    static int tuoi( String ngaysinh) {
        int namNgaySinh = 0;
        //Benhnhan list = bndao.selectById(txtMaBN.getText());
        //PhieuKham list = dao.selectById(txtMaBN.getText());
        //String ngaysinh = txtNgaySinh.getText();
        String[] parts = ngaysinh.split("-");
        String part1 = parts[0];
        namNgaySinh = Integer.parseInt(String.valueOf(part1));
        int namHienTai = Calendar.getInstance().get(Calendar.YEAR);
        int tuoi = namHienTai - namNgaySinh;
        return tuoi;
    }
}
