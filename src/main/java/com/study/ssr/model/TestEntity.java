package com.study.ssr.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TestEntity {

    private String name = "views/test";
    private int age = 29;

}
