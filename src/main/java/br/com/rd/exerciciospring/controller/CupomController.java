package br.com.rd.exerciciospring.controller;

import br.com.rd.exerciciospring.service.CupomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;


@RestController
public class CupomController {
    @Autowired
    CupomService service;

    @GetMapping("/cupom")
    public void search(@PathParam("idCliente") Long idCliente, @PathParam("dtVenda") String dtVenda){
        service.searchByClientAndDate(idCliente, dtVenda);
    }
}


