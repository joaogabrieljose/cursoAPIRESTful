package pt.com.api.curso.mapper;

import pt.com.api.curso.domain.entity.Aluno;
import pt.com.api.curso.request.AlunoRequest;

public class AlunoMapper {
    public static Aluno toAluno(AlunoRequest request){
        Aluno aluno = new Aluno();
        aluno.setId(request.getId());
        aluno.setName(request.getName());
        aluno.setApelido(request.getApelido());
        aluno.setCodigoPostal(request.getCodigoPostal());
        aluno.setEmail(request.getEmail());
        if (request.getCurso() != null){
            aluno.setCurso(request.getCurso());
        }
        return aluno;
    }
}
