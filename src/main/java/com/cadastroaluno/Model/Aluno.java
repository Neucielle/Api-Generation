package com.cadastroaluno.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private double notaPrimeiroSemestre;
    private double notaSegundoSemestre;
    private String nomeProfessor;
    private int numeroSala;

    public Aluno() {
    }

    public Aluno(Long id, String nome, int idade, double notaPrimeiroSemestre, double notaSegundoSemestre,
            String nomeProfessor, int numeroSala) {
        super();
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.notaPrimeiroSemestre = notaPrimeiroSemestre;
        this.notaSegundoSemestre = notaSegundoSemestre;
        this.nomeProfessor = nomeProfessor;
        this.numeroSala = numeroSala;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNotaPrimeiroSemestre() {
        return notaPrimeiroSemestre;
    }

    public void setNotaPrimeiroSemestre(double notaPrimeiroSemestre) {
        this.notaPrimeiroSemestre = notaPrimeiroSemestre;
    }

    public double getNotaSegundoSemestre() {
        return notaSegundoSemestre;
    }

    public void setNotaSegundoSemestre(double notaSegundoSemestre) {
        this.notaSegundoSemestre = notaSegundoSemestre;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }
}
