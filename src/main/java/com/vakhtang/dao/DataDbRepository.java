package com.vakhtang.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DataDbRepository {

    public String fetchData(Long id){
            return "real db response";
    }

}
