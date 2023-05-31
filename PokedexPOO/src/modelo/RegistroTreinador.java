/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author WINDOWS
 */
public class RegistroTreinador {
    private int id_treinador;
    private int id_poke1;
    private int id_poke2;
    private int id_poke3;
    private int id_poke4;
    private int id_poke5;
    private int id_poke6;

    public RegistroTreinador(int id_treinador, int id_poke1, int id_poke2, int id_poke3, int id_poke4, int id_poke5, int id_poke6) {
        this.id_treinador = id_treinador;
        this.id_poke1 = id_poke1;
        this.id_poke2 = id_poke2;
        this.id_poke3 = id_poke3;
        this.id_poke4 = id_poke4;
        this.id_poke5 = id_poke5;
        this.id_poke6 = id_poke6;
    }

    public RegistroTreinador(int id_poke1, int id_poke2, int id_poke3, int id_poke4, int id_poke5, int id_poke6) {
        this.id_poke1 = id_poke1;
        this.id_poke2 = id_poke2;
        this.id_poke3 = id_poke3;
        this.id_poke4 = id_poke4;
        this.id_poke5 = id_poke5;
        this.id_poke6 = id_poke6;
    }

    public RegistroTreinador() {
    }

    public int getId_treinador() {
        return id_treinador;
    }

    public void setId_treinador(int id_treinador) {
        this.id_treinador = id_treinador;
    }

    public int getId_poke1() {
        return id_poke1;
    }

    public void setId_poke1(int id_poke1) {
        this.id_poke1 = id_poke1;
    }

    public int getId_poke2() {
        return id_poke2;
    }

    public void setId_poke2(int id_poke2) {
        this.id_poke2 = id_poke2;
    }

    public int getId_poke3() {
        return id_poke3;
    }

    public void setId_poke3(int id_poke3) {
        this.id_poke3 = id_poke3;
    }

    public int getId_poke4() {
        return id_poke4;
    }

    public void setId_poke4(int id_poke4) {
        this.id_poke4 = id_poke4;
    }

    public int getId_poke5() {
        return id_poke5;
    }

    public void setId_poke5(int id_poke5) {
        this.id_poke5 = id_poke5;
    }

    public int getId_poke6() {
        return id_poke6;
    }

    public void setId_poke6(int id_poke6) {
        this.id_poke6 = id_poke6;
    }
    
    
    
          
}
