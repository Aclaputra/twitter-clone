package com.aclaputra.twitter.rest.spring.backend.repository;

import com.aclaputra.twitter.rest.spring.backend.entity.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Integer> {

}
