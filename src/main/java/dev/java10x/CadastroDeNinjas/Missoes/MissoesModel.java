package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private String dificuldade;
  @OneToMany(mappedBy = "missoes")
  private List<NinjaModel> ninjas;

  public MissoesModel() {
  }

  public MissoesModel(Long id, String nome, String dificuldade, List<NinjaModel> ninja) {
    this.id = id;
    this.nome = nome;
    this.dificuldade = dificuldade;
    this.ninjas = ninja;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDificuldade() {
    return dificuldade;
  }

  public void setDificuldade(String dificuldade) {
    this.dificuldade = dificuldade;
  }

  public List<NinjaModel> getNinjas() {
    return ninjas;
  }

  public void setNinjas(List<NinjaModel> ninjas) {
    this.ninjas = ninjas;
  }
}
