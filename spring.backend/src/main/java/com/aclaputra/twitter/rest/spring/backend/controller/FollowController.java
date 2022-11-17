package com.aclaputra.twitter.rest.spring.backend.controller;

import com.aclaputra.twitter.rest.spring.backend.service.FollowService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FollowController {

  @Autowired
  private FollowService service;

}
