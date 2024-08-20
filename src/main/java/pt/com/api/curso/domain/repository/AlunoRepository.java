package pt.com.api.curso.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pt.com.api.curso.domain.entity.Aluno;

import java.util.Optional;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno,Long> {
    Optional<Aluno> findById(Long id);
}
