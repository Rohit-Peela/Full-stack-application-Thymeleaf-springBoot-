package com.project.SuperAdmin.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class LoginForm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;

    private String password;
}
