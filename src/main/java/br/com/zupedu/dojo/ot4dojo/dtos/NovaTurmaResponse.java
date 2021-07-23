package br.com.zupedu.dojo.ot4dojo.dtos;

import java.time.LocalDate;

public class NovaTurmaResponse {

    private Long id;
    private String nome;
    private LocalDate iniciaEm;
    private LocalDate terminaEm;

    public NovaTurmaResponse(Long id, String nome, LocalDate iniciaEm, LocalDate terminaEm) {
        this.id = id;
        this.nome = nome;
        this.iniciaEm = iniciaEm;
        this.terminaEm = terminaEm;
    }

    public Long getId() {
        return id;
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
