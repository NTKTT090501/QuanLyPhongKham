/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;



/**
 *
 * @author HA NAM
 */
public class BacSi {
    String MaBS;
    String TenBS;
    String Chuyennganh;
    String Ngaysinh;   
    String SDT;
    boolean Gioitinh;
    String diaChi;
 
    public String getMaBS() {
        return MaBS;
    }

    public void setMaBS(String MaBS) {
        this.MaBS = MaBS;
    }

    public String getTenBS() {
        return TenBS;
    }

    public void setTenBS(String TenBS) {
        this.TenBS = TenBS;
    }

    public boolean getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(boolean Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getDiachi() {
        return diaChi;
    }

    public void setDiachi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getChuyennganh() {
        return Chuyennganh;
    }

    public void setChuyennganh(String Chuyennganh) {
        this.Chuyennganh = Chuyennganh;
    }
}
