/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author Silvia Araya J
 */
public class Numero {
    private float numero;

    public Numero(float numero) {
        this.numero = numero;
    }

    public Numero() {
    }

    public float getNumero() {
        return numero;
    }

    public void setNumero(float numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Numero{" + "numero=" + numero + '}';
    }
}
