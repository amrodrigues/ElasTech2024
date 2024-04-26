package com.soulcode.chamadosapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/cadastro-tecnico")
    public String cadastrotecnico(){
        return "cadastro-tecnico";
    }
    @GetMapping("/cadastro-usuario")
    public String cadastrousuario(){
        return "cadastro-usuario";
    }

    @GetMapping("/menu")
    public String menu(){
        return "menu";
    }
    @GetMapping("/soulcode")
    @ResponseBody
    public String paginasoulcode(){
        return "Soul Code pagina teste";
    }
}
