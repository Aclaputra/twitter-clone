package com.aclaputra.twitter.rest.spring.backend.controller;

import java.util.List;

import com.aclaputra.twitter.rest.spring.backend.entity.Tweet;
import com.aclaputra.twitter.rest.spring.backend.service.TweetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TweetController {

  @Autowired
  private TweetService service;

  @GetMapping("/tweets")
  public List<Tweet> findAllTweets() {
    return service.getTweets();
  }
}
