package com.gymManege.GymManage.models;
import javax.persistence.*;
import java.io.Serializable;


@Entity
public class cadAluno implements Serializable {


    private static final long serialVersionUid= 1l;



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String sobrenome;  
    private String senha;
    private String novamenteSenha;
    private String email;
    private String CPF;
    private String telefone;

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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }   

    public String getNovamenteSenha() {
        return novamenteSenha;
    }

    public void setNovamenteSenha(String novamenteSenha) {
        this.novamenteSenha = novamenteSenha;
    } 

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }    

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        this.CPF = cPF;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}






   




