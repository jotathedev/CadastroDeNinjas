package dev.java10x.cadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

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
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
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
