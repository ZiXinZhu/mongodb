package com.zzx.mongodb.update;


import com.zzx.mongodb.PO.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;


@Service
public class UpdateMongoDB {

    private static final String collectionName="userPO";

    @Autowired
    private MongoTemplate mongoTemplate;

    public long updateOne(){
        Query query= Query.query(Criteria.where("username").is(("zzx")));
        Update update=Update.update("password","654321");
        return mongoTemplate.updateFirst(query,update, UserPO.class).getModifiedCount();
    }

    public long updateMulti(){
        Query query= Query.query(Criteria.where("roles.roleName").is(("程序员")));
        Update update=Update.update("password","654321");
       return mongoTemplate.updateMulti(query,update, UserPO.class,collectionName).getModifiedCount();
    }

    public UserPO findAndModify(){
        Query query= Query.query(Criteria.where("roles.roleName").is(("程序员")));
        Update update=Update.update("password","123456");
        return mongoTemplate.findAndModify(query,update, UserPO.class,collectionName);
    }
}
