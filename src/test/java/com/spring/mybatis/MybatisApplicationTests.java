//package com.spring.mybatis;
//
//import org.jasypt.encryption.StringEncryptor;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//class MybatisApplicationTests {
//    @Autowired
//    StringEncryptor encryptor;
//
//    @Test
//    void contextLoads() {
//        String url = encryptor.encrypt("jdbc:mysql://127.0.0.1:3306/local?useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true");
//        String name = encryptor.encrypt("root");
//        String password = encryptor.encrypt("hbgydx520");
//        System.out.println(url);
//        System.out.println(name);
//        System.out.println(password);
//    }
//
//}