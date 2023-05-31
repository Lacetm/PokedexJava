/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import com.mysql.cj.util.StringUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Pokemon;

/**
 *
 * @author Marquinhos e Dandan
 */
public class JDBCPokemon {
    Connection conexão;

    public JDBCPokemon(Connection conexão) {
        this.conexão = conexão;
    }
    public void inserirPokemon(Pokemon p){
        String sql = "insert into pokemons(nome, tipo1, tipo2) values (?, ?, ?)";
        PreparedStatement ps;
        
        try{
            ps = this.conexão.prepareStatement(sql);
            ps.setString(1, p.getNome());
            ps.setString(2, p.getTipo1());
            ps.setString(3, p.getTipo2());
            ps.execute();
            
        } catch (SQLException e){
            e.printStackTrace();
        }
        
    }
    
    public ArrayList<Pokemon> listarPokemon(){
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        String sql = "select * from pokemons";
        
        try{
            Statement declaração = conexão.createStatement();
            ResultSet resposta = declaração.executeQuery(sql);
            
            
            while(resposta.next()){
                
                int id = resposta.getInt("id");
                String nome = resposta.getString("nome");
                String tipo1 = resposta.getString("tipo1");
                String tipo2 = resposta.getString("tipo2");
                int total = resposta.getInt("total");
                int hp = resposta.getInt("hp");
                int ataque = resposta.getInt("ataque");
                int defesa = resposta.getInt("defesa");
                int spAtk = resposta.getInt("spAtk");
                int spDef = resposta.getInt("spDef");
                int velocidade = resposta.getInt("velocidade");
                int geraçao = resposta.getInt("geraçao");
                
                
                
                
                Pokemon p = new Pokemon(id, nome, tipo1, tipo2, total, hp, ataque, defesa, spAtk, spDef, velocidade, geraçao);
                pokemons.add(p);
            }
                    
        } catch (SQLException e){
            e.printStackTrace();
        }
        return pokemons;
    }
    
    public ArrayList<Pokemon> listarPokemonTipo(String tipo){
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        
        String sql = "SELECT id, nome, tipo1, tipo2, total, hp, ataque, defesa, spAtk, spDef, velocidade, geraçao FROM pokemons WHERE tipo1 = '"+ tipo+"' OR tipo2 = '"+ tipo+"'";
        
        try{
            Statement declaração = conexão.createStatement();
            ResultSet resposta = declaração.executeQuery(sql);
            
            
            while(resposta.next()){
                
                int id = resposta.getInt("id");
                String nome = resposta.getString("nome");
                String tipo1 = resposta.getString("tipo1");
                String tipo2 = resposta.getString("tipo2");
                int total = resposta.getInt("total");
                int hp = resposta.getInt("hp");
                int ataque = resposta.getInt("ataque");
                int defesa = resposta.getInt("defesa");
                int spAtk = resposta.getInt("spAtk");
                int spDef = resposta.getInt("spDef");
                int velocidade = resposta.getInt("velocidade");
                int geraçao = resposta.getInt("geraçao");
                
                
                
                
                Pokemon p = new Pokemon(id, nome, tipo1, tipo2, total, hp, ataque, defesa, spAtk, spDef, velocidade, geraçao);
                pokemons.add(p);
            }
                    
        } catch (SQLException e){
            e.printStackTrace();
        }
        return pokemons;
    }
    public ArrayList<Pokemon> listarPokemonNome(String texto){
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        String sql = "SELECT id, nome, tipo1, tipo2, total, hp, ataque, defesa, spAtk, spDef, velocidade, geraçao FROM pokemons WHERE nome = '"+ texto+"'" ;
        
        try{
            Statement declaração = conexão.createStatement();
            ResultSet resposta = declaração.executeQuery(sql);
            
            
            while(resposta.next()){
                
                int id = resposta.getInt("id");
                String nome = resposta.getString("nome");
                String tipo1 = resposta.getString("tipo1");
                String tipo2 = resposta.getString("tipo2");
                int total = resposta.getInt("total");
                int hp = resposta.getInt("hp");
                int ataque = resposta.getInt("ataque");
                int defesa = resposta.getInt("defesa");
                int spAtk = resposta.getInt("spAtk");
                int spDef = resposta.getInt("spDef");
                int velocidade = resposta.getInt("velocidade");
                int geraçao = resposta.getInt("geraçao");
                
                
                
                Pokemon p = new Pokemon(id, nome, tipo1, tipo2, total, hp, ataque, defesa, spAtk, spDef, velocidade, geraçao);
                pokemons.add(p);
            }
                    
        } catch (SQLException e){
            e.printStackTrace();
        }
        return pokemons;
    }
     public Pokemon listarPokemonId(String texto){
        Pokemon p = new Pokemon();
        
        String sql = "SELECT id, nome, tipo1, tipo2, total, hp, ataque, defesa, spAtk, spDef, velocidade, geraçao FROM pokemons WHERE id = '"+texto+"'" ;
        
        try{
            Statement declaração = conexão.createStatement();
            ResultSet resposta = declaração.executeQuery(sql);
            
            
            while(resposta.next()){
                
                int id = resposta.getInt("id");
                String nome = resposta.getString("nome");
                String tipo1 = resposta.getString("tipo1");
                String tipo2 = resposta.getString("tipo2");
                int total = resposta.getInt("total");
                int hp = resposta.getInt("hp");
                int ataque = resposta.getInt("ataque");
                int defesa = resposta.getInt("defesa");
                int spAtk = resposta.getInt("spAtk");
                int spDef = resposta.getInt("spDef");
                int velocidade = resposta.getInt("velocidade");
                int geraçao = resposta.getInt("geraçao");
                
                
                
                Pokemon poke = new Pokemon(id, nome, tipo1, tipo2, total, hp, ataque, defesa, spAtk, spDef, velocidade, geraçao);
                p = poke;
            }
                    
        } catch (SQLException e){
            e.printStackTrace();
        }
        return p;
    }
     
     public Pokemon listarPokemonRegistrado(String texto){
        
         Pokemon poke = new Pokemon();
        
        String sql = "SELECT id, nome, tipo1, tipo2, total, hp, ataque, defesa, spAtk, spDef, velocidade, geraçao FROM pokemons WHERE id = '"+texto+"'" ;
        
        try{
            Statement declaração = conexão.createStatement();
            ResultSet resposta = declaração.executeQuery(sql);
            
            
            while(resposta.next()){
                
                int id = resposta.getInt("id");
                String nome = resposta.getString("nome");
                String tipo1 = resposta.getString("tipo1");
                String tipo2 = resposta.getString("tipo2");
                int total = resposta.getInt("total");
                int hp = resposta.getInt("hp");
                int ataque = resposta.getInt("ataque");
                int defesa = resposta.getInt("defesa");
                int spAtk = resposta.getInt("spAtk");
                int spDef = resposta.getInt("spDef");
                int velocidade = resposta.getInt("velocidade");
                int geraçao = resposta.getInt("geraçao");
                
                
                
                Pokemon p = new Pokemon(id, nome, tipo1, tipo2, total, hp, ataque, defesa, spAtk, spDef, velocidade, geraçao);
                poke = p;
            }
                  
        } catch (SQLException e){
            e.printStackTrace();
        }
        return poke;
    }
    
    
    public void apagarTudo(){
        String sql = "delete from pokemons";
        
        PreparedStatement ps;
        
        try {
            ps = this.conexão.prepareStatement(sql);
            ps.execute();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
