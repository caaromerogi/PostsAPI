package com.sofka.relationalDB.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Post")
@Table(name = "post")
@Data
public class Post  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    private String title;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private final List<Comment> comments = new ArrayList<Comment>();

    public Post addComment(Comment comment){
        this.comments.add(comment);

        return this;
    }
}
