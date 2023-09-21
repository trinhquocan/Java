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
@Table(name = "benxe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Benxe.findAll", query = "SELECT b FROM Benxe b"),
    @NamedQuery(name = "Benxe.findByIDBen", query = "SELECT b FROM Benxe b WHERE b.iDBen = :iDBen"),
    @NamedQuery(name = "Benxe.findByTenBen", query = "SELECT b FROM Benxe b WHERE b.tenBen = :tenBen")})
public class Benxe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Ben")
    private Integer iDBen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "TenBen")
    private String tenBen;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDbenDen")
    private Set<Chuyenxe> chuyenxeSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDbenDi")
    private Set<Chuyenxe> chuyenxeSet1;

    public Benxe() {
    }

    public Benxe(Integer iDBen) {
        this.iDBen = iDBen;
    }

    public Benxe(Integer iDBen, String tenBen) {
        this.iDBen = iDBen;
        this.tenBen = tenBen;
    }

    public Integer getIDBen() {
        return iDBen;
    }

    public void setIDBen(Integer iDBen) {
        this.iDBen = iDBen;
    }

    public String getTenBen() {
        return tenBen;
    }

    public void setTenBen(String tenBen) {
        this.tenBen = tenBen;
    }

    @XmlTransient
    public Set<Chuyenxe> getChuyenxeSet() {
        return chuyenxeSet;
    }

    public void setChuyenxeSet(Set<Chuyenxe> chuyenxeSet) {
        this.chuyenxeSet = chuyenxeSet;
    }

    @XmlTransient
    public Set<Chuyenxe> getChuyenxeSet1() {
        return chuyenxeSet1;
    }

    public void setChuyenxeSet1(Set<Chuyenxe> chuyenxeSet1) {
        this.chuyenxeSet1 = chuyenxeSet1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDBen != null ? iDBen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Benxe)) {
            return false;
        }
        Benxe other = (Benxe) object;
        if ((this.iDBen == null && other.iDBen != null) || (this.iDBen != null && !this.iDBen.equals(other.iDBen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqk.pojo.Benxe[ iDBen=" + iDBen + " ]";
    }
    
}
