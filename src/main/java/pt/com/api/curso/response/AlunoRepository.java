package pt.com.api.curso.response;

import java.util.List;

public class AlunoRepository {

    public long id;
    public String name;
    public String apelido;
    public int codigoPostal;
    public String email;
    public List<CursoRepository> curso;

    public AlunoRepository(){}
    public AlunoRepository(long id, String name, String apelido, int codigoPostal, String email, List<CursoRepository> curso) {
        this.id = id;
        this.name = name;
        this.apelido = apelido;
        this.codigoPostal = codigoPostal;
        this.email = email;
        this.curso = curso;
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

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<CursoRepository> getCurso() {
        return curso;
    }

    public void setCurso(List<CursoRepository> curso) {
        this.curso = curso;
    }
}
