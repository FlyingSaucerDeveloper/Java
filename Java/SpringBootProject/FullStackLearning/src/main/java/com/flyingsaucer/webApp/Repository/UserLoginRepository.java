package com.flyingsaucer.webApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyingsaucer.webApp.Models.User;

@Repository
public interface UserLoginRepository extends JpaRepository<User, Integer>{

}
