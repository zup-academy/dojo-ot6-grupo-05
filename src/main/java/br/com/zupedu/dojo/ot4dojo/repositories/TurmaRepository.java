package br.com.zupedu.dojo.ot4dojo.repositories;

import br.com.zupedu.dojo.ot4dojo.entites.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma,Long> {
}
