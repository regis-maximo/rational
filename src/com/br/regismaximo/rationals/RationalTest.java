/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.regismaximo.rationals;

/**
 *
 * @author Regis_Maximo
 */
public class RationalTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Rational obj1 = new Rational(2, 5);
        int num1 = obj1.getNumerador();
        int dem1 = obj1.getDenominador();
        
        Rational obj2 = new Rational(1, 6);
        int num2 = obj2.getNumerador();
        int dem2 = obj2.getDenominador();
        
        System.out.printf("obj1 %d/%d\n", num1, dem1);
        System.out.printf("obj2 %d/%d\n", num2, dem2);
       
        Rational.somaRationals(num1, num2, dem1, dem2);
         
        Rational.subtracaoRationals(num1, num2, dem1, dem2);
        
        Rational.multiRationals(num1, num2, dem1, dem2);
     
    }

}
