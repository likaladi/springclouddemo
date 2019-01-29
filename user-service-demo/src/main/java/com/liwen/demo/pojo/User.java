package com.liwen.demo.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "tb_user")
public class User {

    @Id
    private Integer id;

    private String name;

    private Integer age;
}
