package com.blog.service.impl;

import com.blog.entity.Post;
import com.blog.payload.PostDto;
import com.blog.repository.PostRepository;
import com.blog.service.PostService;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PostserviceImpl implements PostService {
//   @Autowired --field injection
//    private PostRepository postRepo;

    private PostRepository postRepo;

    public PostserviceImpl(PostRepository postRepo) {
        // dependency injection using constructor
        this.postRepo = postRepo;

    }


    /* @Override
     public void createPost(PostDto postDto) {//called from controller comment 1,2
         //3.now create entity object and set the field using setter injection
         Post post = new Post();
         post.setTitle(postDto.getTitle());
         post.setContent(postDto.getContent());
         post.setDescription(postDto.getDescription());
         //4.using constructor dependency we can get the PostRepository obj PostRepo and able to call the save method of
         //jpa repository by passing entity object
         postRepo.save(post);

     }*/
    @Override
    public PostDto createPost(PostDto postDto) {//called from controller
        //3.now create entity object and set the field using setter injection
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        post.setDescription(postDto.getDescription());

        Post savedPost = postRepo.save(post);//return entity type
        // why dto/payload require
        PostDto dto = new PostDto();
        dto.setId(savedPost.getId());
        dto.setContent(savedPost.getContent());
        dto.setDescription(savedPost.getDescription());
        dto.setTitle(savedPost.getTitle());
        // in dto we can add one more field without bothering to the entity/Post
        // if we add field in dto it wont affect in our database
        dto.setMessage("Post is Created");
        // if we do same thing to post/entity data there is chance of tempering
        return dto;

    }

    @Override
    public void deletePost(Long id) {
        postRepo.deleteById(id);
    }
}
