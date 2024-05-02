/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainfiguras;

/**
 *
 * @author aluno
 */
public class MainFiguras {

    public static void main(String[] args) {
        Figuras2D f;
        f = new Quadrado(3,"azul");
        System.out.println("Area:"+ f.CalcArea());
        System.out.println("Perimetro:"+ f.CalcPerim());
        System.out.println("Cor:"+ f.cor);
        
    }
}
