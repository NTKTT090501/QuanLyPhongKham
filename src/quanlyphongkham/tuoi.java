/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham;

import Entity.Benhnhan;
import Utilities.XDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import DAO.BenhNhanDAO;
/**
 *
 * @author HA NAM
 */
public class tuoi {
    BenhNhanDAO dao=new BenhNhanDAO();
    public static void main(String[] args) {
        int namNgaySinh = 0;
        List<Benhnhan> list = (List<Benhnhan>) dao.selectById("BN001");
        for (Benhnhan bn : list){
            String ngaysinh=bn.getNgaySinh();
            Date d = XDate.toDate(ngaysinh, "yyyy");
            namNgaySinh=Integer.parseInt(String.valueOf(d));
        }
        int namHienTai = Calendar.getInstance().get(Calendar.YEAR);
       int tuoi=namHienTai-namNgaySinh;
        System.out.println(tuoi);
    }
}
