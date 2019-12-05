package com.zzx.mongodb.insert;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class InsertInToMongoDB {

    @Autowired
    private MongoTemplate mongoTemplate;
}
