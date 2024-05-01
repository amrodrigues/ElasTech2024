package com.soulcodeapi.demo.controller;
import com.soulcodeapi.demo.model.PizzaPedidaIngrediente;
import com.soulcodeapi.demo.repository.PizzaPedidaIngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;
@RestController
public class PizzaPedidaIngredienteController {
    @Autowired
    private PizzaPedidaIngredienteRepository pizzaPedidaIngredienteRepository;

    @RequestMapping(value = "/criarPizzaPedidaIngrediente",method = RequestMethod.POST)
    public PizzaPedidaIngrediente save(@RequestBody PizzaPedidaIngrediente pizzaPedidaIngrediente)
    {
        pizzaPedidaIngrediente = this.pizzaPedidaIngredienteRepository.save(pizzaPedidaIngrediente);
        return pizzaPedidaIngrediente;
    }

    @RequestMapping(value = "/mostrarPizzaPedidaIngrediente",method = RequestMethod.GET )
    public List<PizzaPedidaIngrediente> findAll(){
        List<PizzaPedidaIngrediente> pizzaPedidaIngrediente = this.pizzaPedidaIngredienteRepository.findAll();
        return pizzaPedidaIngrediente;
    }


    @RequestMapping(value = "/mostrarPizzaPedidaIngrediente/{id}",method = RequestMethod.GET )
    public PizzaPedidaIngrediente findByid(@PathVariable long id)    {
        Optional<PizzaPedidaIngrediente> resultado = this.pizzaPedidaIngredienteRepository.findById(id);
        if (resultado.isEmpty())
        { throw new RuntimeException("Bebida nao encontrada");}
        else
        { return resultado.get();}
    }

    @RequestMapping(value = "PizzaPedidaIngrediente/excluir/{id}", method = RequestMethod.GET)
    public PizzaPedidaIngrediente deleteById(@PathVariable long id)    {
        PizzaPedidaIngrediente PizzaPedidaIngrediente =  findByid(id);
        this.pizzaPedidaIngredienteRepository.deleteById(id);
        return PizzaPedidaIngrediente;
    }

    @RequestMapping(value = "PizzaPedidaIngrediente/editar/{id}", method = RequestMethod.PUT)
    public PizzaPedidaIngrediente editarById(@PathVariable long id, @RequestBody PizzaPedidaIngrediente pizzaPedidaIngrediente)    {
        this.findByid(id);
        pizzaPedidaIngrediente.setIdPizaaIngrediente(id);
        pizzaPedidaIngrediente = this.pizzaPedidaIngredienteRepository.save(pizzaPedidaIngrediente);
        return pizzaPedidaIngrediente;
    }
}
