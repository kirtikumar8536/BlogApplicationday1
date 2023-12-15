package com.blog.service;

import com.blog.payload.PostDto;

public interface PostService {
    //1public void createPost(PostDto postDto);
    public PostDto createPost(PostDto postDto);

    void deletePost(Long id);
}
