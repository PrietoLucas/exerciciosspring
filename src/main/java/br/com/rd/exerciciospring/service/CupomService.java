package br.com.rd.exerciciospring.service;

import br.com.rd.exerciciospring.model.Cupom;
import br.com.rd.exerciciospring.repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@Service("Cupom-Service")
public class CupomService {
    @Autowired
    CupomRepository cupomRepository;

    public ResponseEntity<List<Cupom>> searchByClientAndDate(@PathParam("idCliente") Long idCliente, @PathParam("dtVenda") String dtVenda){
        List<Cupom> cupom = new ArrayList<>();
        if(idCliente != null && dtVenda !=null)
            cupom = cupomRepository.findByIdClienteAndDtVenda(idCliente,dtVenda);
        else if(idCliente != null)
            cupom.add(cupomRepository.findById(idCliente).get());
        else if(dtVenda != null)
            cupom = cupomRepository.findByDtVenda(dtVenda);
        if (cupom != null && cupom.size() > 0){
            return ResponseEntity.ok().body(cupom);
        } else {
            return ResponseEntity.badRequest().build();
        }

    }
}
