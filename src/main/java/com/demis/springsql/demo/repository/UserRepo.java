package com.demis.springsql.demo.repository;

import com.demis.springsql.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    @Query(value = "select * from dbo.user where username = ?1",nativeQuery = true)
    User findUsersByUsername(String username);
    Boolean existsUserByUsername(String username);
}
