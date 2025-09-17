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
    @GetMapping("/listarID")
    public String exibirNinjaporId() {
        return "Ninja Por ID!";
    }
    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public String exibirTodosOsNinjas() {
        return "Todos os ninjas!";
    }
    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/atualizarID")
    public String atualizarNinjaPorID() {
        return "Os dados desse ninja foram atualizados!";
    }
    // Deletar ninja (DELETE)
    @DeleteMapping("/removerID")
    public String apagarNinjaPorID() {
        return "Ninja foi deletado!";
    }
}
