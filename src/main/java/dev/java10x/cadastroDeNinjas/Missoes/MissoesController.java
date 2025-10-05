package dev.java10x.cadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    // GET - Mostrar todas as missoes
    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes() {
        return missoesService.listarMissoes();
    }

    // GET - Procurar missão por id
    @GetMapping("/listar/{id}")
    public MissoesModel listarMissoesPorId(@PathVariable Long id) {
        return missoesService.listarMissoesPorId(id);
    }

    // POST - Manda uma requisição para adicionar/criar missões
    @PostMapping("/criar")
    public String criar() {
        return "Missão criada com sucesso!";
    }

    // PUT - Manda uma requisição para alterar missões
    @PutMapping("/atualizar")
    public String atualizarMissao() {
        return "Missão atualizada com sucesso!";
    }

    // DELETE - Manda uma requisição para deletar missões
    @DeleteMapping("/remover")
    public String remover() {
        return "Missçao foi removida com sucesso!";
    }

}
