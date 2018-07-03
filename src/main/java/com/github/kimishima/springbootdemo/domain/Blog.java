package com.github.kimishima.springbootdemo.domain;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "BLOG")
@ToString(exclude = "user")
public class Blog {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "title")
  private String title;
  @Column(name = "contents")
  private String contents;
  @CreationTimestamp
  @Column(name = "created_time", updatable = false)
  public Timestamp createdTime;
  @UpdateTimestamp
  @Column(name = "updated_time")
  private Timestamp updatedTime;
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
}
