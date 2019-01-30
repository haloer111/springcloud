package com.gexiao.userservice.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author gexiao
 * @date 2019/1/30 11:05
 */
@Entity
@Table
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private int age;
    private String sex;
}
