package com.study.ssr.service;

import com.study.ssr.model.TestEntity;
import com.study.ssr.model.TestRepository;
import org.springframework.stereotype.Service;

@Service
public class TestService {


    public String serviceMethod() {
        TestRepository repository = new TestRepository();
        String re = repository.te();

        return re;
    }
}
