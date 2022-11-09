package com.aclaputra.twitter.rest.spring.backend.repository;

import com.aclaputra.twitter.rest.spring.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
