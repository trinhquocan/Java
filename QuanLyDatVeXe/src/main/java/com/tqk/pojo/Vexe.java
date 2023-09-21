/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqk.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "vexe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vexe.findAll", query = "SELECT v FROM Vexe v"),
    @NamedQuery(name = "Vexe.findByIDVeXe", query = "SELECT v FROM Vexe v WHERE v.iDVeXe = :iDVeXe"),
    @NamedQuery(name = "Vexe.findByNgayIn", query = "SELECT v FROM Vexe v WHERE v.ngayIn = :ngayIn"),
    @NamedQuery(name = "Vexe.findByIsConfirm", query = "SELECT v FROM Vexe v WHERE v.isConfirm = :isConfirm")})
public class Vexe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_VeXe")
    private Integer iDVeXe;
    @Column(name = "NgayIn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayIn;
    @Column(name = "isConfirm")
    private Short isConfirm;
    @JoinColumn(name = "ID_ChuyenXe", referencedColumnName = "ID_ChuyenXe")
    @ManyToOne(optional = false)
    private Chuyenxe iDChuyenXe;
    @JoinColumn(name = "ID_Ghe", referencedColumnName = "ID_Ghe")
    @ManyToOne(optional = false)
    private Ghe iDGhe;
    @JoinColumn(name = "ID_NhanVien", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private User iDNhanVien;
    @JoinColumn(name = "ID_KhachHang", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private User iDKhachHang;

    public Vexe() {
    }

    public Vexe(Integer iDVeXe) {
        this.iDVeXe = iDVeXe;
    }

    public Integer getIDVeXe() {
        return iDVeXe;
    }

    public void setIDVeXe(Integer iDVeXe) {
        this.iDVeXe = iDVeXe;
    }

    public Date getNgayIn() {
        return ngayIn;
    }

    public void setNgayIn(Date ngayIn) {
        this.ngayIn = ngayIn;
    }

    public Short getIsConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(Short isConfirm) {
        this.isConfirm = isConfirm;
    }

    public Chuyenxe getIDChuyenXe() {
        return iDChuyenXe;
    }

    public void setIDChuyenXe(Chuyenxe iDChuyenXe) {
        this.iDChuyenXe = iDChuyenXe;
    }

    public Ghe getIDGhe() {
        return iDGhe;
    }

    public void setIDGhe(Ghe iDGhe) {
        this.iDGhe = iDGhe;
    }

    public User getIDNhanVien() {
        return iDNhanVien;
    }

    public void setIDNhanVien(User iDNhanVien) {
        this.iDNhanVien = iDNhanVien;
    }

    public User getIDKhachHang() {
        return iDKhachHang;
    }

    public void setIDKhachHang(User iDKhachHang) {
        this.iDKhachHang = iDKhachHang;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDVeXe != null ? iDVeXe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vexe)) {
            return false;
        }
        Vexe other = (Vexe) object;
        if ((this.iDVeXe == null && other.iDVeXe != null) || (this.iDVeXe != null && !this.iDVeXe.equals(other.iDVeXe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqk.pojo.Vexe[ iDVeXe=" + iDVeXe + " ]";
    }
    
}
