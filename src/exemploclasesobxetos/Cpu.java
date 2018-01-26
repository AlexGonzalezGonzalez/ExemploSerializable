/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploclasesobxetos;

/**
 *
 * @author agonzalezgonzalez
 */
public class Cpu {
    private int velocidade;
    private int memoria;

    public Cpu() {
    }

    public Cpu(int velocidade, int memoria) {
        this.velocidade = velocidade;
        this.memoria = memoria;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "velocidade=" + velocidade + ", memoria=" + memoria;
    }
    
}
