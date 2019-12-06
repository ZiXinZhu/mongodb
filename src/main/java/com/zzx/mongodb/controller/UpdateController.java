package com.zzx.mongodb.controller;


import com.zzx.mongodb.PO.UserPO;
import com.zzx.mongodb.service.update.UpdateMongoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateController {

    @Autowired
    UpdateMongoDB updateMongoDB;

    /**
     * 修改【第一条】符合条件的文档
     * @return
     */
    @GetMapping("/update")
    public long updateOne(){
        return updateMongoDB.updateOne();
    }

    /**
     * 修改符合内嵌数据条件的文档【批量修改】
     * @return
     */
    @GetMapping("/update/multi")
    public long updateMulti(){
        return updateMongoDB.updateMulti();
    }


    /**
     * 修改第一条符合条件的文档并返回修改前的文档【原子操作】
     * @return
     */
    @GetMapping("/update/modify")
    public UserPO findAndModify(){
        return updateMongoDB.findAndModify();
    }
}
