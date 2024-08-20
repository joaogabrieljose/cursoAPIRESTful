package pt.com.api.curso.mapper;

import pt.com.api.curso.domain.entity.Curso;
import pt.com.api.curso.request.CursoRequest;
import pt.com.api.curso.response.CursoRepository;

public class CursoMapper {
    public static Curso toCurso(CursoRequest request){
        Curso curso = new Curso();
        curso.setId(request.getId());
        curso.setName(request.getName());
        curso.setDescricao(request.getDescricao());
        curso.setNivel(request.getNivel());
        if (request.getAluno() != null) {
            curso.setAluno(request.getAluno());
        }
        return curso;
    }
    public static CursoRepository toCursoRepository( Curso curso){
        CursoRepository repository = new CursoRepository();
        repository.setId(curso.getId());
        repository.setName(curso.getName());
        repository.setDescricao(curso.getDescricao());
        repository.setNivel(curso.getNivel());
        if (curso.getAluno() != null){
            repository.setAluno(curso.getAluno());
        }
        return  repository;
    }
}
