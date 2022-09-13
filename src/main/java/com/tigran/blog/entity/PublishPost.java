package com.tigran.blog.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "post")
@Getter
@Setter
@NoArgsConstructor
public class PublishPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nameAuthor;

    private String titlePost;

    private String description;
//    @OneToMany(cascade = CascadeType.ALL,mappedBy ="postId" )
//    private List<Comments> commentsList;

    public PublishPost(String nameAuthor, String titlePost, String description) {
        this.nameAuthor = nameAuthor;
        this.titlePost = titlePost;
        this.description = description;
    }

    @Override
    public String toString() {
        return "PublishPost{" +
                "id=" + id +
                ", nameAuthor='" + nameAuthor + '\'' +
                ", titlePost='" + titlePost + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
