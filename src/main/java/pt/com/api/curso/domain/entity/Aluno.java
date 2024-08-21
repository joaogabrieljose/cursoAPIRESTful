package pt.com.api.curso.domain.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String apelido;
    private int codigoPostal;
    private String email;
    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<Curso> curso;

    public Aluno(){}

    public Aluno(long id, String name, String apelido, int codigoPostal, String email, List<Curso> curso) {
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

    public List<Curso> getCurso() {
        return curso;
    }

    public void setCurso(List<Curso> curso) {
        this.curso = curso;
    }
}
