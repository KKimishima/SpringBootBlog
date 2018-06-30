package com.github.kimishima.springbootdemo.domain;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "user")
public class User {
  @CreationTimestamp
  @Column(name = "created_time", updatable = false)
  public Timestamp createdTime;
  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column
  private String name;
  @Column
  private String email;
  @UpdateTimestamp
  @Column(name = "updated_time")
  private Timestamp updatedTime;
}
