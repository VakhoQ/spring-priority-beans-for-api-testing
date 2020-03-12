package com.vakhtang.service;

import com.vakhtang.dao.DataDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBServiceImpl {

    @Autowired
    DataDbRepository repository;

    public String getData(Long id){
        return repository.fetchData(id);
    }
}
