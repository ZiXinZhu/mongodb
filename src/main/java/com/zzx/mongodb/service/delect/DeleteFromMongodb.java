package com.zzx.mongodb.service.delect;

import com.mongodb.client.result.DeleteResult;
import com.zzx.mongodb.PO.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class DeleteFromMongodb {
    @Autowired
    private MongoTemplate mongoTemplate;


    /**
     * 删除符合条件的所有数据
     * @return
     */
    public long delect() {
        Query query = new Query(Criteria.where("username").is("qq"));
        DeleteResult result = mongoTemplate.remove(query, UserPO.class);
        long count = result.getDeletedCount();
        return count;
    }


    /**
     * 通过内嵌数据删除符合条件的所有数据
     * @return
     */
    public long delectcontent() {
        Query query = new Query(Criteria.where("roles.roleName").is("老师"));
        DeleteResult result = mongoTemplate.remove(query, UserPO.class);
        long count = result.getDeletedCount();
        return count;
    }
}
