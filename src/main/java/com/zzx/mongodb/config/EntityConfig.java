package com.zzx.mongodb.config;

import com.zzx.mongodb.PO.RolePO;
import com.zzx.mongodb.PO.UserPO;

import java.util.ArrayList;
import java.util.List;

public class EntityConfig {
    RolePO rolePO=new RolePO();
    RolePO rolePO_one=new RolePO();
    UserPO userPO=new UserPO();
    UserPO userPO_one=new UserPO();

    public void setData(){
        rolePO.setRoleID("1");
        rolePO.setRoleName("老师");

        rolePO_one.setRoleID("2");
        rolePO_one.setRoleName("程序员");

        List<RolePO> list=new ArrayList<>();
        list.add(rolePO);
        list.add(rolePO_one);

        List<RolePO> list_one=new ArrayList<>();
        list_one.add(rolePO_one);

        userPO.setUserID("1");
        userPO.setUsername("zzx");
        userPO.setPassword("123456");
        userPO.setRoles(list_one);

        userPO_one.setUserID("2");
        userPO_one.setUsername("qq");
        userPO_one.setPassword("123456");
        userPO_one.setRoles(list);

    }
}
