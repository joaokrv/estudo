package spring.estagio.sbexercicios.controllers;

import org.springframework.web.bind.annotation.*;
import spring.estagio.sbexercicios.model.entities.Cliente;

@RestController
@RequestMapping("/clientes") // -> tudo nessa classe tera a URL /clientes antes (GET)
public class ClienteController {

    @GetMapping("/qualquer")
    public Cliente obterCleinte() {
        return new Cliente(11, "Qualquer", "111.222.333-45");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId(@PathVariable int id) { // -> parametro passado pela propria URL (GET)
        return new Cliente(id, "Pedro", "999.888.777-65");
    }

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
        return new Cliente(id, "Lucas", "333.222.111-01");
    }
}
