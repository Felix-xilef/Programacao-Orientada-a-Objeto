/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex_3;

/**
 *
 * @author Felix Petiz Bonilho
 */
public class Aluno {
    private int codAluno;
    private String nome, turma;
    
    //toString, equals & hashCode
    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.codAluno;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (this.codAluno != other.codAluno) {
            return false;
        }
        return true;
    }
    
    //Construtores
    public Aluno() {    
    }

    public Aluno(int codAluno, String nome, String turma) {
        this.codAluno = codAluno;
        this.nome = nome;
        this.turma = turma;
    }
    //Getters & Setters
    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
