package br.com.zupedu.dojo.ot4dojo.entites;

import br.com.zupedu.dojo.ot4dojo.dtos.NovaTurmaResponse;
import org.hibernate.validator.constraints.Length;

import br.com.zupedu.dojo.ot4dojo.dtos.NovaTurmaRequest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.FutureOrPresent;
import java.time.LocalDate;

@Entity
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Length(max=50)
    private String nome;

    @FutureOrPresent
    private LocalDate iniciaEm;

    private LocalDate terminaEm;

    public Turma(String nome, LocalDate dataInicio, LocalDate dataFim) {
        this.nome = nome;
        this.iniciaEm = dataInicio;
        this.terminaEm = dataFim;
    }

    @Deprecated
    public Turma(){
    }

    public Turma(NovaTurmaRequest novaTurmaRequest) {
		this.nome = novaTurmaRequest.getNome();
		this.iniciaEm = novaTurmaRequest.getIniciaEm();
		this.terminaEm = novaTurmaRequest.getTerminaEm();
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

    public NovaTurmaResponse toResposta() {
        return new NovaTurmaResponse(this.id, this.nome, this.iniciaEm, this.terminaEm);
    }
}
