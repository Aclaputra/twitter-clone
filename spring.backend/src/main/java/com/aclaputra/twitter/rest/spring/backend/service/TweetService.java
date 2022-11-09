package com.aclaputra.twitter.rest.spring.backend.service;

import java.util.List;

import com.aclaputra.twitter.rest.spring.backend.entity.Tweet;
import com.aclaputra.twitter.rest.spring.backend.repository.TweetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TweetService {

  @Autowired
  private TweetRepository repository;

  public List<Tweet> getTweets() {
    return repository.findAll();
  }
}
