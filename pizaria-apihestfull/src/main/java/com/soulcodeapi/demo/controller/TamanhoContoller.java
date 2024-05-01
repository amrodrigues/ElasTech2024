package com.soulcodeapi.demo.controller;
import com.soulcodeapi.demo.model.Tamanho;
import com.soulcodeapi.demo.repository.TamanhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;
@RestController
public class TamanhoContoller {
    @Autowired
    private TamanhoRepository tamanhoRepository;

    @RequestMapping(value = "/criarTamanho",method = RequestMethod.POST)
    public Tamanho save(@RequestBody Tamanho tamanho)
    {
        tamanho = this.tamanhoRepository.save(tamanho);
        return tamanho;
    }

    @RequestMapping(value = "/mostrarTamanho",method = RequestMethod.GET )
    public List<Tamanho> findAll(){
        List<Tamanho> tamanho = this.tamanhoRepository.findAll();
        return tamanho;
    }


    @RequestMapping(value = "/mostrarTamanho/{id}",method = RequestMethod.GET )
    public Tamanho findByid(@PathVariable long id)    {
        Optional<Tamanho> resultado = this.tamanhoRepository.findById(id);
        if (resultado.isEmpty())
        { throw new RuntimeException("Bebida nao encontrada");}
        else
        { return resultado.get();}
    }

    @RequestMapping(value = "Tamanho/excluir/{id}", method = RequestMethod.GET)
    public Tamanho deleteById(@PathVariable long id)    {
        Tamanho tamanho =  findByid(id);
        this.tamanhoRepository.deleteById(id);
        return tamanho;
    }

    @RequestMapping(value = "Tamanho/editar/{id}", method = RequestMethod.PUT)
    public Tamanho editarById(@PathVariable long id, @RequestBody Tamanho tamanho)    {
        this.findByid(id);
        tamanho.setIdTamanho(id);
        tamanho = this.tamanhoRepository.save(tamanho);
        return tamanho;
    }
}
