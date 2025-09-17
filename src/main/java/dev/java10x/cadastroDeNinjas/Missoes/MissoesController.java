package dev.java10x.cadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    // GET - Manda uma requisição para listar missões
    @GetMapping("/listar")
    public String listarMissao() {
        return "Missões listada com sucesso!";
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
