package pt.com.api.curso.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.com.api.curso.domain.entity.Curso;
import pt.com.api.curso.domain.repository.CursoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {
    @Autowired
    private CursoRepository repository;

    //salva
    public Curso save(Curso curso){
        return  repository.save(curso);
    }

    //busca por id
    public Curso getById(long id){
        Optional<Curso> getCurso = repository.findById(id);
        return getCurso.orElseThrow(()-> new RuntimeException("curso não encontrado com id "+ id));
    }

    // upedate
    public Curso updateCurso(long id, Curso curso){
        Optional<Curso> cursoAtual = repository.findById(id);
        if(cursoAtual.isPresent()){
            Curso atualizar = cursoAtual.get();
            atualizar.setId(curso.getId());
            atualizar.setName(curso.getName());
            atualizar.setDescricao(curso.getDescricao());
            atualizar.setAluno(curso.getAluno());
            atualizar.setNivel(curso.getNivel());
            return repository.save(atualizar);
        }else {
            curso.setId(id);
            return repository.save(curso);
        }
    }

    // lista todos cursos
   public List<Curso> findAllCurso(){
        return (List<Curso>)  repository.findAll();
   }

   //delete Curso
    public void deleteCursoById(long id){
        Optional<Curso> cursoDelete = repository.findById(id);
        if(cursoDelete.isPresent()){
            repository.deleteById(id);
        }else{
            throw new IllegalArgumentException("curso naõ foi encontrado com id"+id);
        }
    }
}
