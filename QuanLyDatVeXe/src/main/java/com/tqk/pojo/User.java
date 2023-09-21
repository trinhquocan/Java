/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqk.pojo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
    @NamedQuery(name = "User.findByUserId", query = "SELECT u FROM User u WHERE u.userId = :userId"),
    @NamedQuery(name = "User.findByUserFullname", query = "SELECT u FROM User u WHERE u.userFullname = :userFullname"),
    @NamedQuery(name = "User.findByUserIdCard", query = "SELECT u FROM User u WHERE u.userIdCard = :userIdCard"),
    @NamedQuery(name = "User.findByUserPhoneNumber", query = "SELECT u FROM User u WHERE u.userPhoneNumber = :userPhoneNumber"),
    @NamedQuery(name = "User.findByUserDateOfBirth", query = "SELECT u FROM User u WHERE u.userDateOfBirth = :userDateOfBirth"),
    @NamedQuery(name = "User.findByUserDateJoin", query = "SELECT u FROM User u WHERE u.userDateJoin = :userDateJoin"),
    @NamedQuery(name = "User.findByUsername", query = "SELECT u FROM User u WHERE u.username = :username"),
    @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password"),
    @NamedQuery(name = "User.findByUserAddress", query = "SELECT u FROM User u WHERE u.userAddress = :userAddress")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "user_fullname")
    private String userFullname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "user_id_card")
    private String userIdCard;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "user_phone_number")
    private String userPhoneNumber;
    @Column(name = "user_date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date userDateOfBirth;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_date_join")
    @Temporal(TemporalType.DATE)
    private Date userDateJoin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "user_address")
    private String userAddress;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Set<Binhluan> binhluanSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDNhanVien")
    private Set<Vexe> vexeSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDKhachHang")
    private Set<Vexe> vexeSet1;
    @JoinColumn(name = "role_id", referencedColumnName = "id_role")
    @ManyToOne(optional = false)
    private Role roleId;

    public User() {
    }

    public User(Integer userId) {
        this.userId = userId;
    }

    public User(Integer userId, String userFullname, String userIdCard, String userPhoneNumber, Date userDateJoin, String username, String password, String userAddress) {
        this.userId = userId;
        this.userFullname = userFullname;
        this.userIdCard = userIdCard;
        this.userPhoneNumber = userPhoneNumber;
        this.userDateJoin = userDateJoin;
        this.username = username;
        this.password = password;
        this.userAddress = userAddress;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserFullname() {
        return userFullname;
    }

    public void setUserFullname(String userFullname) {
        this.userFullname = userFullname;
    }

    public String getUserIdCard() {
        return userIdCard;
    }

    public void setUserIdCard(String userIdCard) {
        this.userIdCard = userIdCard;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public Date getUserDateOfBirth() {
        return userDateOfBirth;
    }

    public void setUserDateOfBirth(Date userDateOfBirth) {
        this.userDateOfBirth = userDateOfBirth;
    }

    public Date getUserDateJoin() {
        return userDateJoin;
    }

    public void setUserDateJoin(Date userDateJoin) {
        this.userDateJoin = userDateJoin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
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
    public Set<Vexe> getVexeSet1() {
        return vexeSet1;
    }

    public void setVexeSet1(Set<Vexe> vexeSet1) {
        this.vexeSet1 = vexeSet1;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqk.pojo.User[ userId=" + userId + " ]";
    }
    
}
