package com.zzx.mongodb.controller;


import com.zzx.mongodb.PO.RolePO;
import com.zzx.mongodb.PO.UserPO;
import com.zzx.mongodb.insert.InsertInToMongoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class InsertController {

    @Autowired
    private InsertInToMongoDB insertInToMongoDB;

    /**
     * 新增文档如果主键id被占用会抛出异常
     * @return
     */
    @GetMapping("/insert")
    public RolePO insert(){
       return insertInToMongoDB.insert();
    }

    /**
     * 向指定数据库新增文档数据
     * @return
     */
    @GetMapping("/insert/collection")
    public UserPO insertCollection(){
        return insertInToMongoDB.insertToDatabases();
    }

    /**
     * 批量新增文档到指定数据库
     * @return
     */
    @GetMapping("/insert/foreach")
    public Collection<RolePO> insertForeach(){
        return insertInToMongoDB.insertForeach();
    }


    /**
     * 保存文档如果主键id被占用会覆盖旧的文档（save无法做批量保存）
     * @return
     */
    @GetMapping("/save")
    public RolePO save(){
        return insertInToMongoDB.save();
    }

    /**
     * 保存文档数据向指定数据库
     * @return
     */
    @GetMapping("/save/collection")
    public UserPO saveCollection(){
        return insertInToMongoDB.saveToDatabases();
    }

}
