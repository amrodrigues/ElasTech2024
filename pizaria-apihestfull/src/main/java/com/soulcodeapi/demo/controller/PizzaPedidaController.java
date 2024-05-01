package com.soulcodeapi.demo.controller;
import com.soulcodeapi.demo.model.PizzaPedida;
import com.soulcodeapi.demo.repository.PizzaPedidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;
@RestController
public class PizzaPedidaController {
    @Autowired
    private PizzaPedidaRepository pizzaPedidaRepository;

    @RequestMapping(value = "/criarPizzaPedida",method = RequestMethod.POST)
    public PizzaPedida save(@RequestBody PizzaPedida pizzaPedida)
    {
        pizzaPedida = this.pizzaPedidaRepository.save(pizzaPedida);
        return pizzaPedida;
    }

    @RequestMapping(value = "/mostrarPizzaPedida",method = RequestMethod.GET )
    public List<PizzaPedida> findAll(){
        List<PizzaPedida> pizzaPedida = this.pizzaPedidaRepository.findAll();
        return pizzaPedida;
    }


    @RequestMapping(value = "/mostrarPizzaPedida/{id}",method = RequestMethod.GET )
    public PizzaPedida findByid(@PathVariable long id)    {
        Optional<PizzaPedida> resultado = this.pizzaPedidaRepository.findById(id);
        if (resultado.isEmpty())
        { throw new RuntimeException("Bebida nao encontrada");}
        else
        { return resultado.get();}
    }

    @RequestMapping(value = "PizzaPedida/excluir/{id}", method = RequestMethod.GET)
    public PizzaPedida deleteById(@PathVariable long id)    {
        PizzaPedida PizzaPedida =  findByid(id);
        this.pizzaPedidaRepository.deleteById(id);
        return PizzaPedida;
    }

    @RequestMapping(value = "PizzaPedida/editar/{id}", method = RequestMethod.PUT)
    public PizzaPedida editarById(@PathVariable long id, @RequestBody PizzaPedida pizzaPedida)    {
        this.findByid(id);
        pizzaPedida.setIdPizzaPedida(id);
        pizzaPedida = this.pizzaPedidaRepository.save(pizzaPedida);
        return pizzaPedida;
    }
}
