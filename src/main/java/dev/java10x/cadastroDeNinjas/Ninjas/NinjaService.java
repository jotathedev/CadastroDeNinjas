package dev.java10x.cadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaDTO> listarNinjas() {
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        List<NinjaDTO> ninjasDTOS = new ArrayList<>();
        for (NinjaModel ninja : ninjas) {
            ninjasDTOS.add(ninjaMapper.map(ninja));
        }
        return ninjasDTOS;
        //return ninjas.stream()
        //        .map(ninjaMapper::map)
        //        .collect(Collectors.toList());
    }

    public NinjaDTO listarNinjasPorId(Long id) {
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaMapper.map(ninjaPorId.orElse(null));
        //return ninjaPorId.map(ninjaMapper::map).orElse(null);
    }

    public NinjaDTO criarNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninja = new NinjaMapper().map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }

    public void apagarNinjaPorID(Long id) {
        ninjaRepository.deleteById(id);
    }

    public NinjaDTO atualizarNinja(Long id, NinjaDTO ninjaDTO) {
        Optional<NinjaModel> ninjaExistente = ninjaRepository.findById(id);
        if (ninjaExistente.isPresent()) {
            NinjaModel ninjaAtualizado = ninjaMapper.map(ninjaDTO);
            ninjaAtualizado.setId(id);
            ninjaRepository.save(ninjaAtualizado);
            return ninjaMapper.map(ninjaAtualizado);
        }

        return null;

//        if (ninjaRepository.existsById(id)) {
//            ninja.setId(id);
//            ninjaRepository.save(ninja);
//
//            return ninjaMapper.map(ninja);
//        }
//        return null;
    }

}
