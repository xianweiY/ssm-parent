/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: StudentService
 * @Package com.atguigu.ssm.service
 * @author: apple
 * @date: 2019-06-12 16:22
 * @since JDK 1.8
 */
package com.atguigu.ssm.service;

import com.atguigu.ssm.entities.Student;

/**
 *
 * @ClassName : StudentService
 * @AUTHOR :  apple
 * @DATE :    2019-06-12 16:22  
 * @DESCRIPTION : TODO(用一句话描述该类做什么)   
 * @since JDK 1.8
 */
public interface StudentService {
    Student queryStudent(Integer id);
}
