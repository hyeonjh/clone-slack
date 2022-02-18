package com.sparta.clonecodingslack.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class User {

    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // email
    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String password;
}