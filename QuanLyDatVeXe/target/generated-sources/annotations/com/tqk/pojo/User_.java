package com.tqk.pojo;

import com.tqk.pojo.Binhluan;
import com.tqk.pojo.Role;
import com.tqk.pojo.Vexe;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-09-10T20:22:16")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SetAttribute<User, Vexe> vexeSet;
    public static volatile SingularAttribute<User, Role> roleId;
    public static volatile SingularAttribute<User, String> userIdCard;
    public static volatile SingularAttribute<User, String> userPhoneNumber;
    public static volatile SingularAttribute<User, Integer> userId;
    public static volatile SingularAttribute<User, String> userAddress;
    public static volatile SingularAttribute<User, Date> userDateJoin;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SetAttribute<User, Binhluan> binhluanSet;
    public static volatile SetAttribute<User, Vexe> vexeSet1;
    public static volatile SingularAttribute<User, String> userFullname;
    public static volatile SingularAttribute<User, Date> userDateOfBirth;
    public static volatile SingularAttribute<User, String> username;

}