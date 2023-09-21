/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqk.pojo;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "xe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Xe.findAll", query = "SELECT x FROM Xe x"),
    @NamedQuery(name = "Xe.findByIDXe", query = "SELECT x FROM Xe x WHERE x.iDXe = :iDXe"),
    @NamedQuery(name = "Xe.findByTenXe", query = "SELECT x FROM Xe x WHERE x.tenXe = :tenXe"),
    @NamedQuery(name = "Xe.findByBienSo", query = "SELECT x FROM Xe x WHERE x.bienSo = :bienSo")})
public class Xe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Xe")
    private Integer iDXe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "TenXe")
    private String tenXe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "BienSo")
    private String bienSo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDXe")
    private Set<Ghe> gheSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "xe")
    private Set<ChuyenxeXe> chuyenxeXeSet;

    public Xe() {
    }

    public Xe(Integer iDXe) {
        this.iDXe = iDXe;
    }

    public Xe(Integer iDXe, String tenXe, String bienSo) {
        this.iDXe = iDXe;
        this.tenXe = tenXe;
        this.bienSo = bienSo;
    }

    public Integer getIDXe() {
        return iDXe;
    }

    public void setIDXe(Integer iDXe) {
        this.iDXe = iDXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    @XmlTransient
    public Set<Ghe> getGheSet() {
        return gheSet;
    }

    public void setGheSet(Set<Ghe> gheSet) {
        this.gheSet = gheSet;
    }

    @XmlTransient
    public Set<ChuyenxeXe> getChuyenxeXeSet() {
        return chuyenxeXeSet;
    }

    public void setChuyenxeXeSet(Set<ChuyenxeXe> chuyenxeXeSet) {
        this.chuyenxeXeSet = chuyenxeXeSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDXe != null ? iDXe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Xe)) {
            return false;
        }
        Xe other = (Xe) object;
        if ((this.iDXe == null && other.iDXe != null) || (this.iDXe != null && !this.iDXe.equals(other.iDXe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqk.pojo.Xe[ iDXe=" + iDXe + " ]";
    }
    
}
