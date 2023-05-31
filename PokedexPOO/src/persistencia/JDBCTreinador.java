/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pokemon;
import modelo.RegistroTreinador;
import modelo.Treinador;

/**
 *
 * @author Marquinhos e Dandan
 */
public class JDBCTreinador {
    Connection conexão;
    
    public JDBCTreinador(Connection conexão) {
        this.conexão = conexão;
    }
    
    public void inserirTreinador(Treinador t){
        String sql = "insert into treinadores (nome, idade, cidade) values (?, ?, ?)";
        PreparedStatement ps;
        
        try{
            ps = this.conexão.prepareStatement(sql);
            ps.setString(1, t.getNome());
            ps.setString(2, String.valueOf(t.getIdade()));
            ps.setString(3, t.getCidade());
            ps.execute();
            
        } catch (SQLException e){
            e.printStackTrace();
        }
        criarRowRegistro(t);
        
       
    }
    public void criarRowRegistro(Treinador t){
        String sql = "INSERT INTO pokemonsregistrados(id_poke1, id_poke2, id_poke3, id_poke4, id_poke5, id_poke6, id_treinador)\n" +
        "SELECT 0,0,0,0,0,0, "+" id\n" +
        "  FROM treinadores\n" +
        " WHERE nome = '"+t.getNome()+"'\n" +
        " LIMIT 1";
        PreparedStatement ps;
        try {
            ps = this.conexão.prepareStatement(sql);
                    
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCTreinador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void removerPokemon(Treinador t, String id_poke){
        String sql = "UPDATE pokemonsregistrados SET "+id_poke+" = 0  WHERE id_treinador= (?)";
        PreparedStatement ps;
        try {
            ps = this.conexão.prepareStatement(sql);
            ps.setString(1, String.valueOf(t.getId()));
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCTreinador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public ArrayList<Treinador> listarTodosTreinador(){
        ArrayList<Treinador> treinadores = new ArrayList<Treinador>();
        String sql = "select * from treinadores";
        
        try{
            Statement declaração = conexão.createStatement();
            ResultSet resposta = declaração.executeQuery(sql);
            
            
            while(resposta.next()){
                
                int id = resposta.getInt("id");
                String nome = resposta.getString("nome");
                int idade = resposta.getInt("idade");
                String cidade = resposta.getString("cidade");
                
                
                
                
                
                Treinador t = new Treinador(id, nome,idade, cidade);
                treinadores.add(t);
            }
                    
        } catch (SQLException e){
            e.printStackTrace();
        }
        return treinadores;
    }
    
    public ArrayList<Treinador> listarTreinadorNome(String texto){
        ArrayList<Treinador> treinadores = new ArrayList<Treinador>();
        String sql = "SELECT id, nome, idade, cidade FROM treinadores WHERE nome ='"+texto+"'";
        
        try{
            Statement declaração = conexão.createStatement();
            ResultSet resposta = declaração.executeQuery(sql);
            
            
            while(resposta.next()){
                
                int id = resposta.getInt("id");
                String nome = resposta.getString("nome");
                int idade = resposta.getInt("idade");
                String cidade = resposta.getString("cidade");
                
                
                
                
                
                Treinador t = new Treinador(id, nome,idade, cidade);
                treinadores.add(t);
            }
                    
        } catch (SQLException e){
            e.printStackTrace();
        }
        return treinadores;
    }
    
    public ArrayList<Treinador> listarTreinadorCidade(String texto){
        ArrayList<Treinador> treinadores = new ArrayList<Treinador>();
        String sql = "SELECT id, nome, idade, cidade FROM treinadores WHERE cidade ='"+texto+"'";
        
        try{
            Statement declaração = conexão.createStatement();
            ResultSet resposta = declaração.executeQuery(sql);
            
            
            while(resposta.next()){
                
                int id = resposta.getInt("id");
                String nome = resposta.getString("nome");
                int idade = resposta.getInt("idade");
                String cidade = resposta.getString("cidade");
                
                
                
                
                
                Treinador t = new Treinador(id, nome,idade, cidade);
                treinadores.add(t);
            }
                    
        } catch (SQLException e){
            e.printStackTrace();
        }
        return treinadores;
    }
    
     public Treinador listarTreinadorId(String texto){
        Treinador t = new Treinador();
        
        String sql = "SELECT id, nome, idade, cidade FROM treinadores WHERE id = '"+texto+"'" ;
        
        try{
            Statement declaração = conexão.createStatement();
            ResultSet resposta = declaração.executeQuery(sql);
            
            
            while(resposta.next()){
                
                int id = resposta.getInt("id");
                String nome = resposta.getString("nome");
                int idade = resposta.getInt("idade");
                String cidade = resposta.getString("cidade");
                
                
                
                
                
                Treinador tPoke = new Treinador(id, nome, idade, cidade);
                t = tPoke;
            }
                    
        } catch (SQLException e){
            e.printStackTrace();
        }
        return t;
    }
    public void registrarPokemon(Treinador t,String pokeslot, String id_poke){
        String sql = "UPDATE pokemonsregistrados SET "+pokeslot+" = "+id_poke+" WHERE id_treinador = '"+t.getId()+"';";
        
        
        
        
        PreparedStatement ps;
        
        try{
            ps = this.conexão.prepareStatement(sql);
            ps.execute();
            
        } catch (SQLException e){
            e.printStackTrace();
        
        
    }
    
}
    public RegistroTreinador localizaTreinadorRegistrado(String texto){
        
        RegistroTreinador rt = new RegistroTreinador();
        
        String sql = "SELECT id_treinador, id_poke1, id_poke2, id_poke3, id_poke4, id_poke5, id_poke6 FROM pokemonsregistrados WHERE id_treinador = '"+texto+"'" ;
        
        try{
            Statement declaração = conexão.createStatement();
            ResultSet resposta = declaração.executeQuery(sql);
            
            
            while(resposta.next()){
                int treinador_id = resposta.getInt("id_treinador");
                int id_poke1 = resposta.getInt("id_poke1");
                int id_poke2 = resposta.getInt("id_poke2");
                int id_poke3 = resposta.getInt("id_poke3");
                int id_poke4 = resposta.getInt("id_poke4");
                int id_poke5 = resposta.getInt("id_poke5");
                int id_poke6 = resposta.getInt("id_poke6");
                
                RegistroTreinador rt2 = new RegistroTreinador(treinador_id, id_poke1,id_poke2,id_poke3,id_poke4,id_poke5,id_poke6);
                rt = rt2;
            }
                    
        } catch (SQLException e){
            e.printStackTrace();
        }
        
        return rt;
    }
    public Treinador deletarTreinador(String id){
        
        
        String sql = "delete from pokemonsregistrados where id_treinador = "+id;
        
        PreparedStatement ps;
        
        try {
            ps = this.conexão.prepareStatement(sql);
            ps.execute();
        } catch(SQLException e){
            e.printStackTrace();
        }
        
        sql = "delete from treinadores where id = "+id;
        
                
        try {
            ps = this.conexão.prepareStatement(sql);
            ps.execute();
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
        
    }
}

