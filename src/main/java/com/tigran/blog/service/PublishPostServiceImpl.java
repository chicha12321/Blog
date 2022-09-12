package com.tigran.blog.service;

import com.tigran.blog.dao.PublishPostDAO;
import com.tigran.blog.entity.Comments;
import com.tigran.blog.entity.PublishPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PublishPostServiceImpl implements PublishPostService {
    @Autowired
    private PublishPostDAO publishPostDAO;


    @Override
    @Transactional
    public List<PublishPost> getAllPosts() {
        return publishPostDAO.getAllPosts();
    }

    @Override
    @Transactional
    public void savePublishPost(PublishPost post) {
        publishPostDAO.savePublishPost(post);
    }

    @Override
    @Transactional
    public PublishPost getPublishPost(int id) {
        return publishPostDAO.getPublishPost(id);
    }

    @Override
    @Transactional
    public void removePublishPost(int id) {
        publishPostDAO.removePublishPost(id);
    }

    @Override
    @Transactional
    public List<Comments> getAllComments() {
        return publishPostDAO.getAllComments();
    }
    @Override
    @Transactional
    public List<Comments> getAllPostsById(Integer id) {
        return publishPostDAO.getAllCommentsById(id);
    }



    @Override
    @Transactional
    public void addCommentToPost(Comments comments,Integer id) {
        publishPostDAO.addCommentToPost(comments,id);

    }
}
