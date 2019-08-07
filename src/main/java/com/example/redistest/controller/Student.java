package com.example.redistest.controller;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="student")
class Student{
    @Id
    String _id;
    String name;
    String class_id;
    String sex;
    Integer age;
}