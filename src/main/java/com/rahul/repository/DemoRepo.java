package com.rahul.repository;

import com.rahul.model.Welcome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepo extends JpaRepository<Welcome, Integer> {

}
