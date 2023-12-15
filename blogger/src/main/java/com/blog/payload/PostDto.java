package com.blog.payload;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode methods
@AllArgsConstructor // Lombok annotation to generate an all-args constructor
@NoArgsConstructor
public class PostDto {
    private Long id;
    private String title;
    private String Description;
    private String content;
    private String message;//additional field i.e not present in entity

}
