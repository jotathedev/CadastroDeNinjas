package dev.java10x.cadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {
    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Esse é meu primeiro Controller";
    }
}
