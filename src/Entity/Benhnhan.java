/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author HA NAM
 */
public class Benhnhan {
    String maBN; 
    String hoTen;
    String ngaySinh;
    boolean gioiTinh;
    String diaChi;
    boolean baoHiem;
    int sdT;

    public int getSdT() {
        return sdT;
    }

    public void setSdT(int sdT) {
        this.sdT = sdT;
    }

    public String getMaBN() {
        return maBN;
    }

    public void setMaBN(String maBN) {
        this.maBN = maBN;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean getBaoHiem() {
        return baoHiem;
    }

    public void setBaoHiem(boolean baoHiem) {
        this.baoHiem = baoHiem;
    }
    
    
}