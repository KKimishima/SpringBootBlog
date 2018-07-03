package com.github.kimishima.springbootdemo.domain;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "person")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column
  private String name;
  @Column
  private String email;
  @Column(name = "encode_password")
  private String encodePassword;
  @CreationTimestamp
  @Column(name = "created_time", updatable = false)
  public Timestamp createdTime;
  @UpdateTimestamp
  @Column(name = "updated_time")
  private Timestamp updatedTime;
}
