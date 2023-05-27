/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Marquinhos e Dandan
 */
public class Pokemon {
    private int id;
    private String nome;
    private String tipo1;
    private String tipo2;
    private int total;
    private int hp;
    private int ataque;
    private int defesa;
    private int spAtk;
    private int spDef;
    private int velocidade;
    
    

    public Pokemon() {
    }

    public Pokemon(int id, String nome, String tipo1, String tipo2, int total, int hp, int ataque, int defesa, int spAtk, int spDef, int velocidade) {
        this.id = id;
        this.nome = nome;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.total = total;
        this.hp = hp;
        this.ataque = ataque;
        this.defesa = defesa;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.velocidade = velocidade;
    }

    
    public Pokemon (String nome, String tipo1, String tipo2) {
        
        this.nome = nome;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
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

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getSpAtk() {
        return spAtk;
    }

    public void setSpAtk(int spAtk) {
        this.spAtk = spAtk;
    }

    public int getSpDef() {
        return spDef;
    }

    public void setSpDef(int spDef) {
        this.spDef = spDef;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    
    
}
