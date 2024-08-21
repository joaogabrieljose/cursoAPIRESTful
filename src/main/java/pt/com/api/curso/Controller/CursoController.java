package pt.com.api.curso.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pt.com.api.curso.domain.entity.Curso;
import pt.com.api.curso.domain.service.CursoService;
import pt.com.api.curso.mapper.CursoMapper;
import pt.com.api.curso.request.CursoRequest;
import pt.com.api.curso.response.CursoResponse;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoService service;

    @PostMapping("/")
    public ResponseEntity<CursoResponse> saveCurso(@RequestBody CursoRequest request) {
        Curso novoCurso = CursoMapper.toCurso(request);
        Curso cursoSave = service.save(novoCurso);
        CursoResponse repository = CursoMapper.toCursoResponse(cursoSave);
        return ResponseEntity.status(HttpStatus.CREATED).body(repository);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CursoResponse> update(@PathVariable long id, @RequestBody CursoRequest request) {
        Curso cursoUpdate = CursoMapper.toCurso(request);
        Curso novoCurso = service.updateCurso(id, cursoUpdate);
        CursoResponse updateResponse = CursoMapper.toCursoResponse(novoCurso);
        return ResponseEntity.status(HttpStatus.OK).body(updateResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CursoResponse> getById(@PathVariable long id) {
        Curso novoCurso = service.getById(id);
        CursoResponse cursoRepository = CursoMapper.toCursoResponse(novoCurso);
        return ResponseEntity.ok(cursoRepository);
    }

    @GetMapping("/")
    public ResponseEntity<List<CursoResponse>> findAllCurso() {
        List<Curso> findAllCurso = service.findAllCurso();
        List<CursoResponse> novoFindAll = findAllCurso.stream()
                .map(CursoMapper::toCursoResponse)
                .collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.OK).body(novoFindAll);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable long id) {
        service.deleteCursoById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
