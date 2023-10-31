package com.cadastroalunos.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastroaluno.Model.Aluno;
import com.cadastroalunos.repository.AlunoRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	   @ApiOperation("Obter todos os exemplos")
	    @GetMapping("/alunos")
	    public void getAlunos() {
	   
	    }
	
    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

    @PostMapping
    public Aluno adicionarAluno(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @GetMapping("/{id}")
    public Aluno buscarAlunoPorId(@PathVariable Long id) {
        return alunoRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Aluno atualizarAluno(@PathVariable Long id, @RequestBody Aluno alunoAtualizado) {
        Aluno aluno = alunoRepository.findById(id).orElse(null);
        if (aluno != null) {
            aluno.setNome(alunoAtualizado.getNome());
            aluno.setIdade(alunoAtualizado.getIdade());
            aluno.setNotaPrimeiroSemestre(alunoAtualizado.getNotaPrimeiroSemestre());
            aluno.setNotaSegundoSemestre(alunoAtualizado.getNotaSegundoSemestre());
            aluno.setNomeProfessor(alunoAtualizado.getNomeProfessor());
            aluno.setNumeroSala(alunoAtualizado.getNumeroSala());
            return alunoRepository.save(aluno);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable Long id) {
        alunoRepository.deleteById(id);
    }
}