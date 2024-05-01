package com.soulcodeapi.demo.controller;

import com.soulcodeapi.demo.model.Fornada;
import com.soulcodeapi.demo.repository.FornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FornadaController {

    @Autowired
    private FornadaRepository fornadaRepository;

    @RequestMapping(value = "/criarFornada",method = RequestMethod.POST)
    public Fornada save(@RequestBody Fornada fornada)
    {
        fornada = this.fornadaRepository.save(fornada);
        return fornada;
    }

    @RequestMapping(value = "/mostrarFornada",method = RequestMethod.GET )
    public List<Fornada> findAll(){
        List<Fornada> fornada = this.fornadaRepository.findAll();
        return fornada;
    }


    @RequestMapping(value = "/mostrarFornada/{id}",method = RequestMethod.GET )
    public Fornada findByid(@PathVariable long id)    {
        Optional<Fornada> resultado = this.fornadaRepository.findById(id);
        if (resultado.isEmpty())
        { throw new RuntimeException("Bebida nao encontrada");}
        else
        { return resultado.get();}
    }

    @RequestMapping(value = "Fornada/excluir/{id}", method = RequestMethod.GET)
    public Fornada deleteById(@PathVariable long id)    {
        Fornada fornada =  findByid(id);
        this.fornadaRepository.deleteById(id);
        return fornada;
    }

    @RequestMapping(value = "Fornada/editar/{id}", method = RequestMethod.PUT)
    public Fornada editarById(@PathVariable long id, @RequestBody Fornada fornada)    {
        this.findByid(id);
        fornada.setIdFornada(id);
        fornada = this.fornadaRepository.save(fornada);
        return fornada;
    }
}
