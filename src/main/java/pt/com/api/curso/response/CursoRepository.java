package pt.com.api.curso.response;

public class CursoRepository {
    public long id;
    public String name;
    public String descricao;
    public int nivel;

    public AlunoRepository aluno;

    public CursoRepository(){}

    public CursoRepository(long id, String name, String descricao, int nivel, AlunoRepository aluno) {
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

    public AlunoRepository getAluno() {
        return aluno;
    }

    public void setAluno(AlunoRepository aluno) {
        this.aluno = aluno;
    }
}
