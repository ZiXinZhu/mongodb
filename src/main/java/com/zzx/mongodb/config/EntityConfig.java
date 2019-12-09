package com.zzx.mongodb.config;

import com.zzx.mongodb.PO.RolePO;
import com.zzx.mongodb.PO.UserPO;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * created by zzx
 */
@Service
public class EntityConfig {
    private RolePO rolePO=new RolePO();
    private RolePO rolePO_one=new RolePO();
    private UserPO userPO=new UserPO();
    private UserPO userPO_one=new UserPO();
    private List<RolePO> list=new ArrayList<>();
    private List<RolePO> list_one=new ArrayList<>();
    @PostConstruct
    public void setData(){
        rolePO.setRoleID("1");
        rolePO.setRoleName("老师");

        rolePO_one.setRoleID("2");
        rolePO_one.setRoleName("程序员");


        list.add(rolePO);
        list.add(rolePO_one);


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

    public List<RolePO> getList() {
        return list;
    }

    public void setList(List<RolePO> list) {
        this.list = list;
    }

    public List<RolePO> getList_one() {
        return list_one;
    }

    public void setList_one(List<RolePO> list_one) {
        this.list_one = list_one;
    }

    public RolePO getRolePO() {
        return rolePO;
    }

    public void setRolePO(RolePO rolePO) {
        this.rolePO = rolePO;
    }

    public RolePO getRolePO_one() {
        return rolePO_one;
    }

    public void setRolePO_one(RolePO rolePO_one) {
        this.rolePO_one = rolePO_one;
    }

    public UserPO getUserPO() {
        return userPO;
    }

    public void setUserPO(UserPO userPO) {
        this.userPO = userPO;
    }

    public UserPO getUserPO_one() {
        return userPO_one;
    }

    public void setUserPO_one(UserPO userPO_one) {
        this.userPO_one = userPO_one;
    }


}
