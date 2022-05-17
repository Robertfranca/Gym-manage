package com.gymManege.GymManage.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ficha")
public class FichaModels implements Serializable{

    private static final long serialVersionUID= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "exercicio", length = 100, nullable = false)
    private String exercicio;
    //verificar se o tipo atribuido está correto//
    @Column(name = "series", length = 100, nullable = false)
    private Integer series;
    @Column(name  = "repeticoes", length = 100, nullable = false)
    private Integer repeticoes;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getExercicio() {
        return exercicio;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Integer getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(Integer repeticoes) {
        this.repeticoes = repeticoes;
    }
}
