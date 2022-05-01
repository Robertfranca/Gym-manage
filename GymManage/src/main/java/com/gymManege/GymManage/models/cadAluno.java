package com.gymManege.GymManage.models;
import javax.persistence.*;
import java.io.Serializable;


@Entity
public class cadAluno implements Serializable {


    private static final long serialVersionUid= 1l;



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String rg;
    private String nome;
    private String email;
    private String telefone;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
