package pt.com.api.curso.request;

import pt.com.api.curso.domain.entity.Aluno;

public class CursoRequest {
    public long id;
    public String name;
    public String descricao;
    public int nivel;

    public AlunoRequest aluno;

    public CursoRequest(){}

    public CursoRequest(long id, String name, String descricao, int nivel, AlunoRequest aluno) {
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

    public void setAluno(AlunoRequest aluno) {
        this.aluno = aluno;
    }
}
