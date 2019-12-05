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

    @Autowired
    private MongoTemplate mongoTemplate;

    public void updateOne(String username,String password){
        Query query= Query.query(Criteria.where("username").is((username)));
        Update update=Update.update("password","654321");
        mongoTemplate.updateFirst(query,update, UserPO.class);
    }
}
