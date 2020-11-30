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
 

    /**
     * @return the MaBS
     */
    public String getMaBS() {
        return MaBS;
    }

    /**
     * @param MaBS the MaBS to set
     */
    public void setMaBS(String MaBS) {
        this.MaBS = MaBS;
    }

    public boolean isGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(boolean Gioitinh) {
        this.Gioitinh = Gioitinh;
    }
    /**
     * @return the TenBS
     */
    public String getTenBS() {
        return TenBS;
    }

    /**
     * @param TenBS the TenBS to set
     */
    public void setTenBS(String TenBS) {
        this.TenBS = TenBS;
    }

    /**
     * @return the SDT
     */
    public String getSDT() {
        return SDT;
    }

    /**
     * @param SDT the SDT to set
     */
    public void setSDT(String SDT) {
        this.SDT = SDT;
    }


    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }


    /**
     * @return the Diachi
     */

    public String getDiachi() {
        return diaChi;
    }

    public void setDiachi(String diaChi) {
        this.diaChi = diaChi;
    }
    /**
     * @return the Chuyennganh
     */
    public String getChuyennganh() {
        return Chuyennganh;
    }

    /**
     * @param Chuyennganh the Chuyennganh to set
     */
    public void setChuyennganh(String Chuyennganh) {
        this.Chuyennganh = Chuyennganh;
    }
}
