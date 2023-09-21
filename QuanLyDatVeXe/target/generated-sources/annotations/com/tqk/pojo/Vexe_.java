package com.tqk.pojo;

import com.tqk.pojo.Chuyenxe;
import com.tqk.pojo.Ghe;
import com.tqk.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-09-10T20:22:16")
@StaticMetamodel(Vexe.class)
public class Vexe_ { 

    public static volatile SingularAttribute<Vexe, User> iDNhanVien;
    public static volatile SingularAttribute<Vexe, Integer> iDVeXe;
    public static volatile SingularAttribute<Vexe, Short> isConfirm;
    public static volatile SingularAttribute<Vexe, Date> ngayIn;
    public static volatile SingularAttribute<Vexe, Chuyenxe> iDChuyenXe;
    public static volatile SingularAttribute<Vexe, Ghe> iDGhe;
    public static volatile SingularAttribute<Vexe, User> iDKhachHang;

}