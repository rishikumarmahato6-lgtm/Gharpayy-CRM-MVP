package com.rishi.crm.controller;

import com.rishi.crm.entity.Lead;
import com.rishi.crm.repository.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leads")
public class LeadController {

    @Autowired
    private LeadRepository leadRepository;

    @PostMapping
    public Lead createLead(@RequestBody Lead lead) {
        return leadRepository.save(lead);
    }

    @GetMapping
    public List<Lead> getAllLeads() {
        return leadRepository.findAll();
    }
}