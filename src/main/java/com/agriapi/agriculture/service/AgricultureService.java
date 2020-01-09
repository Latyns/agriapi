package com.agriapi.agriculture.service;

import com.agriapi.agriculture.repository.ExploitationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Implementation de service pour le management d'exploitation.
 */
@Service
@Transactional
public class AgricultureService {

    private final ExploitationRepository exploitationRepository;

    public AgricultureService(ExploitationRepository exploitationRepository) {
        this.exploitationRepository = exploitationRepository;
    }
}
