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
    public void search(@PathVariable(required = true) Long id, @PathVariable(required = true) String dtVenda){
        service.searchByClientAndDate(id, dtVenda);
    }
}


