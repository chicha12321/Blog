package com.tigran.blog.dao;

import com.tigran.blog.entity.Comments;
import com.tigran.blog.entity.PublishPost;

import java.util.List;

public interface PublishPostDAO {

    List<PublishPost> getAllPosts();

    void savePublishPost(PublishPost post);

    PublishPost getPublishPost(int id);

    void removePublishPost(int id);

    //test
    List<Comments> getAllComments();

    List<Comments> getAllCommentsById(Integer id);
    void addCommentToPost(Comments comments,Integer id);

}
