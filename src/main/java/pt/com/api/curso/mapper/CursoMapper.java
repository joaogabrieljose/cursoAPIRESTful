package pt.com.api.curso.mapper;

import pt.com.api.curso.domain.entity.Curso;
import pt.com.api.curso.request.CursoRequest;
import pt.com.api.curso.response.CursoResponse;

public class CursoMapper {

    // Maps CursoRequest to Curso entity
    public static Curso toCurso(CursoRequest request) {
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

    // Maps Curso entity to CursoResponse
    public static CursoResponse toCursoResponse(Curso curso) {
        CursoResponse response = new CursoResponse();
        response.setId(curso.getId());
        response.setName(curso.getName());
        response.setDescricao(curso.getDescricao());
        response.setNivel(curso.getNivel());
        if (curso.getAluno() != null) {
            response.setAluno(curso.getAluno());
        }
        return response;
    }
}
