package pt.com.api.curso.mapper;

import pt.com.api.curso.domain.entity.Aluno;
import pt.com.api.curso.request.AlunoRequest;
import pt.com.api.curso.response.AlunoResponse;

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
    public static AlunoResponse toAlunoRepositori(Aluno aluno){
        AlunoResponse repository = new AlunoResponse();
        repository.setId(aluno.getId());
        repository.setName(aluno.getName());
        repository.setApelido(aluno.getApelido());
        repository.setCodigoPostal(aluno.getCodigoPostal());
        repository.setEmail(aluno.getEmail());
        if (aluno.getCurso()!= null){
            repository.setCurso(aluno.getCurso());
        }
        return repository;
    }
}
