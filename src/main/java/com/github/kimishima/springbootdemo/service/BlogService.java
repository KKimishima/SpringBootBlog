package com.github.kimishima.springbootdemo.service;

import com.github.kimishima.springbootdemo.domain.Blog;
import com.github.kimishima.springbootdemo.repositories.BlogsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
  @Autowired
  private BlogsRepositories blogsRepositories;

  public List<Blog> findAll() {
    return blogsRepositories.findAll();
  }

  public Blog findOne(Long id) {
    return blogsRepositories.getOne(id);
  }

  public Blog save(Blog blog) {
    return blogsRepositories.save(blog);
  }

  public void delete(Long id) {
    blogsRepositories.deleteById(id);
  }
}
