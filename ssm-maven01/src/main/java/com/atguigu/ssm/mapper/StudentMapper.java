/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: StudentMapper
 * @Package com.atguigu.ssm.mapper
 * @author: apple
 * @date: 2019-06-12 15:54
 * @since JDK 1.8
 */
package com.atguigu.ssm.mapper;

import com.atguigu.ssm.entities.Student;

/**
 *
 * @ClassName : StudentMapper
 * @AUTHOR :  apple
 * @DATE :    2019-06-12 15:54  
 * @DESCRIPTION : TODO(用一句话描述该类做什么)   
 * @since JDK 1.8
 */
public interface StudentMapper {

    public Student selectById(Integer id);
}
