package dev.java10x.CadastroDeNinjas.Ninjas;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class NinjaService {

  private NinjaRepository ninjaRepository;

  public NinjaService(NinjaRepository ninjaRepository) {
    this.ninjaRepository = ninjaRepository;
  }

  // Listar todos os Ninjas
  public List<NinjaModel> listarNinjas() {
    return  ninjaRepository.findAll();
  }

  // Listar ninja por ID
  public NinjaModel listarNinjaId(Long id) {
    Optional<NinjaModel> ninjaId = ninjaRepository.findById(id);
    return ninjaId.orElse(null);
  }
}
