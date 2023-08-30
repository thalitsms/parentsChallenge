package com.example.parentschallenge.controller;

import com.example.parentschallenge.model.Child;
import com.example.parentschallenge.model.Parent;
import com.example.parentschallenge.service.ChildService;
import com.example.parentschallenge.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ParentChildController {

    @Autowired
    private ParentService parentService;

    @Autowired
    private ChildService childService;

    // 1. A list of all FATHER names
    @GetMapping("/fathers")
    public ResponseEntity<List<Parent>> getFathers() {
        return ResponseEntity.ok(childService.findAllDistinctFathers());
    }

    // 2. All FATHER names that have more than one child
    @GetMapping("/fathers/multiple-children")
    public List<String> getFathersWithMultipleChildren() {
        return parentService.findFathersWithMultipleChildren();
    }

    // 3. For every CHILD, the name of his/her father and mother, if defined
    @GetMapping("/children/parents")
    public List<Child> getAllChildrenWithParents() {
        return childService.findAllChildrenWithParents();
    }

    // 4. How many children John has
    @GetMapping("/john/children-count")
    public Long getJohnsChildrenCount() {
        return parentService.countJohnsChildren();
    }

    // 5. How many children Mary has
    @GetMapping("/mary/children-count")
    public Long getMarysChildrenCount() {
        return parentService.countMarysChildren();
    }


}
