package dev.java10x.CadastroDeNinjas.Ninjas;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

  private NinjaService ninjaService;

  public NinjaController(NinjaService ninjaService) {
    this.ninjaService = ninjaService;
  }

  @GetMapping("/boasvindas")
  public String boasVindas() {
    return "Olá, Mundo! Essa é minha primeira mensagem nessa rota.";
  }

  // Adicionar Ninja (Create)
  @PostMapping("/criar")
  public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
    return ninjaService.criarNinja(ninja);
  }

  // Mostrar todos os Ninjas (Read)
  @GetMapping("/listar")
  public List<NinjaModel> listarNinjas() {
    return ninjaService.listarNinjas();
  }

  // Mostrar Ninja por ID (Read)
  @GetMapping("listar/{id}")
  public NinjaModel listarNinjaId(@PathVariable Long id) {
    return ninjaService.listarNinjaId(id);
  }

  // Alterar dados do Ninja (Update)
  @PutMapping("/alterarID")
  public String alterarNinjaId() {
    return "Alterar ninjas por ID";
  }

  // Deletar Ninja (Delete)
  @DeleteMapping("/deletarID")
  public String deletarNinjaId() {
    return "Deletar ninjas por ID";
  }
}
