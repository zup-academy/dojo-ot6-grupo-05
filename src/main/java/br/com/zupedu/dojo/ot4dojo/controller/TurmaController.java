package br.com.zupedu.dojo.ot4dojo.controller;

import br.com.zupedu.dojo.ot4dojo.dtos.NovaTurmaRequest;
import br.com.zupedu.dojo.ot4dojo.entites.Turma;
import br.com.zupedu.dojo.ot4dojo.repositories.TurmaRepository;

import org.springframework.beans.factory.annotation.Autowired;
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
	
    @PostMapping("/turma")
    public String save(@RequestBody @Valid NovaTurmaRequest novaTurmaRequest){
    	
        Turma turma = novaTurmaRequest.toModel();

        turmaRepository.save(turma);
        
        
        return turma.toString();
    }
}
