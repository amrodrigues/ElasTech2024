package com.soulcodeapi.demo.Controller;

import com.soulcodeapi.demo.Models.Usuario;
import com.soulcodeapi.demo.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

//    @RequestMapping(value = "/mostrarusuario/{id}",method = RequestMethod.GET )
//    public ResponseEntity<?> findByid(@PathVariable long id){
//       Optional<Usuario> resultado = this.usuarioRepository.findById(id);
//        if (resultado.isPresent()) {
//            return ResponseEntity.ok(resultado.get());
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuário não encontrado");
//        }
//
//    }
    @RequestMapping(value = "/mostrarusuario/{id}",method = RequestMethod.GET )
    public Usuario findByid(@PathVariable long id)    {
        Optional<Usuario> resultado = this.usuarioRepository.findById(id);
        if (resultado.isEmpty())
        { throw new RuntimeException("Usuario nao encontraoo");}
        else
        { return resultado.get();}
    }

    @RequestMapping(value = "/excluir/{id}", method = RequestMethod.GET)
    public Usuario deleteById(@PathVariable long id)    {
        Usuario usuario =  findByid(id);
        this.usuarioRepository.deleteById(id);
        return usuario;
    }

    @RequestMapping(value = "/editar/{id}", method = RequestMethod.PUT)
    public Usuario editarById(@PathVariable long id, @RequestBody Usuario usuario)    {
         this.findByid(id);
         usuario.setId(id);
         usuario = this.usuarioRepository.save(usuario);
        return usuario;
    }
}
