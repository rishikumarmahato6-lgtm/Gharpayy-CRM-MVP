package com.rishi.crm.controller;

import com.rishi.crm.entity.Agent;
import com.rishi.crm.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agents")
public class AgentController {

    @Autowired
    private AgentRepository agentRepository;

    @PostMapping
    public Agent createAgent(@RequestBody Agent agent) {
        return agentRepository.save(agent);
    }

    @GetMapping
    public List<Agent> getAllAgents() {
        return agentRepository.findAll();
    }
}