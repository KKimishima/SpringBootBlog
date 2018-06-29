package com.github.kimishima.springbootdemo.repositories;

import com.github.kimishima.springbootdemo.domain.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogsRepositories extends JpaRepository<Blog, Long> {
}
