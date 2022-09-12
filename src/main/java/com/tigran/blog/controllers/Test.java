package com.tigran.blog.controllers;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Coms comments=new Coms(1,"comment1","dsadas",1);
        Coms comments2=new Coms(2,"comment2","dsad",2);
        Coms comments3=new Coms(3,"comment3","dsa",1);
        Coms comments4=new Coms(4,"comment4","dsa",3);
        List<Coms> comsList=new ArrayList<>();
        comsList.add(comments);
        comsList.add(comments2);
        comsList.add(comments3);
        comsList.add(comments4);
        System.out.println(comsList.stream().filter(coms -> coms.getPostId()==1));
    }

}


@Getter
@Setter
@NoArgsConstructor
class Coms {

    private int id;

    private String comment;

    private String dateComment;

    @Override
    public String toString() {
        return "Coms{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", dateComment='" + dateComment + '\'' +
                ", postId=" + postId +
                '}';
    }

    private int postId;

    public Coms(int id, String comment, String dateComment, int postId) {
        this.id = id;
        this.comment = comment;
        this.dateComment = dateComment;
        this.postId = postId;
    }
}