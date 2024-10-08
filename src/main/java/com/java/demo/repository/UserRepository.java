package com.java.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.demo.modal.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long> {
}
