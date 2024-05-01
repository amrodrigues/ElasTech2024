package com.soulcodeapi.demo.controller;
import com.soulcodeapi.demo.model.Ingrediente;
import com.soulcodeapi.demo.repository.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class IngredienteController {

    @Autowired
    private IngredienteRepository ingredienteRepository;

    @RequestMapping(value = "/criarIngrediente",method = RequestMethod.POST)
    public Ingrediente save(@RequestBody Ingrediente ingrediente)
    {
        ingrediente = this.ingredienteRepository.save(ingrediente);
        return ingrediente;
    }

    @RequestMapping(value = "/mostrarIngrediente",method = RequestMethod.GET )
    public List<Ingrediente> findAll(){
        List<Ingrediente> ingrediente = this.ingredienteRepository.findAll();
        return ingrediente;
    }


    @RequestMapping(value = "/mostrarIngrediente/{id}",method = RequestMethod.GET )
    public Ingrediente findByid(@PathVariable long id)    {
        Optional<Ingrediente> resultado = this.ingredienteRepository.findById(id);
        if (resultado.isEmpty())
        { throw new RuntimeException("Bebida nao encontrada");}
        else
        { return resultado.get();}
    }

    @RequestMapping(value = "Ingrediente/excluir/{id}", method = RequestMethod.GET)
    public Ingrediente deleteById(@PathVariable long id)    {
        Ingrediente ingrediente =  findByid(id);
        this.ingredienteRepository.deleteById(id);
        return ingrediente;
    }

    @RequestMapping(value = "Ingrediente/editar/{id}", method = RequestMethod.PUT)
    public Ingrediente editarById(@PathVariable long id, @RequestBody Ingrediente ingrediente)    {
        this.findByid(id);
        ingrediente.setIdIngrediente(id);
        ingrediente = this.ingredienteRepository.save(ingrediente);
        return ingrediente;
    }
}
