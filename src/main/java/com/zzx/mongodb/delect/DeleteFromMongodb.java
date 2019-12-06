package com.zzx.mongodb.delect;

import com.mongodb.client.result.DeleteResult;
import com.zzx.mongodb.PO.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import javax.sound.midi.Soundbank;

@Service
public class DeleteFromMongodb {
    @Autowired
    private MongoTemplate mongoTemplate;

    public long delect() {
        Query query = new Query(Criteria.where("username").is("qq"));
        DeleteResult result = mongoTemplate.remove(query, UserPO.class);
        long count = result.getDeletedCount();
        return count;
    }

    public long delectcontent() {
        Query query = new Query(Criteria.where("roles.roleName").is("老师"));
        DeleteResult result = mongoTemplate.remove(query, UserPO.class);
        long count = result.getDeletedCount();
        return count;
    }
}
