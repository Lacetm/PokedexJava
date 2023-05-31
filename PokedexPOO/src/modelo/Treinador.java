/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;

/**
 *
 * @author Marquinhos e Dandan
 */
public class Treinador {
    private int id;
    private String nome;
    private int idade;
    private String cidade;
    
    
    public Treinador(){
        
    }
    public Treinador(int id, String nome, int idade, String cidade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public Treinador(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

  


 public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    
    
}
