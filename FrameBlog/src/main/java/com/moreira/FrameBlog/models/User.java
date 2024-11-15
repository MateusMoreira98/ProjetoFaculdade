package com.moreira.FrameBlog.models;


import com.moreira.FrameBlog.enums.RoleEnum;

import javax.persistence.*;

@Entity
@Table (name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //REGRA GERAL, ISSO FAZ AUTO INCREMENTO
    private Long userId;


    private String name;

    private String email;

    private String passaword;

    private RoleEnum role;

    //CONSTRUTOR VAZIO, ISSO É BOAS PRATICAS
    public User() {
    }

    //FINAL é boas praticas e tbm é uma regra geral qnd se faz CRUD.
    public User(final Long userId, final String name, final String email,
                final String passaword, final RoleEnum role) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.passaword = passaword;
        this.role = role;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassaword() {
        return passaword;
    }

    public void setPassaword(String passaword) {
        this.passaword = passaword;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }
}
