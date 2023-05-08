package com.example.SpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBoot.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
