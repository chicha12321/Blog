package com.tigran.blog.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comments")
@Getter
@Setter
@NoArgsConstructor
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String comment;

    private Date dateComment;
//,targetEntity = PublishPost.class
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "postId")
    private  PublishPost postId;

    public Comments(String comment, Date dateComment) {
        this.comment = comment;
        this.dateComment = dateComment;
    }

}
