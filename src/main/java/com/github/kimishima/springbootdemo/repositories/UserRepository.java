package com.github.kimishima.springbootdemo.repositories;

import com.github.kimishima.springbootdemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
  public User findByName(String name);
}
