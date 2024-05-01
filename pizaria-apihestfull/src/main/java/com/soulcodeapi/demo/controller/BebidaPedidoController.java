package com.soulcodeapi.demo.controller;


import com.soulcodeapi.demo.model.BebidaPedido;
import com.soulcodeapi.demo.repository.BebidaPedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BebidaPedidoController {

    @Autowired
    private BebidaPedidoRepository bebidapedidoRepository;

    @RequestMapping(value = "/criarbebidapedido",method = RequestMethod.POST)
    public BebidaPedido save(@RequestBody BebidaPedido bebidapedido)
    {
        bebidapedido = this.bebidapedidoRepository.save(bebidapedido);
        return bebidapedido;
    }

    @RequestMapping(value = "/mostrarbebidapedido",method = RequestMethod.GET )
    public List<BebidaPedido> findAll(){
        List<BebidaPedido> bebidapedido = this.bebidapedidoRepository.findAll();
        return bebidapedido;
    }


    @RequestMapping(value = "/mostrarbebidapedido/{id}",method = RequestMethod.GET )
    public BebidaPedido findByid(@PathVariable long id)    {
        Optional<BebidaPedido> resultado = this.bebidapedidoRepository.findById(id);
        if (resultado.isEmpty())
        { throw new RuntimeException("Bebida nao encontrada");}
        else
        { return resultado.get();}
    }

    @RequestMapping(value = "bebidapedido/excluir/{id}", method = RequestMethod.GET)
    public BebidaPedido deleteById(@PathVariable long id)    {
        BebidaPedido bebidapedido =  findByid(id);
        this.bebidapedidoRepository.deleteById(id);
        return bebidapedido;
    }

    @RequestMapping(value = "bebidapedido/editar/{id}", method = RequestMethod.PUT)
    public BebidaPedido editarById(@PathVariable long id, @RequestBody BebidaPedido bebidapedido)    {
        this.findByid(id);
        bebidapedido.setIdBebidaPedido(id);
        bebidapedido = this.bebidapedidoRepository.save(bebidapedido);
        return bebidapedido;
    }
}
