package com.zzx.mongodb.select;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class SelectFromMongoDB {
    @Autowired
    private MongoTemplate mongoTemplate;
}
