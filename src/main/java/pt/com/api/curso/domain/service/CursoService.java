package pt.com.api.curso.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.com.api.curso.domain.repository.CursoRepository;

@Service
public class CursoService {
    @Autowired
    private CursoRepository repository;
}
