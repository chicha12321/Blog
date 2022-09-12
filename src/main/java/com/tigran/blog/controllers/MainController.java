package com.tigran.blog.controllers;

import com.tigran.blog.entity.Comments;
import com.tigran.blog.entity.PublishPost;
import com.tigran.blog.service.PublishPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private PublishPostService publishPostService;

    @GetMapping("/")
    public String showAllPublishPosts(Model model){
        List<PublishPost> allPublishPosts=publishPostService.getAllPosts();
        model.addAttribute("allPosts",allPublishPosts);
        return "index";
    }
    @GetMapping("/addNewPost")
    public String addNewPublishPost(Model model){
        PublishPost post=new PublishPost();
        model.addAttribute("publishPost",post);
        return "publish-info";
    }

    @RequestMapping("/savePost")
    public String savePublishPost(@ModelAttribute("publishPost")PublishPost publishPost){
        publishPostService.savePublishPost(publishPost);
        return "redirect:/";
    }
    @RequestMapping("/updatePost")
    public String updatePublishPost(@RequestParam("publishPostId")int id, Model model){
        PublishPost post=publishPostService.getPublishPost(id);
        model.addAttribute("publishPost",post);
        return "publish-info";
    }

    @RequestMapping("/removePost")
    public String removePublishPost(@RequestParam("publishPostId")int id){
        publishPostService.removePublishPost(id);
        return "redirect:/";
    }

    //добавляю новое
    @GetMapping("/publication")
    public String showPublication(Model model){
        List<PublishPost> allPosts=publishPostService.getAllPosts();
        model.addAttribute("allPosts",allPosts);
        return "allPublication";
    }

    @RequestMapping("/publication/{id}")
    public String showAllPublishPosts(@PathVariable Integer id,Model model){
        PublishPost post=publishPostService.getPublishPost(id);
        model.addAttribute("modelOnePublication",post);

        List<Comments> comments=publishPostService.getAllComments();
        model.addAttribute("modelComments",comments);

//        List<Comments> comments=publishPostService.getAllPostsById(id);
//        model.addAttribute("modelComments",comments);
        //для добавления комментария

        Comments comments1=new Comments();
        model.addAttribute("comment",comments1);
        return "PublicationProfilePost";
    }
    @RequestMapping("/publication/{id}/saveComment")
    public String saveComment(@ModelAttribute("comment")Comments comments,@PathVariable Integer id){
        publishPostService.addCommentToPost(comments,id);
        return "redirect:/";
    }



}
