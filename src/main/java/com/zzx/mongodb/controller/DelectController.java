package com.zzx.mongodb.controller;

import com.zzx.mongodb.service.delect.DeleteFromMongodb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DelectController {

    @Autowired
    private DeleteFromMongodb deleteFromMongodb;

    /**
     * 删除符合条件的【所有】数据
     * @return
     */
    @GetMapping("/delect")
    public long delect() {
        return deleteFromMongodb.delect();
    }

    /**
     * 通过【内嵌数据】删除符合条件的所有数据
     * @return
     */
    @GetMapping("/delect/content")
    public long delectContent() {
        return deleteFromMongodb.delectcontent();
    }
}
