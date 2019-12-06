package com.zzx.mongodb.service.insert;


import com.zzx.mongodb.PO.RolePO;
import com.zzx.mongodb.PO.UserPO;
import com.zzx.mongodb.config.EntityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class InsertInToMongoDB {
    private static final String collectionName="userPO";
    private static final String collectionName_rolePO="rolePO";

    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private EntityConfig entityConfig;


    /**
     * 【新增】文档如果主键id被占用会抛出异常
     * @return
     */
    public RolePO insert(){
        return mongoTemplate.insert(entityConfig.getRolePO());
    }

    /**
     * 向【指定数据库】新增文档数据
     * @return
     */
    public UserPO insertToDatabases(){
        return mongoTemplate.insert(entityConfig.getUserPO_one(),collectionName);
    }

    /**
     * 【批量】新增文档到指定数据库
     * @return
     */
    public Collection<RolePO> insertForeach(){
        return mongoTemplate.insert(entityConfig.getList(),collectionName_rolePO);
    }

    /**
     * 保存文档如果主键id被占用会【覆盖】旧的文档（save无法做批量保存）
     * @return
     */
    public RolePO save(){
        return mongoTemplate.save(entityConfig.getRolePO_one());
    }

    /**
     * 保存文档数据向【指定数据库】
     * @return
     */
    public UserPO saveToDatabases(){
        return mongoTemplate.save(entityConfig.getUserPO_one(),collectionName);
    }

}
