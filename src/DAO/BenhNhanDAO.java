/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Benhnhan;
import Utilities.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HA NAM
 */
public class BenhNhanDAO extends clinicMN<Benhnhan, String> {

    String Insert_Sql = "INSERT INTO BenhNhan (MaBN, Hoten, ngaysinh, Gioitinh, Diachi, Baohiem, sdt)\n"
            + "VALUES (?,?,?,?,?,?,?)";
    String Update_Sql = "UPDATE BenhNhan\n"
            + "SET Hoten = ?, ngaysinh = ?, Gioitinh = ?, Diachi = ?, Baohiem = ?, sdt = ?\n"
            + "where mabn = ?";
    String Delete_Sql = "delete from benhnhan where mabn = ?";
    String Select_All_Sql = "select * from benhnhan";
    String Select_By_Id_Sql = "select * from benhnhan where mabn = ?";

    @Override
    public void insert(Benhnhan entity) {
        XJdbc.update(Insert_Sql,
                entity.getMaBN(),
                entity.getHoTen(),
                entity.getNgaySinh(),
                entity.getGioiTinh(),
                entity.getDiaChi(),
                entity.getBaoHiem(),
                entity.getSdT());
    }

    @Override
    public void update(Benhnhan entity) {
        XJdbc.update(Update_Sql,
                entity.getHoTen(),
                entity.getNgaySinh(),
                entity.getGioiTinh(),
                entity.getDiaChi(),
                entity.getBaoHiem(),
                entity.getSdT(),
                entity.getMaBN());
    }

    @Override
    public void delete(String id) {
        XJdbc.update(Delete_Sql, id);
    }

    @Override
    public List<Benhnhan> selectAll() {
        return this.selectBySql(Select_All_Sql);
    }

    @Override
    public Benhnhan selectById(String id) {
        List<Benhnhan> list = this.selectBySql(Select_By_Id_Sql, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<Benhnhan> selectBySql(String sql, Object... args) {
        List<Benhnhan> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Benhnhan entity = new Benhnhan();
                entity.setMaBN(rs.getString("MaBN"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setNgaySinh(rs.getString("ngaysinh"));
                entity.setGioiTinh(rs.getBoolean("Gioitinh"));
                entity.setDiaChi(rs.getString("Diachi"));
                entity.setBaoHiem(rs.getBoolean("Baohiem"));
                entity.setSdT(rs.getInt("sdt"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


