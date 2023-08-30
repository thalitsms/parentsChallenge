package com.example.parentschallenge.repository;


import com.example.parentschallenge.model.Child;
import com.example.parentschallenge.model.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChildRepository extends JpaRepository<Child, Long> {

        // 3. Para cada CHILD, obtenha o nome de seu pai e mãe, se definidos
        @Query("SELECT c FROM Child c")
        List<Child> findAllChildrenWithParents();

    @Query("SELECT DISTINCT c.father FROM Child c WHERE c.father IS NOT NULL")
    List<Parent> findAllDistinctFathers();
}


