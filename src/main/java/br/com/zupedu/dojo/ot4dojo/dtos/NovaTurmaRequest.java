package br.com.zupedu.dojo.ot4dojo.dtos;

import br.com.zupedu.dojo.ot4dojo.entites.Turma;
import br.com.zupedu.dojo.ot4dojo.validators.Unique;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalDateTime;

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

    	if (!iniciaEm.isBefore(terminaEm)) {

    		throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Data de Fim não pode ser maior que a data de Inicio!");

		}

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
