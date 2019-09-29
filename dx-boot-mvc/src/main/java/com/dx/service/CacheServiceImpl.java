package com.dx.service;

import com.dx.bean.Student;
import com.dx.mapper.CacheMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: com.dx.service
 *
 * @author yaoj
 * @version 1.0
 * @copyright Copyright (c) 文理电信
 * @since 2019/9/26
 */
@Service
public class CacheServiceImpl implements CacheService{

    @Autowired
    private CacheMapper cacheMapper;


    @Cacheable(value = "studentList", key = "#num")
    @Override
    public List<Student> getStudent(int num) {
        List<Student> studentList = cacheMapper.getStudent(num);

        return studentList;
    }
}