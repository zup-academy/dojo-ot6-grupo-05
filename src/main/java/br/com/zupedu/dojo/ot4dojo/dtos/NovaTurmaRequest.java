package br.com.zupedu.dojo.ot4dojo.dtos;

import br.com.zupedu.dojo.ot4dojo.entites.Turma;
import br.com.zupedu.dojo.ot4dojo.validators.Unique;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class NovaTurmaRequest {

    @NotBlank @Unique(clazz = Turma.class, fieldName = "nome")
    private String nome;
    private LocalDate iniciaEm;
    private LocalDate terminaEm;

    public NovaTurmaRequest(String nome, LocalDate iniciaEm, LocalDate terminaEm) {
        this.nome = nome;
        this.iniciaEm = iniciaEm;
        this.terminaEm = terminaEm;
    }

	public Turma toModel() {
		
		return new Turma(this);
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getIniciaEm() {
		return iniciaEm;
	}

	public LocalDate getTerminaEm() {
		return terminaEm;
	}

	
   
}
