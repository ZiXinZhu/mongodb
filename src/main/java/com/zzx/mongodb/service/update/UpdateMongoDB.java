package com.zzx.mongodb.service.update;


import com.zzx.mongodb.PO.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;


@Service
public class UpdateMongoDB {

    private static final String collectionName="userPO";

    @Autowired
    private MongoTemplate mongoTemplate;


    /**
     * 修改【第一条】符合条件的文档
     * @return
     */
    public long updateOne(){
        Query query= Query.query(Criteria.where("username").is(("zzx")));
        Update update=Update.update("password","654321");
        return mongoTemplate.updateFirst(query,update, UserPO.class).getModifiedCount();
    }

    /**
     * 修改符合内嵌数据条件的文档【批量修改】
     * @return
     */
    public long updateMulti(){
        Query query= Query.query(Criteria.where("roles.roleName").is(("程序员")));
        Update update=Update.update("password","654321").set("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
       return mongoTemplate.updateMulti(query,update, UserPO.class,collectionName).getModifiedCount();
    }

    /**
     * 修改第一条符合条件的文档并返回修改前的文档【原子操作】
     * @return
     */
    public UserPO findAndModify(){
        Query query= Query.query(Criteria.where("roles.roleName").is(("程序员")));
        Update update=Update.update("password","123456");
        return mongoTemplate.findAndModify(query,update, UserPO.class,collectionName);
    }
}
