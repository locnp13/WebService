/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vunx.entity;

import java.sql.Date;

/**
 *
 * @author vunx
 */
public class Student {
    private String so_bao_danh;
    private String ho_va_ten; 
    private Date ngay_sinh; 
    private String khoi_nganh; 
    private float diem_mon_1; 
    private float diem_mon_2; 
    private float diem_mon_3;

    public String getSo_bao_danh() {
        return so_bao_danh;
    }

    public String getHo_va_ten() {
        return ho_va_ten;
    }

    public Date getNgay_sinh() {
        return ngay_sinh;
    }

    public String getKhoi_nganh() {
        return khoi_nganh;
    }

    public float getDiem_mon_1() {
        return diem_mon_1;
    }

    public float getDiem_mon_2() {
        return diem_mon_2;
    }

    public float getDiem_mon_3() {
        return diem_mon_3;
    }

    public void setSo_bao_danh(String so_bao_danh) {
        this.so_bao_danh = so_bao_danh;
    }

    public void setHo_va_ten(String ho_va_ten) {
        this.ho_va_ten = ho_va_ten;
    }

    public void setNgay_sinh(Date ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public void setKhoi_nganh(String khoi_nganh) {
        this.khoi_nganh = khoi_nganh;
    }

    public void setDiem_mon_1(float diem_mon_1) {
        this.diem_mon_1 = diem_mon_1;
    }

    public void setDiem_mon_2(float diem_mon_2) {
        this.diem_mon_2 = diem_mon_2;
    }

    public void setDiem_mon_3(float diem_mon_3) {
        this.diem_mon_3 = diem_mon_3;
    }

    @Override
    public String toString() {
        return "Student{" + "so_bao_danh=" + so_bao_danh + ", ho_va_ten=" + ho_va_ten + ", ngay_sinh=" + ngay_sinh + ", khoi_nganh=" + khoi_nganh + ", diem_mon_1=" + diem_mon_1 + ", diem_mon_2=" + diem_mon_2 + ", diem_mon_3=" + diem_mon_3 + '}';
    }
    
}
