package spring.estagio.sbexercicios.controllers;

import org.springframework.web.bind.annotation.*;
import spring.estagio.sbexercicios.model.Calculadora;

@RestController
@RequestMapping("/calc")
public class CalculadoraController {

    // /calc/sum/10/20  --> get pra somar
    // /calc/subtracao?a=40&b=20  --> metodo pra subtrair

    Calculadora calc = new Calculadora();

    @GetMapping("/soma/{a}/{b}")
    public String somar(@PathVariable int a,@PathVariable int b) {
        return "Adição entre " + a + " + " + b + " = "  + (a+b);
    }

    @GetMapping("/subtracao")
    public String subtrair(@RequestParam(name = "a") int a,@RequestParam(name = "b") int b) {
        return "Subtração entre " + a + " - " + b + " = "  + (a-b);
    }
}
