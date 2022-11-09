package com.aclaputra.twitter.rest.spring.backend.repository;

import com.aclaputra.twitter.rest.spring.backend.entity.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowRepository extends JpaRepository<Follow, Integer> {

}
