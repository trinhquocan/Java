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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "binhluan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Binhluan.findAll", query = "SELECT b FROM Binhluan b"),
    @NamedQuery(name = "Binhluan.findByIdBinhluan", query = "SELECT b FROM Binhluan b WHERE b.idBinhluan = :idBinhluan"),
    @NamedQuery(name = "Binhluan.findByContent", query = "SELECT b FROM Binhluan b WHERE b.content = :content"),
    @NamedQuery(name = "Binhluan.findByCreatedAt", query = "SELECT b FROM Binhluan b WHERE b.createdAt = :createdAt")})
public class Binhluan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_binhluan")
    private Integer idBinhluan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "content")
    private String content;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @JoinColumn(name = "Id_chuyenxe", referencedColumnName = "ID_ChuyenXe")
    @ManyToOne(optional = false)
    private Chuyenxe idchuyenxe;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private User userId;

    public Binhluan() {
    }

    public Binhluan(Integer idBinhluan) {
        this.idBinhluan = idBinhluan;
    }

    public Binhluan(Integer idBinhluan, String content) {
        this.idBinhluan = idBinhluan;
        this.content = content;
    }

    public Integer getIdBinhluan() {
        return idBinhluan;
    }

    public void setIdBinhluan(Integer idBinhluan) {
        this.idBinhluan = idBinhluan;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Chuyenxe getIdchuyenxe() {
        return idchuyenxe;
    }

    public void setIdchuyenxe(Chuyenxe idchuyenxe) {
        this.idchuyenxe = idchuyenxe;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBinhluan != null ? idBinhluan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Binhluan)) {
            return false;
        }
        Binhluan other = (Binhluan) object;
        if ((this.idBinhluan == null && other.idBinhluan != null) || (this.idBinhluan != null && !this.idBinhluan.equals(other.idBinhluan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqk.pojo.Binhluan[ idBinhluan=" + idBinhluan + " ]";
    }
    
}
