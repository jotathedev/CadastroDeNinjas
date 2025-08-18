package dev.java10x.cadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "É só pra ter o controller enquanto vou estruturando o projeto!";
    }

}
