package com.github.kimishima.springbootdemo.domain;


import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "BLOG")
public class Blog {
  @CreationTimestamp
  @Column(name = "created_time", updatable = false)
  public Timestamp createdTime;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;
  @Column(name = "title")
  private String title;
  @Column(name = "contents")
  private String contents;
  @UpdateTimestamp
  @Column(name = "updated_time")
  private Timestamp updatedTime;
}
