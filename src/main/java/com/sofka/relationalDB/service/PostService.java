package com.sofka.relationalDB.service;

import com.sofka.relationalDB.entity.Comment;
import com.sofka.relationalDB.entity.Post;

import java.util.List;

public interface PostService {

    Post createPost(Post post);

    Post createComment(Comment comment);

    void deleteComment(Comment comment);

    void deletePost(Post post);

    List<Post> findAllPosts();
}
