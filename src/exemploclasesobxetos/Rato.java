/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploclasesobxetos;

import java.io.Serializable;

/**
 *
 * @author agonzalezgonzalez
 */
public class Rato implements Serializable{
    private String tipo;
    private Mouse mouse;
    public Rato() {
    }

    public Rato(String tipo,Mouse mouse) {
        this.tipo = tipo;
        this.mouse=mouse;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "tipo=" + tipo + ", mouse=" + mouse;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

}
