/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: StudentServiceImpl
 * @Package com.atguigu.ssm.service.impl
 * @author: apple
 * @date: 2019-06-12 16:22
 * @since JDK 1.8
 */
package com.atguigu.ssm.service.impl;

import com.atguigu.ssm.entities.Student;
import com.atguigu.ssm.mapper.StudentMapper;
import com.atguigu.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @ClassName : StudentServiceImpl
 * @AUTHOR :  apple
 * @DATE :    2019-06-12 16:22  
 * @DESCRIPTION : TODO(用一句话描述该类做什么)   
 * @since JDK 1.8
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public Student queryStudent(Integer id) {
        return studentMapper.selectById(id);
    }
}
