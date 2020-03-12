package com.vakhtang.service;

import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {

    public String getData(){
        return  "returning real data";
    }
}
