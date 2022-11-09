package com.aclaputra.twitter.rest.spring.backend.service;

import com.aclaputra.twitter.rest.spring.backend.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository repository;

}
