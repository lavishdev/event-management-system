package com.lavish.eventmanagementsystem.Repo;

import com.lavish.eventmanagementsystem.Models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Eventrepo extends JpaRepository<Event,Long> {
}
