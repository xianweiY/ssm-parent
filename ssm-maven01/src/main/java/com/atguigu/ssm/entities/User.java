/**
 * Copyright (C), 2015-2019, 深圳市启明星电子商务有限公司
 *
 * @Title: User
 * @Package com.atguigu.ssm.entities
 * @author: apple
 * @date: 2019-06-12 14:52
 * @since JDK 1.8
 */
package com.atguigu.ssm.entities;

/**
 *
 * @ClassName : User
 * @AUTHOR :  apple
 * @DATE :    2019-06-12 14:52  
 * @DESCRIPTION : TODO(user)
 * @since JDK 1.8
 */
public class User {
    private Integer id;

    private String userName;

    private String password;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", userName=" + userName + ", password="
                + password + ", age=" + age + "]";
    }


}
