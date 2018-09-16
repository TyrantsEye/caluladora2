/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro
 */
public class CalculadoraAritmetica {
    public int x=0;
    public int y=0;
    public double t;
    
    int sumar(){
        int resultado = x+y;
        return resultado;
    }
    int restar(){
        int resultado = x-y;
        return resultado;
    }
    int multiplicar(){
        int resultado = x*y;
        return resultado;
    }
    int dividir(){
        int resultado = x/y;
        return resultado;
    }    
    
}
