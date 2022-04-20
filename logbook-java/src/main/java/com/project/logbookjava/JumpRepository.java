package com.project.logbookjava;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JumpRepository extends JpaRepository<Jump, Integer> {
}
