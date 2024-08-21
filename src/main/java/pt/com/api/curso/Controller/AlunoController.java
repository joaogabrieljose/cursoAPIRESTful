package pt.com.api.curso.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.com.api.curso.domain.entity.Aluno;
import pt.com.api.curso.domain.service.AlunoService;
import pt.com.api.curso.mapper.AlunoMapper;
import pt.com.api.curso.request.AlunoRequest;
import pt.com.api.curso.response.AlunoRepository;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.ResponseEntity.status;

@RestController
public class AlunoController {

    @Autowired
    private AlunoService service;

    @PostMapping("/aluno/")
    public ResponseEntity<AlunoRepository> saveAluno(@RequestBody AlunoRequest request){
            var novoSalva = AlunoMapper.toAluno(request);
            var alunoSave = service.save(novoSalva);
            AlunoRepository repository = AlunoMapper.toAlunoRepositori(alunoSave);
            return status(HttpStatus.CREATED).body(repository);
    }

    @PutMapping("/aluno/{id}")
    public ResponseEntity<Object> update(@PathVariable  long id, @RequestBody AlunoRequest request) {
        var alunoUpdate = AlunoMapper.toAluno(request);
        var novoAluno = service.updateById(id, alunoUpdate);
        AlunoRepository updateResponse = AlunoMapper.toAlunoRepositori(novoAluno);
        return ResponseEntity.status(HttpStatus.OK).body(updateResponse);
    }

    @GetMapping("/aluno/{id}")
    public ResponseEntity<AlunoRepository> getById(@PathVariable long id){
        var novoAluno = service.getByd(id);
        AlunoRepository alunoRepository = AlunoMapper.toAlunoRepositori(novoAluno);
        return ResponseEntity.ok(alunoRepository);
    }

    @GetMapping("/aluno/")
    public ResponseEntity<List<AlunoRepository>> findAllAluno() {
        List<Aluno> findAllAluno = service.findAllAluno();
        List<AlunoRepository> novoFindAll = findAllAluno.stream()
                .map(AlunoMapper::toAlunoRepositori)
                .collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.OK).body(novoFindAll);
    }

    @DeleteMapping("aluno")
    public ResponseEntity<AlunoRepository> deleteById(@PathVariable long id){
        service.deleteById(id);
        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
