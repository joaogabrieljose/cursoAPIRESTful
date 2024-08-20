package pt.com.api.curso.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.com.api.curso.domain.entity.Aluno;
import pt.com.api.curso.domain.repository.AlunoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public Aluno save(Aluno aluno){
        return repository.save(aluno);
    }
    public Aluno getByd(long id){
        Optional<Aluno> buscaAluno = repository.findById(id);
        return  buscaAluno.orElseThrow(()-> new RuntimeException("aluno com id"+id+"não encontrado"));
    }
    public Aluno updateById(long id, Aluno aluno){
        Optional<Aluno> alunoAtual = repository.findById(id);
        if(alunoAtual.isPresent()){
            Aluno atualizar = alunoAtual.get();
            atualizar.setId(aluno.getId());
            atualizar.setName(aluno.getName());
            atualizar.setApelido(aluno.getApelido());
            atualizar.setEmail(aluno.getEmail());
            atualizar.setCodigoPostal(aluno.getCodigoPostal());
            atualizar.setCurso(aluno.getCurso());
            return repository.save(atualizar);
        }else {
            aluno.setId(id);
            return  repository.save(aluno);
        }
    }
    public List<Aluno> findAllAluno(){
        return (List<Aluno>) repository.findAll();
    }
    public  void deleteById(long id){
        Optional<Aluno> alunoDelete = repository.findById(id);
        if (alunoDelete.isPresent()){
            repository.deleteById(id);
            throw  new IllegalArgumentException("aluno com id"+id+"não encontrado");
        }
    }
}
