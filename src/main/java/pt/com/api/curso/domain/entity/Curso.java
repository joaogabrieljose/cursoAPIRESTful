package pt.com.api.curso.domain.entity;

import jakarta.persistence.*;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String descricao;
    private int nivel;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    public Curso(){}

    public Curso(long id, String name, String descricao, int nivel, Aluno aluno) {
        this.id = id;
        this.name = name;
        this.descricao = descricao;
        this.nivel = nivel;
        this.aluno = aluno;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
