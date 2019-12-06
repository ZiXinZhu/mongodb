package com.zzx.mongodb.service.select;

import com.zzx.mongodb.PO.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class SelectFromMongoDB {
    private static final String collectionName="userPO";

    @Autowired
    private MongoTemplate mongoTemplate;


    /**
     * 查找符合要求的【所有】数据并返回
     * @return
     */
    public List<UserPO> select(){
        Query query=Query.query(Criteria.where("roles.roleName").is("程序员"));
       return mongoTemplate.find(query,UserPO.class,collectionName);
    }

    /**
     * 查找符合要求的【第一条】数据并返回
     * @return
     */
    public UserPO selectOne(){
        Query query=Query.query(Criteria.where("roles.roleName").is("程序员"));
        return mongoTemplate.findOne(query,UserPO.class,collectionName);
    }

    /**
     * 按照时间从小到大【排序】返回
     * @return
     */
    public List<UserPO> selectSort() {
        Sort sort = Sort.by(Sort.Direction.ASC, "time");
        String time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date().getTime()-24*60*60*1000);
        return mongoTemplate.find(Query.query(Criteria.where("time").lt(time)).with(sort), UserPO.class);
    }

    /**
     * 按照时间从小到大排序【分页】返回
     * @return
     */
    public List<UserPO> selectPage() {
        //分页查询（第1页每页2行）
        Sort sort = Sort.by(Sort.Direction.ASC, "time");
        Pageable pageable =PageRequest.of(0,2);
        String time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date().getTime()-24*60*60*1000);
        return mongoTemplate.find(Query.query(Criteria.where("time").lt(time)).with(pageable).with(sort), UserPO.class);
    }

}
