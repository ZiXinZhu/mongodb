package com.zzx.mongodb.insert;


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

    public RolePO insert(){
        return mongoTemplate.insert(entityConfig.getRolePO());
    }
    public UserPO insertToDatabases(){
        return mongoTemplate.insert(entityConfig.getUserPO_one(),collectionName);
    }
    public Collection<RolePO> insertForeach(){
        return mongoTemplate.insert(entityConfig.getList(),collectionName_rolePO);
    }



    public RolePO save(){
        return mongoTemplate.save(entityConfig.getRolePO_one());
    }
    public UserPO saveToDatabases(){
        return mongoTemplate.save(entityConfig.getUserPO_one(),collectionName);
    }

}
