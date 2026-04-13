package com.lavish.eventmanagementsystem.Repo;

import com.lavish.eventmanagementsystem.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userrepo extends JpaRepository<User, Integer> {
}
