/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqk.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author ADMIN
 */
@Embeddable
public class ChuyenxeXePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ChuyenXe")
    private int iDChuyenXe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Xe")
    private int iDXe;

    public ChuyenxeXePK() {
    }

    public ChuyenxeXePK(int iDChuyenXe, int iDXe) {
        this.iDChuyenXe = iDChuyenXe;
        this.iDXe = iDXe;
    }

    public int getIDChuyenXe() {
        return iDChuyenXe;
    }

    public void setIDChuyenXe(int iDChuyenXe) {
        this.iDChuyenXe = iDChuyenXe;
    }

    public int getIDXe() {
        return iDXe;
    }

    public void setIDXe(int iDXe) {
        this.iDXe = iDXe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) iDChuyenXe;
        hash += (int) iDXe;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChuyenxeXePK)) {
            return false;
        }
        ChuyenxeXePK other = (ChuyenxeXePK) object;
        if (this.iDChuyenXe != other.iDChuyenXe) {
            return false;
        }
        if (this.iDXe != other.iDXe) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqk.pojo.ChuyenxeXePK[ iDChuyenXe=" + iDChuyenXe + ", iDXe=" + iDXe + " ]";
    }
    
}
