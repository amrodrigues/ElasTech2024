package com.soulcodeapi.demo.Controller;

import com.soulcodeapi.demo.Models.Usuario;
import com.soulcodeapi.demo.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping(value = "/criarusuario",method = RequestMethod.POST)
    public Usuario save()
    {
        Usuario u = new Usuario();
        u.setNome("Rafael");
        u = this.usuarioRepository.save(u);
        return u;
    }

    @RequestMapping(value = "/mostrarusuario",method = RequestMethod.GET )
    public List<Usuario> findAll(){
        List<Usuario> usuarios = this.usuarioRepository.findAll();
        return usuarios;
    }

    @RequestMapping(value = "/mostrarusuario/{id}",method = RequestMethod.GET )
    public Usuario findByid(@PathVariable long id){
       Optional<Usuario> resultado = this.usuarioRepository.findById(id);
       if(resultado.isEmpty())
       {
           throw new RuntimeException("usuario nao encontrado");
       }
       else
       {
           return resultado.get();
       }


    }
}
