package com.aclaputra.twitter.rest.spring.backend.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tweets")
@IdClass(TweetUserDateId.class)
public class Tweet {

  @Id
  @GeneratedValue
  private int tid;

  @Id
  private int uid;
  private String post;

  @Id
  private Date date;

  // key(date) key(uid, date)
}
