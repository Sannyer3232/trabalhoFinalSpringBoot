package aranoua.edu.atividadeFinal.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

//Classe modelo autor mapeada como entitade no banco de dados
@Entity(name = "tabAutor")
public class Autor {
    //Atributo representado com chave primaria no banco de dados
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "autnome", nullable = false)
    private String nome;
    @Column(name = "autafiliacao", nullable = false)
    private String afiliacao;
    //Lista de Artigos publicados do autor
    @ManyToMany(mappedBy = "autores")
    private List<Artigo> artigos = new ArrayList<>();

    //Metodos construtores do objeto da classe modelo Autor
    public Autor() {}

    public Autor(String nome, String afiliacao) {
        this.nome = nome;
        this.afiliacao = afiliacao;
    }

    //Getters e Setters para manipulação de dados
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

    public String getAfiliacao() {
        return afiliacao;
    }

    public void setAfiliacao(String afiliacao) {
        this.afiliacao = afiliacao;
    }

    public List<Artigo> getArtigos() {
        return artigos;
    }

    public void setArtigos(List<Artigo> artigos) {
        this.artigos = artigos;
    }


}