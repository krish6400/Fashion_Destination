package com.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

	@Query("from User u where u.email = :email and u.password = :password")
	public User findByEmail(@Param("email") String email);
//	@Query(value ="select u from User u where u.email = ?1")
//	public User getUserByEmailList(String email, String password);
}
