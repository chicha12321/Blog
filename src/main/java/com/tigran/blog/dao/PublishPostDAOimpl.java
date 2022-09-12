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

    //test
    @Override
    public List<Comments> getAllComments() {
        Session session = sessionFactory.getCurrentSession();
        List<Comments> commentsList = session.createQuery("from Comments", Comments.class).getResultList();
        return commentsList;
    }

    @Override
    public List<Comments> getAllCommentsById(Integer id) {
        Session session = sessionFactory.getCurrentSession();

        // List<Comments >comments=session.createQuery(" select c from Comments c where c.postId=:postIndex", Comments.class)
//        List<Comments >comments=session.createQuery(" from Comments  where postId=:postIndex")
//                .setParameter("postIndex", id).getResultList();

        List comments = session.createQuery(" from Comments  where Comments.postId=:index  ").setParameter("index", id).getResultList();
        System.out.println(id);
        return comments;
    }

    @Override
    public void addCommentToPost(Comments comments,Integer id) {
        Session session = sessionFactory.getCurrentSession();

       Query query= session.createQuery("insert into Comments (comment,postId) select 'hello','2' from Comments ");
        query.executeUpdate();
    }
}
