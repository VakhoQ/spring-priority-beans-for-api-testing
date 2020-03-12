package com.vakhtang.controller;

import com.vakhtang.service.DataService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class DataServiceMockImpl implements DataService {

    @Override
    public String getData() {
        return "returning fake data";
    }

}
