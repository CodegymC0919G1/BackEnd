package com.codegym.dao.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="thong_bao")
public class ThongBao {
    @Id
    @Column(name = "id_thong_bao")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idThongBao;

    @Column(name = "tieu_de")
    private String tieuDe;

    @Column(name = "noi_dung")
    private String noiDung;

    @Column(name = "thoi_gian_thong_bao")
    private Date thoiGianThongBao;

    public int getIdThongBao() {
        return idThongBao;
    }

    public void setIdThongBao(int idThongBao) {
        this.idThongBao = idThongBao;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public Date getThoiGianThongBao() {
        return thoiGianThongBao;
    }

    public void setThoiGianThongBao(Date thoiGianThongBao) {
        this.thoiGianThongBao = thoiGianThongBao;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public ThongBao() {
    }

}
