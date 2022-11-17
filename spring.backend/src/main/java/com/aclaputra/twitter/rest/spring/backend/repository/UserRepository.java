package com.aclaputra.twitter.rest.spring.backend.repository;

import com.aclaputra.twitter.rest.spring.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

  User findByUsername(String username);
}
