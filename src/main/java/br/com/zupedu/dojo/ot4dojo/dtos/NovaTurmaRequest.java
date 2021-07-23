package br.com.zupedu.dojo.ot4dojo.dtos;

import br.com.zupedu.dojo.ot4dojo.entites.Turma;
import br.com.zupedu.dojo.ot4dojo.validators.Unique;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class NovaTurmaRequest {

    @NotBlank @Unique(clazz = Turma.class, fieldName = "nome")
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public NovaTurmaRequest(String nome, LocalDate dataInicio, LocalDate dataFim) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Turma converter() {
        Turma turma = new Turma()
    }
}
