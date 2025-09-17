package dev.java10x.cadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {
    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Esse é meu primeiro Controller";
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado!";
    }
    // Procurar Ninja por ID (READ)
    @GetMapping("/ninjaPorID")
    public String exibirNinjaporId() {
        return "Ninja Por ID!";
    }
    // Mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public String exibirTodosOsNinjas() {
        return "Todos os ninjas!";
    }
    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/atualizarNinjaPorID")
    public String atualizarNinjaPorID() {
        return "Os dados desse ninja foram atualizados!";
    }
    // Deletar ninja (DELETE)
    @DeleteMapping("/deletarNinjaPorID")
    public String apagarNinjaPorID() {
        return "Ninja foi deletado!";
    }
}
