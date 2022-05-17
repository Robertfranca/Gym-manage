package com.gymManege.GymManage.models;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "professores")
public class ProfModels implements Serializable {


    private static final long serialVersionUid= 1l;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    @Enumerated(EnumType.STRING)
    private TurmaProf Turma;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TurmaProf getTurma() {
        return Turma;
    }

    public void setTurma(TurmaProf turma) {
        Turma = turma;
    }
}
