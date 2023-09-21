package com.tqk.pojo;

import com.tqk.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-09-10T20:22:16")
@StaticMetamodel(Role.class)
public class Role_ { 

    public static volatile SingularAttribute<Role, Integer> idRole;
    public static volatile SingularAttribute<Role, String> nameRole;
    public static volatile SetAttribute<Role, User> userSet;

}