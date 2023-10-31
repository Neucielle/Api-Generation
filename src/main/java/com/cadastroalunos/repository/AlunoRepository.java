package com.cadastroalunos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastroaluno.Model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}