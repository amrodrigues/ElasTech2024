package com.soulcodeapi.demo.controller;
import com.soulcodeapi.demo.model.Pedido;
import com.soulcodeapi.demo.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @RequestMapping(value = "/criarPedido",method = RequestMethod.POST)
    public Pedido save(@RequestBody Pedido pedido)
    {
        pedido = this.pedidoRepository.save(pedido);
        return pedido;
    }

    @RequestMapping(value = "/mostrarPedido",method = RequestMethod.GET )
    public List<Pedido> findAll(){
        List<Pedido> pedido = this.pedidoRepository.findAll();
        return pedido;
    }


    @RequestMapping(value = "/mostrarPedido/{id}",method = RequestMethod.GET )
    public Pedido findByid(@PathVariable long id)    {
        Optional<Pedido> resultado = this.pedidoRepository.findById(id);
        if (resultado.isEmpty())
        { throw new RuntimeException("Bebida nao encontrada");}
        else
        { return resultado.get();}
    }

    @RequestMapping(value = "Pedido/excluir/{id}", method = RequestMethod.GET)
    public Pedido deleteById(@PathVariable long id)    {
        Pedido pedido =  findByid(id);
        this.pedidoRepository.deleteById(id);
        return pedido;
    }

    @RequestMapping(value = "Pedido/editar/{id}", method = RequestMethod.PUT)
    public Pedido editarById(@PathVariable long id, @RequestBody Pedido pedido)    {
        this.findByid(id);
        pedido.setIdPedido(id);
        pedido = this.pedidoRepository.save(pedido);
        return pedido;
    }
}
