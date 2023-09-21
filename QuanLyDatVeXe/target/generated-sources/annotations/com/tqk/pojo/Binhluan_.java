package com.tqk.pojo;

import com.tqk.pojo.Chuyenxe;
import com.tqk.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-09-10T20:22:16")
@StaticMetamodel(Binhluan.class)
public class Binhluan_ { 

    public static volatile SingularAttribute<Binhluan, Date> createdAt;
    public static volatile SingularAttribute<Binhluan, Integer> idBinhluan;
    public static volatile SingularAttribute<Binhluan, Chuyenxe> idchuyenxe;
    public static volatile SingularAttribute<Binhluan, User> userId;
    public static volatile SingularAttribute<Binhluan, String> content;

}