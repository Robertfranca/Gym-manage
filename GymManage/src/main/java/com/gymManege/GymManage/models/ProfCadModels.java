package com.gymManege.GymManage.models;

import javax.persistence.*;

@Entity
@Table(name = "Cad_profs")
public class ProfCadModels {


    private static final long serialVersionUID= 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "nome", length = 100)
    private String nome;

    @Column(name = "sobrenome", length = 50)
    private String sobrenome;

    @Column(name = "email", length = 100)
    private String email;
    @Column(name = "cref", length = 100)
    private String cref;

    @Column(name = "dropvalue")
    private String dropvalue;

    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    @Column(name = "cpf", length = 255)
    private String cpf;

    @Column(name = "telefone", length = 100)
    private String telefone;



    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDropvalue() {
        return dropvalue;
    }

    public void setDropvalue(String dropvalue) {
        this.dropvalue = dropvalue;
    }

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

}
