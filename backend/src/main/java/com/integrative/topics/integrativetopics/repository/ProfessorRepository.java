package com.integrative.topics.integrativetopics.repository;

import com.integrative.topics.integrativetopics.model.Discipline;
import com.integrative.topics.integrativetopics.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessorRepository  extends JpaRepository<Professor, Long> {

    Professor findByEnrollment(String enrollment);

    //List<Discipline>

    //@Query(value = "select p from Professor p where p.nome like :nome")
    //List<Professor> findByNome(@Param("nome") String nome);

    //boolean existsByNomeLike(String nome);

    //@Query(value = "select p from Professor p where p.email like :email")
    //Professor findByEmail(@Param("email") String email);

    //boolean existsByEmailLike(String email);
}
