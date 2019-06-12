/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: Student
 * @Package com.atguigu.ssm.entities
 * @author: apple
 * @date: 2019-06-12 15:54
 * @since JDK 1.8
 */
package com.atguigu.ssm.entities;

import java.io.Serializable;

/**
 *
 * @ClassName : Student
 * @AUTHOR :  apple
 * @DATE :    2019-06-12 15:54  
 * @DESCRIPTION : TODO(用一句话描述该类做什么)   
 * @since JDK 1.8
 */
public class Student implements Serializable {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
