package dev.java10x.CadastroDeNinjas.Ninjas;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    return  "Olá, Mundo! Essa é minha primeira mensagem nessa rota.";
  }

  // Adicionar Ninja (Create)
  @PostMapping("/criar")
  public String criarNinja() {
    return "Ninja Criada com sucesso!";
  }

  // Mostrar todos os Ninjas (Read)
  @GetMapping("/listar")
  public List<NinjaModel> listarNinjas() {
    return ninjaService.listarNinjas();
  }

  // Mostrar Ninja por ID (Read)
  @GetMapping("/todosID")
  public String mostrarNinjasId() {
    return "Mostrar ninjas por ID";
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
