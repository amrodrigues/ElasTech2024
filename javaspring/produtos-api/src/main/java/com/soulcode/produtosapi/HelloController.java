package com.soulcode.produtosapi;


import org.apache.coyote.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
@Controller
public class HelloController {
//    @GetMapping("/elastech")
//    @ResponseBody
//    public String paginateste(){
//        return  "Ola eu sou aa página Elastech";
//    }
    @RequestMapping(value = "/elastech1", method = RequestMethod.GET)
    @ResponseBody
    public String paginateste1(@RequestParam String nome, @RequestParam int idade){
        return  "Ola" + nome + " sua idade " +idade + " e voce na página Elastech";
    }

    @RequestMapping(value = "/elastech", method = RequestMethod.POST)
    public String paginaelastech(@RequestParam String nome , @RequestParam int idade , Model model){
        if(idade >= 18){
            System.out.println("Entrou nesse if");
            model.addAttribute("nome", nome);
            model.addAttribute("idade", idade);
            return "maior-idade";
        }else{
            int faltaanos = 18 - idade ;
            System.out.println(faltaanos);
            model.addAttribute("nome", nome);
            model.addAttribute("idade", idade);
            model.addAttribute("faltaidade", faltaanos);
            return "menor-idade";
        }
    }
    @GetMapping("/soulcode")
    @ResponseBody
    public String paginasoulcode (){
        return  "Soul code pagina de teste";
    }

    @GetMapping("/cadastro_produto")
    public String cadastroproduto (){
        return  "cadastro";
    }

    @GetMapping("/cadastro_usuario")
    public String cadastrousuario (){
        return  "cadastro_usuario";
    }
}
