package com.zzx.mongodb.delect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class DeleteFromMongodb {
    @Autowired
    private MongoTemplate mongoTemplate;
}
