package com.vakhtang.service;

import com.vakhtang.dao.DataDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {

    public String getData(){
        return  "returning real data";
    }
}
