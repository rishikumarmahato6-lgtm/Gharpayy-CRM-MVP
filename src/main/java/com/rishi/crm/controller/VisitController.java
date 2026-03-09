
package com.rishi.crm.controller;

import com.rishi.crm.entity.Visit;
import com.rishi.crm.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visits")
public class VisitController {

    @Autowired
    private VisitRepository visitRepository;

    @PostMapping
    public Visit createVisit(@RequestBody Visit visit) {
        return visitRepository.save(visit);
    }

    @GetMapping
    public List<Visit> getAllVisits() {
        return visitRepository.findAll();
    }
}