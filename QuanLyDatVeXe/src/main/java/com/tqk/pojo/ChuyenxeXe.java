/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqk.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "chuyenxe_xe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ChuyenxeXe.findAll", query = "SELECT c FROM ChuyenxeXe c"),
    @NamedQuery(name = "ChuyenxeXe.findByIDChuyenXe", query = "SELECT c FROM ChuyenxeXe c WHERE c.chuyenxeXePK.iDChuyenXe = :iDChuyenXe"),
    @NamedQuery(name = "ChuyenxeXe.findByIDXe", query = "SELECT c FROM ChuyenxeXe c WHERE c.chuyenxeXePK.iDXe = :iDXe"),
    @NamedQuery(name = "ChuyenxeXe.findByGioKhoiHanh", query = "SELECT c FROM ChuyenxeXe c WHERE c.gioKhoiHanh = :gioKhoiHanh")})
public class ChuyenxeXe implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ChuyenxeXePK chuyenxeXePK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "gioKhoiHanh")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gioKhoiHanh;
    @JoinColumn(name = "ID_ChuyenXe", referencedColumnName = "ID_ChuyenXe", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Chuyenxe chuyenxe;
    @JoinColumn(name = "ID_Xe", referencedColumnName = "ID_Xe", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Xe xe;

    public ChuyenxeXe() {
    }

    public ChuyenxeXe(ChuyenxeXePK chuyenxeXePK) {
        this.chuyenxeXePK = chuyenxeXePK;
    }

    public ChuyenxeXe(ChuyenxeXePK chuyenxeXePK, Date gioKhoiHanh) {
        this.chuyenxeXePK = chuyenxeXePK;
        this.gioKhoiHanh = gioKhoiHanh;
    }

    public ChuyenxeXe(int iDChuyenXe, int iDXe) {
        this.chuyenxeXePK = new ChuyenxeXePK(iDChuyenXe, iDXe);
    }

    public ChuyenxeXePK getChuyenxeXePK() {
        return chuyenxeXePK;
    }

    public void setChuyenxeXePK(ChuyenxeXePK chuyenxeXePK) {
        this.chuyenxeXePK = chuyenxeXePK;
    }

    public Date getGioKhoiHanh() {
        return gioKhoiHanh;
    }

    public void setGioKhoiHanh(Date gioKhoiHanh) {
        this.gioKhoiHanh = gioKhoiHanh;
    }

    public Chuyenxe getChuyenxe() {
        return chuyenxe;
    }

    public void setChuyenxe(Chuyenxe chuyenxe) {
        this.chuyenxe = chuyenxe;
    }

    public Xe getXe() {
        return xe;
    }

    public void setXe(Xe xe) {
        this.xe = xe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chuyenxeXePK != null ? chuyenxeXePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChuyenxeXe)) {
            return false;
        }
        ChuyenxeXe other = (ChuyenxeXe) object;
        if ((this.chuyenxeXePK == null && other.chuyenxeXePK != null) || (this.chuyenxeXePK != null && !this.chuyenxeXePK.equals(other.chuyenxeXePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqk.pojo.ChuyenxeXe[ chuyenxeXePK=" + chuyenxeXePK + " ]";
    }
    
}
