package com.soulcodeapi.demo.controller;


import com.soulcodeapi.demo.model.Cliente;
import com.soulcodeapi.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @RequestMapping(value = "/criarcliente",method = RequestMethod.POST)
    public Cliente save(@RequestBody Cliente cliente)
    {
        cliente = this.clienteRepository.save(cliente);
        return cliente;
    }

    @RequestMapping(value = "/mostrarcliente",method = RequestMethod.GET )
    public List<Cliente> findAll(){
        List<Cliente> cliente = this.clienteRepository.findAll();
        return cliente;
    }


    @RequestMapping(value = "/mostrarcliente/{id}",method = RequestMethod.GET )
    public Cliente findByid(@PathVariable long id)    {
        Optional<Cliente> resultado = this.clienteRepository.findById(id);
        if (resultado.isEmpty())
        { throw new RuntimeException("Bebida nao encontrada");}
        else
        { return resultado.get();}
    }

    @RequestMapping(value = "cliente/excluir/{id}", method = RequestMethod.GET)
    public Cliente deleteById(@PathVariable long id)    {
        Cliente cliente =  findByid(id);
        this.clienteRepository.deleteById(id);
        return cliente;
    }

    @RequestMapping(value = "cliente/editar/{id}", method = RequestMethod.PUT)
    public Cliente editarById(@PathVariable long id, @RequestBody Cliente cliente)    {
        this.findByid(id);
        cliente.setIdCliente(id);
        cliente = this.clienteRepository.save(cliente);
        return cliente;
    }
}
