package com.aclaputra.twitter.rest.spring.backend.entity;

import javax.persistence.Entity;
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
@Table(name = "follows")
@IdClass(FollowingUserId.class)
public class Follow {

  @Id
  private int uid;
  @Id
  private int follower;
  // make primary key(uid, follower)
}
