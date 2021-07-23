package br.com.zupedu.dojo.ot4dojo.controller;

import br.com.zupedu.dojo.ot4dojo.dtos.NovaTurmaRequest;
import br.com.zupedu.dojo.ot4dojo.dtos.NovaTurmaResponse;
import br.com.zupedu.dojo.ot4dojo.entites.Turma;
import br.com.zupedu.dojo.ot4dojo.repositories.TurmaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class TurmaController {

	@Autowired
	TurmaRepository turmaRepository;
	
    @PostMapping("/turmas")
    public ResponseEntity<NovaTurmaResponse> save(@RequestBody @Valid NovaTurmaRequest novaTurmaRequest){
        Turma turma = novaTurmaRequest.toModel();
        turmaRepository.save(turma);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(turma.toResposta());
    }
}
