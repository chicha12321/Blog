package com.tigran.blog.dao;

import com.tigran.blog.entity.Comments;
import com.tigran.blog.entity.PublishPost;

import java.util.List;

public interface PublishPostDAO {

    List<PublishPost> getAllPosts();

    void savePublishPost(PublishPost post);

    PublishPost getPublishPost(int id);

    void removePublishPost(int id);

    List<Comments> getCommentsById(Integer id);
    void addCommentToPost(Comments comments);

}
