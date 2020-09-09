package com.lambdaschool.getorders.services;

import com.lambdaschool.getorders.models.Agent;
import com.lambdaschool.getorders.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service(value = "agentService")
public class AgentServiceImpl implements AgentService {
    @Autowired
    private AgentsRepository agentrepos;

    @Override
    public Agent findAgentById(long id) {
        return agentrepos.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Agent " + id + " Not Found"));
    }
    @Override
    public Agent save(Agent agent) {
        return agentrepos.save(agent);
    }
}
