package com.dfsproject.dfsfileserver.repository;

import com.dfsproject.dfsfileserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
