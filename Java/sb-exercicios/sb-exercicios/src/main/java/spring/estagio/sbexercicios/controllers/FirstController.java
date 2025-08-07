package spring.estagio.sbexercicios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.estagio.sbexercicios.model.entities.Cliente;

@RestController
// @RequestMapping("/api")
public class FirstController {

    Cliente model = new Cliente();

    // @RequestMapping(method = RequestMethod.GET, path = "/ola")
    @GetMapping({"/ola", "/cumprimento"})
    public String ola() {
        return "Olá! Spring boot! (GET)";
    }

//    @PostMapping("/cumprimento")
//    public String cumprimento() {
//        return "Olá! Spring boot! (POST)";
//    }


}
