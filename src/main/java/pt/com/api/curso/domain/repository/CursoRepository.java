package pt.com.api.curso.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pt.com.api.curso.domain.entity.Curso;

import java.util.Optional;

@Repository
public interface CursoRepository extends CrudRepository<Curso,Long> {
    Optional<Curso> findById(Long id);
}
