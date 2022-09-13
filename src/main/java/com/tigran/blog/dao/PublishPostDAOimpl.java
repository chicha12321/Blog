package com.tigran.blog.dao;

import com.tigran.blog.entity.Comments;
import com.tigran.blog.entity.PublishPost;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Repository
public class PublishPostDAOimpl implements PublishPostDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<PublishPost> getAllPosts() {
        Session session = sessionFactory.getCurrentSession();
        List<PublishPost> allposts = session.createQuery("from PublishPost", PublishPost.class).getResultList();
        return allposts;
    }

    @Override
    public void savePublishPost(PublishPost post) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(post);
    }

    @Override
    public PublishPost getPublishPost(int id) {
        Session session = sessionFactory.getCurrentSession();
        PublishPost post = new PublishPost();
        post = session.get(PublishPost.class, id);
        return post;
    }

    @Override
    public void removePublishPost(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<PublishPost> query = session.createQuery("delete from PublishPost  where  id=:postId");
        query.setParameter("postId", id);
        query.executeUpdate();
    }


    @Override
    public List<Comments> getCommentsById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        List<Comments> commentsList = session.createQuery("from Comments", Comments.class).getResultList();
        return commentsList.stream().filter(comments -> Objects.equals(comments.getPostId().getId(), id)).collect(Collectors.toList());
    }

    @Override
    public void addCommentToPost(Comments comments) {
        Session session = sessionFactory.getCurrentSession();
        System.out.println(comments);
        session.save(comments);
    }
}
