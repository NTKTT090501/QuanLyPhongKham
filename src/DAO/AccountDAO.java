/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Account;
import Utilities.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HA NAM
 */
public class AccountDAO extends clinicMN<Account, String>{
    String Select_By_Id_Sql = "select * from Account where username = ?";
    String Select_All_Sql = "select * from Account";

    @Override
    public void insert(Account entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Account entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Account> selectAll() {
        return this.selectBySql(Select_All_Sql); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Account selectById(String id) {
        List<Account> list = this.selectBySql(Select_By_Id_Sql, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<Account> selectBySql(String sql, Object... args) {
         List<Account> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Account entity = new Account();
                entity.setUserName(rs.getString("username"));
                entity.setPass(rs.getString("password"));
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
