/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import Vista.Principal;
import java.util.ArrayList;
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
    private ArrayList<Pattern> array;
    private Pattern patron = Pattern.compile("");
    
    public ManejoCalculadora() {
        this.principal = new Principal();
        array = new ArrayList<Pattern>();
        
    }

    public void verificarValor(String numero) throws MyException {
        patron = Pattern.compile("[^\\D]");
        array.add(patron);
        patron = Pattern.compile("[^,]");
        array.add(patron);
        patron = Pattern.compile("[\\d+,+\\d{3}]");
        array.add(patron);
        
    }
    public float realizarOperacionSuma(String num){
        try {
            float valor = 0;
            verificarValor(principal.getNumero());
            for(int i=0;i<array.size();i++){
                Pattern numero = array.get(i);
                Matcher matcher = numero.matcher(num);
                if(matcher.find()){
                    matcher.group(1);
                    valor = Float.parseFloat(principal.getNumero())
                    +Float.parseFloat(matcher.group(2));
                }
            }
            return valor;
        } catch (MyException ex) {
            Logger.getLogger(ManejoCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public float realizarOperacionResta(String num){
        try {
            float valor = 0;
            verificarValor(principal.getNumero());
            for(int i=0;i<array.size();i++){
                Pattern numero = array.get(i);
                Matcher matcher = numero.matcher(num);
                if(matcher.find()){
                    matcher.group(1);
                    valor = Float.parseFloat(principal.getNumero())
                    -Float.parseFloat(matcher.group(2));
                }
            }
            return valor;
        } catch (MyException ex) {
            Logger.getLogger(ManejoCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
}
