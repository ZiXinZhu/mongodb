package com.zzx.mongodb.select;

import com.zzx.mongodb.PO.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectFromMongoDB {
    private static final String collectionName="userPO";

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<UserPO> select(){
        Query query=Query.query(Criteria.where("roles.roleName").is("程序员"));
       return mongoTemplate.find(query,UserPO.class,collectionName);
    }

    public UserPO selectOne(){
        Query query=Query.query(Criteria.where("roles.roleName").is("程序员"));
        return mongoTemplate.findOne(query,UserPO.class,collectionName);
    }


}
