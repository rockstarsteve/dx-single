package com.dx.mvc.service;


import com.dx.mvc.bean.Student;

import java.util.List;

/**
 * Description: com.dx.service
 *
 * @author yaoj
 * @version 1.0
 * @copyright Copyright (c) 文理电信
 * @since 2019/9/26
 */
public interface CacheService {

    /**
     * 获取list学生
     * @return
     */
    public List<Student> getStudent(int num);

    String getString(String formdata);

    /**
     * 使用默认缓存
     * @param num
     * @return
     */
    List<Student> getDefualt(int num);
}
