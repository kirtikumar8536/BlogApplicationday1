package com.blog.controller;

import com.blog.payload.PostDto;
import com.blog.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {

        this.postService = postService;
    }

    /*@PostMapping// 1if we don't want to show/send any response to postman
    public void createPost(@RequestBody PostDto postDto){
        //1.this will take json data from postman and store into the PostDto object(payload)
        //2.send postDto obj to service layer by calling the below code
        postService.createPost(postDto);
    }*/
    /*@PostMapping//2if we want to show/send any response to postman
    public ResponseEntity<String> createPost(@RequestBody PostDto postDto){
        //1.this will take json data from postman and store into the PostDto object(payload)
        //2.send postDto obj to service layer by calling the below code
        postService.createPost(postDto);
        return new ResponseEntity<>("post is created", HttpStatus.CREATED);//201
    }*/
    @PostMapping//if we want to show/send any dto response to postman
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
        PostDto dto = postService.createPost(postDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);//201
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable Long id){
        postService.deletePost(id);
        return new ResponseEntity<>("post is deleted!",HttpStatus.OK);
    }


}
