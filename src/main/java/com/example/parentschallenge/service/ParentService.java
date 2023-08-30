package com.example.parentschallenge.service;

import com.example.parentschallenge.model.Parent;
import com.example.parentschallenge.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentService {
    @Autowired
   private ParentRepository parentRepository;

    // 1. A list of all FATHER names
    public List<String> findAllFatherNames() {
        return parentRepository.findAllFatherNames();
    }

    // 2. All FATHER names that have more than one child
    public List<String> findFathersWithMultipleChildren() {
        return parentRepository.findFathersWithMultipleChildren();
    }

    // 4. How many children John has
    public Long countJohnsChildren() {
        return parentRepository.countJohnsChildren();
    }

    // 5. How many children Mary has
    public Long countMarysChildren() {
        return parentRepository.countMarysChildren();
    }
}
