package com.tigran.blog.service;

import com.tigran.blog.entity.Comments;
import com.tigran.blog.entity.PublishPost;

import java.util.List;

public interface PublishPostService {

    List<PublishPost> getAllPosts();



    void savePublishPost(PublishPost post);

    PublishPost getPublishPost(int id);

    void removePublishPost(int id);

    //test
    List<Comments> getAllComments();

    List<Comments> getAllPostsById(Integer id);
    void addCommentToPost(Comments comments,Integer id);

}
