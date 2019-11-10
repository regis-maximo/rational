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
public class MMC {
    private static int mdc(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    //Algoritmo do MMC
    public static int mmc(int a, int b){
        return a * (b / mdc(a, b));
    }
}
