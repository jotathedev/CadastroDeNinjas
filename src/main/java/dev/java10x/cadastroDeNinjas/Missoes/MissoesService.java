package dev.java10x.cadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;
    private MissoesMapper missoesMapper;

    public MissoesService(MissoesRepository missoesRepository, MissoesMapper missoesMapper) {
        this.missoesRepository = missoesRepository;
        this.missoesMapper = missoesMapper;
    }

    public List<MissoesDTO> listarMissoes() {
        List<MissoesModel> missoes = missoesRepository.findAll();
        List<MissoesDTO> missoesDTOS = new ArrayList<>();
        for (MissoesModel missao : missoes) {
            missoesDTOS.add(missoesMapper.map(missao));
        }

        return missoesDTOS;
    }

    public MissoesDTO listarMissoesPorId(Long id) {
        Optional<MissoesModel> missaoPorId = missoesRepository.findById(id);
        return missoesMapper.map(missaoPorId.orElse(null));
    }


    public List<MissoesDTO> listarMissoesPorDificuldade(String dificuldade) {
        List<MissoesModel> missoesPorDificuldade = missoesRepository.findByDificuldade(dificuldade);
        List<MissoesDTO> missoesDTOS = new ArrayList<>();
        for (MissoesModel missao : missoesPorDificuldade) {
            missoesDTOS.add(missoesMapper.map(missao));
        }

        return missoesDTOS;
    }

    public void removerMissaoPorId(Long id) {
        missoesRepository.deleteById(id);
    }

    public MissoesDTO criarMissao(MissoesDTO missoesDTO) {
        MissoesModel missao = new MissoesMapper().map(missoesDTO);
        missao = missoesRepository.save(missao);
        return missoesMapper.map(missao);
    }

    public MissoesDTO atualizarMissao(Long id, MissoesDTO missaoDTO) {
        Optional<MissoesModel> missaoExistente = missoesRepository.findById(id);
        if (missaoExistente.isPresent()) {
            MissoesModel missaoAtualizada = missoesMapper.map(missaoDTO);
            missaoAtualizada.setId(id);
            missoesRepository.save(missaoAtualizada);
            return missoesMapper.map(missaoAtualizada);
        }

        return null;
    }

}
