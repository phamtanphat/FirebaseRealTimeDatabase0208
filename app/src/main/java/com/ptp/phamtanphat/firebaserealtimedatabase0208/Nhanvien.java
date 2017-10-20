package com.ptp.phamtanphat.firebaserealtimedatabase0208;

/**
 * Created by KhoaPhamPC on 20/10/2017.
 */

public class Nhanvien {
    private String Tennv;
    private Integer Tuoinv;

    public Nhanvien() {
    }

    public Nhanvien(String tennv, Integer tuoinv) {
        Tennv = tennv;
        Tuoinv = tuoinv;
    }

    public String getTennv() {
        return Tennv;
    }

    public void setTennv(String tennv) {
        Tennv = tennv;
    }

    public Integer getTuoinv() {
        return Tuoinv;
    }

    public void setTuoinv(Integer tuoinv) {
        Tuoinv = tuoinv;
    }
}
