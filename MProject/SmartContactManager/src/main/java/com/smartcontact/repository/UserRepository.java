package com.smartcontact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartcontact.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
