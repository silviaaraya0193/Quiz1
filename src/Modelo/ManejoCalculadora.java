/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import Vista.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Silvia Araya J
 */
public class ManejoCalculadora {
    private Principal principal;
    
    public ManejoCalculadora() {
        this.principal = new Principal();
        
    }

    public void verificarValor(String numero) throws MyException {
        Pattern patron = Pattern.compile("([^,])+([^,$])+([?+0-9])+([\\D])");
        Matcher matcher = patron.matcher(numero);
        if(matcher.find()){
            realizarOperacion();
        } else{
            throw new MyException("Error en el numero digitado");
        }
    }
    public float realizarOperacion(){
        float valor = 0;
        valor = Float.parseFloat(principal.getNumero());
        try {
            verificarValor(Float.toString(valor));
        } catch (MyException ex) {
            Logger.getLogger(ManejoCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valor;
    }
}
