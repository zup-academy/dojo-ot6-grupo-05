package br.com.zupedu.dojo.ot4dojo.entites;

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
    private LocalDate dataInicio;

    private LocalDate dataFim;

    public Turma(String nome, LocalDate dataInicio, LocalDate dataFim) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    @Deprecated
    public Turma(){
    }

    public Turma(NovaTurmaRequest novaTurmaRequest) {
		this.nome = novaTurmaRequest.getNome();
		this.dataInicio = novaTurmaRequest.getIniciaEm();
		this.dataFim = novaTurmaRequest.getTerminaEm();
    }

	public String getNome() {
        return nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

	@Override
	public String toString() {
		return "Turma [id=" + id + ", nome=" + nome + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + "]";
	}
    
    
}
