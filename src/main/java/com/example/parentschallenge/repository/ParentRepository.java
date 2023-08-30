package com.example.parentschallenge.repository;

import com.example.parentschallenge.model.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ParentRepository extends JpaRepository<Parent, Long> {
    
    // 1. A list of all FATHER names
    @Query("SELECT p.name FROM Parent p")
    List<String> findAllFatherNames();

    // 2. All FATHER names that have more than one child
    @Query("SELECT p.name FROM Parent p WHERE p.id IN (SELECT c.father.id FROM Child c GROUP BY c.father.id HAVING COUNT(c.father.id) > 1)")
    List<String> findFathersWithMultipleChildren();

    // 4. How many children John has
    @Query("SELECT COUNT(c) FROM Child c WHERE c.father.name = 'John'")
    Long countJohnsChildren();

    // 5. How many children Mary has
    @Query("SELECT COUNT(c) FROM Child c WHERE c.mother.name = 'Mary'")
    Long countMarysChildren();

 }
