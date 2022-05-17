package com.gymManege.GymManage.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "alunos")
public class AlunoModels implements Serializable {


    private static final long serialVersionUid= 1l;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    @Column(name = "cidade", length = 50, nullable = false)
    private String cidade;
    @Column(name = "telefone", length = 100, nullable = false)
    private String telefone;
    @Column(name = "senha", length = 255, nullable = false)
    private String Senha;
    @Column(name = "email", length = 100, nullable = false)
    private String emaiil;
    @Column(name = "dropvalue", nullable = false)
    private String dropvalue;

    public String getDropvalue() {
        return dropvalue;
    }

    public void setDropvalue(String dropvalue) {
        this.dropvalue = dropvalue;
    }



    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public String getEmaiil() {
        return emaiil;
    }

    public void setEmaiil(String emaiil) {
        this.emaiil = emaiil;
    }



    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setcidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
