package com.integrative.topics.integrativetopics.services;

import com.integrative.topics.integrativetopics.dtos.ProfessorDTO;
import com.integrative.topics.integrativetopics.model.Discipline;
import com.integrative.topics.integrativetopics.model.Professor;
import com.integrative.topics.integrativetopics.repository.ProfessorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfessorService {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    ProfessorRepository professorRepository;



}
