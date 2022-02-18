package com.sparta.clonecodingslack.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity @Getter
public class Posts extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="posts_id")
    private Long id;

    @Lob
    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String category;

    @Lob
    @Column
    private String imgUrl;

    @ManyToOne
    @JoinColumn(name ="user_id")
    User user;
}