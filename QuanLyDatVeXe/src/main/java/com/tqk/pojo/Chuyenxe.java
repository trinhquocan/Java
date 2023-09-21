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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "chuyenxe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chuyenxe.findAll", query = "SELECT c FROM Chuyenxe c"),
    @NamedQuery(name = "Chuyenxe.findByIDChuyenXe", query = "SELECT c FROM Chuyenxe c WHERE c.iDChuyenXe = :iDChuyenXe"),
    @NamedQuery(name = "Chuyenxe.findByTenCX", query = "SELECT c FROM Chuyenxe c WHERE c.tenCX = :tenCX"),
    @NamedQuery(name = "Chuyenxe.findByGiaChuyen", query = "SELECT c FROM Chuyenxe c WHERE c.giaChuyen = :giaChuyen")})
public class Chuyenxe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ChuyenXe")
    private Integer iDChuyenXe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tenCX")
    private String tenCX;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "giaChuyen")
    private String giaChuyen;
    @JoinColumn(name = "ID_benDen", referencedColumnName = "ID_Ben")
    @ManyToOne(optional = false)
    private Benxe iDbenDen;
    @JoinColumn(name = "ID_benDi", referencedColumnName = "ID_Ben")
    @ManyToOne(optional = false)
    private Benxe iDbenDi;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idchuyenxe")
    private Set<Binhluan> binhluanSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDChuyenXe")
    private Set<Vexe> vexeSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "chuyenxe")
    private Set<ChuyenxeXe> chuyenxeXeSet;

    public Chuyenxe() {
    }

    public Chuyenxe(Integer iDChuyenXe) {
        this.iDChuyenXe = iDChuyenXe;
    }

    public Chuyenxe(Integer iDChuyenXe, String tenCX, String giaChuyen) {
        this.iDChuyenXe = iDChuyenXe;
        this.tenCX = tenCX;
        this.giaChuyen = giaChuyen;
    }

    public Integer getIDChuyenXe() {
        return iDChuyenXe;
    }

    public void setIDChuyenXe(Integer iDChuyenXe) {
        this.iDChuyenXe = iDChuyenXe;
    }

    public String getTenCX() {
        return tenCX;
    }

    public void setTenCX(String tenCX) {
        this.tenCX = tenCX;
    }

    public String getGiaChuyen() {
        return giaChuyen;
    }

    public void setGiaChuyen(String giaChuyen) {
        this.giaChuyen = giaChuyen;
    }

    public Benxe getIDbenDen() {
        return iDbenDen;
    }

    public void setIDbenDen(Benxe iDbenDen) {
        this.iDbenDen = iDbenDen;
    }

    public Benxe getIDbenDi() {
        return iDbenDi;
    }

    public void setIDbenDi(Benxe iDbenDi) {
        this.iDbenDi = iDbenDi;
    }

    @XmlTransient
    public Set<Binhluan> getBinhluanSet() {
        return binhluanSet;
    }

    public void setBinhluanSet(Set<Binhluan> binhluanSet) {
        this.binhluanSet = binhluanSet;
    }

    @XmlTransient
    public Set<Vexe> getVexeSet() {
        return vexeSet;
    }

    public void setVexeSet(Set<Vexe> vexeSet) {
        this.vexeSet = vexeSet;
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
        hash += (iDChuyenXe != null ? iDChuyenXe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chuyenxe)) {
            return false;
        }
        Chuyenxe other = (Chuyenxe) object;
        if ((this.iDChuyenXe == null && other.iDChuyenXe != null) || (this.iDChuyenXe != null && !this.iDChuyenXe.equals(other.iDChuyenXe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqk.pojo.Chuyenxe[ iDChuyenXe=" + iDChuyenXe + " ]";
    }
    
    
    
}
