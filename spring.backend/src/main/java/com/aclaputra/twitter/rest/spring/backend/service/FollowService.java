package com.aclaputra.twitter.rest.spring.backend.service;

import com.aclaputra.twitter.rest.spring.backend.repository.FollowRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowService {

  @Autowired
  private FollowRepository repository;

}
