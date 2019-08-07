package com.example.redistest.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@RestController
@ResponseBody
@RequestMapping("/mongo/test")
public class MongoTestController {

    @Autowired
    MongoTemplate mongoTemplate;

    @GetMapping("/save")
    public String save() {
        Student student = new Student();
        student.setName("小二");
        student.setAge(18);
        student.setSex("女");
        student.set_id(UUID.randomUUID().toString());

        mongoTemplate.save(student);
        return "写入成功";
    }

    @RequestMapping("/query")
    public List<Student> query() {
        // 匹配条件sex = 男

        Criteria criteria = Criteria.where("sex").is("男");
        Query query = Query.query(criteria);

        // 查询名字为张三的所有学生
        List<Student> students = mongoTemplate.find(query, Student.class);
        return students;
    }

}