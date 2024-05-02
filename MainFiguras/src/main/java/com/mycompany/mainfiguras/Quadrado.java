/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainfiguras;

/**
 *
 * @author aluno
 */
public class Quadrado extends Figuras2D{
    
    int lado;
    
    Quadrado(int lado, String cor){
        this.lado = lado;
        this.cor = cor;
    }
    
    @Override
    public double CalcArea(){
        return lado*lado;
    }
    
    @Override
    public double CalcPerim(){
        return 4*lado;             
    }
    
           
}
