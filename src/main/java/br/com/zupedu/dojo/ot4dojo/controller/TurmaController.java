package br.com.zupedu.dojo.ot4dojo.controller;

import br.com.zupedu.dojo.ot4dojo.dtos.NovaTurmaRequest;
import br.com.zupedu.dojo.ot4dojo.entites.Turma;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class TurmaController {

    @PostMapping("/turma")
    public ResponseEntity<?> save(@RequestBody @Valid NovaTurmaRequest novaTurmaRequest){
        Turma turma = novaTurmaRequest.converter();

    }
}
