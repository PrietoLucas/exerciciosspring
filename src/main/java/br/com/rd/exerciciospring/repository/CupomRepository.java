package br.com.rd.exerciciospring.repository;

import br.com.rd.exerciciospring.model.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CupomRepository extends JpaRepository<Cupom, Long> {
    public List<Cupom> findByIdClienteAndDtVenda(Long idCliente, String dtVenda);

    public List<Cupom> findByDtVenda(String dtVenda);
}
