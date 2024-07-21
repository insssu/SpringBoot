package com.study.ssr.model;

import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {

    public String te() {
        TestEntity test = TestEntity.builder()
                .name("views/test")
                .age(13)
                .build();

        return test.getName();
    }
}
