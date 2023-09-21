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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "ghe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ghe.findAll", query = "SELECT g FROM Ghe g"),
    @NamedQuery(name = "Ghe.findByIDGhe", query = "SELECT g FROM Ghe g WHERE g.iDGhe = :iDGhe"),
    @NamedQuery(name = "Ghe.findByTinhTrangGhe", query = "SELECT g FROM Ghe g WHERE g.tinhTrangGhe = :tinhTrangGhe"),
    @NamedQuery(name = "Ghe.findByThuTuGhe", query = "SELECT g FROM Ghe g WHERE g.thuTuGhe = :thuTuGhe")})
public class Ghe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Ghe")
    private Integer iDGhe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TinhTrangGhe")
    private boolean tinhTrangGhe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ThuTuGhe")
    private int thuTuGhe;
    @JoinColumn(name = "ID_Xe", referencedColumnName = "ID_Xe")
    @ManyToOne(optional = false)
    private Xe iDXe;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDGhe")
    private Set<Vexe> vexeSet;

    public Ghe() {
    }

    public Ghe(Integer iDGhe) {
        this.iDGhe = iDGhe;
    }

    public Ghe(Integer iDGhe, boolean tinhTrangGhe, int thuTuGhe) {
        this.iDGhe = iDGhe;
        this.tinhTrangGhe = tinhTrangGhe;
        this.thuTuGhe = thuTuGhe;
    }

    public Integer getIDGhe() {
        return iDGhe;
    }

    public void setIDGhe(Integer iDGhe) {
        this.iDGhe = iDGhe;
    }

    public boolean getTinhTrangGhe() {
        return tinhTrangGhe;
    }

    public void setTinhTrangGhe(boolean tinhTrangGhe) {
        this.tinhTrangGhe = tinhTrangGhe;
    }

    public int getThuTuGhe() {
        return thuTuGhe;
    }

    public void setThuTuGhe(int thuTuGhe) {
        this.thuTuGhe = thuTuGhe;
    }

    public Xe getIDXe() {
        return iDXe;
    }

    public void setIDXe(Xe iDXe) {
        this.iDXe = iDXe;
    }

    @XmlTransient
    public Set<Vexe> getVexeSet() {
        return vexeSet;
    }

    public void setVexeSet(Set<Vexe> vexeSet) {
        this.vexeSet = vexeSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDGhe != null ? iDGhe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ghe)) {
            return false;
        }
        Ghe other = (Ghe) object;
        if ((this.iDGhe == null && other.iDGhe != null) || (this.iDGhe != null && !this.iDGhe.equals(other.iDGhe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqk.pojo.Ghe[ iDGhe=" + iDGhe + " ]";
    }
    
}
