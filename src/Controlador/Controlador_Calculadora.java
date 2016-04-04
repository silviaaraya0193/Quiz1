/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.ManejoCalculadora;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Silvia Araya J
 */
    

public class Controlador_Calculadora implements ActionListener{
    private Principal ventana;
    private ManejoCalculadora manejo;
    
    public Controlador_Calculadora(Principal ventana){
        this.ventana = ventana;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("Calcular")){
            //System.out.println("Entra");
            manejo.realizarOperacionSuma(ventana.getNumero());
            manejo.realizarOperacionResta(ventana.getNumero());
        }
    }
    
}
