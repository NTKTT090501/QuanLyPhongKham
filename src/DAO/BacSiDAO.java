/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.BacSi;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Utilities.XJdbc;

/**
 *
 * @author ADMIN
 */
public class BacSiDAO extends clinicMN<BacSi, String>{
    String INSERT_SQL = "insert into BacSi(MaBS,TenBS, Chuyennganh, NgaySinh, DiaChi, SDT,GioiTinh) values(?,?,?,?,?,?,?)";
    String UPDATE_SQL = "update BacSi set TenBS=?, Chuyennganh=?, NgaySinh=? ,DiaChi=? ,SDT=? ,GioiTinh=? where MaBS=?";
    String DELETE_SQL = "delete from BacSi where MaBS=?";
    String SELECT_ALL_SQL = "select * from BacSi";
    String SELECT_BY_ID_SQL = "select * from BacSi where MaBS=?";
    
    @Override
    public void insert(BacSi entity) {
        XJdbc.update(INSERT_SQL,
                entity.getMaBS(),
                entity.getTenBS(),
                entity.getChuyennganh(),
                entity.getNgaysinh(),
                entity.getDiachi(),
                entity.getSDT(),
                entity.getGioitinh());
    }

    @Override
    public void update(BacSi entity) {
       XJdbc.update(UPDATE_SQL,
               entity.getTenBS(),
               entity.getChuyennganh(),
               entity.getNgaysinh(),
               entity.getDiachi(),
               entity.getSDT(),
               entity.getGioitinh(),
               entity.getMaBS());
    }

    @Override
    public void delete(String id) {
         XJdbc.update(DELETE_SQL, id);
    }

    @Override
    public BacSi selectById(String id) {
        List<BacSi> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
    
    @Override
    protected List<BacSi> selectBySql(String sql, Object... args) {
        List<BacSi> list = new ArrayList<BacSi>();
        try{
           ResultSet rs = XJdbc.query(sql, args);
           while(rs.next()){
               BacSi entity = new BacSi();
               entity.setMaBS(rs.getString("MaBS"));
               entity.setTenBS(rs.getString("TenBS"));
               entity.setChuyennganh(rs.getString("Chuyennganh"));
               entity.setNgaysinh(rs.getString("NgaySinh"));
               entity.setDiachi(rs.getString("DiaChi"));
               entity.setSDT(rs.getString("SDT"));
               entity.setGioitinh(rs.getBoolean("GioiTinh"));
               list.add(entity);
           }
           rs.getStatement().getConnection().close();
           return list;
       }catch(Exception e){
           throw new RuntimeException(e);
       }
    } 

    @Override
    public List<BacSi> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);//To change body of generated methods, choose Tools | Templates.
    }
}
