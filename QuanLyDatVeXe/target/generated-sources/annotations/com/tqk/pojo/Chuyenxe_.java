package com.tqk.pojo;

import com.tqk.pojo.Benxe;
import com.tqk.pojo.Binhluan;
import com.tqk.pojo.ChuyenxeXe;
import com.tqk.pojo.Vexe;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-09-10T20:22:16")
@StaticMetamodel(Chuyenxe.class)
public class Chuyenxe_ { 

    public static volatile SingularAttribute<Chuyenxe, String> tenCX;
    public static volatile SingularAttribute<Chuyenxe, String> giaChuyen;
    public static volatile SetAttribute<Chuyenxe, Binhluan> binhluanSet;
    public static volatile SetAttribute<Chuyenxe, Vexe> vexeSet;
    public static volatile SetAttribute<Chuyenxe, ChuyenxeXe> chuyenxeXeSet;
    public static volatile SingularAttribute<Chuyenxe, Integer> iDChuyenXe;
    public static volatile SingularAttribute<Chuyenxe, Benxe> iDbenDi;
    public static volatile SingularAttribute<Chuyenxe, Benxe> iDbenDen;

}