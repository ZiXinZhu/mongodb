package com.zzx.mongodb.controller;

import com.zzx.mongodb.PO.UserPO;
import com.zzx.mongodb.select.SelectFromMongoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SelectController {

    @Autowired
    SelectFromMongoDB selectFromMongoDB;

    /**
     * 查找符合要求的【所有】数据并返回
     * @return
     */
    @GetMapping("/select")
    public List<UserPO> select(){
        return selectFromMongoDB.select();
    }

    /**
     * 查找符合要求的【第一条】数据并返回
     * @return
     */
    @GetMapping("/select/one")
    public UserPO selectOne(){
        return selectFromMongoDB.selectOne();
    }




}
