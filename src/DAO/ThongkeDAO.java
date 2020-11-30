 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utilities.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HA NAM
 */
public class ThongkeDAO {

    /*getListofArray chỉ pv cho các phương thức còn lại, nó dựa vào PROC, mảng các
    cột để đọc dữ liệu trên mỗi bản ghi*/
    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Object[]> getbenhnhan(String maphieukham) {
        String sql = "{CALL sp_benhnhan(?)}";
        String[] cols = {"hoten", "ngaysinh", "gioitinh","sdt","mabn","maphieukham","madt","mabs"
        ,"motabenh","ngaykham","thanhtien"};
        return this.getListOfArray(sql, cols, maphieukham);
    }

}
