/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.TaiKhoan;
import Utilities.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HA NAM
 */
public class TaiKhoanDAO extends EduSysDAO<TaiKhoan, String>{
    String Select_By_Id_Sql = "select * from taikhoan where tendn = ?";
    String Select_All_Sql = "select * from taikhoan";
    @Override
    public void insert(TaiKhoan entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(TaiKhoan entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TaiKhoan> selectAll() {
        return this.selectBySql(Select_All_Sql); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TaiKhoan selectById(String id) {
        List<TaiKhoan> list = this.selectBySql(Select_By_Id_Sql, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<TaiKhoan> selectBySql(String sql, Object... args) {
         List<TaiKhoan> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                TaiKhoan entity = new TaiKhoan();
                entity.setTenDN(rs.getString("TenDN"));
                entity.setPass(rs.getString("MatKhau"));
                entity.setVaiTro(rs.getBoolean("VaiTro"));               
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } //To change body of generated methods, choose Tools | Templates.
    }
    
}
